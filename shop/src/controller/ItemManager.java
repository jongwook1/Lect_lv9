package controller;

import java.util.ArrayList;

import models.Cart;
import models.Item;
import models.User;

public class ItemManager {
	public static ItemManager instance=new ItemManager();
	private ArrayList<String> category=new ArrayList<String>();
	private ArrayList<Item> itemList=new ArrayList<Item>();		 // 전체 아이템리스트
	private ArrayList<Cart> jangList = new ArrayList<Cart>();		// 전체 장바구니
	
	private UserManager um=UserManager.instance;
	public ItemManager() {
		init();
	}
	
	void init() {
		this.category.add("과자");		//get(0)
		this.category.add("생선");		//get(1)
		this.category.add("육류");		//get(2)
		this.category.add("음료수");		//get(3)
	//ItemŬ���� ������
//		String name;
//		int price;
//		String category;
		Item item=new Item("새우깡",1000,this.category.get(0));
		itemList.add(item);
		item=new Item("칸초",1500,this.category.get(0));
		itemList.add(item);
		item=new Item("포카칩Ĩ",2000,this.category.get(0));
		itemList.add(item);
		item=new Item("고등어",5500,this.category.get(1));
		itemList.add(item);
		item=new Item("새우",4500,this.category.get(1));
		itemList.add(item);
		item=new Item("갈치",6500,this.category.get(1));
		itemList.add(item);
		item=new Item("소고기",9500,this.category.get(2));
		itemList.add(item);
		item=new Item("양고기",9800,this.category.get(2));
		itemList.add(item);
		item=new Item("돼지고기",6500,this.category.get(2));
		itemList.add(item);
		item=new Item("콜라",2500,this.category.get(3));
		itemList.add(item);
		item=new Item("사이다",2200,this.category.get(3));
		itemList.add(item);
		item=new Item("환타",2000,this.category.get(3));
		itemList.add(item);
		
	}
	
	
	public void printCategory() {
		for(int i=0;i<this.category.size();i++) {
			System.out.println("["+i+"]"+this.category.get(i));
		}
	}
	
//	public void getItemSize(int pick) {
//		this.category.get(pick).
//	}
	
	//�̺κ��� �򰥸��Ƿ� �ٽú���
	public void printItemList(int caId) {
		int n = 0;
		for(int i=0;i<this.itemList.size();i++) {
			if(this.category.get(caId).equals(itemList.get(i).getCategory())){
				System.out.print("[" + n + "]");
				this.itemList.get(i).print();
				n += 1;
			}
		}
	}
	
	public void printItemList() {
		for (int i = 0; i < itemList.size(); i++) {
			System.out.print("[" + i + "]");
			itemList.get(i).print();
		}
	}
	
	//�̺κе� �ߺ���
	public void addCart(String usId,int caId,int itId) {
		int n=0;
		Cart newCart=new Cart();
		newCart.setUserId(usId);
		for(int i=0;i<this.itemList.size();i++) {		//이부분 특히잘보기
			if(this.category.get(caId).equals(this.itemList.get(i).getCategory())) {
				if(itId==n) {
					newCart.setItemName(this.itemList.get(i).getName());
					newCart.setPrice(this.itemList.get(i).getPrice());
				}
				n++;
			}
		}
		this.jangList.add(newCart);		
		//
//		um.getUsers().get(um.log).getUmJangList().add(newCart);
		//
	}

	public void printJang(User user) {
		if(this.jangList.size()>0) {
			int n=0;					//넘버링을 위한 변수
		for (int i = 0; i < jangList.size(); i++) {
			if (user.getId().equals(jangList.get(i).getUserId())) {
				
				jangList.get(i).print(n);
				n++;
			}
		}
		}else {
			System.out.println("장바구니가 비었습니다");
		}
	}
	///jang즉 Cart오브젝트를 지우는것
	public void removeCart(User user) {		
		printJang(user);
		
		
		
		System.out.println("지울번호를 선택하세요");
		int idx=UserManager.sc.nextInt();
		
		int jangIdx=-1;
		
		int cnt=0;
		for(int i=0;i<this.jangList.size();i++) {
//			if(this.jangList.get(i).getUserId()==user.getId()) {		//이렇게 하게되면 주소값을 비교하는거이되므로 이렇게하면 안됌
			if(this.jangList.get(i).getUserId().equals(user.getId())) {  //바로위코드와 헷갈렸는데 위에것으로 하면 안됌
				cnt++;
				if(cnt==idx) {
					jangIdx=i;
				}
			}
		}
		this.jangList.remove(jangIdx);
		
	
//		ArrayList<Cart> delCart=um.getUsers().get(log).getUmJangList();
//		um.getUsers().get(log).getUmJangList().remove(delCart);
//		this.jangList.remove(delCart);
		
//		ArrayList<Cart> removeCart=this.jangList;		
//			this.jangList.remove(removeCart);

		
//		int delCartIdx=-1;
//		Cart delCart=null;			
//		
//		
//		for(int i=0;i<um.getUsers().size();i++) {
//			if(um.getUsers().get(i).getId()==um.getUsers().get(um.log).getId()) {
//				delCartIdx=i;
//			}	
//		}
//		
//		this.jangList.remove(delCartIdx);
//		
		
	}

	public void buyItem(User user) {
		int money=user.getMoney();
		int totalPrice=0;

		for(int i=0;i<this.jangList.size();i++) {
			if(this.jangList.get(i).getUserId()==user.getId()) {
				totalPrice+=this.jangList.get(i).getPrice();
			}
		}
		if(money>=totalPrice) {
		money-=totalPrice;
		user.setMoney(money);

//		this.printJang(um.getUsers().get(um.log));
		this.printJang(user);
		
		System.out.println("아이템 구입완료");
		System.out.println("물건구입후 잔액: "+user.getMoney());
		}else {
			System.out.println("잔액이 부족합니다");
		}
	}
	
	public void addItem() {
		System.out.println("[아이템추가] 아이템이름을 입력하세요.");
		String name = UserManager.sc.next();
		System.out.println("[아이템추가] 가격을 입력하세요. ");
		int price = UserManager.sc.nextInt();
		printCategory();
		System.out.println("[아이템추가] 카테고리를 입력하세요. ");
		int sel = UserManager.sc.nextInt();
		Item temp = new Item(name, price, category.get(sel));
		itemList.add(temp);
	}

	public void removeItem() {
		System.out.println("[아이템삭제] 삭제할이름 입력하세요");
		String name=UserManager.sc.next();
		int delItemIdx=-1;
		for(int i=0;i<this.itemList.size();i++) {
			if(name.equals(this.itemList.get(i).getName())) {
				delItemIdx=i;
			}
		}		
		this.itemList.remove(delItemIdx);
	}

	public void addCategory() {
		System.out.println("[카테고리추가] 추가할 카테고리 이름을 입력하세요.");
		String name = UserManager.sc.next();
		category.add(name);		
	}

	public void removeCategory() {
		this.printCategory();
		System.out.println("삭제할 카테고리 번호선택");
		
		int delCateIdx=UserManager.sc.nextInt();
		this.category.remove(delCateIdx);
		
	}





}

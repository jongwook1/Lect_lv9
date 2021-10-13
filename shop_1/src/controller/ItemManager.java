package controller;

import java.util.ArrayList;

import models.Cart;
import models.Item;
import models.Shop;
import models.User;

public class ItemManager {
	public static ItemManager instance = new ItemManager();
	private ArrayList<String> category = new ArrayList<>(); // 여것 살짝 놓칠수있음 확인하기!
	private ArrayList<Item> itemList = new ArrayList<>(); // 전체 아이템리스트
	private ArrayList<Cart> jang=new ArrayList<>();	//전체 장바구니
	public ItemManager() {
		init();
	}

	private void init() {
		this.category.add("과자");
		this.category.add("생선");
		this.category.add("육류");
		this.category.add("음료수");

		Item item = new Item("칩촉", 2500, this.category.get(0));
		this.itemList.add(item);
		item = new Item("새우깡", 1500, this.category.get(0));
		this.itemList.add(item);
		item = new Item("꼬북칩", 2000, this.category.get(0));
		this.itemList.add(item);
		item = new Item("고등어", 5500, this.category.get(1));
		itemList.add(item);
		item = new Item("새우", 4500, this.category.get(1));
		itemList.add(item);
		item = new Item("갈치", 6500, this.category.get(1));
		itemList.add(item);
		item = new Item("소고기", 9500, this.category.get(2));
		itemList.add(item);
		item = new Item("양고기", 9800, this.category.get(2));
		itemList.add(item);
		item = new Item("돼지고기", 6500, this.category.get(2));
		itemList.add(item);
		item = new Item("콜라", 2500, this.category.get(3));
		itemList.add(item);
		item = new Item("사이다", 2200, this.category.get(3));
		itemList.add(item);
		item = new Item("환타", 2000, this.category.get(3));
		itemList.add(item);

	}

	public void printCate() {
		for (int i = 0; i < this.category.size(); i++) {
			System.out.println("[" + i + "]" + this.category.get(i));
		}

	}
		//헷갈렸음
	public void printItemList(int caN) {
	 int n=0;
	 for(int i=0;i<this.itemList.size();i++) {
		 if(this.category.get(caN).equals(this.itemList.get(i).getCategory())) {
			 System.out.print("[" + n + "]");
				this.itemList.get(i).print();
				n += 1;
		 }
	 }
		
	}
		//다시보기
	public void addCart(String id, int caN, int itemN) {
		int n=0;
		Cart newCart=new Cart();
		newCart.setUserId(id);
		for(int i=0;i<this.itemList.size();i++) {		//이부분 특히잘보기
			if(this.category.get(caN).equals(this.itemList.get(i).getCategory())) {
				if(itemN==n) {
					newCart.setItemName(this.itemList.get(i).getName());
					newCart.setPrice(this.itemList.get(i).getPrice());
				}
				n++;
			}
		}
		this.jang.add(newCart);
	}

	public void printJang(User user) {
		if (this.jang.size() > 0) {
			int n = 0;					//넘버링을 위한 변수
			for (int i = 0; i < this.jang.size(); i++) {
				if (this.jang.get(i).getUserId().equals(user.getId())) {
					this.jang.get(i).print(n);
					n++;
				}
			}

		} else {
			System.out.println("장바구니가 비었습니다");
		}
	}

	public void removeCart(User user) {
		if(this.jang.size()>0) {
		printJang(user);
			System.out.println("삭제할 번호입력하세요");
			int idx=Shop.sc.nextInt();
			int jangIdx=-1;
			
			int cnt=0;
			for(int i=0;i<this.jang.size();i++) {
				if(this.jang.get(i).getUserId().equals(user.getId())) {
//				if(this.jangList.get(i).getUserId()==user.getId()) { 이것도 되는이유 질문하기 이렇게 하면 주소값을 비교하게 되므로 이렇게 하면안됌
					cnt++;
				}
				if(cnt==idx) {
					jangIdx=i;
				}
			}
			this.jang.remove(jangIdx);
		}else {
			System.out.println("장바구니가 비어있습니다");
		}
		
	}

	public void buyItem(User user) {
		int money=user.getMoney();
		int total=0;
		
		for(int i=0;i<this.jang.size();i++) {
			if(this.jang.get(i).getUserId().equals(user.getId())) {
				total+=jang.get(i).getPrice();
			}
		}
		if(money>=total) {
			money-=total;
			user.setMoney(money);
		this.printJang(user);
		System.out.println("아이템구입완료");
		System.out.println("물건구입후 잔액: "+user.getMoney());
		}else {
			System.out.println("잔액이 부족합니다");
		}
		
	}

	public void printItemList() {
		for(int i=0;i<this.itemList.size();i++) {
			System.out.print("[" + i + "]");
			this.itemList.get(i).print();
		}
		
	}

	public void addItem() {
		System.out.println("[아이템추가] 아이템이름 입력하세요");
		String name=Shop.sc.next();
		System.out.println("[아이템추가] 가격을 입력하세요");
		int price=Shop.sc.nextInt();
		printCate();
		System.out.println("[아이템추가] 카테고리를 선택하세요");
		int sel=Shop.sc.nextInt();
		Item newitem=new Item(name,price, this.category.get(sel));
		this.itemList.add(newitem);
	}

	public void removeItem() {
		//아이템으로 번호찾은후 삭제
		System.out.println("[아이템삭제] 삭제할 이름 입력하세요");
		String delName=Shop.sc.next();
		int dIdx=-1;
		for(int i=0;i<this.itemList.size();i++) {
			if(this.itemList.get(i).getName().equals(delName)) {
				dIdx=i;
			}
		}
		this.itemList.remove(dIdx);
		
		
		//인덱스로 삭제
//		for(int i=0;i<this.itemList.size();i++) {
//			System.out.print("[" + i + "]");
//			this.itemList.get(i).print();
//		}
//		System.out.println("삭제할 번호선택");
//		int sel=Shop.sc.nextInt();
//		this.itemList.remove(sel);
		
	}

	public void addCategory() {
		System.out.println("추가할 카테고리명 입력하세요");
		String cateName=Shop.sc.next();
		this.category.add("cateName");
		
	}

	public void removeCategory() {
		this.printCate();
		System.out.println("삭제할 카테고리 번호선택");
		
		int delCateIdx=Shop.sc.nextInt();
		this.category.remove(delCateIdx);
		
	}



}

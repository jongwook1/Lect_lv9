package controller;

import java.util.ArrayList;

import models.Cart;
import models.Item;
import models.User;

public class ItemManager {
	public static ItemManager instance=new ItemManager();
	private ArrayList<String> category=new ArrayList<String>();
	private ArrayList<Item> itemList=new ArrayList<Item>();		 // ��ü �����۸���Ʈ
	private ArrayList<Cart> jangList = new ArrayList<Cart>();		// ��ü ��ٱ���
	
	private UserManager um=UserManager.instance;
	public ItemManager() {
		init();
	}
	
	void init() {
		this.category.add("����");		//get(0)
		this.category.add("����");		//get(1)
		this.category.add("����");		//get(2)
		this.category.add("�����");		//get(3)
	//ItemŬ���� ������
//		String name;
//		int price;
//		String category;
		Item item=new Item("�����",1000,this.category.get(0));
		itemList.add(item);
		item=new Item("ĭ��",1500,this.category.get(0));
		itemList.add(item);
		item=new Item("����Ĩ",2000,this.category.get(0));
		itemList.add(item);
		item=new Item("����",5500,this.category.get(1));
		itemList.add(item);
		item=new Item("�̸��",4500,this.category.get(1));
		itemList.add(item);
		item=new Item("��ġ",6500,this.category.get(1));
		itemList.add(item);
		item=new Item("�Ұ��",9500,this.category.get(2));
		itemList.add(item);
		item=new Item("����",9800,this.category.get(2));
		itemList.add(item);
		item=new Item("�������",6500,this.category.get(2));
		itemList.add(item);
		item=new Item("�ݶ�",2500,this.category.get(3));
		itemList.add(item);
		item=new Item("���̴�",2200,this.category.get(3));
		itemList.add(item);
		item=new Item("ȯŸ",2000,this.category.get(3));
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
		for(int i=0;i<this.itemList.size();i++) {
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
			int n=0;					//�������� �ѹ����� ���Ѻ���
		for (int i = 0; i < jangList.size(); i++) {
			if (user.getId().equals(jangList.get(i).getUserId())) {
				
				jangList.get(i).print(n);
				n++;
			}
		}
		}else {
			System.out.println("��ٱ��ϰ� ������ϴ�");
		}
	}
	///jang�� Cart������Ʈ�� ����°�
	public void removeCart(User user) {		
		printJang(user);
		
		
		
		System.out.println("�����ȣ�� �����ϼ���");
		int idx=UserManager.sc.nextInt();
		
		int jangIdx=-1;
		
		int cnt=0;
		for(int i=0;i<this.jangList.size();i++) {
			if(this.jangList.get(i).getUserId()==user.getId()) {
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
		System.out.println("������ ���ԿϷ�");
		}else {
			System.out.println("�ܾ��� �����մϴ�");
		}
	}
	
	public void addItem() {
		System.out.println("[�������߰�] �������̸��� �Է��ϼ���.");
		String name = UserManager.sc.next();
		System.out.println("[�������߰�] ������ �Է��ϼ���. ");
		int price = UserManager.sc.nextInt();
		printCategory();
		System.out.println("[�������߰�] ī�װ��� �Է��ϼ���. ");
		int sel = UserManager.sc.nextInt();
		Item temp = new Item(name, price, category.get(sel));
		itemList.add(temp);
	}

	public void removeItem() {
		System.out.println("[�����ۻ���] �������̸� �Է��ϼ���");
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
		System.out.println("[ī�װ��߰�] �߰��� ī�װ� �̸��� �Է��ϼ���. ");
		String name = UserManager.sc.next();
		category.add(name);		
	}

	public void removeCategory() {
		this.printCategory();
		System.out.println("������ ī�װ� ��ȣ����");
		
		int delCateIdx=UserManager.sc.nextInt();
		this.category.remove(delCateIdx);
		
	}





}

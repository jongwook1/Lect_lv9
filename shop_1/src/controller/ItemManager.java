package controller;

import java.util.ArrayList;

import models.Cart;
import models.Item;
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
		
	}

	public void printJang(User user) {
		if (this.jang.size() > 0) {
			int n = 0;
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

}

package controller;

import java.util.ArrayList;

import models.Item;

public class ItemManager {
	public static ItemManager instance = new ItemManager();
	private ArrayList<String> category = new ArrayList<>(); // 여것 살짝 놓칠수있음 확인하기!
	private ArrayList<Item> itemList = new ArrayList<>(); // 전체 아이템리스트

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
		//핵심
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

}

package models;

import java.util.ArrayList;

public class Shop {
	ArrayList<Item> itemList = new ArrayList<>();
	
	public Shop() {
		Item temp = new Item();
		temp.kind = Item.WEAPON;
		temp.name = "�ʽ����� ��";
		temp.power = 3;
		temp.price = 1000;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.WEAPON;
		temp.name = "�߱����� ��";
		temp.power = 5;
		temp.price = 2000;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.WEAPON;
		temp.name = "�������� ��";
		temp.power = 7;
		temp.price = 2500;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.ARMOR;
		temp.name = "�ʽ����� ����";
		temp.power = 1;
		temp.price = 300;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.ARMOR;
		temp.name = "�߱����� ����";
		temp.power = 4;
		temp.price = 800;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.ARMOR;
		temp.name = "�������� ����";
		temp.power = 7;
		temp.price = 1500;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.RING;
		temp.name = "������";
		temp.power = 7;
		temp.price = 3000;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.RING;
		temp.name = "�ݹ���";
		temp.power = 17;
		temp.price = 6000;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.RING;
		temp.name = "���̾ƹ���";
		temp.power = 35;
		temp.price = 20000;
		itemList.add(temp);
		
		
		
		
		
	}
}

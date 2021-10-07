package models;

import java.util.ArrayList;

import controller.MainGame;

public class Shop {
	ArrayList<Item> itemList = new ArrayList<>();
	
	public Shop() {
		Item temp = new Item();
		temp.kind = Item.WEAPON;
		temp.name = "초보자용 검";
		temp.power = 3;
		temp.price = 1000;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.WEAPON;
		temp.name = "중급자용 검";
		temp.power = 5;
		temp.price = 2000;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.WEAPON;
		temp.name = "숙련자용 검";
		temp.power = 7;
		temp.price = 2500;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.ARMOR;
		temp.name = "초보자용 갑옷";
		temp.power = 1;
		temp.price = 300;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.ARMOR;
		temp.name = "중급자용 갑옷";
		temp.power = 4;
		temp.price = 800;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.ARMOR;
		temp.name = "숙련자용 갑옷";
		temp.power = 7;
		temp.price = 1500;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.RING;
		temp.name = "은반지";
		temp.power = 7;
		temp.price = 3000;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.RING;
		temp.name = "금반지";
		temp.power = 17;
		temp.price = 6000;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.RING;
		temp.name = "다이아반지";
		temp.power = 35;
		temp.price = 20000;
		itemList.add(temp);
		
		
		
		
		
	}
	/////////////////////중요
	public void shopMenu() {
		while (true) {
			System.out.println("===============[상점]=============");
			System.out.println("[1.무기] [2.갑옷] [3.반지] [0.뒤로가기]");
			int sel = MainGame.sc.nextInt();
			if (sel == 0)
				break;
			while (true) {
				if(sel==Item.WEAPON) {
					System.out.println();
				}
				else if(sel==Item.ARMOR) {
					
				}
				else if(sel==Item.RING) {
					
				}
				printItems(sel);
				System.out.println("[골드 : "+Player.money);
				System.out.println("구입할 아이템의 번호입력 [0.뒤로가기]");
				int sel2=MainGame.sc.nextInt();
				if(sel2==0) {
					break;
				}
				int count=0;
				for(int i=0;i<this.itemList.size();i++) {
					if(this.itemList.get(i).kind==sel) {
						count++;
						if(count==sel2) {
							Player.inven.addItem(this.itemList.get(i));
							Player.money-=this.itemList.get(i).price;	
							System.out.println(this.itemList.get(i).name+"을 구매했습니다");
							break;
						}
					}
				}
			}

		}
	}

	private void printItems(int sel) {
		int count =0;
		for(int i=0;i<this.itemList.size();i++) {
			if(this.itemList.get(i).kind==sel) {
				System.out.print("["+(count+1)+"번"+"]");
				System.out.print("[이름: "+this.itemList.get(i).name+"]");
				System.out.print("[능력: "+this.itemList.get(i).power+"]");
				System.out.println("[가격: "+this.itemList.get(i).price+"]");
				count++;
				
			}else {
				break;
			}
		}
		
	}
	
	
}

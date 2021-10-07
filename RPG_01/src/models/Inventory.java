package models;

import java.util.ArrayList;

import controller.MainGame;

public class Inventory {	
	 ArrayList<Item> itemList=new ArrayList<>();			//shop클래스에 있는 itemList랑은 다른놈

	public void addItem(Item item) {
		this.itemList.add(item);		
	}

	public void inventoryMenu() {
		while(true) {
			System.out.println("==================[인벤메뉴]===========");
			System.out.println("[1.착용] [2.판매] [0.뒤로가기]");
			int sel=MainGame.sc.nextInt();
			if(sel==1) {
				equipMenu();
			}
			else if(sel==2) {}
			else if(sel==0) {
				break;
			}
			
			
			
			}
		
	}

	private void equipMenu() {		
		Player.guild.printAllUnitStaus();				/////inventory클래스에 이렇게 가져오는법 잠깐 잊어버렸었음 숙지하기
		System.out.println("아이템을 착용할 길드원번호 선택하세요");
		int sel=MainGame.sc.nextInt()-1;					//인덱스로 쓰이므로 -1해줌
		while(true) {
		Player.guild.printUnitStaus(sel);
		Player.guild.printUnitItem(sel);
		this.printItemList();
		for(int i=0;i<this.itemList.size();i++) {
			
		}
		
		
		
		
		}
	}

	private void printItemList() {
		
		System.out.println("================[아이템 리스트]========");
		for(int i=0;i<this.itemList.size();i++) {
			System.out.print("["+(i+1)+"번]");
//			this.itemList.get(i).  이하 부분이 왜 지금 클래스(Inventory)가 controller 패키지에 있을떄는 안나오는지??질문하기
			System.out.print("[이름 : "+this.itemList.get(i).name+"]");
			System.out.print("[능력 : "+this.itemList.get(i).power+"]");
			System.out.print("[가격 : "+this.itemList.get(i).price+"]");
			System.out.println();
			

		}
		
	}


}

package models;

import java.util.ArrayList;

import controller.MainGame;

public class Inventory {
	public ArrayList<Item> itemList = new ArrayList<>(); // shop클래스에 있는 itemList랑은 다른놈

	public void addItem(Item item) {
		this.itemList.add(item);
	}

	public void inventoryMenu() {
		while (true) {
			System.out.println("==================[인벤메뉴]===========");
			System.out.println("[1.착용] [2.판매] [0.뒤로가기]");
			int sel = MainGame.sc.nextInt();
			if (sel == 1) {
				equipMenu();
			} else if (sel == 2) {
				sellMenu();
			} else if (sel == 0) {
				break;
			}

		}

	}

	private void sellMenu() {
		while (true) {
			this.printItemList();
			System.out.println("[골드 : " + Player.money + "]");
			if (this.itemList.size() > 0) {
				System.out.println("판매할 아이템 번호를 입력하세요. (50% 세금) [0.뒤로가기]");
				int selItemIdx = MainGame.sc.nextInt();
				if (selItemIdx <= this.itemList.size() && selItemIdx >= 0) {
					if (selItemIdx == 0)
						break;

//			int Money=this.itemList.get(selItemIdx-1).price;
//			double selMoney=Money*0.5;
//			int balance=Player.money;
//			balance+=selMoney;
//			Player.money=balance;

					Player.money += (itemList.get(selItemIdx - 1).price / 2); // 바로위 4줄 한줄요약//selItemIdx 가 인덱스로 쓰일때는
																				// -1해줌
					System.out.println(this.itemList.get(selItemIdx - 1).name + "을 판매합니다");// selItemIdx 가 인덱스로 쓰일때는
																							// -1해줌
					this.itemList.remove(selItemIdx - 1);// selItemIdx 가 인덱스로 쓰일때는 -1해줌
				} else {
					System.out.println("번호를 확인해주세요");
				}
			} else {
				System.out.println("구입한 아이템이 없습니다");
				break;
			}
		}
	}

	private void equipMenu() {
		Player.guild.printAllUnitStaus(); ///// inventory클래스에 이렇게 가져오는법 잠깐 잊어버렸었음 숙지하기
		System.out.println("아이템을 착용할 길드원번호 선택하세요");
		int UnitN = MainGame.sc.nextInt() - 1; // 인덱스로 쓰이므로 -1해줌
		if (UnitN < Player.guild.getGuildList().size() && UnitN >= 0) { // 예외처리
			while (true) {
				Player.guild.printUnitStaus(UnitN);
				Player.guild.printUnitItem(UnitN);
				this.printItemList();
				System.out.println("착용할 아이템 번호 입력[0.뒤로가기]");
				int equipN = MainGame.sc.nextInt();
				if (equipN == 0)
					break;
				equipN--;
				if (this.itemList.get(equipN).kind == Item.WEAPON) {
					if (Player.getGuildUnit(UnitN).getWeapon() != null) {
						this.itemList.add(Player.getGuildUnit(UnitN).getWeapon());
					}
					Player.getGuildUnit(UnitN).setWeapon(this.itemList.get(equipN));
				} else if (this.itemList.get(equipN).kind == Item.ARMOR) {
					if (Player.getGuildUnit(UnitN).getArmor() != null) {
						this.itemList.add(Player.getGuildUnit(UnitN).getArmor());
					}
					Player.getGuildUnit(UnitN).setArmor(this.itemList.get(equipN));
				} else if (this.itemList.get(equipN).kind == Item.RING) {
					if (Player.getGuildUnit(UnitN).getRing() != null) {
						this.itemList.add(Player.getGuildUnit(UnitN).getRing());
					}
					Player.getGuildUnit(UnitN).setRing(this.itemList.get(equipN));
				}
				itemList.remove(equipN);
			}
		}
	}

	private void printItemList() {

		System.out.println("================[아이템 리스트]========");
		for (int i = 0; i < this.itemList.size(); i++) {
			System.out.print("[" + (i + 1) + "번]");
//			this.itemList.get(i).  이하 부분이 왜 지금 클래스(Inventory)가 controller 패키지에 있을떄는 안나오는지??질문하기
			System.out.print("[이름 : " + this.itemList.get(i).name + "]");
			System.out.print("[능력 : " + this.itemList.get(i).power + "]");
			System.out.print("[가격 : " + this.itemList.get(i).price + "]");
			System.out.println();

		}

	}

}

package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import models.Item;
import models.Player;
import models.Unit;

public class FileData {
	private File file = null;
	private FileWriter fw = null;
	private FileReader fr = null;
	private BufferedReader br = null;

	private String fileName = "RPG01.txt";

	public void save() {
		ArrayList<Unit> temp = Player.getGuildList();
		String gameData = "";
		gameData += Player.money + "\n";
		gameData += temp.size() + "\n";

		// Unit temp = new Unit(String name,int level,int maxHp, int att,int def,int
		// exp);
		for (int i = 0; i < temp.size(); i++) {
			gameData += temp.get(i).getName() + "/";
			gameData += temp.get(i).getLevel() + "/";
			gameData += temp.get(i).getMaxHp() + "/";
			gameData += temp.get(i).getAtt() + "/";
			gameData += temp.get(i).getDef() + "/";
			gameData += temp.get(i).getExp() + "/";
			gameData += temp.get(i).isParty() + "\n";
			// 무기
			if (temp.get(i).getWeapon() == null) {
				gameData += temp.get(i).getWeapon();
			} else {
				Item item = temp.get(i).getWeapon();
//				int kind,String name,int power,	int price;
				String weaponData = "";
				weaponData += item.getKind() + ",";
				weaponData += item.getName() + ",";
				weaponData += item.getPower() + ",";
				weaponData += item.getPrice() + ",";
				gameData += weaponData;
			}
			gameData += "/";
			// 방어구
			if (temp.get(i).getArmor() == null) {
				gameData += temp.get(i).getArmor();
			} else {
				Item item = temp.get(i).getArmor();
//				int kind,String name,int power,	int price;
				String armorData = "";
				armorData += item.getKind() + ",";
				armorData += item.getName() + ",";
				armorData += item.getPower() + ",";
				armorData += item.getPrice() + ",";
				gameData += armorData;
			}
			gameData += "/";
			// 링
			if (temp.get(i).getRing() == null) {
				gameData += temp.get(i).getRing();
			} else {
				Item item = temp.get(i).getRing();
//				int kind,String name,int power,	int price;
				String ringData = "";
				ringData += item.getKind() + ",";
				ringData += item.getName() + ",";
				ringData += item.getPower() + ",";
				ringData += item.getPrice() + ",";
				gameData += ringData;
			}
			gameData += "\n";
		}
		// 플레이어 인벤토리에있는거
		gameData += Player.getItemSize() + "\n";
		for (int i = 0; i < Player.getItemSize(); i++) {
//			int kind,String name,int power,	int price;
			gameData += Player.inven.itemList.get(i).getKind() + "/";
			gameData += Player.inven.itemList.get(i).getName() + "/";
			gameData += Player.inven.itemList.get(i).getPower() + "/";
			gameData += Player.inven.itemList.get(i).getPrice() + "\n";
		}

		try {
			file = new File(fileName);
			fw = new FileWriter(file);
			fw.write(gameData);
			fw.close();
			System.out.println("저장완료");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void load() {
		file = new File(fileName);
		if (file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);

				int money = Integer.parseInt(br.readLine()); // 첫번째줄
				Player.money = money;
				int guildSize = Integer.parseInt(br.readLine()); // 2째줄
				Player.guild.getGuildList().clear();
//			System.out.println("길드사이즈: "+guildSize);
				for (int i = 0; i < guildSize; i++) {
					String unitData = br.readLine(); // 3째줄 Ex) 호랑이/1/100/10/5/0/true
					String[] unitTemp = unitData.split("/");
					String name = unitTemp[0];
					int lv = Integer.parseInt(unitTemp[1]);
					int maxHp = Integer.parseInt(unitTemp[2]);
					int att = Integer.parseInt(unitTemp[3]);
					int def = Integer.parseInt(unitTemp[4]);
					int exp = Integer.parseInt(unitTemp[5]);
					boolean party = Boolean.parseBoolean(unitTemp[6]);
					Unit temp = new Unit(name, lv, maxHp, att, def, exp, party);
					Player.guild.getGuildList().add(temp);
//				Player.getGuildList().add(temp);	//이것도 되는지 확인하기

					// 착용한 아이템
					String itemData = br.readLine(); // 4째줄
					String[] itemTemp = itemData.split("/"); // 무기/갑옷/링
					// 무기
					if (itemTemp[0].equals("null")) { // =무기착용하지않았던데이터면
						Player.getGuildList().get(i).setWeapon(null);
//					Player.guild.getGuildList().get(i).setWeapon(null); //바로윗줄과같음
					} else {
						String[] weapon = itemTemp[0].split(","); // Ex) 1,레이피어,7,2500/2,강철갑옷
						int kind = Integer.parseInt(weapon[0]);
						String itemName = weapon[1];
						int power = Integer.parseInt(weapon[2]);
						int price = Integer.parseInt(weapon[3]);
						Item roadItemW = new Item();
						roadItemW.setItem(kind, itemName, power, price);
						Player.getGuildList().get(i).setWeapon(roadItemW);
//					Player.guild.getGuildList().get(i).setWeapon(roadItemW);	//바로윗줄과같음
					}

					// 갑옷
					if (itemTemp[1].equals("null")) {
						Player.guild.getGuildList().get(i).setArmor(null);
//					Player.getGuildList().get(i).setArmor(null);  //바로윗줄과같음
					} else {
						String[] armor = itemTemp[1].split(",");
						int kind = Integer.parseInt(armor[0]);
						String itemName = armor[1];
						int power = Integer.parseInt(armor[2]);
						int price = Integer.parseInt(armor[3]);
						Item roadItemA = new Item();
						roadItemA.setItem(kind, itemName, power, price);
						Player.getGuildList().get(i).setArmor(roadItemA);
//					Player.guild.getGuildList().get(i).setArmor(roadItemA);	//바로윗줄과같음
					}

					// 링
					if (itemTemp[2].equals("null")) {
						Player.getGuildList().get(i).setRing(null);
//					Player.guild.getGuildList().get(i).setRing(null);
					} else {
						String[] roadeItemR = itemTemp[2].split(",");
						int kind = Integer.parseInt(roadeItemR[0]);
						String itemName = roadeItemR[1];
						int power = Integer.parseInt(roadeItemR[2]);
						int price = Integer.parseInt(roadeItemR[3]);
						Item newItemR = new Item();
						newItemR.setItem(kind, itemName, power, price);
						Player.getGuildList().get(i).setRing(newItemR);
//					Player.guild.getGuildList().get(i).setRing(newItemR);	//바로윗줄과같음
					}
				}

				// 길드원들 도는 for문이후에
				// 인벤토리 아이템
				String invenSize = br.readLine(); // 길드원들다뽑아온후그이후줄
//			System.out.println("인벤사이즈: "+invenSize);
				int inSize = Integer.parseInt(invenSize);

				Player.inven.itemList.clear();

				for (int i = 0; i < inSize; i++) {
					String invenItemTemp = br.readLine(); // Ex) 3/다이아반지/35/20000
					String[] invenItem = invenItemTemp.split("/");
					int itemKind = Integer.parseInt(invenItem[0]);
					String itemName = invenItem[1];
					int power = Integer.parseInt(invenItem[2]);
					int price = Integer.parseInt(invenItem[3]);
					Item invItem = new Item();
					invItem.setItem(itemKind, itemName, power, price);
					Player.inven.itemList.add(invItem);
				}

				System.out.println("로드완료");

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}

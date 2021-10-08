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
			gameData += temp.get(i).getMaxHp() + '/';
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

}

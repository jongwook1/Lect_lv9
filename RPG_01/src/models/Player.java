package models;

import java.util.ArrayList;

import controller.Guild;
import controller.MainGame;

public class Player {
	public static int money;
	public static Guild guild = new Guild();
	public static Inventory inven = new Inventory();

	public Player() {
		money = 100000;
		this.guild.setGuild();
	}

	public void guildMenu() {
		this.guild.guildMenu();
	}

	public void inventoryMenu() {
		this.inven.inventoryMenu();
	}

	public static Unit getGuildUnit(int num) {
		return guild.getGuildUnit(num);
	}

	public static ArrayList<Unit> getGuildList() {
		return guild.getGuildList();
	}

	public static int getItemSize() {
		return inven.itemList.size();
	}

}

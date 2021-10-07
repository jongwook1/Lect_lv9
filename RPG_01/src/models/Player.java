package models;

import controller.Guild;
import controller.Inventory;
import controller.MainGame;

public class Player {
	public static int money;
	private static Guild guild = new Guild();
	private static Inventory inventory= new Inventory();
	
	public Player() {
		money=100000;
		guild.setGuild();
	}

	public void guildMenu() {
		guild.guildMenu();			
	}
	
	
	
	
	
	
	
}

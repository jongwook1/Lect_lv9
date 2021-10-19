package controller;

import java.util.Random;
import java.util.Vector;

import models.Player;
import models.Unit;

public class UnitManager {
	
	public Vector<Player> player_list = new Vector<>();
	public Vector<Unit> mon_list = new Vector<>();
	String path = "models.";		// 패키지명  + . 
	Random ran = new Random();
	String mons[] = {"UnitWolf", "UnitBat", "UnitOrc"};
	
	public UnitManager(){
		player_list.add(new Player("전사", 1000, 45));
		player_list.add(new Player("마법사", 800, 60));
		player_list.add(new Player("힐러", 500, 70));
	}
	
	public void monster_rand_set(int size) {
		for(int i = 0; i < size; i++) {
			int num = ran.nextInt(mons.length);
			try {
				Class<?> clazz = Class.forName(path + mons[num]);					
				Object obj = clazz.newInstance();
				Unit temp = (Unit)obj;
				int hp = ran.nextInt(100) + 100;
				int pow = ran.nextInt(10) + 10;
				temp.init(hp, pow);
				mon_list.add(temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}


package controller;

import java.util.ArrayList;

import models.Player;
import models.Unit;

public class UnitManager {
	ArrayList<Player> player_list = new ArrayList<>();
	ArrayList<Unit> mon_list = new ArrayList<>();
	
	UnitManager (){
		player_list.add(new Player("전사",1000,45));
		
		
	}
	
	
}

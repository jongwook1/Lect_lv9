package models;

import controller.Game;

public class Hero extends Unit{

	public Hero(String name, int hp, int att, int def, int pos) {
		super(name, hp, att, def, pos);
		// TODO Auto-generated constructor stub
	}

	private int cnt = 3;

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public void attack(Unit enemy) {
		if(enemy instanceof ZombieKing) {
			
		}else {
			super.attack(enemy);
		}
		
		
	}
	
	
}

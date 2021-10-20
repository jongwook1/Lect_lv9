package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import models.Hero;
import models.Unit;
import models.Zombie;

public class Game {
	//싱글톤
	public static Game instance = new Game();
	
	private Game(){};
	
	public static Game getInstance() {
		return instance;
	}
	
	private Hero p;
	
	ArrayList<Unit> enemyList = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	public Random rn = new Random();
	
	public void init() {
		p = new Hero("용사", 200, 5, 1, 1);		//Hero클래스 생성자를 public 해야 이코드 작동
		enemyList.add(new Zombie("초보좀비", 100, 5, 1, 3));		//Zombie도 위와 마찬가지
		enemyList.add(new Zombie("중급좀비", 150, 10, 1, 6));
		enemyList.add(new Zombie("고급좀비", 200, 15, 1, 9));
//		enemyList.add(new ZombieKing("좀비킹", 100, 5, 1, 12, 쉴드));
	}
	
	
	
	public void run() {
		init();
		int act = 1;
		while(true) {
			printMenu(act);
			int sel = sc.nextInt();
			if(sel == 1) {
				
			}else if(sel == 2) {
				act = heal(act, p);
			}else if(sel == 3) {
				
			}
		}
	}

	private int heal(int act, Hero p) {
		int rHeal = rn.nextInt(50)+20;
		p.setHp(p.getHp()+rHeal);
		System.out.println("체력이 " + rHeal + "만큼 회복되었습니다");
		return act = 2;		
	}

	private void printMenu(int act) {
		System.out.println("[ 현재 층 : " + p.getPos() + "]");
		System.out.println("[1] : 올라간다");
		if(act == 1) {
		System.out.println("[2] : 체력을 회복한다");
		System.out.println("[3] : 무기를 강화한다");
		}
	}
	
	
}

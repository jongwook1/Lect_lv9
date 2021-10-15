package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import models.Hero;
import models.Unit;
import models.Zombie;

public class Game {
	public static Scanner sc = new Scanner(System.in);
	public static Random ran = new Random();
	private static Game Instance = new Game();

	private Game() {
	} // 싱글톤과정

	public static Game getInstance() { // 싱글톤과정
		return Instance;
	};

	private Hero p;
	ArrayList<Unit> enemyList = new ArrayList<>();

	// Unit(String name, int hp, int att, int def, int pos)
	public void init() {
		p = new Hero("용사", 200, 50, 1, 11);
		enemyList.add(new Zombie("초급좀비", 100, 5, 1, 3));
		enemyList.add(new Zombie("중급좀비", 150, 10, 1, 6));
		enemyList.add(new Zombie("고급좀비", 200, 15, 1, 9));
		enemyList.add(new ZombieKing("왕좀비", 100, 20, 4, 12,51));
	}

	public void run() {
		init();
		int act = 1; // 체력회복이나 무기강화 둘중 하나만 할수있게 하기위해 act변수활용
		while (true) {
			printMenu(act);
			int sel = sc.nextInt();
			if (sel == 1) {
				p.setPos(p.getPos() + 1);
				int ememyN=check();
				if(ememyN!=-1) {
					boolean a = fight(enemyList.get(ememyN));
					if(a==false) {
						System.out.println("용사가죽었으므로 게임종료");
						break;
					}

					
					
				}else{
					System.out.println("아무일도 일어나지 않았다");
				};
				act = 1;
			} else if (sel == 2 && act == 1) {
				int rN = ran.nextInt(40) + 20;
				p.setHp(p.getHp() + rN);
				System.out.println(rN + "만큼 체력회복");
				act = 2;
			} else if (sel == 3 && act == 1) {
				act = enchant(act);
				
//				int rN = ran.nextInt(2) + 1; // 1과 2뿐이 안나오게 해서 1나오면 무기강화 2나오면 아머강화
//				if (rN == 1) {
//					int upRAtt = ran.nextInt(5) + 1;
//					p.setAtt(p.getAtt() + upRAtt);
//					System.out.println("공격력이 " + upRAtt + "만큼 증가했다");
//				} else {
//					int upRDff = ran.nextInt(3) + 1;
//					p.setDef(p.getDef() + upRDff);
//					System.out.println("방어력이 " + upRDff + "만큼 증가했다");
//				}
//
//				 act = 2;
			}
		}

	}

	private boolean fight(Unit enemy) {
		System.out.println("좀비가 나타났다");
		while (true) {
			p.print();
			System.out.println("===========VS==========");
			enemy.print();
			System.out.println("[무엇을 할까? ]");
			System.out.println("1.공격 2.물약(" + p.getCnt() + "개 남음)");
			int sel=sc.nextInt();
			if(sel==1) {
				p.attack(enemy);
			}
			else if(sel==2) {
				p.drink();
			}
			//용사공격후 용사와 좀비중 죽은사람있는지 판단
			if(die(enemy)!=0) {				
				break;				//죽은사람 발생시 while나오게함
			}
			System.out.println();
			enemy.attack(p);
			//좀비공격후 용사와 좀비중 죽은사람있는지 판단
			if(die(enemy)!=0) {
				break;				//죽은사람 발생시 while나오게함
			}
			System.out.println();
			
		}
		if(die(enemy)==1) {
			System.out.println("용사 죽음....");
			return false;
		}
		else {
			System.out.println(enemy.getName()+"를 물리쳤다");
			return true;
		}
	}

	private int die(Unit enemy) {
		if(p.getHp()<=0) {
			return 1;				//플레이어죽음
		}else if(enemy.getHp()<=0) {
			return 2;
		}
		return 0;
	}

	private int check() {
		for(int i=0; i<enemyList.size(); i++) {
		if(p.getPos() == enemyList.get(i).getPos())
			return i;
			
			}
		return -1;
		
	}

	private int enchant(int act) {
		
		int rN = ran.nextInt(2) + 1; // 1과 2뿐이 안나오게 해서 1나오면 무기강화 2나오면 아머강화
		if (rN == 1) {
			int upRAtt = ran.nextInt(5) + 1;
			p.setAtt(p.getAtt() + upRAtt);
			System.out.println("공격력이 " + upRAtt + "만큼 증가했다");
		} else {
			int upRDff = ran.nextInt(3) + 1;
			p.setDef(p.getDef() + upRDff);
			System.out.println("방어력이 " + upRDff + "만큼 증가했다");
		}

		return act = 2;

	}

	private void printMenu(int act) {
		System.out.println("[ 현재 층 : " + p.getPos() + "]");
		System.out.println("[1] : 올라간다");
		if (act == 1) {
			System.out.println("[2] : 체력을 회복한다");
			System.out.println("[3] : 무기를 강화한다");
		}
	}

}

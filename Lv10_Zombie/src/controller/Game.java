package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import models.Hero;
import models.Unit;
import models.Zombie;
import models.ZombieKing;

public class Game {
	public static Scanner sc=new Scanner(System.in);
	public Random rn= new Random();
	
	private static Game instance = new Game ();
	private Game() {};			//싱글톤 과정
	public static Game getInstance() {	//싱글톤을 하기위해 getter만들어줌
		return instance;
	}

//		private int floor=0;
	private Hero p;
	private ArrayList<Unit> enemy = new ArrayList<>();
	private void init() {
		p = new Hero("용사", 100, 5, 1, 1);		//Unit->Hero에서 물려받은 생성자(String name,int hp, int att, int def, int pos)에 값을넣어줌
		enemy.add(new Zombie("초보좀비",25,5,1,3));
		enemy.add(new Zombie("중급좀비",50,10,2,6));
		enemy.add(new Zombie("고급좀비",70,15,3,9));
		enemy.add(new ZombieKing("왕좀비",25,20,4,12,50));		
	}
	
	public void run() {
		init();
		int act = 1;			//체력회복이나 무기강화 둘중 하나만 할수있게 하기위해 act변수활용
		while(true) {
			printMenu(act);
			int sel=sc.nextInt();
			if (sel == 1) {
//				floor++;
				p.setPos(p.getPos() + 1);
				
				int enemyIdx = lookEnemyN();		//enemy에있는 몇번째 몬스터를 만났는지 확인하기위한 변수
				if(enemyIdx!=-1) {
					boolean a = fight(enemy.get(enemyIdx));
					if(a == false) {
						break;
					}
				}else {
					System.out.println("아무일도 일어나지 않았다");
				}
				
//				lookEnemyN(idx);
//				for (int i = 0; i < enemy.size(); i++) {
//					if (enemy.get(i).getPos() == p.getPos()) {
//						System.out.println("좀비발견!!");
//						idx = i;
//					}
//				}
//				if (idx != -1) {
//					idx = -1;
//				} else {
//					System.out.println("아무일도 일어나지 않았다..");
//				}
				act = 1; //여기서 해주지 않으면 sel=2 or sel=3 하고온후 층올갔을때 act가 2로 되어있어서 계속 층만올라갸야하는 경우발생
			}
			else if(sel==2 && act==1) {
				int rNum = rn.nextInt(40)+20;
				p.setHp(p.getHp()+rNum);
				System.out.println("체력이 "+ rNum + "만큼 회복했다");
				act = 2;		
			}
			else if(sel==3 && act==1) {
				enchant();
			}
			
			
		}
		
		
	}
	
	private int lookEnemyN() {
//		int idx = -1; // 몬스터가 있는 층을 확인하기위한 idx변수
		for (int i = 0; i < enemy.size(); i++) {
			if (enemy.get(i).getPos() == p.getPos()) {
				System.out.println("좀비발견!!");				
				return i;							//enemy에있는 몇번째 몬스터를 만났는지 확인하기위한 변수
			}
		}
		return -1;
	}
	
	private boolean fight(Unit target) {
		while(true) {
		p.print();
		System.out.println("==========VS========");
		target.print();
		System.out.println("-----------");
		System.out.println("[무엇을 할까? ]");
		System.out.println("1.공격 2.물약(?개 남음)");
		int sel=sc.nextInt();
		if(sel==1) {			
			p.attck(target);
		}else if(sel==2) {
			p.drink();
		}
		if(die(target)!=0) {
			break;
		}
		System.out.println();
		target.attack(p);
		if(die(target)!=0) {
			break;
		}
		System.out.println();
		}
		if(die(target)==1) {
			System.out.println("용사 사망..");
			return false;
		}
		else {
			System.out.println("좀비를 물리쳤다");
			return true;
		}
	}
	
//	private boolean att(int i) {
//		boolean checkDie=false;			//용사죽었을때 체크하기위한 변수
//		//용사의 공격력만큼 좀비한테 데미지를 줌
//		System.out.println("용사의 공격");
//		System.out.println();
//		int remainEnemyHp=enemy.get(i).getHp()+enemy.get(i).getDef()-p.getAtt();
//		enemy.get(i).setHp(remainEnemyHp);
//		
//		//좀비의 공격력만큼 용사한테 데미지를 줌
//		int remainPHp=p.getHp()+p.getDef()-enemy.get(i).getAtt();
//		p.setHp(remainPHp);	
//		if(p.getHp()<0) {
//			return  checkDie=true;
//		}
//		return checkDie=false;
//	}
	
	private int die(Unit enemyN) {
		if(p.getHp()<=0) {
			return 1;
		}
		else if(enemyN.getHp()<=0) {
			return 2;
		}
		else {
		return 0;
		}
	}
	
	private int enchant() {
		int act=0;
		int rNum = rn.nextInt(2)+1;
		if(rNum==1) {
			int rN=rn.nextInt(5)+1;
			int addAtt=p.getAtt()+rN;
			p.setAtt(addAtt);
			System.out.println("공격력이 " + addAtt+"만큼 증가했다");
		}else if(rNum==2) {
			int rN=rn.nextInt(3)+1;
			int addDef=p.getDef()+rN;
			p.setDef(addDef);
			System.out.println("방어력이 " + addDef+"만큼 증가했다");
		}
		return act = 2;
	}
	
	public void printMenu(int act) {
		System.out.println("[  현재  층 : "+p.getPos()+"]");
		System.out.println("[1] : 올라간다");
		if(act==1) {
		System.out.println("[2] : 체력을 회복한다");
		System.out.println("[3] : 무기를 강화한다");
		}
	}
	
	
}

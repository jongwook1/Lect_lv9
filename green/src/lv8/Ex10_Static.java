package lv8;

import java.util.ArrayList;
import java.util.Random;

// Static

// 1명의 플레이어
// ㄴ다수의 몬스터를 채용할 수있고
// ㄴ전투가 시작되면 랜덤으로 각 몬스터의 hp가 감소	(hp가 20 감소하면 -> 플레이어의 레벨1 상승)
// ㄴ hp default : 50
// ㄴ hp 가 0이 되면 사망
// ㄴ 보유한 몬스터가 모두 사망하면 -> 게임 종료

class Player {
	static int exp;
	static int level;
	ArrayList<Monster> party=new ArrayList<Monster>();
	
	public Player() {
		this.level=1;
		party.add(new Monster());
	}
	
	public void printInfo() {
		System.out.println("p1 level : " + this.level);
		for(int i=0;i<party.size();i++) {
			party.get(i).printInfo();
		}
	}
	
}

class Monster {
	
	
	String name;
	int level;
	int hp;
	boolean death;
	
	public Monster() {
		this.name=ranName();
		this.level=Player.level;
		this.hp=50;
		System.out.printf("몬스터 %s의 탄생..\n", this.name);
	}

	private String ranName() {
		String front[]= {"헤라","메타","포세이돈","럴","베"};
		String back[]= {"몬","릴","파","라","릴라"};
		
		int r1=Game.rn.nextInt(front.length);
		int r2=Game.rn.nextInt(back.length);
		
		return front[r1]+back[r2];
	}
	
	public void printInfo() {
		System.out.printf("%s : level %d, hp %d, death %b\n",this.name,this.level,this.hp,this.death);
	}
	
		
}

class Game{
	
	static Random rn=new Random();
	Player p1= new Player();	
	
	void run() {
		while(isRun()) {
			createMon();
			printState();
			fight();
			
			try {
				Thread.sleep(500);	//sleep() 메서드는 실행에 딜레이를 줄 수 있다
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	private void fight() {
		
		for (int i = 0; i < this.p1.party.size(); i++) {
			int damage = rn.nextInt(5) + 3;
			this.p1.party.get(i).hp -= damage;
			Player.exp+=damage;
			Player.level=Player.exp/20+1;
			this.p1.party.get(i).level=Player.level;
			if (this.p1.party.get(i).hp < 0) {
//				this.p1.party.get(i).death = true;
//				this.p1.party.get(i).hp = 0;
				this.p1.party.remove(i);		//사망한 캐릭터 보내기
			}
		}
		System.out.println();
	}

	private void createMon() {
		int r= rn.nextInt(5);
		if(r==0) {
			this.p1.party.add(new Monster());
		}
		
	}

	private void printState() {
		this.p1.printInfo();
		
	}

	private boolean isRun() {
		if(this.p1.party.isEmpty()) {
			System.out.println("플레이어 사망...");
		return false;
		
		}
		return true;
	}
	
	
	
	
}

public class Ex10_Static {

	public static void main(String[] args) {
		Game game=new Game();
		game.run();

	}

}

package lv10;

interface Repairable1{	//Mark Interface : 이를 상속받아 정의한 클래스들이 모두 -> 마크 인터페이스의 하위 자료형이 됨
	
}

// damage() 메소드를 가진
// Interface Damageable 를 정의하고
// 최하위 유닛들 (모든) 에게 Damageable 상속
// main에서 각각의 유닛들을 손상시킨 후 -> repair() 돌려보기

interface Damagealbe1{
	
	public void damage(int deal) ;
}


class Unit1{		//모든 유닛의 최고 조상 클래스
	final int MAX_HP;
	int hp;	//hitpoint
	String name;
	
	public Unit1(int hp) {	//자식 유닛의 고유한 맥스값 지정
		this.MAX_HP = hp;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

// GroundUnit
class GroundUnit1 extends Unit1{

	public GroundUnit1(int hp) {
		// super() : 부모의 생성자를 호출(기본생성자는 생략 O)
		super(hp);	
	}
	
}

//AirUnit
class AirUnit1 extends Unit1{

	public AirUnit1(int hp) {
		// super() : 부모의 생성자를 호출(기본생성자는 생략 O)
		super(hp);
		// TODO Auto-generated constructor stub
	}
	
}

//GroundUnit
//ㄴ Tank(150)	(수리 O)
//ㄴ Marine(70)
//ㄴ SCV 우주 건설 로봇(200)	(수리 O)

class Tank1 extends GroundUnit1 implements Repairable1, Damagealbe1{
	// super() : 부모의 생성자를 호출(기본생성자는 생략 O)
	// super.  : 부모가 가진 멤버에 접근
	public Tank1() {
		super(150);		// MAX_HP 를 우선 초기화
		hp = MAX_HP;		// 0초기화 되어있는 Unit의 hp를 MAX로 맞춰줌		//super.hp = super.MAX_HP;
		super.setName("Tank");
		System.out.printf("TANK의 생성.. Unit [hp :  %d]\n", hp);
	}

	@Override
	public void damage(int deal) {
		this.hp-=deal;
		System.out.printf("Tank1이 %s만큼 공격받음\n",deal);
		
	}
}

class Marine1 extends GroundUnit1 implements Damagealbe1{
	
	public Marine1() {
		super(70);
		hp=MAX_HP;
		super.setName("Marine");
		System.out.printf("Marine의 생성..Unit [hp : %d]\n", hp);
	}

	@Override
	public void damage(int deal) {
		this.hp-=deal;
		System.out.printf("Marine1이 %s만큼 공격받음\n",deal);
		
	}
}

//우주 건설 차량 SCV는 
//다른 유닛들 중에 "수리가능한" 유닛을 -> 어떻게 식별? -> 마크 인터페이스를 활용
//수리하는 기능을 가진다. -> repair()메소드
class SCV1 extends GroundUnit1 implements Repairable1 , Damagealbe1{
	
	public SCV1() {
		super(200);
		hp=MAX_HP;
		super.setName("SCV");
		System.out.printf("SCV의 생성..Unit [hp : %d]\n", hp);
	}
	
	public void repair(Repairable1 repairable) {
		// Upcasting
		Unit1 unit = (Unit1) repairable;
		
		while(unit.hp <unit.MAX_HP) {
			unit.hp ++;
System.out.println("수리중>>");			
		}
		System.out.printf("[%s 수리완료]\n",unit.name);
	}

	@Override
	public void damage(int deal) {
		this.hp-=deal;
		System.out.printf("SCV1가 %s만큼 공격받음\n",deal);
		
	}
}


//AirUnit
//ㄴ DropShip(120)
class DropShip1 extends AirUnit1 implements Damagealbe1 {
	
	public DropShip1() {
		super(120);
		hp=MAX_HP;
		System.out.printf("DropShip의 생성..Unit [hp : %d]\n", hp);
		
	}
	
	public void damage(int deal) {
		this.hp-=deal;
		System.out.printf("DropShip1이 %s만큼 공격받음\n",deal);
		
	}
}


public class Ex05_Starcraft_my {

	public static void main(String[] args) {
		
		Tank1 tank = new Tank1();
		Marine1 marine = new Marine1();
		SCV1 scv = new SCV1();		
		DropShip1 ship = new DropShip1();
		
		tank.damage(2);
		marine.damage(1);
		scv.damage(3);
		ship.damage(2);
		scv.repair(tank);
//		scv.repair(marine);			//마크인터페이스가 없어서 수리불가
		scv.repair(scv);
//		scv.repair(ship);			//마크인터페이스가 없어서 수리불가

	}

}


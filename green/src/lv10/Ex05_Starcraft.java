package lv10;

interface Repairable{	//Mark Interface : 이를 상속받아 정의한 클래스들이 모두 -> 마크 인터페이스의 하위 자료형이 됨
	
}

// damage() 메소드를 가진
// Interface Damageable 를 정의하고
// 최하위 유닛들 (모든) 에게 Damageable 상속
// main에서 각각의 유닛들을 손상시킨 후 -> repair() 돌려보기

interface Damageable{
	
	public void damage(int att) ;
}


class Unit{		//모든 유닛의 최고 조상 클래스
	final int MAX_HP;
	int hp;	//hitpoint
	String name;
	
	public Unit(int hp) {	//자식 유닛의 고유한 맥스값 지정
		this.MAX_HP = hp;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

// GroundUnit
class GroundUnit extends Unit{

	public GroundUnit(int hp) {
		// super() : 부모의 생성자를 호출(기본생성자는 생략 O)
		super(hp);	
	}
	
}

//AirUnit
class AirUnit extends Unit{

	public AirUnit(int hp) {
		// super() : 부모의 생성자를 호출(기본생성자는 생략 O)
		super(hp);
		// TODO Auto-generated constructor stub
	}
	
}

//GroundUnit
//ㄴ Tank(150)	(수리 O)
//ㄴ Marine(70)
//ㄴ SCV 우주 건설 로봇(200)	(수리 O)

class Tank extends GroundUnit implements Repairable, Damageable{
	// super() : 부모의 생성자를 호출(기본생성자는 생략 O)
	// super.  : 부모가 가진 멤버에 접근
	public Tank() {
		super(150);		//여기서 MAX_HP 를 우선 초기화
		hp = MAX_HP;		// 0초기화 되어있는 Unit의 hp를 MAX로 맞춰줌		//super.hp = super.MAX_HP;
		super.setName("Tank");
		System.out.printf("TANK의 생성.. Unit [hp :  %d]\n", hp);
	}

	@Override
	public void damage(int att) {
		if(hp>0) {
			hp-=att;
			System.out.printf("%d만큼 아야!!\n",att);
		}
		
	}

}

class Marine extends GroundUnit implements Damageable{
	
	public Marine() {
		super(70);
		hp=MAX_HP;
		super.setName("Marine");
		System.out.printf("Marine의 생성..Unit [hp : %d]\n", hp);
	}

	@Override
	public void damage(int att) {
		if(hp>0) {
			hp-=att;
			System.out.printf("%d만큼 아야!!\n",att);
		}
		
	}

}

//우주 건설 차량 SCV는 
//다른 유닛들 중에 "수리가능한" 유닛을 -> 어떻게 식별? -> 마크 인터페이스를 활용
//수리하는 기능을 가진다. -> repair()메소드
class SCV extends GroundUnit implements Repairable , Damageable{
	
	public SCV() {
		super(200);
		hp=MAX_HP;
		super.setName("SCV");
		System.out.printf("SCV의 생성..Unit [hp : %d]\n", hp);
	}
	
	public void repair(Repairable repairable) {//수리가 가능한 객체를 인자로 받아서, //이부분 헷갈렸으므로 숙지하기 repairable을 유닛으로 생각하면 좀더 편함
		// Upcasting -> Unit 의 멤버 hp 처리하기 위함
		Unit unit = (Unit) repairable;
		
		while(unit.hp <unit.MAX_HP) {
			unit.hp ++;
			System.out.println("수리중>>");			
		}
		System.out.printf("[%s 수리완료]\n",unit.name);
	}

	@Override
	public void damage(int att) {
		if(hp>0) {
			hp-=att;
			System.out.printf("%d만큼 아야!!\n",att);
		}
		
	}

}


//AirUnit
//ㄴ DropShip(120)
class DropShip extends AirUnit implements Damageable{
	
	public DropShip() {
		super(120);
		hp=MAX_HP;
		System.out.printf("DropShip의 생성..Unit [hp : %d]\n", hp);
		
	}

	@Override
	public void damage(int att) {
		if(hp>0) {
			hp-=att;
			System.out.printf("%d만큼 아야!!\n",att);
		}
		
	}
}


public class Ex05_Starcraft {

	public static void main(String[] args) {
		
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();		
		DropShip ship = new DropShip();
		
		tank.damage(10);
		marine.damage(11);
		scv.damage(5);
		ship.damage(1);
		
		
		scv.repair(tank);
//		scv.repair(marine);			//마크인터페이스 즉 repairable가 붙지않아서 수리불가
		scv.repair(scv);
//		scv.repair(ship);			//마크인터페이스 즉 repairable가 붙지않아서 수리불가

	}

}



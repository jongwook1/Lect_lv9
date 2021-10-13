package lv10;

interface Repairable2{
	
}

interface Damegeable2{
	
	public void damage(int att);
}


class Unit2{
	final int MAX_HP;
	int hp;
	String name;
	
	public Unit2(int hp) {
		this.MAX_HP=hp;
	}
	
	public void setName(String name) {
		this.name=name;
		
	}	
}

class GroundUnit2 extends Unit2 {
	public GroundUnit2(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}
}

class AirUnit2 extends Unit2 {
	public AirUnit2(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}
}

class Tank2 extends GroundUnit2 implements Repairable2, Damegeable2{

	public Tank2() {
		super(150);
		hp= MAX_HP;
		super.setName("탱크");
		System.out.printf("탱크의 생성...Unit[hp : %d]\n", hp);
	}

	@Override
	public void damage(int att) {
		if(hp>0) {
		hp-=att;
		}
		System.out.printf("%s가 %d만큼 공격받음\n",name,att);
	}
	
}

class Marin2 extends GroundUnit2 implements Damegeable2{

	public Marin2() {
		super(50);
		hp= MAX_HP;
		super.setName("마린");
		System.out.printf("마린의 생성...Unit[hp : %d]\n", hp);
	}

	@Override
	public void damage(int att) {
		if(hp>0) {
			hp-=att;
			}
			System.out.printf("%s가 %d만큼 공격받음\n",name,att);
		
	}
	
}

class Scv2 extends GroundUnit2 implements Repairable2, Damegeable2{

	public Scv2() {
		super(80);
		hp= MAX_HP;
		super.setName("SCV");
		System.out.printf("SCV의 생성...Unit[hp : %d]\n", hp);
	}
	
	public void repair(Repairable2 Uni) {
		
		Unit2 unit = (Unit2) Uni;
		while(unit.hp<unit.MAX_HP) {
			unit.hp++;
			System.out.println("수리중>>");
			
		}
		System.out.printf("[%s 수리완료]\n",unit.name);
	}

	@Override
	public void damage(int att) {
		if(hp>0) {
			hp-=att;
			}
			System.out.printf("%s가  %d만큼 공격받음\n",name,att);
		
	}
	
}

class DropShip2 extends AirUnit2 implements Damegeable2{

	public DropShip2() {
		super(130);
		hp= MAX_HP;
		super.setName("드랍쉽");
		System.out.printf("드랍쉰의 생성...Unit[hp : %d]\n", hp);
	}

	@Override
	public void damage(int att) {
		if(hp>0) {
			hp-=att;
			}
			System.out.printf("%s가 %d만큼 공격받음\n",name,att);
		
	}
	
}

public class Ex05_Starcraft_t1 {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marin2 marin = new Marin2();
		Scv2 scv = new Scv2();
		DropShip2 ship = new DropShip2();

		tank.damage(8);
		marin.damage(2);
		scv.damage(5);
		ship.damage(9);
		
		scv.repair(tank);
		scv.repair(scv);
		
	}

}

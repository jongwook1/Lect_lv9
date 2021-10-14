package models;

public class Hero extends Unit {
//	String name;
//	int hp;
//	int att;
//	int def;
//	int spot;

	private int cnt = 3;
	public Hero(String name, int hp, int att, int def, int pos) {
		super(name, hp, att, def, pos);
		// TODO Auto-generated constructor stub
	}
	public void attck(Unit target) {
		if(target instanceof ZombieKing) {
			if(((ZombieKing) target).getShield()>0){		//// Upcasting????
				int deal = (this.getAtt() - target.getDef())*(ran.nextInt(150)+50)/100;
				if(deal <= 0) {
					deal = 1;
				}
				System.out.println(this.getName() + "의 공격!");
				System.out.println(deal+"의 대미지!");
				((ZombieKing) target).setShield(((ZombieKing) target).getShield()-deal);
				if(((ZombieKing) target).getShield() <=0) {
					System.out.println(target.getName() + "의 쉴드가 박살났다!");
					((ZombieKing) target).setShield(0);
				}
				System.out.println(target.getName() + "의 남은 체력: "+target.getHp() + "(쉴드 : " + ((ZombieKing) target).getShield() +")");
			}
			else {
				super.attack(target);
			}
		}
		else {
			super.attack(target);
		}
		
	}
	public void drink() {
		if(this.cnt > 0) {
			System.out.println("회복약을 마십니다");
			System.out.println("체력이 100회복 되었습니다");
			this.setHp(this.getHp() + 100);
			System.out.println(this.getName()+"의 남은 체력 : " + this.getHp());
			cnt--;
		}
		else {
			System.out.println("물약이 없습니다.");
		}
		
	}

	
	
	
	
}

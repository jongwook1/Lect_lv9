package models;

import controller.Game;

public class Hero extends Unit {

	public Hero(String name, int hp, int att, int def, int pos) {
		super(name, hp, att, def, pos);
		// TODO Auto-generated constructor stub
	}

	private int cnt = 3;

	public int getCnt() {
		return cnt;
	}

	public void attack(Unit enemy) {
		if (enemy instanceof ZombieKing) { // enemy의 형변환을 ZombieKing으로 할수 있냐를 묻는거 즉 좀비킹에만 있는 shield를 가져오기위함
			if (((ZombieKing) enemy).getShield() > 0) {
				int deal = (this.getAtt() - enemy.getDef()) * (Game.ran.nextInt(150) + 50) / 100;
				if (deal <= 0) {
					deal = 1;
				}
				System.out.println(this.getName() + "의 공격!");
				System.out.println(deal + "의 데미지");
				if (((ZombieKing) enemy).getShield() <= 0) {
					System.out.println(enemy.getName() + "의 쉴드가 깨졌습니다");
					((ZombieKing) enemy).setShield(0);
				}
				System.out.println(enemy.getName() + "의 남은 체력 : " + enemy.getHp());
			} else
				super.attack(enemy);
		} else {
			super.attack(enemy);
		}
	}

	public void drink() {
		if(this.getCnt()>0) {
			System.out.println("회복약을 마십니다");
			
		}
		
	}
}

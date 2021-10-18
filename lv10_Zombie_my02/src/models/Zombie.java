package models;

import controller.Game;

public class Zombie extends Unit implements Attack {

	public Zombie(String name, int hp, int att, int def, int pos) {
		super(name, hp, att, def, pos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Unit enemy) {
		int deal = (this.getAtt() - enemy.getDef()) * (Game.ran.nextInt(100) + 50) / 100;
		if (deal <= 0) {
			deal = 1;
		}
		System.out.println(this.getName() + "의 공격!");
		System.out.println(this.getAtt() + "의 데미지");
		enemy.setHp(enemy.getHp() - deal);
		System.out.println(enemy.getName() + "의 남은 체력 : " + enemy.getHp());
		
	}

}

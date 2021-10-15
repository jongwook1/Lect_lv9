package models;

import controller.Game;

public class ZombieKing extends Unit {

	int shield = 0;

	public ZombieKing(String name, int hp, int att, int def, int pos, int shield) {
		super(name, hp, att, def, pos);
		this.shield = shield;
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	public void attack(Unit enemy) {
		if (Game.ran.nextInt(100) > 74) {
			int deal = (this.getAtt() - enemy.getDef()) * (Game.ran.nextInt(150) + 50) / 100;
			if (deal <= 0) {
				deal = 1;
			}
			deal *= 2;
			System.out.println(this.getName() + "의 필살기!!!!!!");
			System.out.println(deal + "의 대미지!");
			enemy.setHp(enemy.getHp() - deal);
			System.out.println(enemy.getName() + "의 남은 체력 : " + enemy.getHp());
		} else {
			super.attack(enemy);
		}
	}

}

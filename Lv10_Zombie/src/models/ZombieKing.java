package models;

public class ZombieKing extends Unit{

	private int shield;
	public ZombieKing(String name, int hp, int att, int def, int pos,int shield) {
		super(name, hp, att, def, pos);
		this.shield = shield;
	}
	
	public int getShield() {
		return shield;
	}
	public void setShield(int shield) {
		this.shield = shield;
	}

	public void attack(Unit target) {
		if(ran.nextInt(100)>74) {
		int deal = (this.getAtt() - target.getDef())*(ran.nextInt(100)+50)/100;
		if(deal<=0) {
			deal*= 2;
		}
		System.out.println(this.getName()+"의 필살기!!!");
		System.out.println(deal+"의 대미지!");
		target.setHp(getHp()-deal);					//////////////target.gethp()로 안해도 맞나 확인하기
		System.out.println(target.getName()+"의 남은 체력 : " + target.getHp());
	}else {
		super.attack(target);
	}
		}
}

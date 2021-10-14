package models;

public class ZombieKing extends Unit{

	private int shield;
	public ZombieKing(String name, int hp, int att, int def, int pos,int shield) {
		super(name, hp, att, def, pos);
		this.shield = shield;
	}

}

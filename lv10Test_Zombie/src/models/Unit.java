package models;

public abstract class Unit {
	private String name;
	private int hp;
	private int att;
	private int def;
	private int pos;
	
	
	public int getPos() {
		return pos;
	}


	public void setPos(int pos) {
		this.pos = pos;
	}


	Unit(String name, int hp, int att, int def, int pos){
		this.name = name;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.pos = pos;
	}
	
}

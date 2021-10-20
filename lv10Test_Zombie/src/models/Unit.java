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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getAtt() {
		return att;
	}


	public void setAtt(int att) {
		this.att = att;
	}


	public int getDef() {
		return def;
	}


	public void setDef(int def) {
		this.def = def;
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

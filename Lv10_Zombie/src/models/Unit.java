package models;

import java.util.Random;

public abstract class Unit {
	Random ran= new Random();
	private String name;
	private int hp;
	private int att;
	private int def;
	private int pos;
	
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
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	
	Unit(String name,int hp, int att, int def, int pos){		//생성자
		this.name = name;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.pos = pos;
	}
	
	public void print() {
		System.out.println("[이름] : " + this.getName() + "[체력] : " +this.getHp() );
		System.out.println("[공격력] : " + this.getAtt() + "[방어력] : "+ this.getDef() +"[위치] : "+this.getPos());
	}
}

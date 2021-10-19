package models;

public abstract class Unit {
	private int curhp;

	public int getCurhp() {
		return curhp;
	}

	public int getMaxhp() {
		return maxhp;
	}

	public int getPower() {
		return power;
	}

	public void setCurhp(int curhp) {
		this.curhp = curhp;
	}

	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public String getState() {
		return state;
	}

	private int maxhp;
	private int power;
	public String name;
	private String state = "노말";

	Unit() {
	};

	Unit(String na, int max, int pw) {
		this.name = na;
		this.maxhp = max;
		this.curhp = max;
		this.power = pw;
	}

	public void init(int max, int pw) {
		this.maxhp = max;
		this.curhp = max;
		this.power = pw;
	}

	public void init(String na, int max, int pw) {
		this.name = na;
		this.maxhp = max;
		this.curhp = max;
		this.power = pw;
	}

	public void printData() {
		System.out.println("[" + this.name + "]" + "[" + this.curhp + "/" + this.maxhp + "]" + "[" + this.power + "]");
	}

	public void attack(Unit target) {
		target.setCurhp(getCurhp() - this.getPower());
		System.out.println(
				"[" + this.getName() + "] 이 " + "[" + target.getName() + "] 에게 " + this.getPower() + "의 데미지를 입힙니다. ");

		if (target.getCurhp() <= 0) {
			System.out.println("[" + target.getName() + "] 을 쳐치했습니다.");
			target.setCurhp(0);
		}

	}
}

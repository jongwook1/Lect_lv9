package models;

public class Item {
	//////
//	public static Item Instance=new Item();
	//////
	static final int WEAPON = 1;
	static final int ARMOR = 2;
	static final int RING = 3;
	int kind;
	String name;
	int power;
	int price;
	
	public void setItem(int k , String n , int p , int pr) {
		kind= k; name = n; power = p; price = pr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	
}

package lv10;

public class Vehicle {

//		protected String color;
	public String name;
	protected String color;	//타 패키지의 자식 클래스까지만
//	String color;	// default
	private int speed;
	
	//생략되어있는 기본생성자
	//public Vehicle(){}
	
	public Vehicle(String name) {
		this.name = name;
	}

}

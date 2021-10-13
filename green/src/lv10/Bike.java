package lv10;

public class Bike extends Vehicle {

	public Bike(String name) {
		super(name);
//		name = "name";
		color = "Black";
		
		//오버라이딩 : 상속받은 부모의 메소드를 재정의 하는 것
	}
	public String toString() {
		return "바이크의 이름은 " + name;
		
	}
	
} 


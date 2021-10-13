package diff;

import lv10.Vehicle;

public class Car extends Vehicle {

	public Car(String name) {
		super(name);		//부모 클래스의 생성자 호출 우선으로 한뒤,
//		super.name="ray";
		super.color = "blue";		
		
	}
	public String toString() {
//			return super.toString();	// JVM상의 instance
		return "자동차의이름은 " +name;
	}


	
}




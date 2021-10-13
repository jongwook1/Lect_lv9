package lv10;

import diff.Car;

public class Ex {

	public static void main(String[] args) {
		Car car=new Car("아반떼");
		Bike bike = new Bike("베스파");
		
		System.out.println(car.toString());
		System.out.println(car);
		
		Vehicle v= new Vehicle("no name");
		System.out.println(v.toString());
		System.out.println(v);

	}

	
}

package lv6;

import java.util.Random;

// Random,Scanner,File, FileWriter, FileReader, BufferedReader, Integer, 
// String 

//클래스 Class
//ㄴ 사용자 정의 자료형

// 객체 : 단위 
// 자동차, 사람 (User), 책...

// 클래스 정의
// class 클래스명(대문자시작){} 

class Person{	//이때는 아직 객체가 아님 아래쪽 new를 통해 객체가됌
	// 클래스 멤버(속성값)
	Long code;
	int gender; //1m 2f
	String name;
	int age;
	int height;
	int weight;
	String address;
}

public class Ex01 {

	public static void main(String[] args) {
		
		Random rn= new Random();	
		//클래스 초기화 (객체를 생성)	
		//클래스명 변수명 = new 클래스명();
		
		Person jongwook=new Person();
		
		System.out.println(jongwook); //@41a4555e
		
		// 클래스 변수 이름을 쓰고 .
		jongwook.code = 1234L;
		jongwook.gender= 1;
		jongwook.address="";
		jongwook.age=0;
		jongwook.height=0;
		jongwook.weight=0;

		//여러개 나올수있음
		Person hgd = new Person();
		Person kjy= new Person();
		Person aaa= new Person();
		Person bbb= new Person();
		

	}

}

package lv8;

import java.util.ArrayList;
import java.util.Scanner;

//Java 컬렉션
// List > ArrayList	(객체 배열)

class Person{
	private String name;
	private int age;
	private int gender;
	
	public Person(String name, int age, int gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void printInfo() {
		System.out.printf("%s %d %d\n", this.name,this.age,this.gender);
	}
	
}

public class Ex00 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person group[]=new Person[10];	// 클래스 배열(고정된 코기)
		
		//번외 래퍼클래스	: 기본자료형 -> 객체화 한것
		ArrayList<Integer> arr = new ArrayList<>();
		Integer num=(Integer)sc.nextInt();
//		Integer num=new(Integer)sc.nextInt();
		arr.add(num);
//		arr.add(20);
		
		
		
		ArrayList<Person> group2 =new ArrayList<Person>();
		System.out.println(group2); //내용물(리스트의) 전체 출력

		//1. 추가
		Person jiyeon= new Person("김지연", 2, 100);
		group2.add(jiyeon);
		System.out.println(group2.size());
//		System.out.println(group2);
		
		Person gildong=new Person("홍길동", 1, 30);
		Person dooly =new Person("둘리", 1, 10);
		
		group2.add(gildong);
		group2.add(dooly);
		
		System.out.println(group2);
		System.out.println(group2.size());
		
		//2. 삽입
		group2.add(0, jiyeon);
		System.out.println(">>");
		for(int i=0;i<group2.size();i++) {
			group2.get(i).printInfo();
		}
		
		//3-1. 삭제(인덱스)
		group2.remove(0);
		group2.add(0, jiyeon);
		System.out.println(">>");
		for(int i=0;i<group2.size();i++) {
			group2.get(i).printInfo();
		}
		
		//3-2 삭제 (값)
		arr.remove(num);
		
		
		group2.remove(dooly);
		group2.add(0, jiyeon);
		System.out.println(">>");
		for(int i=0;i<group2.size();i++) {
			group2.get(i).printInfo();
		}
		
		//4. 수정
		group2.set(0, dooly);
		
		
		//5.값 가져오기 get()
		System.out.println(">>");
		for(int i=0;i<group2.size();i++) {
			group2.get(i).printInfo();
		}
		
		System.out.println("---------------");
		for(Person e: group2) {
			e.printInfo();
		}
		
//		System.out.println(group2.size());
		
	}

}

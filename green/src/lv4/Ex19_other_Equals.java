package lv4;

import java.util.Scanner;

public class Ex19_other_Equals {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		String a="abc";
		String b="abc";
		String c= sc.next();		//abc
		
		
		//String 객체의 주소를 비교함
		System.out.println(a==b);			//true
		System.out.println(b==c);			//false
		
		//String 객체의 값을 비교함
		System.out.println(a.equals(b));	//true
		System.out.println(b.equals(c));	//true
		
		//문자열의 확장
		
		
		String items="";
		
		items +="사과";
		items +="/";
		items +="딸기";
		items +="/";
		items +="수박";
		
		System.out.println(items);
	}

}

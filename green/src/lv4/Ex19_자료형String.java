package lv4;

import java.util.Scanner;

public class Ex19_자료형String {

	public static void main(String[] args) {
		//자료형
		//1. int
		//2. double
		//3. char
		//4. boolean
		//5. String (기본자료형이 아님)
				
		
		// 문자열 : 문자(char)의 나열(배열)
		
		String name= "홍길동";
		//									{'홍','길','동'}
		//									  0    1   2 
		
		System.out.println(name);
		System.out.println(name.length());
		
//		//입력받기
//		Scanner sc= new Scanner(System.in);
//		System.out.println("이름 입력: ");
//		
//		String data = sc.next();		//문자열 입력 처리
//		System.out.println(data);
		
		//문자열 메소드
		
		//ㄴ비교
		String temp= "홍길동";
		if(name.equals(temp)){//equals 기준은 왼쪽!    //(name ==temp) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		//ㄴ문자열의 대소비교(정렬)
		// 문자열.compareTo(비교문자열)
		// 문자열을 기준으로 비교문자열과 비교했을때,문자열의 위치
		
		temp="이종욱";
		System.out.println(name.compareTo(temp));
		
		
		
	}

}

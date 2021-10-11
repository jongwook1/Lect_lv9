package lv6;

import java.util.Random;

//클래스 : 사용자 정의 자료형
//ㄴ 요소
//  1) 멤버변수
//	2) 메서드


//
class Intro{
	String name;
	
	// 메서드(함수) : 기능단위의 코드들을 재사용할 수 있게 만든것 (클래스안에있어야함)
	// 메서드 정의
	// 자료형키워드 메서드명(){ 실행문 }
	// void - 반환할 타입이 정해지지 않은 경우에 사용
	
	// 4가지 유형의 메서드 정의방법
	
	//!!!!!!return을 만나면 메서드는 호출한곳에서 결과값을  남기고 사라진다!!!!!!!
	
	// Type1
	// 반환X, 파라미터X
	void sayHello() {
		//실행문
		System.out.printf("%s아 안녕!\n", name);		
	}
	//문제) 1~5까지의 합을 출력하는 메서드
	// 내가한거
//	int total=0;
//	void sum() {
//		for(int i=1;i<=5;i++) {
//			total+=i;
//		}
//		System.out.println(total);		
//	}
	
	//answer
	void oneToFive() {
		int sum=0;
		for(int i=1;i<=5;i++) sum +=i;
		System.out.println(sum);
	}
	
	
	
	// Type2
	// 반환X, 파라미터O
	void add(int num1,int num2) {	//parameter 매개변수
		int sum=num1+num2;
		System.out.println(sum);		
	}
	
	// Type3   void가 아닌것- retrun이 항상따라옴
	// 반환O, 파리미터X
	int ranNum() {
		Random rn= new Random();
		int rNum=rn.nextInt(10)+1;
		return rNum;		
				
	}
	
	// Type4
	// 반환O, 파라미터O
	String makeStr(String key) {
		return key + "야 안녕!";
	}
	
	//메서드 오버로딩
	
	
}

//class Calculator{
//	// 0. guide message(출력)
//	void message() {
//		System.out.println("0. guide message");
//	}
//	// 1. 덧셈
//	int plus(int num1,int num2) {
//		int sum=0;
//		return sum=num1+num2;
//	}
//	// 2. 뺄셈
//	int minus() {
//		int min=0;
//		retrun min
//	}
//	// 3. 곱셈
//	// 4. 나눗셈
//	// 5. %
//}




public class Ex16_Method {

	public static void main(String[] args) {
		
		String str = "abcd";
//		str.
		
		// 메서드의 사용(호출)
		// .(닷)을 찍고-> 클래스가 기지고 있는 메서드를 선택
		
		Intro intro = new Intro();
		intro.name ="이종욱";
		intro.sayHello();
		
//		intro.sum();
		intro.oneToFive();
		
		intro.add(10, 20);	//arguments 인자(값)

		int a=12;
		int b=33;
		 intro.add(a, b);
		 
		
		 
		 int num = intro.ranNum();
		System.out.println(num);
		
		
		
		String result = intro.makeStr("둘리");
		System.out.println(result);
		
		
	}

}

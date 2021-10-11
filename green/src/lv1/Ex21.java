package lv1;

public class Ex21 {

	public static void main(String[] args) {
		
		//제어문 : 프로그램의 실행 흐름을 제어
		//	ㄴ 조건문, 반복문, 보조제어문
		
		// 제어문의 구조
		//	ㄴ키워드(조건식){ 실행문; }
		
		//반복문 : while, for
//			while(true){
//		System.out.println("반복중>>");
//	}	
		
		//	반복문 종료 조건
		// 1 초기식 
		// 2 조건식
		// 3 증감식
		
		//ex변수 n이 5까지 도달하면 -> 반복문 종료
		int num = 0;					// 초기식 : 반복문 밖에서 선언한 변수
		
		while(num < 5) {				//조건식 : 초기식의 변수를 참조한 조건
			System.out.println(num);
			num ++;						// 증감식 : 초기식의 변수를 변화시킴
			
		}
		
		System.out.println("num: " + num);	//5
		
		
		
	}

}

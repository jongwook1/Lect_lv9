package lv1;

public class EX04_1 {

	public static void main(String[] args) {
		//변수명의 이름 규칙
		//1)카멜표기법
		//2)헝가리언
		
		// 변수를 사용해서 문제해결
		
		// 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력
		
		int money = 1000;
		int price = 200;
		int payback = money - price;
		
		System.out.println("잔돈은 " + payback + "원 입니다.");
		

		// 문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
				// 문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
				int n1 = 30;
				int n2 = 50;
				int n3 = 4;
				System.out.println((n1+n2+n3)/3);				
		
				// 문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
				int n4 = 3; 
				int n5 = 6;
				System.out.println((n4*n5)/2);
				
				// 문제4) 100초를 1분 40초로 출력
				int n6 = 100;
				int n7 = 60;
				System.out.println((n6/n7) +"분"+ (n6%n7) + "초");
				// 문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
				double d1 = 800;
				double d2 = 500;
				
				System.out.println(d1/d2 +"개");
				
				
				// 정답5) 500원(1개), 100원(3개)
				
				//변수는 단 한개의 값을 저장할 수 있음
				
				//값교체 문제 (힌트 : 변수 활용)
				int x = 10;
				int y = 20;
		//잘못된 예 		x = y;
		//				y = x;
				int z;
				z = x;
				x = y;
				y = z;
				
				
				
				System.out.println(x);		//20
				System.out.println(y);		//10
		
		
	}

}

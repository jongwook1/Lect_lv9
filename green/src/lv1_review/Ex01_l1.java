package lv1_review;

public class Ex01_l1 {

	public static void main(String[] args) {
		// 예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력
		int 현금 = 1000;
		int 과자 = 200;
		int 잔돈 = 현금 - 과자;
		System.out.println("잔돈 = " + 잔돈 + "원");

		// 문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		int 월급=100;
		int 세전연봉=100*12;
		int 세금 =	세전연봉/10	;
		int 세후연봉=세전연봉-세금;
		System.out.println("연봉 = "+세후연봉+"원");
		
		// 문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		int a=30;
		int b=50;
		int c=4;
		int total=a+b+c;
		double avg=total/3.0;
		System.out.println("평균: "+avg+"점");
		
		// 문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int x=3;
		int y=6;
		int 넓이=x*y/2;
		System.out.println("넓이: "+넓이);
		
		// 문제4) 100초를 1분 40초로 출력
		int total1=100;
		int m=100/60;
		int s=100%60;
		System.out.println("100초를 분초로 하면"+m+"분"+s+"초");
		
		
		// 문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		// 정답5) 500원(1개), 100원(3개)
		int money=800;
		int o=money%500;
		int p=(money%500)/100;
		System.out.println("500"+o+"개");
		System.out.println("100"+p+"개");
		
		
	}

}

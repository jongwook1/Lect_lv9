package lv1;

import java.util.Scanner;

public class Test6_lv1 {

	public static void main(String[] args) {
		
		// 직접구현 1. 시험점수 평균
				// 시작 11:05
				// 종료 11:26
				// 소요 21분 00
		
		// 문제) 시험점수3개를 입력받고 학점출력 
				// 조건 1) 3과목의 평균을 가지고 점수를 매긴다.
				// 조건 2) 3과목의 평균이 100~90 ==> A
				// 조건 3) 3과목의 평균이 89~80 ==> B
				// 조건 4) 3과목의 평균이 79~70 ==> C
				// 조건 5) 69이하                      ==> 재시험 
				// 추가조건) 각점수대별로 끝자리가 7점 이상은 + 가붙는다. 
				// 예) 98 ==> A+
				// 예) 89 ==> B+
				// 예) 79 ==> C+
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A성적을 입력하세요");
			
		int a = sc.nextInt();
		
		if(a > 100) {
			System.out.println("100점이상은 입력할수 없습니다");
		}
		System.out.println("B성적을 입력하세요");
		int b = sc.nextInt();
		if(b > 100) {
			System.out.println("100점이상은 입력할수 없습니다");
		}
			
		System.out.println("C성적을 입력하세요");
		int c = sc.nextInt();
		if(c > 100) {
			System.out.println("100점이상은 입력할수 없습니다");
		}
			
		
		
			int avg = (a + b + c) /3;
			int n = avg % 10;
		if(a > 100 || b > 100 || c > 100) {
			System.out.println("각 과목의 100점 이상은 입력할수없습니다");
		}
		else if(avg >= 90) {
			if(n == 0 || n >= 7) {
				System.out.println("A과목의 성적 : " + a);
				System.out.println("B과목의 성적 : " + b);
				System.out.println("C과목의 성적 : " + c);
			System.out.println("평균성적 : " + "A+");			
			}else {
				System.out.println("A과목의 성적 : " + a);
				System.out.println("B과목의 성적 : " + b);
				System.out.println("C과목의 성적 : " + c);
				System.out.println("평균성적 : " + "A");
			}
		}
		else if(avg >= 80){
			if(n >= 7) {
				System.out.println("A과목의 성적 : " + a);
				System.out.println("B과목의 성적 : " + b);
				System.out.println("C과목의 성적 : " + c);
			System.out.println("평균성적 : " + "B+");			
			}else {
				System.out.println("A과목의 성적 : " + a);
				System.out.println("B과목의 성적 : " + b);
				System.out.println("C과목의 성적 : " + c);
				System.out.println("평균성적 : " + "B");
			}
		}
		else if(avg >= 70){
			if(n >= 7) {
				System.out.println("A과목의 성적 : " + a);
				System.out.println("B과목의 성적 : " + b);
				System.out.println("C과목의 성적 : " + c);
			System.out.println("평균성적 : " + "C+");			
			}else {
				System.out.println("A과목의 성적 : " + a);
				System.out.println("B과목의 성적 : " + b);
				System.out.println("C과목의 성적 : " + c);
				System.out.println("평균성적 : " + "C");
			}
		}
		else {
			System.out.println("평균성적 69점이하해당----->재시험 ");
		}
	}
}

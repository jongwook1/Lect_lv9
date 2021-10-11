package lv1_review;

import java.util.Scanner;

public class L1_t6 {

	public static void main(String[] args) {
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
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("a과목점수입력하세요");
		int a=sc.nextInt();
		System.out.println("b과목점수입력하세요");
		int b=sc.nextInt();
		System.out.println("c과목점수입력하세요");
		int c=sc.nextInt();
		
		
		
		int sum = a + b + c;
		int avg = sum / 3;
		int over = avg % 10;

		if (a >= 0 && a <= 100 && b >= 0 && b <= 100 && c >= 0 && c <= 100) {
			if (avg >= 90 && avg <= 100) {
				if (over >= 7) {
					System.out.println("평균은 : A+");
				} else {
					System.out.println("평균은 : A");
				}
			} else if (avg >= 80 && avg <= 89) {
				if (over >= 7) {
					System.out.println("평균은 : B+");
				} else {
					System.out.println("평균은 : B");
				}
			} else if (avg >= 70 && avg <= 79) {
				if (over >= 7) {
					System.out.println("평균은 : C+");
				} else {
					System.out.println("평균은 : C");
				}
			} else {
				System.out.println("재시험준비하세요");
			}
		} else {
			System.out.println("점수가 잘못되었습니다");
		}
	}

}

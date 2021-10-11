package lv1_review;

import java.util.Scanner;

public class Ex15_l1 {

	public static void main(String[] args) {
		/*
		 * # 구구단 게임[1단계]
		 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
		 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
		 * 예)	3 x 7 = ?
		 * 3. 문제에 해당하는 정답을 입력받는다.
		 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
		 */

		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자1입력하세요");
		int n1=sc.nextInt();
		System.out.println("숫자2입력하세요");
		int n2=sc.nextInt();
		
		int answer=n1*n2;
		
		System.out.println("정답 입력");
		int mAnswer=sc.nextInt();
		
		if(answer==mAnswer) {
			System.out.println("정답");
		}else if(answer!=mAnswer) {
			System.out.println("떙");
		}
	}

}

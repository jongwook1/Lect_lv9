package lv1_review;

import java.util.Scanner;

public class Ex14_l1 {

	public static void main(String[] args) {
		/*
		 * # 최대값 구하기[1단계]
		 * 1. 숫자 3개를 입력받는다.
		 * 2. 입력받은 3개의 수를 비교하여,
		 * 3. 가장 큰 수(MAX)를 출력한다.
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를입력해주세요");
		int n1=sc.nextInt();
		System.out.println("숫자를입력해주세요");
		int n2=sc.nextInt();
		System.out.println("숫자를입력해주세요");
		int n3=sc.nextInt();
		
		int max=n1;
		if(n1<n2) {
			max=n2;
		}if(n2<n3) {
			max=n3;
		}

		System.out.println("최대값은: " +max);
	}

}

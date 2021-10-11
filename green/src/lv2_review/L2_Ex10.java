package lv2_review;

import java.util.Scanner;

public class L2_Ex10 {

	public static void main(String[] args) {
		/*
		 * # 최대값 구하기[2단계]
		 * 1. 3회 반복을 하면서 정수를 입력받는다.
		 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
		 */

		Scanner sc = new Scanner(System.in);
		int i = 0;
		int max = 0;
		while (i < 3) {
			System.out.println("정수를 입력해주세요");
			int inputN = sc.nextInt();
			if (max < inputN) {
				max = inputN;
			}

			i++;
		}
		System.out.println("최대값" + max);
	}

}

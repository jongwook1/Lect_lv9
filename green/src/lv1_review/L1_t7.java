package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class L1_t7 {

	public static void main(String[] args) {
		/*
		 * # 구구단 게임[2단계]
		 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 랜덤하게 저장한다.
		 * 2. 저장된 숫자를 토대로 구구단 문제를 출력한다.
		 * 예)	3 x 7 = ?
		 * 3. 문제에 해당하는 정답을 입력받는다.
		 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int a = rn.nextInt(10) + 1;
		int b = rn.nextInt(10) + 1;

		int answer = a * b;
		System.out.println(a + "  X " + b + " = " + " ?");
		System.out.println("정답을 입력하세요");
		int myAnswer = sc.nextInt();
		if (answer == myAnswer) {
			System.out.println("정답");
		} else {
			System.out.println("떙");
		}

	}

}

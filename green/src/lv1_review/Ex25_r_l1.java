package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class Ex25_r_l1 {

	public static void main(String[] args) {
		/*
		 * # 연산자 기호 맞추기 게임
		 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
		 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
		 * 3. 위 숫자는 연산자 기호에 해당된다.
		 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
		 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
		 * 예) 3 ? 4  = 7
		 *    1) + 2) - 3) * 4) %
		 *    정답 : 2번
		 */

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		int a = rn.nextInt(10) + 1;
		int b = rn.nextInt(10) + 1;

		int answer = rn.nextInt(4) + 1;

		int q = 0;
		if (answer == 1) {
			q = a + b;
		} else if (answer == 2) {
			q = a - b;
		} else if (answer == 3) {
			q = a * b;
		} else if (answer == 4) {
			q = a / b;
		}

		System.out.println(a + " ? " + b + " = " + q);
		System.out.println("1) + 2)- 3)* 4)%");
		System.out.println("정답입력해주세요");
		int sel = sc.nextInt();

		if (answer == sel) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}

	}

}

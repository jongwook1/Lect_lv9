//내가한거
package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex25_me {

	public static void main(String[] args) {
		/*
		 * # Up & Down 게임[2단계] 1. com 은 랜덤으로 1~100사이를 저장한다. 2. me 는 1~100사이를 입력한다. 3.
		 * com 과 me 를 비교해서 com 크면 "크다" , com 이작으면 "작다" 힌트제공 4. 정답을 맞추면 게임은 종료된다.
		 */

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int com = ran.nextInt(100) + 1;
		// System.out.println(com);

		int result = 0;
		while (result < 1) {
			System.out.println("정답을입력하세요");
			int me = sc.nextInt();
			if (me > 0 && me < 101) {
				if (com == me) {
					result++;
				} else if (com > me) {
					System.out.println("크다");
				} else if (com < me) {
					System.out.println("작다");
				}

				// 결과값 result을 어디에 위치해야하는지가 어려웠음
				if (result == 1) {
					System.out.println("정답입니다");
					System.out.println("게임종료");
				}
			} else {
				System.out.println("1~100사이의 숫자를 입력하세요");
			}
		}
	}
}

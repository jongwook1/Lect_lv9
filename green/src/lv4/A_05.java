package lv4;

import java.util.Random;
import java.util.Scanner;

public class A_05 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50을 ==> 1 to 18
		 * 1. 구글에서 1 to 50 이라고 검색한다.
		 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
		 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
		 * 4. 숫자 1~9는 front 배열에 저장하고,
		 *    숫자 10~18은 back 배열에 저장한다.
		 */
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		final int SIZE = 9;
		int[] front = new int[SIZE];
		int[] back = new int[SIZE];

		for (int i = 0; i < 9; i++) {
			front[i] = i + 1;
			back[i] = i + 10;
		}

		for (int i = 0; i < 1500; i++) {
			int rIdx = rn.nextInt(9);
			int temp = front[0];
			front[0] = front[rIdx];
			front[rIdx] = temp;

			rIdx = rn.nextInt(9);
			temp = back[0];
			back[0] = back[rIdx];
			back[rIdx] = temp;

		}

		int gamenum = 1;
		while (true) {
			for (int i = 0; i < 9; i++) {
				System.out.print(front[i] + " ");
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			System.out.println();

			if (gamenum > SIZE * 2) {
				System.out.println("게임클리어");
				break;
			}

			System.out.print("제일작은수입력 ㄱㄱ(1~9)");
			int idx = sc.nextInt() - 1;

			if (idx >= 0 && idx < 9) {
				if (front[idx] == gamenum) {
					front[idx] = back[idx];
					back[idx] = 0;
					gamenum++;
				} else {
					System.out.println("틀렸습니다!");
				}

			}
		}

	}

}

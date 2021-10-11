package lv4_review;

import java.util.Random;
import java.util.Scanner;

public class L4_Ex04 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50을 ==> 1 to 18
		 * 1. 구글에서 1 to 50 이라고 검색한다.
		 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
		 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
		 * 4. 숫자 1~9는 front 배열에 저장하고,
		 *    숫자 10~18은 back 배열에 저장한다.
		 */

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		final int SIZE = 9;
		int[] front = new int[SIZE];
		int[] back = new int[SIZE];

		// 값 차례대로 넣기
		int idx = -1;
		for (int i = 0; i < SIZE; i++) {
			front[i] = i + 1;
			back[i] = 10 + i;
			idx = i;
		}

		// 셔플
		for (int i = 0; i < 1000; i++) {
			int rN = ran.nextInt(9);

			int temp = front[idx];
			front[idx] = front[rN];
			front[rN] = temp;
		}

		for (int i = 0; i < 1000; i++) {
			int rN = ran.nextInt(9);
			int temp = back[idx];
			back[idx] = back[rN];
			back[rN] = temp;
		}

		// run
		int gameN = 1;
		while (true) {
			// 출력
			for (int j = 0; j < SIZE; j++) {
				System.out.print(front[j] + " ");
				if (j % 3 == 2) {
					System.out.println();
				}
			}

			// 검사
			System.out.println("가장작은수의 인덱스번호 입력 ㄱ");
			int inputIdx = sc.nextInt() - 1;
			if(inputIdx>=0&&inputIdx<SIZE) {
			if (front[inputIdx] == gameN) {
				front[inputIdx] = back[inputIdx];
				back[inputIdx] = 0;
				gameN++;
			}
			}
			if (gameN > SIZE * 2) {
				System.out.println("클리어");
				break;
			}

		}

	}

}

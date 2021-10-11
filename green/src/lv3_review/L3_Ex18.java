package lv3_review;

import java.util.Random;
import java.util.Scanner;

public class L3_Ex18 {

	public static void main(String[] args) {
		/*
		 * # 기억력 게임
		 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
		 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
		 *    back에 모든 수가 채워지면 게임은 종료된다.
		 * 예)
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		 * 입력1 : 0
		 * 입력2 : 1
		 * 
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
		 */

		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int[] back = new int[10];

		// 셔플(shuffle)
		int i = 0;
		while (i < 1000) {
			int r = rn.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;

			i += 1;
		}

		int cnt = 0;
		while (true) {
			System.out.println("카드번호");
			for (int j = 0; j < front.length; j++) {
				System.out.print(j + 1 + " ");
			}
			System.out.println();
			System.out.println("카드의 값: ");
			for (int j = 0; j < front.length; j++) {
				System.out.print(front[j] + " ");
			}
			System.out.println();
			System.out.println("게임카드: ");
			for (int j = 0; j < front.length; j++) {
				System.out.print(back[j] + " ");
			}

			if (cnt == 5) {
				System.out.println("클리어");
				break;
			}

			System.out.println("\n1. 숫자 입력해주세요");
			int idx1 = sc.nextInt() - 1;
			System.out.println("2. 숫자 입력해주세요");
			int idx2 = sc.nextInt() - 1;

			if (idx1 == idx2 || idx1 < 0 || idx1 > 9 || idx2 < 0 || idx2 > 9) {
				System.out.println("숫자확인해주세요");
			} else {
				if (front[idx1] == front[idx2] && back[idx1] == 0) {
					back[idx1] = front[idx1];
					back[idx2] = front[idx2];
					cnt++;
				} else {
					System.out.println("땡");
				}
			}

		}

	}

}

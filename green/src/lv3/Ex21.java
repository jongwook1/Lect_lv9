package lv3;

import java.util.Random;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		/*
		 * # 기억력 게임 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다. 2. 정답을 맞추면 back에 해당 숫자를 저장해,
		 * back에 모든 수가 채워지면 게임은 종료된다. 예) front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5] back =
		 * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0] 입력1 : 0 입력2 : 1
		 * 
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5] back = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
		 */
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int[] back = new int[10];
		// 셔플(shuffle)
		int i = 0;
		while (i < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			i += 1;
		}

		int cnt = 0;
		while (true) {
			System.out.print("카드번호: ");
			for (int k = 0; k < 10; k++) {
				System.out.print(k + 1 + " ");
			}
			System.out.println();
			System.out.print("카드의앞: ");
			for (int k = 0; k < 10; k++) {
				System.out.print(front[k] + " ");
			}
			System.out.println();
			System.out.print("카드의뒤: ");
			for (int k = 0; k < 10; k++) {
				System.out.print(back[k] + " ");
			}
			if (cnt == 5) {
				System.out.println("종료합니다");
				break;
			}

			System.out.println("\n값입력 ㄱㄱ");
			int idx1 = sc.nextInt() - 1;
			System.out.println("값입력 ㄱㄱ");
			int idx2 = sc.nextInt() - 1;

			if (idx1 == idx2 || idx1 < 0 || idx1 > 10 || idx2 < 0 || idx2 > 10) {
				System.out.println("번호를다시확인하세요!");
			} else {
				if (front[idx1] == front[idx2] && back[idx1] == 0) {
					System.out.println("정답");
					back[idx1] = front[idx1];
					back[idx2] = front[idx2];
					cnt++;
				} else {
					System.out.println("떙!");
				}
			}
		}

	}

}

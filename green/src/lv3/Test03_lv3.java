package lv3;

import java.util.Scanner;

public class Test03_lv3 {

	public static void main(String[] args) {
		// ���� 14:25
		// ���� 15:15
		// �ҿ� 00:50
		/* 
		 * # ƽ����
		 * === ƽ���� ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [ ][ ][ ]
		 * [p1]�ε��� �Է� : 6
		 * === ƽ���� ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [O][ ][ ]
		 * [p1]�¸�
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int turn = 1;
		int win = 0;

		while (true) {
			for (int i = 0; i < 9; i++) {
				if (arr[i] == 1) {
					System.out.print("O ");
				} else if (arr[i] == 2) {
					System.out.print("X ");
				} else {
					System.out.print(i + 1 + " ");
				}
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			if (turn == 1) {
				System.out.println("p1 �Է� ����");
			} else if (turn == 2) {
				System.out.println("p2 �Է� ����");
			}
			int idx = sc.nextInt() - 1;

			if (arr[idx] == 1 || arr[idx] == 2) {
				System.out.println("�̹� ����� ��ȣ�Դϴ�!");
			} else {
				arr[idx] = turn;
				if (turn == 1) {
					turn++;
				} else {
					turn--;
				}
			}
			int who = turn == 1 ? 2 : 1;
			// ��
			for (int i = 0; i < 9; i += 3) {
				int cnt = 0;
				for (int j = 0; j < 3; j++) {
					if (arr[i + j] == who) {
						cnt++;
					}
				}
				if (cnt == 3) {
					win = who;
				}
			}
			// |
			for (int i = 0; i < 3; i++) {
				int cnt = 0;
				for (int j = 0; j < 3; j++) {
					if (arr[i + j * 3] == who) {
						cnt++;
					}
				}
				if (cnt == 3) {
					win = who;
				}
			}
			// \
			int cnt = 0;
			for (int i = 0; i < 9; i += 4) {
				if (arr[i] == who) {
					cnt++;
				}

			}
			if (cnt == 3) {
				win = who;
			}
			// /
			cnt = 0;
			for (int i = 2; i < 9; i += 2) {
				if (arr[i] == who) {
					cnt++;
				}
			}
			if (cnt == 3) {
				win = who;
			}

			if (win == 1) {
				System.out.println("P1��!");
				break;
			} else if (win == 2) {
				System.out.println("P2��!");
				break;
			}

		}

	}

}

package lv4;

import java.util.Scanner;

public class Lv4_test1 {

	public static void main(String[] args) {

		/*
		 * # ������ ����
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� ��
		 */

		// ���� �̵����ڸ� �Է¹��������� �̵� �ϴµ� 
				// �ܰ����θ� �̵� �Ʒ��׸����� 
				/*
				 * # ������ ����
				 * �� �� �� �� �� 
				 * �� �� �� �� �� 
				 * �� �� �� �� �� 
				 * �� �� �� �� �� 
				 * �� �� �� �� ��
				 */
				 //�Է� ==> 3 
				/*
				 * # ������ ����
				 * �� �� �� �� �� 
				 * �� �� �� �� �� 
				 * �� �� �� �� �� 
				 * �� �� �� �� �� 
				 * �� �� �� �� ��
				 */
				 //�Է� ==> 3 
				/*
				 * # ������ ����
				 * �� �� �� �� �� 
				 * �� �� �� �� �� 
				 * �� �� �� �� �� 
				 * �� �� �� �� �� 
				 * �� �� �� �� ��
				 */		

		Scanner sc = new Scanner(System.in);
		int player = 7;
		int game[][] = new int[5][5];

		int dir = 0;

		int y = 0;
		int x = 0;
		while (true) {
			game[y][x] = player; // ������ġ ����
			// ���
			for (int i = 0; i < game.length; i++) {
				if (i % 4 == 0) {
					for (int j = 0; j < game.length; j++) {
						if (game[i][j] == player) {
							System.out.print("�� ");
						} else {
							System.out.print("�� ");
						}

					}
					System.out.println();
				} else {
					for (int j = 0; j < game.length; j++) {
						if (j >= 1 && j <= 3) {
							System.out.print("�� ");
						} else {
							if (game[i][j] == player) {
								System.out.print("�� ");
							} else {
								System.out.print("�� ");
							}
						}
					}
					System.out.println();
				}
			}

			System.out.println("�̵��ҰŸ� �Է����ּ���(�����Ű������� 0���Է�)");
			int move = sc.nextInt();
			// Ư���������� ��ȯ
			for (int i = 0; i < move; i++) {
				if (x == 0 && y == 0) {
					dir = 0;
				} else if (x == 4 && y == 0) {
					dir = 1;
				} else if (y == 4 && x == 4) {
					dir = 2;
				} else if (y == 4 && x == 0) {
					dir = 3;
				}
				game[y][x] = 0; // �̵��ϱ��� ������ġ�� �迭�ǰ� 0���� �ٲ�

				// run
				if (dir == 0) {
					x++;
				} else if (dir == 1) {
					y++;
				} else if (dir == 2) {
					x--;
				} else if (dir == 3) {
					y--;
				}

			}
			if (move == 0) {
				break;
			}

		}

	}

}

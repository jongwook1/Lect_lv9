package lv5;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int game[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,0}
				};
				int yx[][] = new int[10000][2];
				// ����1) 0 �� �÷��̾��̴�
				// 1) left 2)right 3)up 4)down 5)�ǰ���
				// ��ȣ�� �Է¹ް� �ش���ġ�� �̵� ==> �̵��Ҷ� ���� ���� ��ȯ�Ѵ�.
				// ��) 1 ==>
				/*
				 * {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,0,15}
				 */

				// ����2) ��ȭ ==> ��ĭ��ĭ�̵��Ҷ����� yx �� �迭�� �̵��Ѱ�θ� �����ߴٰ�
				// 5���Է½� ==> �Դ���� �ǵ��ư��� �Ѵ�.

				int pY = 0;
				int pX = 0;
				int cnt = 0;
				while (true) {
					for (int i = 0; i < game.length; i++) {
						for (int j = 0; j < game[i].length; j++) {
							if (game[i][j] == 0) {
								System.out.print("��");
								pY = i;
								pX = j;
								yx[cnt][0] = pY;
								yx[cnt][1] = pX;
							} else {
								System.out.print(game[i][j]);
							}
						}
						System.out.println();
					}

					System.out.println("8�� 2�Ʒ� 4�� 6�� 5�ǰ���: ");
					int move = sc.nextInt();
					int yy = pY;
					int xx = pX;
					if (move == 8) {
						yy--;
						cnt++;
					} else if (move == 2) {
						yy++;
						cnt++;
					} else if (move == 4) {
						xx--;
						cnt++;
					} else if (move == 6) {
						xx++;
						cnt++;
					} else if (move == 5) {
						if (cnt == 0) {
							System.out.println("���̻� �ǰ��Ⱑ �ȵ˴ϴ�.");
							continue;
						}
						yy = yx[cnt - 1][0];
						xx = yx[cnt - 1][1];
						cnt -= 1;
					}
					// ����ó��
					else {
						continue;
					}
					if (xx < 0 || xx >= game.length) {
						cnt -= 1;
						continue;
					}
					if (yy < 0 || yy >= game.length) {
						cnt -= 1;
						continue;
					}

					game[pY][pX] = game[yy][xx];
					pY = yy;
					pX = xx;
					game[pY][pX] = 0;

				}

	}

}

package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex25_boomberman_my {

	public static void main(String[] args) {
		/*
		 * # ũ������ �����̵�
		 * 1. ���� ũ��� 7 x 7 �̴�. 
		 * 2. ��(1)��(2)��(3)��(4)�� �̵��� �����ϸ�,
		 *    ��ź��ġ(5), ����(6)�� �����Ѵ�. 
		 * 3. ��(3), �÷��̾�(2), ��ź(9), ������(4)�� �����Ѵ�.
		 * 4. ��, ��ź�� ��ġ�� ������� ������ �ϸ�,
		 *    ���� �� ���ڰ� ���·� ������.
		 * 5. �� �ı��� �������� �����ϰ� �����Ǿ�,
		 *    �������� ������ ��ġ�� �� �ִ� ��ź�� ������ �����ȴ�.
		 */

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		final int SIZE = 7;

		int map[][] = new int[SIZE][SIZE];

		int item[] = new int[2];

		final int PLAYER = 2;
		final int WALL = 3;
		final int BOMB = 9;
		final int ITEM = 4;

		boolean run = true;
		int check = 0;
		int[][] bomb = new int[1][2]; // [��ġ�� �������][{y��ǥ}{x��ǥ}]
		int y = 0;
		int x = 0;
		int bombMaxCnt = 3; // ��ġ������ ��ź�� �ִ밳��
		int bombCnt = 0; // ���缳ġ�� ��ź�� ����
		int itemCnt = 0;
		int wallcnt = 10;
//		int[] bombX = new int[bombMaxCnt];
//		int[] bombY = new int[bombMaxCnt];

		// �� ��ġ
		for (int i = 0; i < wallcnt; i++) {
			int wY = ran.nextInt(SIZE);
			int wX = ran.nextInt(SIZE);

			if (map[wY][wX] == 0) {
				map[wY][wX] = WALL;
			} else {
				i -= 1;
			}

		}

		// PLAYER ��ġ
		while (true) {
			y = ran.nextInt(SIZE);
			x = ran.nextInt(SIZE);
			if (map[y][x] == 0) {
				map[y][x] = PLAYER;
				break;
			}
		}

		// run
		while (true) {
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (map[i][j] == PLAYER) {
						System.out.print("��" + " ");
					} else if (map[i][j] == WALL) {
						System.out.print("��" + " ");
					} else if (map[i][j] == BOMB) {
						System.out.print("��" + " ");
					} else if (map[i][j] == ITEM) {
						System.out.print("��" + " ");
					} else {
						System.out.print("��" + " ");
					}
				}
				System.out.println();
			}
			System.out.println("��ġ������ �ִ���ź�� ����: " + bombMaxCnt + "  ��ġ�� ��ź�� ����: " + bombCnt);
			System.out.println("8�� 2�� 4�� 6�� 5��ź��ġ  0����");

			System.out.print("�޴� ���� : ");
			int choice = sc.nextInt();		

			// ĳ���̵� //4�� 6�� 8�� 2��
			int tempX = x;
			int tempY = y;
			if (choice == 4) {
				tempX--;
			} else if (choice == 6) {
				tempX++;
			} else if (choice == 8) {
				tempY--;
			} else if (choice == 2) {
				tempY++;
			}

			if (tempY < 0 || tempY >= SIZE || tempX < 0 || tempX >= SIZE || map[tempY][tempX] == WALL
					|| map[tempY][tempX] == BOMB) {
				continue;
			}

			// ������ȹ��
			if (map[tempY][tempX] == ITEM) {
				map[y][x] = 0;
				itemCnt--;

				bombMaxCnt++;

			}

			if (map[y][x] == PLAYER) { // �̷��� ���ǰ��� ������ ��ź��ġ�� �̵��ϸ� ��ź�� �����
				map[y][x] = 0;
			}
//			map[y][x] = 0;
			x = tempX;
			y = tempY;
			map[y][x] = PLAYER;

			if (choice == 5) {

				if (bombMaxCnt <= bombCnt) {
					System.out.println("��ź ���̻�ġ���մϴ�");
					continue;
				}
				System.out.println("��ź��ġ");
				int[][] temp = null;
				if (bombCnt == 0) {
					bomb = new int[1][2];
				} else {
					temp = new int[bombCnt + 1][2]; // ��ġ�� ��ź�� �������� 1��ū temp�迭����
					for (int i = 0; i < bombCnt; i++) { // temp�� ������ź��ǥ �׾���
						temp[i][0] = bomb[i][0];
						temp[i][1] = bomb[i][1];
					}
					bomb = temp; // ������ź����ǥ�� ���� ��ġ�� ��ź�� �������� 1��ū bomb�迭�ϼ�
				}

				if (y >= 0 || y < SIZE || x >= 0 || x < SIZE) {
					map[y][x] = BOMB;
				}

				// ���� ��ġ�� ��ź�� ��ǥ�� bomb�迭�� ����
				bomb[bombCnt][0] = y;
				bomb[bombCnt][1] = x;
				bombCnt++;

				for (int i = -1; i <= 1; i++) {
					if (i != 0 && 0 <= x + i && x + i < SIZE && y + i >= 0 && y + i < SIZE) {
						if (map[y][x + i] == BOMB || map[y + i][x] == BOMB) {
							check = bombCnt;
						}
					}
				}

			}
			if (choice == 0) {
				if (bombCnt <= 0) {
					System.out.println("������ ��ź�� �����ϴ�");
					continue;
				}
				// ���� ó�� ��ġ�� ��ź����
				int yy = bomb[0][0];
				int xx = bomb[0][1];
				for (int i = -1; i <= 1; i++) { // - - -(��,���,�� ���ļ� 3�ε���)
					if (0 <= xx + i && xx + i < SIZE) {

						// ���϶��� ��������
						if (map[yy][xx + i] == WALL) {
							// 50������ Ȯ���� ��(0) �Ǵ� ������(4)�� ����
							if (ran.nextInt(2) == 0) {
								map[yy][xx + i] = 0;
							} else {
								map[yy][xx + i] = ITEM;
								itemCnt++;
							}
						}
					}

					if (0 <= yy + i && yy + i < SIZE) { // |(��,�߰�,�Ʒ� ���ļ� 3�ε���)

						if (map[yy + i][xx] == WALL) {
							if (ran.nextInt(2) == 0) {
								map[yy + i][xx] = 0;
							} else {
								map[yy + i][xx] = ITEM;
								itemCnt++;
							}
						}
					}
				}
				// ��ź �ʱ�ȭ
				map[yy][xx] = 0;

				if (bombCnt == 1) {
					bomb = null;
				}
				if (check > 0) {

					int cc = bomb[check - 1][0];
					int dd = bomb[check - 1][1];

					for (int i = -1; i <= 1; i++) { // - - -(��,���,�� ���ļ� 3�ε���)
						if (0 <= xx + i && xx + i < SIZE) {

							// ���϶��� ��������
							if (map[cc][dd + i] == WALL) {
								// 50������ Ȯ���� ��(0) �Ǵ� ������(4)�� ����
								if (ran.nextInt(2) == 0) {
									map[cc][dd + i] = 0;
								} else {
									map[cc][dd + i] = ITEM;
									itemCnt++;
								}
							}
						}

						if (0 <= yy + i && yy + i < SIZE) { // |(��,�߰�,�Ʒ� ���ļ� 3�ε���)

							if (map[cc + i][xx] == WALL) {
								if (ran.nextInt(2) == 0) {
									map[cc + i][dd] = 0;
								} else {
									map[cc + i][dd] = ITEM;
									itemCnt++;
								}
							}
						}
					}

					map[cc][dd] = 0;
					int[][] temp = new int[bombCnt - 1][2];
					int idx = 0;
					for (int i = 0; i < bomb.length; i++) {
						if (i != check - 1) {
							temp[idx][0] = bomb[i][0];
							temp[idx][1] = bomb[i][1];
							idx++;
						}
					}
					check = 0;
					bomb = temp;
					bombCnt--;
				}
				if (check == 0) {
					int[][] temp = new int[bombCnt - 1][2];
//					if (bombCnt == 1) {
//						bomb = null;
//					}
//					else {
					for (int i = 0; i < temp.length; i++) {
						temp[i][0] = bomb[i + 1][0]; // ���������ġ�� ��źyy��ǥ �����ϰ� �����ϱ����� bomb[i+1][0]
						temp[i][1] = bomb[i + 1][1]; // ���������ġ�� ��źxx��ǥ �����ϰ� �����ϱ����� bomb[i+1][1]
					}
//				}
					bomb = temp;
					bombCnt--;
				}
			}

		}
	}

}

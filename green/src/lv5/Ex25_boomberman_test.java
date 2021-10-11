package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex25_boomberman_test {

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


		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		final int SIZE = 7;
		int[][] map = new int[SIZE][SIZE];
		int[] item = new int[2];
		int[][] boom = new int[1][2];

		final int PLAYER = 2;
		final int WALL = 3;
		final int BOOM = 9;
		final int ITEM = 4;
		int y = 0;
		int x = 0;
		int boomMaxcnt = 3;
		int boomcnt = 0;
		int itemcnt = 0;
		int wallcnt = 20;
		boolean die = false;

		// setting.
		wallcnt = ran.nextInt(SIZE) + SIZE;
		for (int i = 0; i < wallcnt; i++) {
			int wy = ran.nextInt(SIZE);
			int wx = ran.nextInt(SIZE);

			if (map[wy][wx] == 0) {
				map[wy][wx] = WALL;
			} else {
				i -= 1;
			}
		}

		// boom
/*		while (true) {
			int by = ran.nextInt(SIZE);
			int bx = ran.nextInt(SIZE);

			if (map[by][bx] == 0) {
				map[by][bx] = BOOM;
				boom[0][0] = by;
				boom[0][1] = bx;
				boomcnt++;
				break;
			}
		}
*/
		// PLAYER
		while (true) {

			y = ran.nextInt(SIZE);
			x = ran.nextInt(SIZE);

			if (map[y][x] == 0) {
				map[y][x] = PLAYER;
				break;
			}
		}

		while (true) {
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (map[i][j] == PLAYER) {
						System.out.print("��" + " ");
					} else if (map[i][j] == WALL) {
						System.out.print("��" + " ");
					} else if (map[i][j] == BOOM) {
						System.out.print("��" + " ");
					} else if (map[i][j] == ITEM) {
						System.out.print("��" + " ");
					} else {
						System.out.print("��" + " ");
					}
				}
				System.out.println();
			}

			System.out.print("�޴� ���� : ");
			int choice = scan.nextInt();

			if (die) {
				System.out.println("PLAYER�� ����߽��ϴ�.");
				break;
			}

			int tempx = x;
			int tempy = y;

			if (choice == 4 || choice == 6 || choice == 2 || choice == 8) {
				if (choice == 4) {
					tempx -= 1;
				} else if (choice == 6) {
					tempx += 1;
				} else if (choice == 2) {
					tempy += 1;
				} else if (choice == 8) {
					tempy -= 1;
				}

				//
				if (tempy < 0 || tempy >= SIZE || tempx < 0 || tempx >= SIZE || map[tempy][tempx] == WALL
						|| map[tempy][tempx] == BOOM) {
					continue;
				}

				if (map[y][x] == PLAYER) {
					map[y][x] = 0;
				}
				x = tempx;
				y = tempy;
				map[y][x] = PLAYER;
			}

			if (choice == 5) {
				System.out.println("��ź��ġ");
				int[][] temp = null;
				if (boomcnt == 0) {
					boom = new int[1][2];
				} else {
					temp = new int[boomcnt + 1][2];
					for (int i = 0; i < boomcnt; i++) {
						temp[i][0] = boom[i][0];
						temp[i][1] = boom[i][1];
					}
					boom = temp;
				}

				if (y >= 0 || y < SIZE || x >= 0 || x < SIZE) {
					map[y][x] = BOOM;
				}

				boom[boomcnt][0] = y;
				boom[boomcnt][1] = x;
				boomcnt++;
			} else if (choice == 0) {
				// if(map[y][x] == BOOM) {
				// if(map[y+1][x] == BOOM || map[y-1][x] == BOOM || map[y][x+1] == BOOM ||
				// map[y][x-1] == BOOM) {
				// map[y][x] = 0;
				// }
				// }

				System.out.println("��ź ����");
				if (boomcnt <= 0) {
					System.out.println("������ ��ź�� �����ϴ�.");
				} else if (boomcnt > 0) {

					while (true) {
						boolean check = false;

						if (boom != null) {

							int yy = boom[0][0];
							int xx = boom[0][1];

							for (int i = -1; i <= 1; i++) {
								if (xx + i < SIZE && xx + i >= 0) {// && i != 1) {

									if (map[yy][xx + i] == WALL) {
										map[yy][xx + i] = 0;

										int rNum = ran.nextInt(2);
										if (rNum == 0) {
											map[yy][xx + i] = 0;
										} else {
											map[yy][xx + i] = ITEM;
										}
									}									

									if (map[yy][xx + i] == PLAYER) {
										System.out.println("PLAYER�� �׾����ϴ�.");
										die = true;
									}

									if (map[yy][xx + i] == BOOM) {
										check = true;
									}
								}

								if (yy + i < SIZE && yy + i >= 0) { // i != 0) {
									if (map[yy + i][xx] == WALL) {
										map[yy + i][xx] = 0;

										int rNum = ran.nextInt(2);
										if (rNum == 0) {
											map[yy + i][xx] = 0;
										} else {
											map[yy + i][xx] = ITEM;
										}

									}

									// if(map[yy+i][xx] == BOOM) {
									// map[yy+i][xx] = 0;
									// }

									if (map[yy + i][xx] == PLAYER) {
										System.out.println("PLAYER�� �׾����ϴ�.");
										die = true;
									}
									if (map[yy + i][xx] == BOOM) {
										check = true;
									}
								}
							}
							// ��ź �ʱ�ȭ
							map[yy][xx] = 0;

							if (boomcnt == 1) {
								boom = null;
							} else {
								int[][] temp = new int[boomcnt - 1][2];
								for (int i = 0; i < boomcnt - 1; i++) {
									temp[i][0] = boom[i + 1][0];
									temp[i][1] = boom[i + 1][1];
								}
								boom = temp;
							}
							boomcnt -= 1;

						}
						if (check == false) {
							break;
						}
					}

				}
			}
		}



		
		
	}

}

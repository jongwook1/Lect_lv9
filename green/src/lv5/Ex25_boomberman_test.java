package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex25_boomberman_test {

	public static void main(String[] args) {
		/*
		 * # 크레이지 아케이드
		 * 1. 맵의 크기는 7 x 7 이다. 
		 * 2. 상(1)하(2)좌(3)우(4)로 이동이 가능하며,
		 *    폭탄설치(5), 폭파(6)로 설정한다. 
		 * 3. 벽(3), 플레이어(2), 폭탄(9), 아이템(4)로 설정한다.
		 * 4. 단, 폭탄이 설치된 순서대로 터져야 하며,
		 *    폭파 시 십자가 형태로 터진다.
		 * 5. 벽 파괴시 아이템이 랜덤하게 생성되어,
		 *    아이템을 먹으면 설치할 수 있는 폭탄의 개수가 증가된다.
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
						System.out.print("★" + " ");
					} else if (map[i][j] == WALL) {
						System.out.print("■" + " ");
					} else if (map[i][j] == BOOM) {
						System.out.print("●" + " ");
					} else if (map[i][j] == ITEM) {
						System.out.print("아" + " ");
					} else {
						System.out.print("□" + " ");
					}
				}
				System.out.println();
			}

			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();

			if (die) {
				System.out.println("PLAYER가 사망했습니다.");
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
				System.out.println("폭탄설치");
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

				System.out.println("폭탄 폭파");
				if (boomcnt <= 0) {
					System.out.println("폭파할 폭탄이 없습니다.");
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
										System.out.println("PLAYER가 죽었습니다.");
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
										System.out.println("PLAYER가 죽었습니다.");
										die = true;
									}
									if (map[yy + i][xx] == BOOM) {
										check = true;
									}
								}
							}
							// 폭탄 초기화
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

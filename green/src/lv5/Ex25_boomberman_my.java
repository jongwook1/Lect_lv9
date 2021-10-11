package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex25_boomberman_my {

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
		int[][] bomb = new int[1][2]; // [설치된 순서대로][{y좌표}{x좌표}]
		int y = 0;
		int x = 0;
		int bombMaxCnt = 3; // 설치가능한 폭탄의 최대개수
		int bombCnt = 0; // 현재설치한 폭탄의 개수
		int itemCnt = 0;
		int wallcnt = 10;
//		int[] bombX = new int[bombMaxCnt];
//		int[] bombY = new int[bombMaxCnt];

		// 벽 배치
		for (int i = 0; i < wallcnt; i++) {
			int wY = ran.nextInt(SIZE);
			int wX = ran.nextInt(SIZE);

			if (map[wY][wX] == 0) {
				map[wY][wX] = WALL;
			} else {
				i -= 1;
			}

		}

		// PLAYER 배치
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
						System.out.print("★" + " ");
					} else if (map[i][j] == WALL) {
						System.out.print("■" + " ");
					} else if (map[i][j] == BOMB) {
						System.out.print("●" + " ");
					} else if (map[i][j] == ITEM) {
						System.out.print("아" + " ");
					} else {
						System.out.print("□" + " ");
					}
				}
				System.out.println();
			}
			System.out.println("설치가능한 최대폭탄의 개수: " + bombMaxCnt + "  설치된 폭탄의 개수: " + bombCnt);
			System.out.println("8상 2하 4좌 6우 5폭탄설치  0폭파");

			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();		

			// 캐릭이동 //4좌 6우 8상 2하
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

			// 아이템획득
			if (map[tempY][tempX] == ITEM) {
				map[y][x] = 0;
				itemCnt--;

				bombMaxCnt++;

			}

			if (map[y][x] == PLAYER) { // 이렇게 조건걸지 않으면 폭탄설치후 이동하면 폭탄이 사라짐
				map[y][x] = 0;
			}
//			map[y][x] = 0;
			x = tempX;
			y = tempY;
			map[y][x] = PLAYER;

			if (choice == 5) {

				if (bombMaxCnt <= bombCnt) {
					System.out.println("폭탄 더이상설치못합니다");
					continue;
				}
				System.out.println("폭탄설치");
				int[][] temp = null;
				if (bombCnt == 0) {
					bomb = new int[1][2];
				} else {
					temp = new int[bombCnt + 1][2]; // 설치된 폭탄의 개수보다 1개큰 temp배열생성
					for (int i = 0; i < bombCnt; i++) { // temp에 이전폭탄좌표 쌓아줌
						temp[i][0] = bomb[i][0];
						temp[i][1] = bomb[i][1];
					}
					bomb = temp; // 이전폭탄의좌표를 가진 설치된 폭탄의 개수보다 1개큰 bomb배열완성
				}

				if (y >= 0 || y < SIZE || x >= 0 || x < SIZE) {
					map[y][x] = BOMB;
				}

				// 현재 설치한 폭탄의 좌표를 bomb배열에 담음
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
					System.out.println("폭파할 폭탄이 없습니다");
					continue;
				}
				// 가장 처음 설치한 폭탄부터
				int yy = bomb[0][0];
				int xx = bomb[0][1];
				for (int i = -1; i <= 1; i++) { // - - -(좌,가운데,우 합쳐서 3인덱스)
					if (0 <= xx + i && xx + i < SIZE) {

						// 벽일때만 터지도록
						if (map[yy][xx + i] == WALL) {
							// 50프로의 확률로 길(0) 또는 아이템(4)이 생성
							if (ran.nextInt(2) == 0) {
								map[yy][xx + i] = 0;
							} else {
								map[yy][xx + i] = ITEM;
								itemCnt++;
							}
						}
					}

					if (0 <= yy + i && yy + i < SIZE) { // |(위,중간,아래 합쳐서 3인덱스)

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
				// 폭탄 초기화
				map[yy][xx] = 0;

				if (bombCnt == 1) {
					bomb = null;
				}
				if (check > 0) {

					int cc = bomb[check - 1][0];
					int dd = bomb[check - 1][1];

					for (int i = -1; i <= 1; i++) { // - - -(좌,가운데,우 합쳐서 3인덱스)
						if (0 <= xx + i && xx + i < SIZE) {

							// 벽일때만 터지도록
							if (map[cc][dd + i] == WALL) {
								// 50프로의 확률로 길(0) 또는 아이템(4)이 생성
								if (ran.nextInt(2) == 0) {
									map[cc][dd + i] = 0;
								} else {
									map[cc][dd + i] = ITEM;
									itemCnt++;
								}
							}
						}

						if (0 <= yy + i && yy + i < SIZE) { // |(위,중간,아래 합쳐서 3인덱스)

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
						temp[i][0] = bomb[i + 1][0]; // 가장먼저설치한 폭탄yy좌표 제외하고 저장하기위해 bomb[i+1][0]
						temp[i][1] = bomb[i + 1][1]; // 가장먼저설치한 폭탄xx좌표 제외하고 저장하기위해 bomb[i+1][1]
					}
//				}
					bomb = temp;
					bombCnt--;
				}
			}

		}
	}

}

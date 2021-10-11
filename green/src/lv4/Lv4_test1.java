package lv4;

import java.util.Scanner;

public class Lv4_test1 {

	public static void main(String[] args) {

		/*
		 * # 나만의 마블
		 * 옷 □ □ □ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ □ □ □ □
		 */

		// 옷이 이동숫자를 입력받을때마다 이동 하는데 
				// 외각으로만 이동 아래그림참조 
				/*
				 * # 나만의 마블
				 * 옷 □ □ □ □ 
				 * □ ■ ■ ■ □ 
				 * □ ■ ■ ■ □ 
				 * □ ■ ■ ■ □ 
				 * □ □ □ □ □
				 */
				 //입력 ==> 3 
				/*
				 * # 나만의 마블
				 * □ □ □ 옷 □ 
				 * □ ■ ■ ■ □ 
				 * □ ■ ■ ■ □ 
				 * □ ■ ■ ■ □ 
				 * □ □ □ □ □
				 */
				 //입력 ==> 3 
				/*
				 * # 나만의 마블
				 * □ □ □ □ □ 
				 * □ ■ ■ ■ □ 
				 * □ ■ ■ ■ 옷 
				 * □ ■ ■ ■ □ 
				 * □ □ □ □ □
				 */		

		Scanner sc = new Scanner(System.in);
		int player = 7;
		int game[][] = new int[5][5];

		int dir = 0;

		int y = 0;
		int x = 0;
		while (true) {
			game[y][x] = player; // 현재위치 갱신
			// 출력
			for (int i = 0; i < game.length; i++) {
				if (i % 4 == 0) {
					for (int j = 0; j < game.length; j++) {
						if (game[i][j] == player) {
							System.out.print("옷 ");
						} else {
							System.out.print("□ ");
						}

					}
					System.out.println();
				} else {
					for (int j = 0; j < game.length; j++) {
						if (j >= 1 && j <= 3) {
							System.out.print("■ ");
						} else {
							if (game[i][j] == player) {
								System.out.print("옷 ");
							} else {
								System.out.print("□ ");
							}
						}
					}
					System.out.println();
				}
			}

			System.out.println("이동할거리 입력해주세요(종료시키고싶을시 0번입력)");
			int move = sc.nextInt();
			// 특정지점에서 전환
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
				game[y][x] = 0; // 이동하기전 현재위치의 배열의값 0으로 바꿈

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

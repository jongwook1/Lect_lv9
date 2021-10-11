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
				// 문제1) 0 이 플레이어이다
				// 1) left 2)right 3)up 4)down 5)되감기
				// 번호를 입력받고 해당위치로 이동 ==> 이동할때 값을 서로 교환한다.
				// 예) 1 ==>
				/*
				 * {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,0,15}
				 */

				// 문제2) 심화 ==> 한칸한칸이동할때마다 yx 에 배열에 이동한경로를 저장했다가
				// 5번입력시 ==> 왔던길로 되돌아가기 한다.

				int pY = 0;
				int pX = 0;
				int cnt = 0;
				while (true) {
					for (int i = 0; i < game.length; i++) {
						for (int j = 0; j < game[i].length; j++) {
							if (game[i][j] == 0) {
								System.out.print("옷");
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

					System.out.println("8위 2아래 4좌 6우 5되감기: ");
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
							System.out.println("더이상 되감기가 안됩니다.");
							continue;
						}
						yy = yx[cnt - 1][0];
						xx = yx[cnt - 1][1];
						cnt -= 1;
					}
					// 예외처리
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

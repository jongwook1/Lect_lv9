package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		/*
		 * # 스네이크 게임
		 * 1. 10x10 배열을 0으로 채운다.
		 * 2. 스네이크는 1234로 표시한다.
		 * 3. 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
		 * 4. 자기몸하고 부딪히면, 사망한다.
		 * 5. 랜덤으로 아이템을 생성해
		 *    아이템을 먹으면 꼬리 1개가 자란다.
		 * 6. 꼬리는 최대 8개까지 증가할 수 있다.
		 */

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int size = 10;
		int[][] map = new int[size][size];

		int snake = 4;
		int[] x = new int[snake];
		int[] y = new int[snake];

		// 스네이크 설정
		for (int i = 0; i < snake; i++) {
			x[i] = i;
			y[i] = 0;
			map[y[i]][x[i]] = i + 1;

		}
		// 아이템 설정하기
		int itemCount = 5;
		int item = 9;

		while (itemCount != 0) {
			int rY = ran.nextInt(size);
			int rX = ran.nextInt(size);

			if (map[rY][rX] == 0) {
				map[rY][rX] = item;
				itemCount = itemCount - 1;
			}
		}

		while (true) {

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if(map[i][j] == item) {
						System.out.print("* ");
					}else {
						System.out.print(map[i][j] + " ");
					}
				}
				System.out.println();
			}
			System.out.println();

			System.out.print("1)left 2)right 3)up 4)down : ");
			int sel = sc.nextInt();

			// 뱀의 머리 임시변수에 저장
			int tempY = y[0];
			int tempX = x[0];
			
			if(sel==1||sel==2||sel==3||sel==4) {
			if (sel == 1) {
				tempX--;
			} else if (sel == 2) {
				tempX++;
			} else if (sel == 3) {
				tempY--;
			} else if (sel == 4) {
				tempY++;
			}
			}else {
				continue;
			}
			// 맵끝부분 예외처리
			if (size <= tempY || tempY < 0) {
				continue;
			}
			if (size <= tempX || tempX < 0) {
				continue;
			}

			// 자신의 몸에 닿으면 죽음
			if (map[tempY][tempX] != 0 && map[tempY][tempX] != item) {
				System.out.println("죽음!!!");
				break;
			}
						
			//길이늘리기
			if (map[tempY][tempX] == item) {
				if (snake == 8) {
					continue;
				}

				int[] yy = y;
				int[] xx = x;

				y = new int[snake + 1];
				x = new int[snake + 1];

				for (int i = 0; i < snake; i++) {
					y[i] = yy[i];
					x[i] = xx[i];
				}

				snake = snake + 1;
			}

			// 이전의 뱀이 표기되어 있는 map화면 초기화
			for (int i = 0; i < snake; i++) {
				map[y[i]][x[i]] = 0;
			}
			// 몸통 이동하기
			for (int i = snake - 1; i > 0; i--) {
				y[i] = y[i - 1];
				x[i] = x[i - 1];
			}
			// 머리 이동하기
			y[0] = tempY;
			x[0] = tempX;

			// map화면에 이동한 뱀의 위치로 다시 표기하기
			for (int i = 0; i < snake; i++) {
				map[y[i]][x[i]] = i + 1;
			}

		}

	}

}

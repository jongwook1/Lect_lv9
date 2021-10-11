package lv4;

import java.util.Scanner;

public class Test_Naman_mable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 나만의 마블

		final int PLAYER = 2;
		final int SIZE = 5;
		int map[][] = new int[SIZE][SIZE];

		int y = 0;
		int x = 0;
		map[y][x] = PLAYER;
		
		while (true) {
			System.out.println("==나만의 마블==");
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (i >= 1 && i < 4 && j >= 1 && j < 4) {
						System.out.print("■" + " ");
					} else if (map[i][j] == 2) {
						System.out.print("옷" + " ");
					} else {
						System.out.print("□" + " ");
					}
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("입력(1-4)>>");
			int move = scan.nextInt();
			if (move <= 0 || move > 4) {
				System.out.println("다시 입력하세요");
				continue;
			}
			int yy = y;
			int xx = x;
			// 이동
			if (y == 0 && x >= 0 && x < SIZE) {
				xx += move;
			} else if (x == 4 && y >= 0 && y < SIZE) {
				yy += move;
			} else if (y == 4 && x >= 0 && x < SIZE) {
				xx -= move;
			} else if (x == 0 && y >= 0 && y < SIZE) {
				yy -= move;
			}
			// 예외처리
			if (xx >= SIZE) {
				yy += xx - 4;
				xx = 4;
			} else if (yy >= SIZE) {
				xx -= yy - 4;
				yy = 4;
			} else if (xx < 0) {
				yy += xx;
				xx = 0;
			} else if (yy < 0) {
				xx -= yy;
				yy = 0;
			}
			map[y][x] = 0;
			y = yy;
			x = xx;
			map[y][x] = PLAYER;
		}
		//ver.2
//Scanner scan = new Scanner(System.in);
//		
//		// 나만의 마블
//		System.out.print("size: ");
//		final int SIZE = scan.nextInt();
//		final int PLAYER = 2;
//		
//		int map[][] = new int[SIZE][SIZE];
//		int y = 0;
//		int x = 0;
//		map[y][x] = PLAYER;
//		
//		int dir = 1; // 1동 2남 3서 4북
//		
//		while (true) {
//			System.out.println("==나만의 마블==");
//			for (int i = 0; i < SIZE; i++) {
//				for (int j = 0; j < SIZE; j++) {
//					if (i >= 1 && i < SIZE-1 && j >= 1 && j < SIZE-1) {
//						System.out.print("■" + " ");
//					} else if (map[i][j] == 2) {
//						System.out.print("옷" + " ");
//					} else {
//						System.out.print("□" + " ");
//					}
//				}
//				System.out.println();
//			}
//			System.out.println();
//			System.out.println("move: ");
//			int move = scan.nextInt();
//			
//			// 이동
//			int yy = y;
//			int xx = x;
//			map[y][x] = 0;
//			
//			while(move > 0) {
//				if(dir == 1) xx++;
//				else if(dir == 2) yy ++;
//				else if(dir == 3) xx --;
//				else if(dir == 4) yy --;
//				
//				if(yy < 0 || yy > SIZE-1 || xx < 0 || xx > SIZE-1) {
//					continue;
//				}
//				if((yy == 0 && xx == 0) || (yy == 0 && xx == SIZE-1) || (yy == SIZE-1 && xx == SIZE-1) || (yy == SIZE-1 && xx == 0)){
//					dir = dir==4 ? 1 : ++dir;
//				}
//				
//				y = yy;
//				x = xx;
//				move --;
//				
//			}
//			map[y][x] = PLAYER;
//		}

	}

}

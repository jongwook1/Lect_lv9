package lv4;

import java.util.Random;
import java.util.Scanner;

public class Lv4_test1_t {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 나만의 마블
		System.out.print("size: ");
		final int SIZE = scan.nextInt();
		final int PLAYER = 2;
		int map[][] = new int[SIZE][SIZE];
		int y = 0;
		int x = 0;
		map[y][x] = PLAYER;
		int dir = 1; // 1동 2남 3서 4북
		while (true) {
			System.out.println("==나만의 마블==");
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (i >= 1 && i < SIZE-1 && j >= 1 && j < SIZE-1) {
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
			System.out.println("move: ");
			int move = scan.nextInt();
			// 이동
			int yy = y;
			int xx = x;
			map[y][x] = 0;
			while(move > 0) {
				if(dir == 1) xx++;
				else if(dir == 2) yy ++;
				else if(dir == 3) xx --;
				else if(dir == 4) yy --;
				if(yy < 0 || yy > SIZE-1 || xx < 0 || xx > SIZE-1) {
					continue;
				}
				if((yy == 0 && xx == 0) || (yy == 0 && xx == SIZE-1) || (yy == SIZE-1 && xx == SIZE-1) || (yy == SIZE-1 && xx == 0)){
					dir = dir==4 ? 1 : ++dir;
				}
				y = yy;
				x = xx;
				move --;
			}
			map[y][x] = PLAYER;
		}
		
	}
}

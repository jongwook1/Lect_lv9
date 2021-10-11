package lv4;

import java.util.Scanner;

public class Test_Dalpaeng_02 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		final int SIZE = 5;
		int snail[][] = new int[SIZE][SIZE];
		
		final int MAN = 1;
		int map[][] = new int[SIZE][SIZE];
		
		// set
		int dir = 1; // 1µ¿ 2³² 3¼­ 4ºÏ 
		int num = 1;
		
		int y = 0;
		int x = 0;
		
		while(true) {
			snail[y][x] = num;
			
			if(num == SIZE*SIZE) break;
			
			int yy = y;
			int xx = x;
			
			if(dir == 1) xx ++;
			else if(dir == 2) yy ++;
			else if(dir == 3) xx --;
			else if(dir == 4) yy --;
			
			if(yy >= SIZE || yy < 0 || xx >= SIZE || xx < 0 || snail[yy][xx] != 0) {
				dir = dir == 4 ? 1 : ++dir;
				continue;
			}
			y = yy;
			x = xx;
			num ++;
		}
		
		// run
		int pY = 0;
		int pX = 0;
		map[pY][pX] = MAN;
		
		while(true) {
			// print
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					if(map[i][j] == MAN) {
						System.out.print("¿Ê ");
					}
					else {
						System.out.print("+ ");
					}
				}
				System.out.println();
			}
			
			// input
			System.out.print("1)µÚ·Î 2)¾ÕÀ¸·Î : ");
			int move = sc.nextInt();
			
			int yy = pY;
			int xx = pX;
			int next = snail[pY][pX];
			
			if(move == 1) {
				next --;
			}
			else if(move == 2) {
				next ++;
			}
			
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					if(snail[i][j] == next) {
						yy = i;
						xx = j;
					}
				}
			}
			
			map[pY][pX] = 0;
			pY = yy;
			pX = xx;
			map[pY][pX] = MAN;
		}
		
	}

}

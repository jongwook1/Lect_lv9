package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex29_t_socoban {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		final int SIZE = 7;
		final int PLAYER = 2;
		final int BALL = 3;
		final int GOAL = 7;
		final int WALL = 9;
		int[][] map = new int[SIZE][SIZE];
		int wallCount = 0;
		int pY = 0;
		int pX = 0;
		int ballY = 0;
		int ballX = 0;
		int goalY = 0;
		int goalX = 0;
		// set Wall
		System.out.print("벽 개수 입력: ");
		wallCount = sc.nextInt();
		for(int i=0; i<wallCount +1; i++) {
			int y = rn.nextInt(SIZE);
			int x = rn.nextInt(SIZE);
			if(map[y][x] == 0) {
				if(i == wallCount) {
					map[y][x] = GOAL; // set Goal 
				}
				else {
					map[y][x] = WALL;
				}
			}
			else {			//이미 무언가있는곳일때 	
				i --;		//for문 다시 돌림
			}
		}
		// set Ball 
		while(true) {
			int y = rn.nextInt(SIZE-2) +1;		//y: 1 2 3 4 5
			int x = rn.nextInt(SIZE-2) +1;
			if(map[y][x] == 0) {
				// cross check
				int check = 0;
				for(int i=-1; i<=1; i++) { // i : -1 0 1
					if(y+i >= 0 && y+i < SIZE && map[y+i][x] != 0) 		check ++;
						
					if(x+i >= 0 && x+i < SIZE && map[y][x+i] != 0) 		check ++;
						
				}
				if(check <= 1) {
					ballY = y;
					ballX = x;
					map[ballY][ballX] = BALL;
					break;
				}
			}
		}
		// set P1
		while(true) {
			int y = rn.nextInt(SIZE);
			int x = rn.nextInt(SIZE);
			if(map[y][x] == 0) {
				pY = y;
				pX = x;
				map[pY][pX] = PLAYER;
				break;
			}
		}
		// run
		boolean goal = false;
		while(true) {
			// print
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					if(map[i][j] == PLAYER) {
						System.out.print("옷\t");
					}
					else if(map[i][j] == WALL) {
						System.out.print("◼︎\t");
					}
					else if(map[i][j] == GOAL) {
						System.out.print("☛\t");
					}
					else if(map[i][j] == BALL) {
						System.out.print("●\t");
					}
					else {
						System.out.print("◻\t");
					}
				}
				System.out.println();
			}
			// end
			if(goal) {
				System.out.println("goal!!!");
				break;
			}
			// input
			System.out.print("a좌 w위 s하 d우 :");
			String dir = sc.next();
			int yy = pY;
			int xx = pX;
			int byy = ballY;
			int bxx = ballX;
			if(dir.equals("a")) {
				xx --;
				bxx --;
			}
			else if(dir.equals("d")) {
				xx ++;
				bxx ++;
			}
			else if(dir.equals("w")) {
				yy --;
				byy --;
			}
			else if(dir.equals("s")) {
				yy ++;
				byy ++;
			}
			// exception
			if(yy < 0 || yy > SIZE-1 || xx < 0 || xx > SIZE-1 || 
					map[yy][xx] == WALL || map[yy][xx] == GOAL) continue;
			// ball
			if(map[yy][xx] == BALL) {
				if(byy < 0 || byy > SIZE-1 || bxx < 0 || bxx > SIZE-1 || 
						map[byy][bxx] == WALL) continue;
				else if(map[byy][bxx] == GOAL) goal = true;
//				map[ballY][ballX] = 0;
				ballY = byy;
				ballX = bxx;
				map[ballY][ballX] = BALL;
			}
			map[pY][pX] = 0;
			pY = yy;
			pX = xx;
			map[pY][pX] = PLAYER;
		}

	}

}

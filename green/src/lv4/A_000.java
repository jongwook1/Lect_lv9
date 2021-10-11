package lv4;

import java.util.Scanner;

public class A_000 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		int size = 5;
		
		int[][] map = new int[size][size];
		int[][] temp = new int[size][size];
		
		int start = 1;
		int y = 0;
		int x = 0;
		int dir = -1;
		int max = size * size;
		
		map[y][x] = start;
		temp[y][x] = 1;
		start++;
		
		
		
		while(true) {
			int yy = y;
			int xx = x;
			
			if(xx == 0 && yy == 0) {
				dir = 0;
			}
			else if(xx == 0 && yy == size-1) {		
				dir++;
			}
			else if(xx == size -1 && yy == 0) {		
				dir++;
			}
			else if(xx == size -1 && yy == size -1) {	
				dir++;
			}
			
			if(dir == 0) {
				xx++;
			}
			else if(dir == 1) {
				yy++;
			}
			else if(dir == 2) {
				xx--;
			}
			else if(dir == 3) {
				yy--;
			}
			else if(dir == 4) {			
				xx++;
				dir = 0;
			}
			
			if(temp[yy][xx] == 1) {		//{1,0}인덱스에서 {0,0}도달했을때 다시내려오게한후 dir=3이였으므로 4되게함 {2.1}인덱스에서도 {1,1)에서 내려오게함..
				yy = y;
				xx = x;
				dir++;
				
				if(dir == 0) {
					xx++;
				}
				else if(dir == 1) {
					yy++;
				}
				else if(dir == 2) {
					xx--;
				}
				else if(dir == 3) {
					yy--;
				}
				else if(dir == 4) {
					xx++;
					dir = 0;
				}
			}
			
			y = yy;
			x = xx;
			
			//값 넣기
			map[y][x] = start;
			temp[y][x] = 1;
			start++;
			
			//종료
			if(start > max) {
				break;
			}
		}
		
			//		출력
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		
//------------------------------------------------------------------------------------		
		int move[][] = new int[size][size];

		int a = 0;
		int b = 0;
		int gameN = 1;
		move[a][b] = 1;

		while (true) {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.print(move[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("1.앞으로 2.뒤로 3.종료");
			int sel = sc.nextInt();

			if (gameN + 1 < 26 && sel == 1) {
				gameN++;
				int idx1 = -1;
				int idx2 = -1;
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						if (map[i][j] == gameN) {
							idx1 = i;
							idx2 = j;
						}
					}
				}

				move[idx1][idx2] = 1;

			} else if (gameN - 1 > 0 && sel == 2) {
				gameN--;
				int idx1 = -1;
				int idx2 = -1;
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						if (map[i][j] == gameN + 1) {
							idx1 = i;
							idx2 = j;
						}
					}
				}

				move[idx1][idx2] = 0;
			} else if (sel == 3) {
				break;
			}

			System.out.println(gameN);

		}
		
		
	}

}

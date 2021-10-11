package lv4;

import java.util.Scanner;

public class Ex30_t_omok {

	public static void main(String[] args) {
		// 오목은 10*10 검사는 다섯개해야함							//마지막인덱스 돌때 검사

		Scanner sc = new Scanner(System.in);
		
//		int[][] omok = {
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//		};
		int p1Y = 0;
		int p1X = 0;
		int p2Y = 0;
		int p2X = 0;

		
		final int SIZE = 10;
		
		int omok[][]=new int [SIZE][SIZE];
				
		int win = 0;
		int turn=1;
		
		while(true) {
			//출력
			for(int i=0;i<SIZE;i++) {
				for(int j=0;j<SIZE;j++) {
					if(omok[i][j]==1) {
						System.out.print("[O] ");
					}
					else if(omok[i][j]==2){
						System.out.print("[X] ");
					}else {
						System.out.print(i+""+j+"  ");
					}
				}
				System.out.println();
			}
			//end
			if(win !=0) {
				System.out.printf("p%d 승리!",win);
				break;
			}

			//input
			System.out.printf("p%d Y: ", turn);
			int y=sc.nextInt();
			System.out.printf("p%d X: ", turn);
			int x=sc.nextInt();
			
			if(y>=0 && y<SIZE && x>=0 && x<SIZE && omok[y][x]==0) {				//omok[y][x]==0 우선순위생각하기
				omok[y][x]=turn;
				// -
				for(int i=0; i<SIZE;i++) {
					for(int j=0;j<SIZE-4;j++) {	//j<=SIZE-5 같음
						int cnt=0;
						if(omok[i][j]==turn) {				//값이 들어있을때에만
															//위대신 int cnt=0;있어도댐
							for(int k=0;k<5;k++) {			//5번돌면서 5회 가로방향 검사	//실제검사문
								if(omok[i][j+k]==turn) cnt++;
							}
						}
						if(cnt==5) win =turn;
					}
				}
				
				
				// |
				for(int i=0; i<SIZE;i++) {
					for(int j=0;j<SIZE-4;j++) {
						int cnt=0;
						if(omok[j][i]==turn) {			//열 고정 행바꿈
							for(int k=0;k<5;k++) {
								if(omok[j+k][i]==turn) cnt++;
							}
						}
						if(cnt ==5)	win =turn;
						
					}
				}
				//  \
				
				for(int i=0; i<SIZE-4;i++) {
					for(int j=0;j<SIZE-4;j++) {
						int cnt =0;
						if(omok[i][j]==turn) {
							for(int k=0;k<5;k++) {		// 증감규칙확인하면서
								if(omok[i+k][j+k]==turn) cnt++;
							}
						}
						if(cnt ==5) win = turn;
					}
				}
				
				//		/
				for (int i = 0; i < SIZE - 4; i++) {
					for (int j = 4; j < SIZE ; j++) {
						int cnt=0;
						if(omok[i][j]==turn) {
							for(int k=0;k<5;k++) {		//증감규칙확인하면서
								if(omok[i+k][j-k]==turn)cnt++;
							}
						}						
							if(cnt==5)win=turn;
					}
				}
				
				
				
				
				
				
				turn=turn==1?2:1;
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

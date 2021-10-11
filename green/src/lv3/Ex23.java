package lv3;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		/* 
		 * # 틱택토
		 * === 틱택토 ===
		 * [X][X][O]		2	2	1
		 * [ ][O][ ]		0	1	0	
		 * [ ][ ][ ]		0	0	0
		 * [p1]인덱스 입력 : 6
		 * === 틱택토 ===
		 * [X][X][O]		2	2	1
		 * [ ][O][ ]		0	1	0
		 * [O][ ][ ]		1	0	0
		 * [p1]승리
		 * 
		 */
		Scanner sc= new Scanner(System.in);
		int[] game = new int[9];

		int win=0;	//1:p1  /2:p2
		
		int turn=1;	//1 2 1 2..
		while(true) {
			//출력
			for(int i=0;i<9;i++) {
				if(game[i]==1) {
					System.out.print("O ");
				}else if(game[i]==2) {
					System.out.print("X ");
				}else {
					System.out.print(i+1 + " ");
				}
				if(i % 3==2) {
					System.out.println();
				}
			}
			System.out.printf("player%d 좌표입력 : ", turn);
			int idx = sc.nextInt()-1;
			
			if(game[idx] !=0) {
				System.out.println("이미 선택한 좌표");
			}else {
				game[idx] =turn;//1 or 2
				if(turn == 1) {
					turn ++;
				}else {
					turn--;
				}
			}
			int who = turn == 1 ? 2 : 1;	//turn을 반전	//위에서 처음이라가정시 p1이 입력후 turn은p2로 바꼇는데 입력한차례의사람(p1)이 정답인지를 알기위해서 turn반전		
			//가로
			for(int i=0; i<9; i+=3) {		//i:    0        3        6
				int cnt =0;				
				for(int j=0; j<3;j++) {
					if(game[i+j]==who) {		//turn 대신 who를 씀
						cnt++;
					}
				}
				if(cnt==3) {
					win=who;
				}
			}
			//세로
			for(int i=0;i<3;i++) {			// i:    				0         					1         						 2
				int cnt=0;				
				for(int j=0; j<3;j++) {		// i+j*3: 0+0*3->0  0+1*3->3  0+2*3->6/ 1+0*3->1  1+1*3->4 1+2*3->7   / 2 5 8
					if(game[i+j*3]==who) {
						cnt++;
					}
				}
				if(cnt==3) {
					win=who;
				}
			}
			//[0] 1  2
			// 3 [4] 5
			// 6  7 [8]
			//  \
			int cnt=0;
			for(int i=0;i<9;i+=3+1) {			//i+=4
				if(game[i]==who) {
					cnt++;
				}
			}
			if(cnt ==3) {
				win=who;
			}
			
			//0    1  [2]
			//3   [4]  5
			//[6]  7   8
			//   /
			cnt =0;
			for(int i=3-1;i<9;i+=3-1) {			//i+=2
				if(game[i]==who) {
					cnt++;
				}
			}
			if(cnt ==3) {
				win =who;
			}			
			
			//종료조건
			if(win==1) {
				System.out.println("p1승리");
				break;
			}else if(win==2) {
				System.out.println("p2승리");
				break;
			}
			
			
			
		}
	
		
		
		
	}

}

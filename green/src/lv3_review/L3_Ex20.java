package lv3_review;

import java.util.Scanner;

public class L3_Ex20 {

	public static void main(String[] args) {
		/* 
		 * # ƽ����
		 * === ƽ���� ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [ ][ ][ ]
		 * [p1]�ε��� �Է� : 6
		 * === ƽ���� ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [O][ ][ ]
		 * [p1]�¸�
		 * 
		 */
	Scanner sc=new Scanner(System.in);
		
		int[] game = new int[9];
		int turn=1;
		
		
		int win=0;
		
		while(true) {
			for(int i=0;i<game.length;i++) {
			if(game[i]==1) {
				System.out.print("O ");
			}else if(game[i]==2) {
				System.out.print("X ");
			}else {
				System.out.print(i+1+" ");
			}if(i%3==2) {
				System.out.println();
			}
			}
					
			if(win==1) {
				System.out.println("p1��");
				break;
			}else if(win==2){
				System.out.println("p2��");
				break;
			}
			
			if(turn%2==1) {
				System.out.println("p1�ε����Է� ��");
			}else {
				System.out.println("p2�ε����Է� ��");
			}
			int inputIdx=sc.nextInt()-1;
			
					
			if(turn%2==1) {
				game[inputIdx]=turn;
				turn++;
			}else {
				game[inputIdx]=turn;
				turn--;
			}
			
			int who=turn==1?2:1;
			
			//����
			for(int i=0;i<game.length;i+=3) {
				int cnt=0;
				for(int j=0;j<3;j++) {
					if(game[i+j]==who) {
						cnt++;
					}
				}
				if(cnt==3) {
					win=who;
				}
			}
			//����
			for(int i=0;i<3;i++) {
				int cnt=0;
				for(int j=0;j<3;j++) {
					if(game[i+j*3]==who) {
						cnt++;
					}
				}
				if(cnt==3) {
					win=who;
				}
			}
			
			//\
			int cnt=0;
			for(int i=0;i<game.length;i+=4) {
				if(game[i]==who) {
					cnt++;
				}
			}
			if(cnt==3) {
				win=who;
			}
			
			//  /
			cnt=0;
			for(int i=2;i<game.length;i+=2) {
				if(game[i]==who) {
					cnt++;
				}
			}
			if(cnt==3) {
				win=who;
			}
			
			
		}
		
		
	}

}

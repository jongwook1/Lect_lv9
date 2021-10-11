package lv3;

import java.util.Scanner;

public class Ex24_t_mini_mable {

	public static void main(String[] args) {
		/*
		 * # 미니마블
		 * 1. 플레이어는 p1과 p2 2명이다.
		 * 2. 번갈아가며 1~3 사이의 숫자를 입력해 이동한다.
		 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
		 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
		 * 4. 먼저 3바퀴를 돌면 이긴다.
		 *    
		 *  [p2]1~3 입력 : 1
		 *  1 2 3 4 5 6 7 8 
		 *  0 1 0 0 0 0 0 0 
		 *  0 0 0 2 0 0 0 0 
		 *  
		 *  [p1]1~3 입력 : 3
		 *  [p1]이 p2를 잡았다!
		 *  1 2 3 4 5 6 7 8 
		 *  0 0 0 0 1 0 0 0 
		 *  2 0 0 0 0 0 0 0 
		 */
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		int turn = 0;
		int idx1 = 0;	
		int idx2 = 0;
		p1[idx1] = 1;			//0좌표(인덱스)에 캐릭터배치
		p2[idx2] = 2;
		Scanner sc= new Scanner(System.in);
		
		
		
		
		int win1=0;		//1 2 3
		int win2=0;
		
		while(true) {
			//출력
			System.out.println("win1: "+win1 + "바퀴");
			System.out.println("win2: "+win2 + "바퀴");
			for(int i=0; i<8;i++) {
				System.out.print(game[i]+ " ");				
			}
			System.out.println();
			for(int i=0; i<8;i++) {
				System.out.print(p1[i]+ " ");				
			}
			System.out.println();
			for(int i=0; i<8;i++) {
				System.out.print(p2[i]+ " ");				
			}
			System.out.println();
			
			//종료
			if(win1==3) {
				System.out.println("3바퀴돔 p1승");
				break;
			}else if(win2==3) {
				System.out.println("3바퀴돔 p2승");
				break;
			}
			if(turn %2 ==0) {
				System.out.println("p1: ");
				
			}else {
				System.out.println("p2: ");
				
			}
			int move= sc.nextInt();
			
			//이동
			if(turn %2==0) {			//p1
				int tempIdx = idx1+move;
				
				if(tempIdx <8) {
					p1[idx1]=0;			//원래있던곳
					p1[tempIdx]=1;		//움직인곳으로 이동시켜줌
				}else {//바퀴수 증가
					p1[idx1]=0;
					tempIdx %=8;
					p1[tempIdx]=1;		//11 ->2
					win1++;					
				}				
				//잡았다 확인
				if(p2[tempIdx] !=0) {
					System.out.println("p2를 잡았다!");
					p2[idx2]=0;
					idx2=0;
					p2[idx2] =2;
				}
				//인덱스 갱신
				idx1=tempIdx;
				
				
			}else {						//p2
		int tempIdx = idx2+move;
				
				if(tempIdx<8) {
					p2[idx2]=0;
					p2[tempIdx]=2;
				}else {//바퀴수 증가
					p2[idx2]=0;
					tempIdx %=8;
					p2[tempIdx]=2;		//11 ->2
					win2++;					
				}				
				//잡았다 확인
				if(p1[tempIdx] !=0) {
					System.out.println("p1를 잡았다!");
					p1[idx1]=0;
					idx1=0;
					p1[idx1] =1;
				}
				//인덱스 갱신
				idx2=tempIdx;				
				}	
			turn ++;
			}		

	}
}

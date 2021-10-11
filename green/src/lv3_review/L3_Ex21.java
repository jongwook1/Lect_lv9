package lv3_review;

import java.util.Random;
import java.util.Scanner;

public class L3_Ex21 {

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
		 *  [p1]1~3 입력 : 2
		 *  [p1]이 p2를 잡았다!
		 *  1 2 3 4 5 6 7 8 
		 *  0 0 0 1 0 0 0 0 
		 *  2 0 0 0 0 0 0 0 
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		int turn = 0;
		int idx1 = 0;	
		int idx2 = 0;
		p1[idx1] = 1;	
		p2[idx2] = 2;
		
		int win1=0;
		int win2=0;
			while(true) {
				System.out.println("게임판:");
				for(int i=0;i<game.length;i++) {
				System.out.print(game[i]+" ");
				}
				System.out.println();
				System.out.print("p1: ");
				for(int i=0;i<game.length;i++) {
					System.out.print(p1[i]+" ");
				}
				System.out.println();
				System.out.print("p2: ");
				for(int i=0;i<game.length;i++) {
					System.out.print(p2[i]+" ");
				}
				if(win1==3) {					
					System.out.println("p1승");
					break;
				}else if(win2==3) {
					System.out.println("p2승");
					break;
				}
				
			
				
				if(turn%2==0) {
					System.out.println("\np1님 1~3사이 숫자를 입력하세요");
					
				}else if(turn%2==1) {
					System.out.println("\np2님 1~3사이 숫자를 입력하세요");
				}
				
				int move=sc.nextInt();
				
				
				if(turn%2==0) {
					int tempIdx=idx1+move;
					
					if(tempIdx<8) {
						p1[idx1]=0;
						p1[tempIdx]=1;
					}else {
						p1[idx1]=0;
						tempIdx%=8;
						p1[tempIdx]=1;
						win1++;
					}
					if(p2[tempIdx]!=0) {
						p2[idx2]=0;
						idx2=0;
						p2[idx2]=2;
					}
					idx1=tempIdx;
				}
				else {
					int tempIdx=idx2+move;
					
					if(tempIdx<8) {
						p2[idx2]=0;
						p2[tempIdx]=2;
					}else {
						p2[idx2]=0;
						tempIdx%=8;
						p2[tempIdx]=2;
						win2++;
					}
					if(p1[tempIdx]!=0) {
						p2[idx1]=0;
						idx1=0;
						p2[idx1]=2;
					}
					idx2=tempIdx;
				}
				turn++;
				
			}
			
		
		
		
	}

}

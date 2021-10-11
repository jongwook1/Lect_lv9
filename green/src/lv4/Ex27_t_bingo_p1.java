package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex27_t_bingo_p1 {
		//빙고판 달라져도 가로세로대각선 완성되야함
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Random ran = new Random();
			int maxNum = 5;								//사용자한테 이거 입력받게 ,상수처리 후
			int[][] mark = new int[maxNum][maxNum];
			int[] temp = new int[maxNum*maxNum];

			int size = 5;
			int[][] bingo = new int[size][size];
			
			
			int win = 0;
			while(true) {
				//print 			//빙고 여러개일때 int win이 while문 안으로 들어옴
				
				for(int i=0;i<size;i++) {
					for(int j=0;j<size;j++) {
						if(bingo[i][j]==1) {
							System.out.print("O ");
						}else {
							System.out.print("+ ");
						}
					}
					System.out.println();//행이바뀔때마다
				}
				//종료조건
				if(win ==1) {
					System.out.println("클리어");
					break;
				}
				
				System.out.println("y: ");
				int y=sc.nextInt();
				System.out.println("x: ");
				int x=sc.nextInt();
				
				//exception
				if(y<0||y>size-1||x<0||x>size-1) {
					continue;
				}
				
				//마킹
				if(bingo[y][x]==0) {
					bingo[y][x]=1;
				}
				//체크
				// -
				for(int i=0;i<size;i++) {		//i: 행이 넘어감
					int cnt =0;
					for(int j=0; j<size;j++) {
						if(bingo[i][j]==1) {
							cnt++;
						}
					}
					if(cnt ==size) {
						win++;
					}
				}				
				// |
				for(int i=0;i<size;i++) {		//i: 열
					int cnt=0;
					for(int j=0;j<size;j++) {	//j: 행
						if(bingo[j][i]==1) {
							cnt++;
						}
					}
					if(cnt==size) {
						win++;
					}
				}			
				
				// \
				int cnt=0;
				for(int i=0;i<size;i++) {
					if(bingo[i][i]==1) {
						cnt++;
					}
				}
				if(cnt==size) {
					win ++;
				}			
				
				// /
				cnt=0;
				for(int i=0;i<size;i++) {
					if(bingo[i][size-1-i]==1) {					//4-i
						cnt++;
					}
				}
				if(cnt==size) {
					win ++;
				}		
				
			}
			
			
			
			
			
			
			
			
			
	}

}

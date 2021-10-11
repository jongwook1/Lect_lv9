package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex27 {
//빙고판 달라져도 가로세로대각선 완성되야함
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
			Random ran = new Random();
			int maxNum = 5;							//사용자한테 이거 입력받게 ,상수처리 후
			int[][] bingo = new int[maxNum][maxNum];
			int[][] mark = new int[maxNum][maxNum];				
			int[] temp = new int[maxNum*maxNum];
			int win = 0;

			int size = 5;							//사용자한테 입력받는거
		
			while(true) {
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						if (bingo[i][j] == 1) {
							System.out.print("O ");
						} else {
							System.out.print("X");
						}
					}
				}
				
				System.out.println("x좌표를 입력하세요");
				int y=sc.nextInt();
				System.out.println("y좌표를 입력");
				int x=sc.nextInt();
				
				bingo[y][x]=1;
				
//				for(int i=0;i<size;i++) {
//					for(int j=0;j<size;j++) {
//						if(bingo[i][]=1)
//					}
//				}
				
				
				
			}
		
		

		
		
		
		//가로검사시 내부인덱스가 다0
		//세로검사시 외부인덱스가 다0						
		
	}

}

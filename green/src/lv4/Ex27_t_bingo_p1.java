package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex27_t_bingo_p1 {
		//������ �޶����� ���μ��δ밢�� �ϼ��Ǿ���
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Random ran = new Random();
			int maxNum = 5;								//��������� �̰� �Է¹ް� ,���ó�� ��
			int[][] mark = new int[maxNum][maxNum];
			int[] temp = new int[maxNum*maxNum];

			int size = 5;
			int[][] bingo = new int[size][size];
			
			
			int win = 0;
			while(true) {
				//print 			//���� �������϶� int win�� while�� ������ ����
				
				for(int i=0;i<size;i++) {
					for(int j=0;j<size;j++) {
						if(bingo[i][j]==1) {
							System.out.print("O ");
						}else {
							System.out.print("+ ");
						}
					}
					System.out.println();//���̹ٲ𶧸���
				}
				//��������
				if(win ==1) {
					System.out.println("Ŭ����");
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
				
				//��ŷ
				if(bingo[y][x]==0) {
					bingo[y][x]=1;
				}
				//üũ
				// -
				for(int i=0;i<size;i++) {		//i: ���� �Ѿ
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
				for(int i=0;i<size;i++) {		//i: ��
					int cnt=0;
					for(int j=0;j<size;j++) {	//j: ��
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

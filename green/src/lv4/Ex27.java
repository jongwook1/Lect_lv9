package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex27 {
//������ �޶����� ���μ��δ밢�� �ϼ��Ǿ���
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
			Random ran = new Random();
			int maxNum = 5;							//��������� �̰� �Է¹ް� ,���ó�� ��
			int[][] bingo = new int[maxNum][maxNum];
			int[][] mark = new int[maxNum][maxNum];				
			int[] temp = new int[maxNum*maxNum];
			int win = 0;

			int size = 5;							//��������� �Է¹޴°�
		
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
				
				System.out.println("x��ǥ�� �Է��ϼ���");
				int y=sc.nextInt();
				System.out.println("y��ǥ�� �Է�");
				int x=sc.nextInt();
				
				bingo[y][x]=1;
				
//				for(int i=0;i<size;i++) {
//					for(int j=0;j<size;j++) {
//						if(bingo[i][]=1)
//					}
//				}
				
				
				
			}
		
		

		
		
		
		//���ΰ˻�� �����ε����� ��0
		//���ΰ˻�� �ܺ��ε����� ��0						
		
	}

}

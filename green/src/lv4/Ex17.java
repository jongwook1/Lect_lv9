package lv4;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		/*
		 * # ��ٸ� ����
		 * 1. �ε��� 0~4�� �ϳ������Ѵ�. 
		 * 2. ���� 0 �� ������ �׳� �Ʒ��� ��������.
		 * 3. ���� 1 �� ������ ���������� �̵��� ��������.
		 * 4. ���� 2 �� ������ �������� �̵��� ��������.
		 * 5. ������ �޴� ��� 
		 */

		Scanner sc = new Scanner(System.in);
		String menu[] = {"�����" , "���" ,"¥���" , "�̸�" , "�����"};
		int ladder[][]= {					//12  �� �ѽ����� ���� 
				{0,0,0,0,0},
				{1,2,0,1,2},
				{0,1,2,0,0},
				{0,0,1,2,0},
				{1,2,0,0,0},
				{0,1,2,0,0},
				{1,2,0,0,0},
				{0,0,0,1,2},
				{0,0,0,0,0}};
		
		int x = 0; int y = 0;
		while (true) {
//			for (int i = 0; i < 9; i++) {
//				for (int j = 0; j < 5; j++) {
//					System.out.print(ladder[i][j] + " ");
//				}
//			}					
			System.out.println("\n0~4������ �Է��ϼ���");
			int sel=sc.nextInt();
			if(sel==0) {
				y=0;
			}
			for ( x = 0; x < 9; x++) {
				for ( y = 0; y < 5; y++) {					
					
						if(ladder[x][y]==0) {
						 x++;
						}else if(ladder[x][y]==1) {
							y++;x++;
						}else if(ladder[x][y]==2) {
							x++;y--;
						}
					
//					else if(sel==1) {
//						j=1;
//					}
//					else if(sel==2) {
//						j=2;
//					}
//					else if(sel==3) {
//						j=3;
//					}
//					else if(sel==4) {
//						j=4;
//					}
				}
			}
			for (x = 0; x < 9; x++) {
				for (y = 0; y < 5; y++) {
					if(x==8&&y==0) {
						System.out.println(menu[y]);
					}
					else if(x==8&&y==1) {
						System.out.println(menu[y]);
					}
					else if(x==8&&y==2) {
						System.out.println(menu[y]);
					}
					else if(x==8&&y==3) {
						System.out.println(menu[y]);
					}
					else if(x==8&&y==4) {
						System.out.println(menu[y]);
					}
				}
			}
			
			
			
		}
		
		
		
		
		

	}

}

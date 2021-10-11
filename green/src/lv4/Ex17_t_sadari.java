package lv4;

import java.util.Scanner;

public class Ex17_t_sadari {

	public static void main(String[] args) {		
		/*
		 * # ��ٸ� ����
		 * 1. �ε��� 0~4�� �ϳ������Ѵ�. 
		 * 2. ���� 0 �� ������ �׳� �Ʒ��� ��������.
		 * 3. ���� 1 �� ������ ���������� �̵��� ��������.
		 * 4. ���� 2 �� ������ �������� �̵��� ��������.
		 * 5. ������ �޴� ��� 
		 * �� �� �� ��

		
		 */

				
		Scanner sc = new Scanner(System.in);
		String menu[] = {"�����" , "���" ,"¥���" , "�̸�" , "�����"};
		int choice[]= new int[menu.length];
		
		int ladder[][]= {
				{0,0,0,0,0},		//0
				{1,2,0,1,2},		//1	
				{0,1,2,0,0},		//2
				{0,0,1,2,0},		//3
				{1,2,0,0,0},		//..
				{0,1,2,0,0},
				{1,2,0,0,0},
				{0,0,0,1,2},
				{0,0,0,0,0}};
		
		int x = 0; 
		
		while(true) {
			//���
			for(int i=0;i<ladder[0].length;i++) {
				System.out.print(" "+(i+1)+" ");
			}
			System.out.println();
			for(int y=0; y<ladder.length;y++) {				//ladder.length-->8
				for(int xx=0;xx<ladder[y].length;xx++) {		//ladder[y].length??----->5
					if(ladder [y][xx]==0) {
						System.out.print(" �� ");
					}else if(ladder [y][xx]==1) {
						System.out.print(" ����");
					}else if(ladder [y][xx]==2) {
						System.out.print("���� ");						
					}
				}
				System.out.println();
			}
		
			for(int i=0; i<5;i++) {
				if(choice[i]==0) {
					System.out.print(" 0 ");
				}else {
					System.out.println(menu[i]);
				}
			}			
			
			//����
			System.out.print("��ȣ����1~5: ");
			int sel= sc.nextInt()-1;
			
			
			if (sel >= 0 && sel < ladder.length) {
				x = sel;
				//�̵�
				for (int y = 0; y < ladder.length; y++) {				//x�� ���ǹ��� ���� �����ϹǷ� x������ for�����ʿ����
					if(ladder[y][x]==1) {
						x++;
					}else if(ladder[y][x]==2) {
						x--;
					}					
				}						
				System.out.println(menu[x]);//
				choice[x]=1;//���ÿϷ�ó��				
			}
		}
		
		
		
	}

}

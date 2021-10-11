package lv4;

import java.util.Scanner;

public class Ex16q {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
		// ���� 1) ������ ������ �� ���
		// ���� 1) 4400, 7100, 5400
		int[] garo = new int[3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				garo[i]+=pay[i][j];
			}
			
		}
		for(int i=0;i<3;i++) {
			System.out.print(garo[i]+" ");
		}
					
		// ���� 2) ȣ�� �Է��ϸ� ������ ���
		// ��    2) �Է� : 202	������ ��� : 2000
		System.out.println("\nȣ���� �Է��ϼ���");
		int ad=sc.nextInt();
		
		int idx1 = -1;
		int idx2 = -1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (apt[i][j] == ad) {
					idx1 = i;
					idx2 = j;
				}

			}
		}
		for (int i = 0; i < 1; i++) {		//�ʿ����		�־����µǴ°žƴѰ�?�����
			for (int j = 0; j < 1; j++) {	//�ʿ����		�־����µǴ°žƴѰ�?�����
				System.out.println(pay[idx1][idx2]+"��");				
			}
		}
				
		// ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
		// ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)
		int max=0;
		idx1 = -1;
		idx2 = -1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
					if(max<pay[i][j]) {
						max=pay[i][j];
						idx1=i;
						idx2=j;
					}
			}
		}
		for (int i = 0; i < 1; i++) {			//�ʿ����
			for (int j = 0; j < 1; j++) {		//�ʿ����
				System.out.println(apt[idx1][idx2]);				
			}
		}
		
		int min=2100;
		idx1 = -1;
		idx2 = -1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
					if(min>pay[i][j]) {
						min=pay[i][j];
						idx1=i;
						idx2=j;
						
					}
			}
		}
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.println(apt[idx1][idx2]);				
			}
		}
						
		// ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü
		int a=-1;
		int b=-1;
		int c=-1;
		int d=-1;
		
		System.out.println("ȣ��1: ");
		int door=sc.nextInt();
		System.out.println("ȣ��2: ");
		int door2=sc.nextInt();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(apt[i][j]==door) {
					a=i;
					b=j;
				}
				if(apt[i][j]==door2) {
					c=i;
					d=j;
				}
			}
		}
		int temp=pay[a][b];
		pay[a][b]=pay[c][d];
		pay[c][d]=temp;
		
		for(int i=0;i<3;i++) {			//���⼱ �־�?
			for(int j=0; j<3;j++) {		// �־�? �Ƚᵵ ��µǴ°žƴѰ� ����ó��?
				System.out.print(pay[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}

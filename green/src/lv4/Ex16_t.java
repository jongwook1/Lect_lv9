package lv4;

import java.util.Scanner;

public class Ex16_t {

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
	
		for(int i=0;i<3;i++) {
			int sum =0;
			for(int j=0;j<3;j++) {
				sum+= pay[i][j];
			}
			System.out.printf("%d�� %d��\n", i+1, sum);
		}
		
				
		// ���� 2) ȣ�� �Է��ϸ� ������ ���
		// ��    2) �Է� : 202	������ ��� : 2000
		System.out.println("ȣ���Է�: ");
		int door =sc.nextInt();
		int a=-1;
		int b=-1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(apt[i][j]==door) {
					a=i;
					b=j;
				}
			}
		}
		System.out.println(pay[a][b]+ "��");
		
		
		// ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
		// ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)
		a=0;
		b=0;
		int max=pay[a][b];
		int c=0;
		int d=0;
		int min= pay[c][d];			// ���Ҵ���� ���ǰ��ϳ�
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(max<pay[i][j]) {
					max=pay[i][j];
					a=i;
					b=j;
				}
				if(min>pay[i][j]) {
						min=pay[i][j];
						c=i;
						d=j;
					}
			}

		}
		System.out.println(apt[a][b]);
		System.out.println(apt[c][d]);
		// ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü
	
		a=-1;
		b=-1;
		c=-1;
		d=-1;
		
		System.out.println("ȣ��1: ");
		door=sc.nextInt();
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
		
		for(int i=0;i<3;i++) {
			for(int j=0; j<3;j++) {
				System.out.print(pay[i][j]+" ");
			}
			System.out.println();
		}
		
		
		

	}

}

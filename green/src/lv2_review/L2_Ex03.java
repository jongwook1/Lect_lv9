package lv2_review;

import java.util.Scanner;

public class L2_Ex03 {

	public static void main(String[] args) {
		/*
		 * # ������ ���[2�ܰ�]
		 * 1. 5�� �ֹ��� �޴´�.
		 * 2. �ֹ��� ���� ��, ���� �Է¹޴´�.
		 * 3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
		 * 
		 * ��)
		 * �޴� ���� : 1
		 * �޴� ���� : 1
		 * �޴� ���� : 2
		 * �޴� ���� : 2
		 * �޴� ���� : 3
		 * �� �ݾ� = 31300��
		 * ���� �Է� : 32000
		 * === �Ե����� ������ ===
		 * 1. �Ұ�� ���� : 2��
		 * 2. ����    ���� : 2��
		 * 3. ��         �� : 1��
		 * 4. ��   ��   �� : 31300��
		 * 5. ��         �� : 700��
		 */

		
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		int total=0;		
		
		Scanner sc=new Scanner(System.in);
	
		int p1=0;
		int p2=0;
		int p3=0;
		
		int i=0;
		while (i < 5) {

			System.out.println("=== �Ե����� ===");
			System.out.println("1.�Ұ�� ���� : " + price1 + "��");
			System.out.println("2.����    ���� : " + price2 + "��");
			System.out.println("3.��         �� : " + price3 + "��");
			System.out.println("�޴��� �������ּ���");

			int sel = sc.nextInt();

			if (sel == 1) {
				p1++;
			} else if (sel == 2) {
				p2++;
			} else if (sel == 3) {
				p3++;
			}
			i++;
			
		}
		total=p1*price1+p2*price2+p3*price3;
		
		System.out.println("�����ұݾ��� �Է����ּ���");
		int outM=sc.nextInt();
		int charge=outM-total;
		if(charge>=0) {		
			System.out.println("----������-----");
			System.out.println("1. �Ұ�� ���� :"+p1+"��");
			System.out.println("2. ����    ���� :"+p2+"��");
			System.out.println("3. ��         �� :"+p3+"��");
			System.out.println("4. ��   ��   �� :"+total+"��");
			System.out.println("5. ��         �� :"+charge+"��");
		}
		else {
			System.out.println("�����ұݾ��� �����մϴ�");
		}
		
	}

}

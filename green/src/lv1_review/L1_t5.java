package lv1_review;

import java.util.Scanner;

public class L1_t5 {

	public static void main(String[] args) {
		/*
		 * # ������ ���[1�ܰ�]
		 * 1. �޴����� ����Ѵ�.
		 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
		 * 3. ������ �Է¹޴´�.
		 * 4. �Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�.
		 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
		 */
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		
		System.out.println("�޴� �������ּ���");
		int sel=sc.nextInt();
		
		System.out.println("�����ұݾ� �Է����ּ���");
		int outM=sc.nextInt();
		
		int charge=0;
		if(sel==1) {			
				charge=outM-price1;		
		}else if(sel==2) {
			charge=outM-price2;		
		}else if(sel==3) {
			charge=outM-price3;		
		}
		if(charge>=0) {
			System.out.println("�ܵ�: "+charge+"��");
		}
		if(charge<0) {
			System.out.println("������ ���̺����մϴ�");
		}
		

	}

}

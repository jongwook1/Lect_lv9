package lv1;

import java.util.Scanner;

public class Test6_lv1 {

	public static void main(String[] args) {
		
		// �������� 1. �������� ���
				// ���� 11:05
				// ���� 11:26
				// �ҿ� 21�� 00
		
		// ����) ��������3���� �Է¹ް� ������� 
				// ���� 1) 3������ ����� ������ ������ �ű��.
				// ���� 2) 3������ ����� 100~90 ==> A
				// ���� 3) 3������ ����� 89~80 ==> B
				// ���� 4) 3������ ����� 79~70 ==> C
				// ���� 5) 69����                      ==> ����� 
				// �߰�����) �������뺰�� ���ڸ��� 7�� �̻��� + ���ٴ´�. 
				// ��) 98 ==> A+
				// ��) 89 ==> B+
				// ��) 79 ==> C+
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A������ �Է��ϼ���");
			
		int a = sc.nextInt();
		
		if(a > 100) {
			System.out.println("100���̻��� �Է��Ҽ� �����ϴ�");
		}
		System.out.println("B������ �Է��ϼ���");
		int b = sc.nextInt();
		if(b > 100) {
			System.out.println("100���̻��� �Է��Ҽ� �����ϴ�");
		}
			
		System.out.println("C������ �Է��ϼ���");
		int c = sc.nextInt();
		if(c > 100) {
			System.out.println("100���̻��� �Է��Ҽ� �����ϴ�");
		}
			
		
		
			int avg = (a + b + c) /3;
			int n = avg % 10;
		if(a > 100 || b > 100 || c > 100) {
			System.out.println("�� ������ 100�� �̻��� �Է��Ҽ������ϴ�");
		}
		else if(avg >= 90) {
			if(n == 0 || n >= 7) {
				System.out.println("A������ ���� : " + a);
				System.out.println("B������ ���� : " + b);
				System.out.println("C������ ���� : " + c);
			System.out.println("��ռ��� : " + "A+");			
			}else {
				System.out.println("A������ ���� : " + a);
				System.out.println("B������ ���� : " + b);
				System.out.println("C������ ���� : " + c);
				System.out.println("��ռ��� : " + "A");
			}
		}
		else if(avg >= 80){
			if(n >= 7) {
				System.out.println("A������ ���� : " + a);
				System.out.println("B������ ���� : " + b);
				System.out.println("C������ ���� : " + c);
			System.out.println("��ռ��� : " + "B+");			
			}else {
				System.out.println("A������ ���� : " + a);
				System.out.println("B������ ���� : " + b);
				System.out.println("C������ ���� : " + c);
				System.out.println("��ռ��� : " + "B");
			}
		}
		else if(avg >= 70){
			if(n >= 7) {
				System.out.println("A������ ���� : " + a);
				System.out.println("B������ ���� : " + b);
				System.out.println("C������ ���� : " + c);
			System.out.println("��ռ��� : " + "C+");			
			}else {
				System.out.println("A������ ���� : " + a);
				System.out.println("B������ ���� : " + b);
				System.out.println("C������ ���� : " + c);
				System.out.println("��ռ��� : " + "C");
			}
		}
		else {
			System.out.println("��ռ��� 69�������ش�----->����� ");
		}
	}
}

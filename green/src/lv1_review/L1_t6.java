package lv1_review;

import java.util.Scanner;

public class L1_t6 {

	public static void main(String[] args) {
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
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("a���������Է��ϼ���");
		int a=sc.nextInt();
		System.out.println("b���������Է��ϼ���");
		int b=sc.nextInt();
		System.out.println("c���������Է��ϼ���");
		int c=sc.nextInt();
		
		
		
		int sum = a + b + c;
		int avg = sum / 3;
		int over = avg % 10;

		if (a >= 0 && a <= 100 && b >= 0 && b <= 100 && c >= 0 && c <= 100) {
			if (avg >= 90 && avg <= 100) {
				if (over >= 7) {
					System.out.println("����� : A+");
				} else {
					System.out.println("����� : A");
				}
			} else if (avg >= 80 && avg <= 89) {
				if (over >= 7) {
					System.out.println("����� : B+");
				} else {
					System.out.println("����� : B");
				}
			} else if (avg >= 70 && avg <= 79) {
				if (over >= 7) {
					System.out.println("����� : C+");
				} else {
					System.out.println("����� : C");
				}
			} else {
				System.out.println("������غ��ϼ���");
			}
		} else {
			System.out.println("������ �߸��Ǿ����ϴ�");
		}
	}

}

package lv1_review;

import java.util.Scanner;

public class Ex24_r_l1 {

	public static void main(String[] args) {
		/*
		 * # ����ö ��� ���
		 * 1. �̿��� ������ ���� �Է¹޴´�.
		 * 2. ������ ���� ������ ���� ���� ����� ����ȴ�.
		 * 3. ���ǥ
		 * 1) 1~5	: 500��
		 * 2) 6~10	: 600��
		 * 3) 11,12 : 650�� (10���������Ĵ� 2�����帶�� 50���߰�)
		 * 4) 13,14 : 700�� (10���������Ĵ� 2�����帶�� 50���߰�)
		 * 5) 15,16 : 750�� (10���������Ĵ� 2�����帶�� 50���߰�)
		 * ... 
		 */
		Scanner sc = new Scanner(System.in);
		int inputN = sc.nextInt();

		int price = 0;

		if (1 >= inputN && inputN <= 5) {
			price = 500;
		} else if (6 >= inputN && inputN <= 10) {
			price = 600;
		} else {
			int add = inputN - 10;
			if (inputN % 2 == 1) {
				add += 1;
			}
			price = 600 + add / 2 * 50;
		}
		System.out.println("����ö�� �����: " + price);

	}

}

package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class L1_t7 {

	public static void main(String[] args) {
		/*
		 * # ������ ����[2�ܰ�]
		 * 1. ������ ������ �����ϱ� ����, ���� 2���� �����ϰ� �����Ѵ�.
		 * 2. ����� ���ڸ� ���� ������ ������ ����Ѵ�.
		 * ��)	3 x 7 = ?
		 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
		 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int a = rn.nextInt(10) + 1;
		int b = rn.nextInt(10) + 1;

		int answer = a * b;
		System.out.println(a + "  X " + b + " = " + " ?");
		System.out.println("������ �Է��ϼ���");
		int myAnswer = sc.nextInt();
		if (answer == myAnswer) {
			System.out.println("����");
		} else {
			System.out.println("��");
		}

	}

}

package lv1;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// ������ �����ֱ�(scope)

		// {} �߰�ȣ : ������ ���۰� ��
		int a = 10;
		if (true) {
			int b = 20;

			if (true) {
				int c = 30;

				System.out.println(a); // 10
				System.out.println(b); // 20
				System.out.println(c); // 30

			}
//			System.out.println(a); 			//10
//			System.out.println(b);			//20
//			System.out.println(c);			//���� ��

		}
//		System.out.println(a); 			//10
//		System.out.println(b);			//���� ��
//		System.out.println(c);			//���� ��	

		/*
		 * # ������ ���[1�ܰ�] 
		 * 1. �޴����� ����Ѵ�.
		 *  2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
		 *   3. ������ �Է¹޴´�. 
		 *   4.�Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�. 
		 *   5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
		 */
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");

		Scanner sc = new Scanner(System.in);

		System.out.println("�޴����� : ");
		int sel = sc.nextInt();

		System.out.println("�����Է� : ");
		int cash = sc.nextInt();

		// case 3����
		int total = 0;

		if (sel == 1) {
			total = price1;
		} else if (sel == 2) {
			total = price2;
		} else if (sel == 3) {
			total = price3;
		} else {
			System.out.println("�������� �ʴ� �޴��Դϴ�. ���ư�����.");
		}

		// total�� cash�� �� -> �Ž����� ����
		if (total != 0) {

			if (total > cash) {
				System.out.println("������ �����մϴ�!");
			} else {
				// ������ ���
				// ������ �޴��� ���� ǥ�� -> �Ž����� ���

				System.out.println("----�� �� �� ---");
				if (sel == 1) {
					System.out.println("�Ұ��1�� " + price1 + "��");
				} else if (sel == 2) {
					System.out.println("����1�� " + price2 + "��");
				} else {
					System.out.println("�ݶ�1�� " + price3 + "��");
				}
				System.out.println("�Ž����� : " + (cash - total) + "��");
				System.out.println("---------------");
			}
		}

		/*
		 * # �ִ밪 ���ϱ�[1�ܰ�] 1. ���� 3���� �Է¹޴´�. 2. �Է¹��� 3���� ���� ���Ͽ�, 3. ���� ū ��(MAX)�� ����Ѵ�.
		 */
		/*
		 * Scanner sc = new Scanner(System.in); int num1 = sc.nextInt(); int num2 =
		 * sc.nextInt(); int num3 = sc.nextInt();
		 * 
		 * 
		 * 
		 * /*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * /* # ������ ����[1�ܰ�] 1. ������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�. 2. �Է¹��� ���ڸ� ���� ������ ������
		 * ����Ѵ�. ��) 3 x 7 = ? 3. ������ �ش��ϴ� ������ �Է¹޴´�. 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�. ���� �Ѱ�
		 * Scanner sc = new Scanner(System.in); int n1 = sc.nextlnt(); int n2 =
		 * sc.nextlnt();
		 * 
		 * int c = n1 * n2
		 * 
		 * System.out.println(+n1+" X" +n2 "=" +c);
		 * 
		 */

	}

}

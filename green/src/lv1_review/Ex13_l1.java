package lv1_review;

import java.util.Scanner;

public class Ex13_l1 {

	public static void main(String[] args) {
		/*
		 * # ������ ���[1�ܰ�]
		 * 1. �޴����� ����Ѵ�.
		 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
		 * 3. ������ �Է¹޴´�.
		 * 4. �Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�.
		 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);

		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;

		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		System.out.println("�޴��������ּ���");
		int sel = sc.nextInt();
		System.out.println("�����ұݾ��Է����ּ���");
		int payM = sc.nextInt();

		int charge = 0;
		if (sel == 1) {
			charge = payM - price1;
		}
		if (sel == 2) {
			charge = payM - price2;
		}
		if (sel == 3) {
			charge = payM - price3;
		}

		if (charge >= 0) {
			System.out.println("�ܵ���: " + charge + "�� �Դϴ�");
		}
		if (charge < 0) {
			System.out.println("���ұݾ��� �����մϴ�");
		}

	}

}

package lv1;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {

		/*
		 * # ������ ���[2�ܰ�] 1. 5�� �ֹ��� �޴´�. 2. �ֹ��� ���� ��, ���� �Է¹޴´�. 3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
		 * 
		 * ��) �޴� ���� : 1 �޴� ���� : 1 �޴� ���� : 2 �޴� ���� : 2 �޴� ���� : 3 �� �ݾ� = 31300�� ���� �Է� :
		 * 32000 === �Ե����� ������ === 1. �Ұ�� ���� : 2�� 2. ���� ���� : 2�� 3. �� �� : 1�� 4. �� �� �� :
		 * 31300�� 5. �� �� : 700��
		 */
		Scanner sc = new Scanner(System.in);

		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");

		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int total = 0;

		int n = 0;
		while (n < 5) {
			System.out.println("�޴� ���� :");
			int sel = sc.nextInt();

			if (sel == 1) {
				cnt1++;
				total += price1; // total = total + price1
			} else if (sel == 2) {
				cnt2++;
				total += price2;
			} else if (sel == 3) {
				cnt3++;
				total += price3;
			} else {
				System.out.println("���������ʴ� �޴��Դϴ�");
			}

			n++; // �������� �ݺ��� ���̿� ��ġ
		}
		System.out.println("�����ұݾ��� �Է��ϼ���");

		// ������ ���
		// ���޴��� �ֹ�����(cnt ���� ���)
		int inputMoney = sc.nextInt();
		if (inputMoney > total) {
			System.out.println("------������-------------");
			if (cnt1 > 0) {
				System.out.println("�Ұ�� ���� " + cnt1 + "��");
			}
			if (cnt2 > 0) {
				System.out.println("���� ���� " + cnt2 + "��");
			}
			if (cnt3 > 0) {
				System.out.println("�ݶ� " + cnt3 + "��");
			}
			System.out.println("----------");
			System.out.println("�ѱݾ�" + total + "��");
			System.out.println("�ܵ� " + (inputMoney - total) + "��");
		} else {
			System.out.println("������ �����մϴ�");
		}
	}

}

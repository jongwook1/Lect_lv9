package lv2;

import java.util.Random;

public class Test3_lv2 {

	public static void main(String[] args) {
		// ���� 10:42
		// ���� 11:00
		// �ҿ� 18��

		/*
		 * # �����л� 1. 10ȸ �ݺ��� �Ѵ�. 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����) 3. ������ 60�� �̻��̸�
		 * �հݻ��̴�. --------------------------------------- . ������(10��)�� ������ ����� ����Ѵ�. .
		 * �հ��� ���� ����Ѵ�. . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
		 */

		Random ran = new Random();
		int a = 0;
		int cnt = 0;
		int sum = 0;
		int max = 0;
		int top = 0;
		while (a < 10) {
			int rN = ran.nextInt(100) + 1;
			System.out.println("�л�����:" + rN);
			if (rN >= 60) {

				cnt++;

			}
			if (max < rN) {
				max = rN;
				top = a + 1;
			}

			sum += rN;
			a++;
		}
		System.out.println("����" + sum);
		System.out.println("���" + (sum / 10));
		System.out.println("�հ��ڼ�:" + cnt);
		System.out.println("1������" + max + "��ȣ" + top);

	}

}

package lv3;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// ����) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// ��)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		Scanner sc = new Scanner(System.in);
		int index = -1;
		boolean check = true;
		while (true) {
			System.out.println("�й��� �Է��ϼ���");
			int n = sc.nextInt();
			for (int i = 0; i < 5; i++) {
				if (hakbuns[i] == n) {
					index = i;
					// System.out.println(i);
					check = false;
				}
			}
			if (check == false) {
				System.out.println("�й�: " + n + " ����: " + scores[index]);

				break;
			} else {
				System.out.println("���� �й��Դϴ�");
			}

		}
		// ����) 1���л��� �й��� ���� ���
		// ����) 1004��(98��)
		int max = 0;
		int dex = -1;
		for (int i = 0; i < 5; i++) {
			if (scores[i] > max) {
				max = scores[i];
				dex = i;
			}
		}
		System.out.println("1���� �й�: " + hakbuns[dex] + "  ����" + max);

	}

}

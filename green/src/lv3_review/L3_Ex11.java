package lv3_review;

import java.util.Scanner;

public class L3_Ex11 {

	public static void main(String[] args) {
		/*
		 * # �Ｎ���� 1. ���� 7�� �������� 3�� �����ϸ�, "��÷" ���.
		 * 
		 */


		Scanner sc = new Scanner(System.in);
		int[] lotto = { 0, 0, 7, 7, 7, 0, 7, 7 };
		// int[] lotto = {7, 0, 7, 7, 0, 7, 0, 7};

		boolean run = true;

		System.out.println("1) ���� ���Ȯ��");
		System.out.println("2) ����");
		System.out.print("�޴� ���� : ");
		int sel = sc.nextInt();
		int cnt = 0;
		boolean win = false;
		if (sel == 1) {
			for (int i = 0; i < lotto.length; i++) {
				if (lotto[i] == 7) {
					cnt++;
				} else {
					cnt = 0;
				}
				if (cnt == 3) {
					win = true;
				}

			}

			if (win == true) {
				System.out.println("��÷");
			} else {
				System.out.println("Ż��");
			}

		}

	}

}

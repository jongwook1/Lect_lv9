package lv3;

import java.util.Scanner;

public class M06D16_4 {

	public static void main(String[] args) {
		/*
		 * # �Ｎ���� 1. ���� 7�� �������� 3�� �����ϸ�, "��÷" ���.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int[] lotto = { 0, 0, 7, 7, 7, 0, 7, 7 };
		// int[] lotto = {7, 0, 7, 7, 0, 7, 0, 7};
		boolean run = true;
		boolean win = false;

		while (run) {
			System.out.println("1) ���� ���Ȯ��");
			System.out.println("2) ����");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			if (sel == 1) {
				int cnt = 0;
				for (int i = 0; i < 8; i++) {
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
					System.out.println("��÷!");
				} else {
					System.out.println("��÷x");
				}
			} else if (sel == 2) {
				System.out.println("�����ϰڽ��ϴ�!");
			}
		}
	}
}

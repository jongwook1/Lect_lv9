package lv3;

import java.util.Scanner;

public class Test04_lv3 {

	public static void main(String[] args) {
		// ���� 16:45
		// ���� 17:25
		// �ҿ� 40��
		/*
		 * # ȸ������ 1. ���� . ���̵� �� ��й�ȣ�� �Է¹޾� ���� . ���̵� �ߺ��˻� 
		 * 2. Ż�� . ���̵� �� �Է¹޾� Ż��
		 */
		Scanner sc = new Scanner(System.in);
		int[] id = { 1001, 1002, 0, 0, 0 };
		int[] pw = { 1111, 2222, 0, 0, 0 };

		boolean run = true;
		int cnt = 2;
		while (run) {
			for (int i = 0; i < 5; i++) {
				System.out.print("�Ƶ�: " + id[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < 5; i++) {
				System.out.print("���: " + pw[i] + " ");
			}
			System.out.println();

			System.out.println("#ȸ������");
			System.out.println("1.����");
			System.out.println("2.Ż��");
			System.out.println("3.����");

			System.out.println("�޴��� �������ּ���");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("id�� �Է����ּ���");
				int inputId = sc.nextInt();

				boolean check = true;
				for (int i = 0; i < cnt; i++) {
					if (id[i] == inputId) {
						check = false;
					}
				}
				if (check = true) {
					System.out.println("��й�ȣ�� �Է����ּ���.");
					int inputPw = sc.nextInt();

					id[cnt] = inputId;
					pw[cnt] = inputPw;
					cnt++;

					System.out.println("ȸ�������� �Ǿ����ϴ�");
				} else {
					System.out.println("�ߺ��� ���̵��Դϴ�.");
				}

			} else if (sel == 2) {
				System.out.println("Ż���� ���̵� �Է��ϼ���");
				int inputId = sc.nextInt();

				int didx = -1;
				for (int i = 0; i < 5; i++) {
					if (id[i] == inputId) {
						didx = i;
					}
				}
				if (didx != -1) {
					System.out.println("Ż���� ���̵��� ��й�ȣ�� �Է��ϼ���");
					int inputPw = sc.nextInt();

					if (pw[didx] == inputPw) {
						for (int i = didx; i < cnt - 1; i++) {
							id[i] = id[i + 1];
							pw[i] = pw[i + 1];
						}
						id[cnt - 1] = 0;
						pw[cnt - 1] = 0;
						cnt--;

					} else {
						System.out.println("Ż���� ���̵��� ��й�ȣ�� Ʋ���ϴ�");
					}

				} else {
					System.out.println("Ż���� �Ƶ� ���������ʽ��ϴ�.");
				}
			} else if (sel == 3) {
				System.out.println("�����ϰڽ��ϴ�");
				break;
			}

		}

	}

}

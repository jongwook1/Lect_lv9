package lv2_review;

import java.util.Scanner;

public class L2_Ex14 {

	public static void main(String[] args) {
		/*
		 * # ATM
		 * 1. �α���
		 * . �α��� �� �� �α��� �Ұ�
		 * . �α׾ƿ� ���¿����� �̿� ����
		 * 2. �α׾ƿ�
		 * . �α��� �� �̿밡��
		 */


		Scanner sc = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;

		int log = -1; // -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)

		boolean run = true;
		while (run) {

			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("0.����");

			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				if (log == -1) {
					System.out.println("�Ƶ� �Է����ּ���");
					int inputId = sc.nextInt();
					System.out.println("����� �Է����ּ���");
					int inputPw = sc.nextInt();
					if (inputId == dbAcc1 && inputPw == dbPw1) {
						log = 1;
						System.out.println(dbAcc1 + "��, �α��εǼ̽��ϴ�.");
					} else if (inputId == dbAcc2 && inputPw == dbPw2) {
						log = 2;
						System.out.println(dbAcc2 + "��, �α��εǼ̽��ϴ�.");
					} else {
						System.out.println("���¹�ȣ�� ��й�ȣ�� Ȯ�����ּ���.");
					}

				} else {
					System.out.println("�α׾ƿ��� �������ּ���");
				}

			} else if (sel == 2) {
				if (log == 1) {
					System.out.println("�α׾ƿ��Ǽ̽��ϴ�");
					log = -1;
				} else {
					System.out.println("�α����� �������ּ���");
				}
			} else if (sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}

	}

}

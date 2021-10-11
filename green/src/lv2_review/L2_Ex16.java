package lv2_review;

import java.util.Scanner;

public class L2_Ex16 {

	public static void main(String[] args) {
		/*
		 * # ATM[����]
		 * 1. �α���
		 * . �α��� �� �� �α��� �Ұ�
		 * . �α׾ƿ� ���¿����� �̿� ����
		 * 2. �α׾ƿ�
		 * . �α��� �� �̿밡��
		 * 3. �Ա�
		 * . �α��� �� �̿밡��
		 * 4. ���
		 * . �α��� �� �̿밡��
		 * 5. ��ü
		 * . �α��� �� �̿밡��
		 * 6. ��ȸ
		 * . �α��� �� �̿밡��
		 * 7. ����
		 */
		
		Scanner sc = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		int log = -1; // -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)

		boolean run = true;
		while (run) {

			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("3.�Ա�");
			System.out.println("4.���");
			System.out.println("5.��ü");
			System.out.println("6.��ȸ");
			System.out.println("0.����");

			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				if (log == -1) {
					System.out.println("���̵� �Է����ּ���");
					int inputId = sc.nextInt();
					System.out.println("����� �Է����ּ���");
					int inputPw = sc.nextInt();
					if (dbAcc1 == inputId && dbPw1 == inputPw) {
						log = 1;
						System.out.println(dbAcc1 + "�� �α��� �Ǽ̽����.");
					} else if (dbAcc2 == inputId && dbPw2 == inputPw) {
						log = 2;
						System.out.println(dbAcc2 + "�� �α��� �Ǽ̽����.");
					} else {
						System.out.println("�Ƶ�� ����� Ȯ�����ּ���");
					}

				} else {
					System.out.println("�α׾ƿ��� �������ּ���");
				}
			} else if (sel == 2) {
				if (log != 1) {
					System.out.println("�α׾ƿ�����");
					log = -1;
				} else {
					System.out.println("�α����� �������ּ���");
				}
			} else if (sel == 3) {
				if (log != -1) {
					System.out.print("�Ա��� �ݾ� �Է� : ");
					int inputM = sc.nextInt();

					if (log == 1) {
						dbMoney1 = dbMoney1 + inputM;
					} else if (log == 2) {
						dbMoney2 = dbMoney2 + inputM;
					}
					System.out.println("�Ա��� �Ϸ��Ͽ����ϴ�.");
				} else {
					System.out.println("�α����� �������ּ���");
				}
			} else if (sel == 4) {
				System.out.print("����� �ݾ� �Է� : ");
				int outM = sc.nextInt();
				if (log == 1) {
					if (outM <= dbMoney1) {
						dbMoney1 -= outM;
						System.out.println("����� �Ϸ��Ͽ����ϴ�.");
					} else {
						System.out.println("�����ܾ��� �����մϴ�.");
					}
				}
				if (log == 2) {
					if (outM <= dbMoney1) {
						dbMoney1 -= outM;
						System.out.println("����� �Ϸ��Ͽ����ϴ�.");
					} else {
						System.out.println("�����ܾ��� �����մϴ�.");
					}
				} else {
					System.out.println("�α����� �������ּ���");
				}
			} else if (sel == 5) {
				if (log != -1) {
					System.out.print("��ü�� ���¹�ȣ �Է����ּ���  ");
					int acc = sc.nextInt();
					if (log == 1) {
						if (acc == dbAcc2) {
							System.out.print("��ü�� �ݾ� �Է� : ");
							int money = sc.nextInt();
							if (money <= dbMoney1) {
								dbMoney1 -= money;
								dbMoney2 += money;
								System.out.println("��ü�� �Ϸ��Ͽ����ϴ�.");
							} else {
								System.out.println("�����ܾ��� �����մϴ�.");
							}
						} else {
							System.out.println("���¸� Ȯ�����ּ���");
						}
					} else if (log == 2) {
						if (acc == dbAcc1) {
							System.out.print("��ü�� �ݾ� �Է� : ");
							int money = sc.nextInt();
							if (money <= dbMoney2) {
								dbMoney2 -= money;
								dbMoney1 += money;
								System.out.println("��ü�� �Ϸ��Ͽ����ϴ�.");
							} else {
								System.out.println("�����ܾ��� �����մϴ�.");
							}
						} else {
							System.out.println("���¸� Ȯ�����ּ���");
						}
					}

				} else {
					System.out.println("�α����� �������ּ���");
				}
			} else if (sel == 6) {
				if (log != 1) {
					if (log == 1) {
						System.out.println("�ܾ�: " + dbMoney1 + "��");
					} else if (log == 2) {
						System.out.println("�ܾ�: " + dbMoney2 + "��");
					}
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

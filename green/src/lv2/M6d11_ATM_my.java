package lv2;

import java.util.Scanner;

public class M6d11_ATM_my {

	public static void main(String[] args) {
		/*
		 * # ATM[����] 1. �α��� . �α��� �� �� �α��� �Ұ� . �α׾ƿ� ���¿����� �̿� ���� 2. �α׾ƿ� . �α��� �� �̿밡�� 3.
		 * �Ա� . �α��� �� �̿밡�� 4. ��� . �α��� �� �̿밡�� 5. ��ü . �α��� �� �̿밡�� 6. ��ȸ . �α��� �� �̿밡�� 7.
		 * ����
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
					System.out.println("���¹�ȣ�� �Է����ּ���");
					int inputAcc = sc.nextInt();
					if (inputAcc == dbAcc1) {
						System.out.println("��й�ȣ�� �Է����ּ���");
						int inputPw = sc.nextInt();
						if (inputPw == dbPw1) {
							System.out.println("1�� �α��εǼ̾��ϴ�");
							log = 1;
							continue;
						} else {
							System.out.println("Ʋ����й�ȣ�Դϴ�.");
							continue;
						}
					} else if (inputAcc == dbAcc2) {
						System.out.println("��й�ȣ�� �Է����ּ���");
						int inputPw = sc.nextInt();
						if (inputPw == dbPw2) {
							System.out.println("2�� �α��εǼ̾��ϴ�");
							log = 2;
							continue;
						} else {
							System.out.println("Ʋ����й�ȣ�Դϴ�.");
							continue;
						}
					} else {
						System.out.println("���°����Դϴ�.");
						continue;
					}
				} else if (log != -1) {
					System.out.println("�̹� �α������Դϴ�.");
					continue;
				}

				// else {}
				// System.out.println("�α����Ͻñ�ٶ��ϴ�");
				// int inputAcc = sc.nextInt();

			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("�̹� �α׾ƿ����Դϴ�");
					continue;
				} else {
					System.out.println("�α׾ƿ��Ǽ̽��ϴ�");
					log = -1;
					continue;
				}
			} // �Ա�
			else if (sel == 3) {
				if (log == 1) {
					System.out.println("���¸� �Է����ֽñ� �ٶ��ϴ�.");
					int input = sc.nextInt();
					if (input == dbAcc1) {
						System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
						int inputMoney = sc.nextInt();
						dbMoney1 += inputMoney;
						System.out.println("�Ա��� �Ϸ�ƽ��ϴ�.");
						continue;
					} else {
						System.out.println("���¸� Ȯ�����ֽñ�ٶ��ϴ�");
						continue;
					}
				} else if (log == 2) {
					System.out.println("���¸� �Է����ֽñ� �ٶ��ϴ�.");
					int input = sc.nextInt();
					if (input == dbAcc2) {
						System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
						int inputMoney = sc.nextInt();
						dbMoney2 += inputMoney;
						System.out.println("�Ա��� �Ϸ�ƽ��ϴ�.");
						continue;
					} else {
						System.out.println("���¸� Ȯ�����ֽñ�ٶ��ϴ�");
						continue;
					}
				} else {
					System.out.println("�α������ֽñ� �ٶ��ϴ�");
					continue;
				}

			} else if (sel == 4) {
				System.out.println("���¸� �Է����ֽñ� �ٶ��ϴ�.");
				int input = sc.nextInt();
				if (log == 1) {
					if (input == dbAcc1) {
						System.out.println("����� �ݾ��� �Է��ϼ���");
						int outMoney = sc.nextInt();
						dbMoney1 -= outMoney;
						System.out.println("����� �Ϸ�ƽ��ϴ�.");
						continue;
					} else {
						System.out.println("���¸� Ȯ�����ֽñ�ٶ��ϴ�");
						continue;
					}
				} else if (log == 2) {
					System.out.println("���¸� �Է����ֽñ� �ٶ��ϴ�.");
					int input1 = sc.nextInt();
					if (input1 == dbAcc2) {
						System.out.println("����� �ݾ��� �Է��ϼ���");
						int outMoney = sc.nextInt();
						dbMoney2 -= outMoney;
						System.out.println("����� �Ϸ�ƽ��ϴ�.");
						continue;
					} else {
						System.out.println("���¸� Ȯ�����ֽñ�ٶ��ϴ�");
						continue;
					}
				} else {
					System.out.println("�α������ֽñ� �ٶ��ϴ�4");
					continue;
				}
			}

			else if (sel == 5) {
				if (log == 1) {
					System.out.println("��ü�� �ݾ��� �Է��ϼ���");
					int oMoney = sc.nextInt();
					if (dbMoney1 < oMoney) {
						System.out.println("�ܰ� �����մϴ�");
					} else {
						dbMoney1 -= oMoney;
						dbMoney2 += oMoney;
						System.out.println("��ü�� �Ϸ�Ǿ����ϴ�");
						continue;
					}
				} else if (log == 2) {
					System.out.println("��ü�� �ݾ��� �Է��ϼ���");
					int oMoney = sc.nextInt();
					if (dbMoney1 < oMoney) {
						System.out.println("�ܰ� �����մϴ�");
					} else {
						dbMoney2 -= oMoney;
						dbMoney1 += oMoney;
						System.out.println("��ü�� �Ϸ�Ǿ����ϴ�");
						continue;
					}
				} else {
					System.out.println("�α������ֽñ� �ٶ��ϴ�");
					continue;
				}
			} // ��ȸ
			else if (sel == 6) {
				if (log == -1) {
					System.out.println("�α����� ���� ���ּ���!");
					continue;
				} else {
					if (log == 1) {
						System.out.println("1���� ���� �ܾ�: " + dbMoney1 + "��");
					} else if (log == 2) {
						System.out.println("2���� ���� �ܾ�: " + dbMoney2 + "��");
					}
					continue;
				}
			} else if (sel == 0) {
				//run = false;
				System.out.println("���α׷� ����");
				break;
			}
		}

	}
}

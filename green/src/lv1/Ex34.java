package lv1;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		/*
		 * # ATM[����] 1. �α��� . �α��� �� �� �α��� �Ұ� . �α׾ƿ� ���¿����� �̿� ���� 2. �α׾ƿ� . �α��� �� �̿밡�� 3.
		 * �Ա� . �α��� �� �̿밡�� 4. ��� . �α��� �� �̿밡�� 5. ��ü . �α��� �� �̿밡�� 6. ��ȸ . �α��� �� �̿밡�� 7.
		 * ����
		 */
		Scanner scan = new Scanner(System.in);

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
			int sel = scan.nextInt();
			if (sel == 1) {
				if (log == -1) {
					System.out.println("���¹�ȣ�� �Է��ϼ���");
					int inputAcc = scan.nextInt();
					if (inputAcc != dbAcc1 || inputAcc != dbAcc2) {
						System.out.println("���� �����Դϴ� ���¹�ȣ�� Ȯ�����ּ���");
					} else if (inputAcc == dbAcc1) {
						System.out.println("1�� ��й�ȣ�� �Է����ּ���");
						int inputdbPw1 = scan.nextInt();
						if (inputdbPw1 == dbPw1) {
							System.out.println("1�� �α��εǼ̽��ϴ�");
							log = +1;
						} else if (inputdbPw1 != dbPw1) {
							System.out.println("Ʋ�� ��й�ȣ�Դϴ� ");
						} else if (inputAcc == dbAcc2) {
							System.out.println("2�� ��й�ȣ�� �Է����ּ���");
							int inputdbPw2 = scan.nextInt();
							if (inputdbPw2 == dbPw2) {
								System.out.println("1�� �α��εǼ̽��ϴ�");
								log = +2;
							}
							if (inputdbPw2 != dbPw2) {
								System.out.println("Ʋ�� ��й�ȣ�Դϴ� ");
							}
						} else {
							System.out.println("�̹� �α��� �Ǿ� �ֽ��ϴ�");
						}
						System.out.println("�α����Ͽ����ϴ�");

					} else if (sel == 2) {
						if (log == -1) {
							System.out.println("�̹� �α׾ƿ� �Ǿ� �ֽ��ϴ�");
						} else {
							System.out.println("�α׾ƿ��� �Ǿ����ϴ�");
							log = -1;
						}
					} else if (sel == 3) {
						System.out.println("���¹�ȣ�� �Է��ϼ���");
						int inputAcc2 = scan.nextInt();
						if (inputAcc2 != dbAcc1 || inputAcc2 != dbAcc2) {
							System.out.println("���� �����Դϴ� ���¹�ȣ�� Ȯ�����ּ���");
						} else if (inputAcc2 == dbAcc1) {
							System.out.println("1�� ��й�ȣ�� �Է����ּ���");
							int inputdbPw = scan.nextInt();
							if (inputdbPw == dbPw1) {
								System.out.println("1�� �Ա��ϽǱݾ��� �Է����ּ���");
								int inputMoney = scan.nextInt();
								dbMoney1 += inputMoney;
							}
						} else if (inputAcc2 == dbAcc2) {
							System.out.println("2�� ��й�ȣ�� �Է����ּ���");
							int inputdbPw = scan.nextInt();
							if (inputdbPw == dbPw2) {
								System.out.println("2�� �Ա��ϽǱݾ��� �Է����ּ���");
								int inputMoney = scan.nextInt();
								dbMoney2 += inputMoney;
							}
						}
					} else if (sel == 4) {
						if (log == 1) {
							System.out.println("�󸶸� ����Ͻðڽ��ϱ�");
							int outMoney = scan.nextInt();
							if (outMoney <= dbMoney1) {
								dbMoney1 -= outMoney;
								System.out.println("�Ա��� �Ϸ�ƽ��ϴ�");
							} else if (outMoney > dbMoney1) {
								System.out.println("�ܾ��� �����մϴ�");
							}
						} else if (log == 2) {
							System.out.println("�󸶸� ����Ͻðڽ��ϱ�");
							int outMoney = scan.nextInt();
							if (outMoney <= dbMoney2) {
								dbMoney2 -= outMoney;
								System.out.println("�Ա��� �Ϸ�ƽ��ϴ�");
							} else if (outMoney > dbMoney2) {
								System.out.println("�ܾ��� �����մϴ�");
							}
						} else {
							System.out.println(" �α��� ���ֽñ�ٶ��ϴ�");
						}
					} else if (sel == 5) {
						if (log == 1) {
							System.out.println("��ü�� ���¹�ȣ�� �Է����ּ���");
							int inputAcc3 = scan.nextInt();
							if (inputAcc3 != dbAcc2) {
								System.out.println("���� �����Դϴ� ���¹�ȣ�� Ȯ�����ּ���");
							} else {
								System.out.println("��ü�ұݾ��� �Է����ּ���");
								int outMoney3 = scan.nextInt();
								if (outMoney3 <= dbMoney1) {
									System.out.println("��ü�� �Ϸ�ƽ��ϴ�");
									dbMoney1 -= outMoney3;
									dbMoney2 += outMoney3;
								}
							}
						} else if (log == 2) {
							System.out.println("��ü�� ���¹�ȣ�� �Է����ּ���");
							int inputAcc4 = scan.nextInt();
							if (inputAcc4 != dbAcc1) {
								System.out.println("���� �����Դϴ� ���¹�ȣ�� Ȯ�����ּ���");
							} else {
								System.out.println("��ü�ұݾ��� �Է����ּ���");
								int outMoney4 = scan.nextInt();
								if (outMoney4 <= dbMoney2) {
									System.out.println("��ü�� �Ϸ�ƽ��ϴ�");
									dbMoney2 -= outMoney4;
									dbMoney1 += outMoney4;
								}
							}
						} else {
							System.out.println("�̹� �α��� ���ֽñ�ٶ��ϴ�");
						}
					} else if (sel == 6) {
						if (log == 1) {
							System.out.println("�����ܾ��� " + dbMoney1 + "�� �Դϴ�");
						}
						if (log == 2) {
							System.out.println("�����ܾ��� " + dbMoney2 + "�� �Դϴ�");
						} else {
							System.out.println(" �α��� ���ֽñ�ٶ��ϴ�");
						}

					} else if (sel == 7) {
						run = false;

						System.out.println("���α׷� ����");

					}
				}
			}
		}
	}
}

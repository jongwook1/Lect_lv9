package lv5;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		//�̴�������Ʈ;
		
		// �ı� ���Ǳ� ���α׷� 		
		// 1) ������   2) ����� 
		//������ ==> 1) �ı�����   2) �ܵ� ���� 	 3)�ڷΰ���
		//����� ==> 1) ���� ==> ==> �Ա� �ݾ� �Է� ==> ���� �ż� �Է�  ==> �ܵ���� 	
	    //	       2)�ڷΰ���
		// ���� ) ��) �ܵ��� 7600���̴�. 5000������ ������ 1000��¥�� 7����� 
		//ȭ�� 
		// �ı� ���� : 3200�� 
		// �ı� 	  : ??��  (������ ����) 
		// 50000�� : ?? ��  	// 10000�� : ?? ��	// 5000�� : ?? ��
		// 1000�� : ?? ��		//  500�� : ?? ��	  	//  100�� : ?? �� 



		Scanner sc = new Scanner(System.in);

		int[] money = { 50000, 10000, 5000, 1000, 500, 100 };
		int[] charges = { 1, 1, 1, 1, 5, 10 };

		int tickets = 5; // �ı� ����
		int price = 3200; // �ı� ����

		while (true) {
			int total = 0;
			for (int i = 0; i < money.length; i++) {
				total += money[i] * charges[i];
			}

			System.out.println("�ı����: [" + tickets + "]");
			System.out.println("ȭ�������� ����");
			for (int i = 0; i < money.length; i++) {
				System.out.printf("%d��[%d] ", money[i], charges[i]);
			}
			System.out.println("\n�ܵ�: " + total);
			System.out.println("[1]������");
			System.out.println("[2]�����");
			System.out.println("[3]����");

			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				while (true) {
					System.out.println("1)�ı�����");
					System.out.println("2)�ܵ�����");
					System.out.println("3)�ڷΰ���");

					System.out.print("�޴� ���� : ");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("������ �ı� �����Է��ϼ���");
						int addTicket = sc.nextInt();
						tickets += addTicket;
					} else if (choice == 2) {

						while (true) {
							for (int i = 0; i < money.length; i++) {
								System.out.printf("%d) %d [%d]  ", i + 1, money[i], charges[i]);
							}
							System.out.println("0)�ڷΰ���");
							System.out.println("������ ȭ���� ������ �����ϼ���");
							int pick = sc.nextInt() - 1;
							if (pick == -1) {
								break;
							} else {
								charges[pick] = charges[pick] + 1;
							}

						}

					} else if (choice == 3) {
						break;
					}
				}

			} else if (sel == 2) {
				while (true) {
					System.out.println("1)����");
					System.out.println("2)�ڷΰ���");

					System.out.print("�޴� ���� : ");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("������ �ıǼ��� �Է��ϼ���");
						int buyT = sc.nextInt();
						int buyPrice = buyT * price;
						System.out.println("�����ϽǱݾ���: " + buyPrice + "�� �Դϴ�");
						System.out.println("");
						System.out.println("������ �ݾ��� �Է��ϼ���");
						int myM = sc.nextInt();
						
						
						

						int cMoney = myM - buyPrice;

						if (cMoney >= 0) {
							System.out.println("������ �ܵ���: " + cMoney + "�Դϴ�");

//							int tempM = cMoney; // �Ž����� ȭ��������� ���
							int tempC[] = new int[charges.length];// �Ž����� ȭ��������� ���

							for (int i = 0; i < tempC.length; i++) {
								tempC[i] = charges[i];
							}

							for (int i = 0; i < money.length; i++) {
								while (true) {
									if (cMoney >= money[i] && tempC[i] > 0) {
										cMoney = cMoney - money[i];
										tempC[i] = tempC[i] - 1;
									} else {
										break;
									}
								}
							}

							if (cMoney == 0) {
								for (int i = 0; i < charges.length; i++) {
									charges[i] = tempC[i];
								}
								tickets -= buyT;
							} else {
								System.out.println("�ܵ��̺����մϴ�");
							}

						} else {
							System.out.println("�����ұݾ��� �����մϴ�");
						}

					} else if (choice == 2) {
						break;
					}
				}
			} else if (sel == 3) {
				System.out.println("�����մϴ�");
				break;
			}
		}

	}

}

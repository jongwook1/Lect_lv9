package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex14_1 {

	public static void main(String[] args) {
			
			// 1. �α��� 2. ����
			// �α��� -> 1. �Ա� 2. ��� 3. ��ȸ
			//
			Scanner scan = new Scanner(System.in);
			int myAcc = 1234;
			int myPw = 1111;
			int myMoney = 8700;
			int yourAcc = 4321;
			int yourPw = 2222;
			int yourMoney = 12000;
			System.out.println("--- Green ATM ---");
			System.out.println("1. �α��� 2. ���� ");
			System.out.println("-----------------");
			System.out.println("�޴�����: ");
			int sel = scan.nextInt();
			if (sel == 1) {
				System.out.println("���¸� �Է��ϼ���");
				int inputAcc = scan.nextInt();				
				if (inputAcc == myAcc) {
					System.out.println("��й�ȣ�� �Է��ϼ���");
					int inputPw = scan.nextInt();					
					if (inputPw == myPw) {
						System.out.println("1. �Ա� 2. ��� 3. ��ü 4. ��ȸ ");
						sel = scan.nextInt();
						if (sel == 1) {
							int inputMoney = scan.nextInt();
							System.out.print("�Ա��� �ݾ׸� �Է��ϼ��� : ");							
							myMoney += inputMoney;
							System.out.println("�Ա��̿Ϸ� ����ϴ�.");
							System.out.println("���� �ܾ��� " + myMoney);							
						} else if (sel == 2) {
							System.out.println("����� �ݾ� �Է�");
							int inputMoney = scan.nextInt();
							if(inputMoney > myMoney) {
								System.out.println("�ܾ��̺����մϴ�");
							}else {
							System.out.print("����� �ݾ׸� �Է��ϼ��� : ");
							int outMoney = scan.nextInt();
							myMoney -= outMoney;}
						} else if (sel == 3) {
							// �Է¹ޱ�
							System.out.print("��ü�� ���¹�ȣ�� �Է��ϼ��� : ");
							inputAcc = scan.nextInt();
							// ����Ȯ��
							if (inputAcc == yourAcc) {
								// ��ü����
								int inputMoney = scan.nextInt();
								// ��ȿ�� �˻�
								if (inputMoney > myMoney) {
									System.out.println("�ܾ��� �����մϴ�!");
								} else {
//					System.out.println("��ü�Ϸ�, ���� �ܾ�: " + (myMoney - inputMoney));
									myMoney -= inputMoney; // myMoney = myMoney - inputMoney;
									// ���������� ( +=, -=, *=, /= )
									yourMoney += inputMoney;
									System.out.println("��ü�� ���������� �Ǿ����ϴ�!");
								}
							} else {
								System.out.println("�������� �ʴ� �����Դϴ�. ");
							}
						} else if (sel == 4) {
							System.out.println("���� �ܾ��� " + myMoney);
						} else {
							System.out.println("�������� �ʴ� �����Դϴ�. ");
						}
					}else 
						System.out.println("�������� �ʴ� �����Դϴ�. ");
				}
			} else if (sel == 2) {
				System.out.println("���α׷��� �����մϴ�.");
			} else {
				System.out.println("�������� �ʴ� �޴��Դϴ�.");
			}
	}
	
}

/*
 * myAcc = sc.nextInt(); if(myAcc == 1234) { myAcc = sc.nextInt();
 * System.out.println("myMoney = " + myMoney + "��" + "��ü����"); myMoney =
 * sc.nextInt(); if(myMoney == 8700) { System.out.println("yourMoney = " +
 * yourMoney + "��"); } else { System.out.println("��ü�Ұ�"); } }
 */





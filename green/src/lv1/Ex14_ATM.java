package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex14_ATM {

	public static void main(String[] args) {
		// 1. �α��� ==> 1.�Ա� 2.��� 3.��ȸ
		Scanner sc = new Scanner(System.in);
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
		int sel = sc.nextInt();
		
		if(sel == 1) {
			System.out.println("�����Է���");
			int inputAcc = sc.nextInt();
			if(inputAcc == myAcc) {
				System.out.println("����Է���");
				int inputPw = sc.nextInt();
				if(myPw == inputPw) {
					System.out.println("1. �Ա� 2. ��� 3. ��ü 4. ��ȸ ");
					int n = sc.nextInt();
					if(n == 1) {
						System.out.println("�Ա��� �ݾ��Է��ϼ���");
							int inputMoney = sc.nextInt();
							myMoney += inputMoney;
							System.out.println("�Ա��̿Ϸ� ����ϴ�.");
							System.out.println("���� �ܾ��� " + myMoney);	
					}
					else if(n == 2) {
						System.out.println("����� �ݾ��Է��ϼ���");
						int outMoney = sc.nextInt();
						myMoney -= outMoney;
						System.out.println("����̿Ϸ� ����ϴ�.");
						System.out.println("���� �ܾ��� " + myMoney);						
					}
					else if(n == 3) {
						System.out.println("��ü�� �����Է��ϼ���");
						inputAcc = sc.nextInt();
						if(inputAcc == yourAcc) {							
							System.out.println("�ݾ��� �Է��ϼ���");
							int inputMoney = sc.nextInt();
							if (inputMoney > myMoney) {
								System.out.println("�ܾ��� �����մϴ�!");
							} else {
//				System.out.println("��ü�Ϸ�, ���� �ܾ�: " + (myMoney - inputMoney));
								myMoney -= inputMoney; // myMoney = myMoney - inputMoney;
								// ���������� ( +=, -=, *=, /= )
								yourMoney += inputMoney;
								System.out.println("��ü�� ���������� �Ǿ����ϴ�!");
							}
						}else {
							System.out.println("���������ʴ� �����Դϴ�");
							}
					}
					else if(n == 4) {
						System.out.println("���� �ܾ��� " + myMoney );
					}else {System.out.println("�������� �ʴ¸޴��Դϴ�");}
				}else {
					System.out.println("Ʋ������Դϴ�");
					}
			}else {
				System.out.println("���������ʴ� �����Դϴ�");
			}
		}else if(sel == 2) {
			System.out.println("�����ϰڽ��ϴ�");
		}		
	}
}
//int inputmoney = sc.nextInt();
package lv1_review;

import java.util.Scanner;

public class Ex21_l1 {

	public static void main(String[] args) {
		// 1. �α��� ==> 1.�Ա� 2.��� 3.��ȸ
		
		int cash = 20000;  // �Աݽ� ����  , ��ݽ� ����
		int balance = 30000; // �Աݽ� ���� , ��ݽ� ���� 
		int account  = 11111; // �α��ν� ���
		int password  = 1234; // �α��ν� ��� 
		Scanner sc = new Scanner(System.in);
		System.out.println("===ATM===");
		System.out.println("1.�Ա� 2.��� 3.����");
		System.out.println("����: " +cash);
		System.out.println("�����ܰ�: " +balance);
		System.out.println("�޴��� �������ּ���");
		int sel = sc.nextInt();
		
		
		System.out.println("���¸� �Է����ּ���");
		int inputAcc=sc.nextInt();
		System.out.println("����Է����ּ���");
		int inputPw=sc.nextInt();
		if(account==inputAcc&&password==inputPw) {
				
		if(sel==1) {			
				System.out.println("�Ա��� �ݾ��� �Է����ּ���");
				int inputM=sc.nextInt();
				if(cash>=inputM) {
				cash-=inputM;
				balance+=inputM;
				System.out.println("�Ա��� �Ϸ�ƽ��ϴ�");
				}else {
					System.out.println("������ �����մϴ�");
				}
			
			
		}else if(sel==2) {
			System.out.println("����� �ݾ��� �Է��ϼ���");
			int outputM=sc.nextInt();
			if(balance>=outputM) {
			cash+=outputM;
			balance-=outputM;
			System.out.println("����� �Ϸ�ƽ��ϴ�");
			}else {
				System.out.println("�����ܾ��̺����մϴ�");
			}
		}else if(sel==3) {
			System.out.println("�����ϰڽ��ϴ�");
		}
		
		}else {
			System.out.println("���¿� ��й�ȣ�� Ȯ�����ּ���");
		}
		System.out.println("����: " +cash);
		System.out.println("�����ܰ�: " +balance);

	}

}

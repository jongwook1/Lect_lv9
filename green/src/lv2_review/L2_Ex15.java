package lv2_review;

import java.util.Scanner;

public class L2_Ex15 {

	public static void main(String[] args) {
		/*
		 * # ATM
		 * 1. �Ա�
		 * . �Ա��� �ݾ��� �Է¹޾�, myMoney�� �Ա�
		 * 2. ���
		 * . ����� �ݾ��� �Է¹޾�, myMoney���� ���
		 * . ��, ����� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ݺҰ�
		 * 3. ��ü
		 * . yourAcc ���¹�ȣ�� �Է¹޾�, ��ü
		 * . ��ü�� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ü �Ұ�
		 * . ��ü �� yourMoney �ܾ� ����
		 * 4. ��ȸ
		 * . myMoney�� yourMoney �ܾ� ��� ���
		 */
		
		Scanner sc = new Scanner(System.in);

		int myAcc = 1111;
		int myMoney = 50000;

		int yourAcc = 2222;
		int yourMoney = 70000;

		boolean run = true;
		while (run) {

			System.out.println("1.�Ա�");
			System.out.println("2.���");
			System.out.println("3.��ü");
			System.out.println("4.��ȸ");
			System.out.println("0.����");

			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("�Ա��� �ݾ��Է����ּ���");
				int inputM=sc.nextInt();				
					myMoney+=inputM;
					System.out.println("�Ա��� �Ϸ�ƽ��ϴ�");
				
				
			} else if (sel == 2) {
				System.out.println("����� �ݾ��Է����ּ���");
				int outM=sc.nextInt();
				if(outM>myMoney) {
					System.out.println("�ܰ� �����մϴ�");
				}else {
					myMoney-=outM;
					System.out.println("����� �Ϸ�ƽ��ϴ�");
				}
				
			} else if (sel == 3) {
				System.out.println("��ü�� ���¸� �Է����ּ���");
				int inputAcc=sc.nextInt();
				if(inputAcc==yourAcc) {
					System.out.println("��ü�� �ݾ��� �Է����ּ���");
					int outM=sc.nextInt();
					if(outM>myMoney) {
						System.out.println("�ܰ� �����մϴ�");
					}else {
						myMoney-=outM;
						yourMoney+=outM;
						System.out.println("��ü�� �Ϸ�ƽ��ϴ�");
					}
				}else {
					System.out.println("���¹�ȣ�� Ȯ�����ּ���");
				}
				
				
			} else if (sel == 4) {
				System.out.println("myMoney = " + myMoney + "��");
				System.out.println("yourMoney = " + yourMoney + "��");				
			} else if (sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}

	}

}

package lv1_review;

import java.util.Scanner;

public class Ex20_l1 {

	public static void main(String[] args) {
		/*
		 * # ATM[1�ܰ�] : ��ü�ϱ�
		 * 1. ��ü�� ���¹�ȣ�� �Է¹޴´�.
		 * 2. ���¹�ȣ�� ��ġ�ϸ�,
		 * 3. ��ü�� �ݾ��� �Է¹޴´�.
		 * 4. ��ü�� �ݾ� <= myMoney	: ��ü����
		 * 			myMoney   - ��ü�� �ݾ�
		 * 			yourMoney + ��ü�� �ݾ�
		 *    ��ü�� �ݾ�  > myMoney 	: ��ü�Ұ�
		 */

		int myAcc = 1234;
		int myMoney = 8700;

		int yourAcc = 4321;
		int yourMoney = 12000;

		System.out.println("myMoney = " + myMoney + "��");
		System.out.println("yourMoney = " + yourMoney + "��");

		Scanner sc = new Scanner(System.in);
		System.out.println("���¹�ȣ�Է����ּ���");
		int inputAcc = sc.nextInt();

		if (yourAcc == inputAcc) {
			System.out.println("��ü�� �ݾ� �Է����ּ���");
			int inputMoney = sc.nextInt();
			if (myMoney >= inputMoney) {
				myMoney -= inputMoney;
				yourMoney += inputMoney;
				System.out.println("��ü�Ϸ�");
			} else {
				System.out.println("�ܾ��̺����մϴ�");
			}
		} else {
			System.out.println("���°� ��ġ���� �ʽ��ϴ�");
		}

		System.out.println("myMoney:" + myMoney);
		System.out.println("yourMoney:" + yourMoney);

	}

}

package lv1_review;

import java.util.Scanner;

public class Ex11_l1 {

	public static void main(String[] args) {
		/*
		 * # ���� ��ȿ�� �˻�
		 * 1. ������ �Է¹޴´�.
		 * 2. ������  60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
		 * 3. ��, �Է¹��� ������ 
		 *    �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�.
		 *    ��) ������  �߸� �Է��߽��ϴ�.
		 */

		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();

		if (score >= 60) {
			if (score > 100) {
				System.out.println("100���� �ʰ��������� �߸��Է��ϼ̽��ϴ�");
			} else
				System.out.println("�հ�");
		} else if (score < 60) {
			System.out.println("���հ�");
		}

	}

}

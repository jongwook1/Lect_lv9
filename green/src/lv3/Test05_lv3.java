package lv3;

import java.util.Scanner;

public class Test05_lv3 {

	public static void main(String[] args) {
		// ���� 09:00
		// ���� 09:13
		// �ҿ� 13��		
		/*
		 * # �Ҽ�ã��[2�ܰ�]
		 * ���� �� ���� �Է¹޾�, 2���� �ش� ���ڱ����� ��� �Ҽ� ���
		 * ��)
		 * �Է� : 20
		 * 2, 3, 5, 7, 11, 13, 17, 19
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���");
		int n = sc.nextInt();

		for (int i = 2; i <=n; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.println("�Ҽ�"+i);
			}
		}

	}

}

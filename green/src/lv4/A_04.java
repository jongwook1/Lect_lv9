package lv4;

import java.util.Random;
import java.util.Scanner;

public class A_04 {

	public static void main(String[] args) {
		/*
		 * # ���� �߱� ����
		 * 1. com�� 1~9 ������ ���� 3���� ����
		 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
		 * 2. com�� me�� ���� ������ ���� ������ �ݺ�
		 * 3. ���ڿ� �ڸ��� ������ 		strike += 1
		 *    ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
		 * ��)
		 * ���� : 1 7 3
		 * 3 1 5		: 2b
		 * 1 5 6		: 1s
		 * ...
		 */
		
		int[] com = { 1, 7, 3 };
		int[] me = new int[3];

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		boolean win = false;
		while (!win) {
			int s = 0;
			int b = 0;
			me = new int[3];

			for (int i = 0; i < 3; i++) {
				System.out.print(com[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < 3; i++) {
				System.out.print(me[i] + " ");
			}
			System.out.println();

			for (int i = 0; i < 3; i++) {
				System.out.printf("����%d: ", i + 1);
				int n = sc.nextInt();

				int check = -1;
				for (int j = 0; j < 3; j++) {
					if (me[j] == n) {
						check = 1;
					}
				}
				if (check == -1) {
					me[i] = n;
				} else {
					System.out.println("�ߺ��� �ԷºҰ�");
					i--;
				}

			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (com[i] == me[j]) {
						if (i == j) {
							s++;
						} else {
							b++;
						}
					}
				}
			}
			System.out.println("��Ʈ����ũ" + s);
			System.out.println("��" + b);
			if (s == 3) {
				System.out.println("���ӳ�!");
				win = true;
			}
		}

	}

}

package lv3_review;

import java.util.Random;
import java.util.Scanner;

public class L3_Ex18 {

	public static void main(String[] args) {
		/*
		 * # ���� ����
		 * 1. ���� ������ ��ġ�� 2�� �Է��� ������ ���ߴ� �����̴�.
		 * 2. ������ ���߸� back�� �ش� ���ڸ� ������,
		 *    back�� ��� ���� ä������ ������ ����ȴ�.
		 * ��)
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		 * �Է�1 : 0
		 * �Է�2 : 1
		 * 
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
		 */

		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int[] back = new int[10];

		// ����(shuffle)
		int i = 0;
		while (i < 1000) {
			int r = rn.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;

			i += 1;
		}

		int cnt = 0;
		while (true) {
			System.out.println("ī���ȣ");
			for (int j = 0; j < front.length; j++) {
				System.out.print(j + 1 + " ");
			}
			System.out.println();
			System.out.println("ī���� ��: ");
			for (int j = 0; j < front.length; j++) {
				System.out.print(front[j] + " ");
			}
			System.out.println();
			System.out.println("����ī��: ");
			for (int j = 0; j < front.length; j++) {
				System.out.print(back[j] + " ");
			}

			if (cnt == 5) {
				System.out.println("Ŭ����");
				break;
			}

			System.out.println("\n1. ���� �Է����ּ���");
			int idx1 = sc.nextInt() - 1;
			System.out.println("2. ���� �Է����ּ���");
			int idx2 = sc.nextInt() - 1;

			if (idx1 == idx2 || idx1 < 0 || idx1 > 9 || idx2 < 0 || idx2 > 9) {
				System.out.println("����Ȯ�����ּ���");
			} else {
				if (front[idx1] == front[idx2] && back[idx1] == 0) {
					back[idx1] = front[idx1];
					back[idx2] = front[idx2];
					cnt++;
				} else {
					System.out.println("��");
				}
			}

		}

	}

}

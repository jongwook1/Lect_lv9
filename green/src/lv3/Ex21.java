package lv3;

import java.util.Random;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		/*
		 * # ���� ���� 1. ���� ������ ��ġ�� 2�� �Է��� ������ ���ߴ� �����̴�. 2. ������ ���߸� back�� �ش� ���ڸ� ������,
		 * back�� ��� ���� ä������ ������ ����ȴ�. ��) front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5] back =
		 * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0] �Է�1 : 0 �Է�2 : 1
		 * 
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5] back = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
		 */
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int[] back = new int[10];
		// ����(shuffle)
		int i = 0;
		while (i < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			i += 1;
		}

		int cnt = 0;
		while (true) {
			System.out.print("ī���ȣ: ");
			for (int k = 0; k < 10; k++) {
				System.out.print(k + 1 + " ");
			}
			System.out.println();
			System.out.print("ī���Ǿ�: ");
			for (int k = 0; k < 10; k++) {
				System.out.print(front[k] + " ");
			}
			System.out.println();
			System.out.print("ī���ǵ�: ");
			for (int k = 0; k < 10; k++) {
				System.out.print(back[k] + " ");
			}
			if (cnt == 5) {
				System.out.println("�����մϴ�");
				break;
			}

			System.out.println("\n���Է� ����");
			int idx1 = sc.nextInt() - 1;
			System.out.println("���Է� ����");
			int idx2 = sc.nextInt() - 1;

			if (idx1 == idx2 || idx1 < 0 || idx1 > 10 || idx2 < 0 || idx2 > 10) {
				System.out.println("��ȣ���ٽ�Ȯ���ϼ���!");
			} else {
				if (front[idx1] == front[idx2] && back[idx1] == 0) {
					System.out.println("����");
					back[idx1] = front[idx1];
					back[idx2] = front[idx2];
					cnt++;
				} else {
					System.out.println("��!");
				}
			}
		}

	}

}

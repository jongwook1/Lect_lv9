package lv4;

import java.util.Random;
import java.util.Scanner;

public class A_05 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50�� ==> 1 to 18
		 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
		 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
		 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
		 * 4. ���� 1~9�� front �迭�� �����ϰ�,
		 *    ���� 10~18�� back �迭�� �����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		final int SIZE = 9;
		int[] front = new int[SIZE];
		int[] back = new int[SIZE];

		for (int i = 0; i < 9; i++) {
			front[i] = i + 1;
			back[i] = i + 10;
		}

		for (int i = 0; i < 1500; i++) {
			int rIdx = rn.nextInt(9);
			int temp = front[0];
			front[0] = front[rIdx];
			front[rIdx] = temp;

			rIdx = rn.nextInt(9);
			temp = back[0];
			back[0] = back[rIdx];
			back[rIdx] = temp;

		}

		int gamenum = 1;
		while (true) {
			for (int i = 0; i < 9; i++) {
				System.out.print(front[i] + " ");
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			System.out.println();

			if (gamenum > SIZE * 2) {
				System.out.println("����Ŭ����");
				break;
			}

			System.out.print("�����������Է� ����(1~9)");
			int idx = sc.nextInt() - 1;

			if (idx >= 0 && idx < 9) {
				if (front[idx] == gamenum) {
					front[idx] = back[idx];
					back[idx] = 0;
					gamenum++;
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�!");
				}

			}
		}

	}

}

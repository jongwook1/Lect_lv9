package lv4_review;

import java.util.Random;
import java.util.Scanner;

public class L4_Ex04 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50�� ==> 1 to 18
		 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
		 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
		 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
		 * 4. ���� 1~9�� front �迭�� �����ϰ�,
		 *    ���� 10~18�� back �迭�� �����Ѵ�.
		 */

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		final int SIZE = 9;
		int[] front = new int[SIZE];
		int[] back = new int[SIZE];

		// �� ���ʴ�� �ֱ�
		int idx = -1;
		for (int i = 0; i < SIZE; i++) {
			front[i] = i + 1;
			back[i] = 10 + i;
			idx = i;
		}

		// ����
		for (int i = 0; i < 1000; i++) {
			int rN = ran.nextInt(9);

			int temp = front[idx];
			front[idx] = front[rN];
			front[rN] = temp;
		}

		for (int i = 0; i < 1000; i++) {
			int rN = ran.nextInt(9);
			int temp = back[idx];
			back[idx] = back[rN];
			back[rN] = temp;
		}

		// run
		int gameN = 1;
		while (true) {
			// ���
			for (int j = 0; j < SIZE; j++) {
				System.out.print(front[j] + " ");
				if (j % 3 == 2) {
					System.out.println();
				}
			}

			// �˻�
			System.out.println("������������ �ε�����ȣ �Է� ��");
			int inputIdx = sc.nextInt() - 1;
			if(inputIdx>=0&&inputIdx<SIZE) {
			if (front[inputIdx] == gameN) {
				front[inputIdx] = back[inputIdx];
				back[inputIdx] = 0;
				gameN++;
			}
			}
			if (gameN > SIZE * 2) {
				System.out.println("Ŭ����");
				break;
			}

		}

	}

}

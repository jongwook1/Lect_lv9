package lv4;

import java.util.Random;
import java.util.Scanner;
//lv3ex22 ����?
public class Ex05_t_1to18 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50�� ==> 1 to 18
		 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
		 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
		 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
		 * 4. ���� 1~9�� front �迭�� �����ϰ�,
		 *    ���� 10~18�� back �迭�� �����Ѵ�.
		 */

		final int SIZE = 9;
		int[] front = new int[SIZE];
		int[] back = new int[SIZE];

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int idx = -1;
		for (int i = 0; i < 9; i++) { // front�迭�� back�迭�� ���ֱ�
			front[i] = i + 1;
			back[i] = i + 10;
			idx = i;
		}
		// ����
		for (int i = 0; i < 1000; i++) {
			int rn = ran.nextInt(9);
			int temp = front[idx];
			front[idx] = front[rn];
			front[rn] = temp;
		}
//		for(int i=0;i<9;i++) {
//			System.out.print(front[i]);
//		}
		for (int i = 0; i < 1000; i++) {
			int rn = ran.nextInt(9);
			int temp = back[idx];
			back[idx] = back[rn];
			back[rn] = temp;
		}
//		for(int i=0;i<9;i++) {
//			System.out.print(back[i]+" ");
//		}
		int gameN = 1;
		while (true) {
			// ���
			for (int i = 0; i < SIZE; i++) {
				System.out.print(front[i] + " ");
				if (i % 3 == 2) { // ==0�ƴ϶� 2
					System.out.println();
				}

			}//����
			if (gameN > SIZE * 2) {
				System.out.println("Ŭ����");
				break;
			}
//			System.out.println();
//			for(int i=0;i<9;i++) {
//				System.out.print(back[i]);			
//				}
			// ����
			System.out.println("\n����������ȣ���� �ε����Է����ּ���");
			int inputIdx = sc.nextInt() - 1;
			if (inputIdx >= 0 && inputIdx < SIZE) {
//				for (int i = 0; i < SIZE; i++) {

					if (front[inputIdx] == gameN) {
						front[inputIdx] = back[inputIdx]; // back ���� ���� ��ġ�� index����;� �ϹǷ� -->back[inputIdx]//
						back[inputIdx] = 0;
						gameN++;
					}

				}
			}

//		}

	}

}

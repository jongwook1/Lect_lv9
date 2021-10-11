package lv3;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		/*
		 * # �̴ϸ��� 1. �÷��̾�� p1�� p2 2���̴�. 2. �����ư��� 1~3 ������ ���ڸ� �Է��� �̵��Ѵ�. 3. �̵��ϴٰ� ���� �÷��̾��
		 * ���� ��ġ�� ���̰� �Ǹ�, ��� �÷��̾�� ������ �Ǿ� �������� �ǵ��ư���. 4. ���� 3������ ���� �̱��.
		 * 
		 * [p2]1~3 �Է� : 1 1 2 3 4 5 6 7 8 0 1 0 0 0 0 0 0 0 0 0 2 0 0 0 0
		 * 
		 * [p1]1~3 �Է� : 3 [p1]�� p2�� ��Ҵ�! 1 2 3 4 5 6 7 8 0 0 0 0 1 0 0 0 2 0 0 0 0 0 0 0
		 */
		Scanner scan = new Scanner(System.in);
		int[] game = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] p1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] p2 = { 0, 0, 0, 0, 0, 0, 0, 0 };
		int turn = 0; // 1 2 1 2 1
		int idx1 = 0;
		int idx2 = 0;
		p1[idx1] = 1;
		p2[idx2] = 2;

		Scanner sc = new Scanner(System.in);

		int win1 = 0; // 1 2 3
		int win2 = 0;

		while (true) {
			for (int i = 0; i < 8; i++) {
				System.out.print(game[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < 8; i++) {
				System.out.print(p1[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < 8; i++) {
				System.out.print(p2[i] + " ");
			}
			System.out.println();

			if (turn % 2 == 0) {
				System.out.println("p1");
				
			} else {
				System.out.println("p2");
				
			}
			int move = sc.nextInt();

			// �̵�
		//	if() {}
			if (turn % 2 == 0) {				
				if (idx1 + move < 8) {
					p1[idx1] = 0;
					p1[idx1 + move] = 1;
				} else {// ������ ����
					p1[idx1] = 0;
					p1[(idx1 + move) % 8] = 1; // 11 ->2
					win1++;
				}
				turn++;
			} else {
				if (idx2 + move < 8) {
					p2[idx2] = 0;
					p2[idx2 + move] = 1;
				} else {// ������ ����
					p2[idx2] = 0;
					p2[(idx2 + move) % 8] = 1; // 11 ->2
					win2++;
				}
				turn--;	
			}
			if (win1 == 3) {
				System.out.println("p1�¸�!");
				break;
			} else if (win2 == 3) {
				System.out.println("p2�¸�!");
				break;
			}

		}

	}

}

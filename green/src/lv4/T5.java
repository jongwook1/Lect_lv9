package lv4;

import java.util.Scanner;

public class T5 {
//Ex04
	public static void main(String[] args) {
		/*
		 * # ���� �߱� ����
		 * 1. me�� 1~9 ������ ���� 3���� ����			//		me�� �ڽ����Է�
		 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
		 * 2. com�� me�� ���� ������ ���� ������ �ݺ� 			//3strike�Ǹ� ����
		 * 3. ���ڿ� �ڸ��� ������ 		strike += 1
		 *    ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
		 * ��)
		 * ���� : 1 7 3
		 * 3 1 5		: 2b
		 * 1 5 6		: 1s
		 * ...
		 */
		Scanner sc=new Scanner(System.in);
		
		int[] com = { 1, 7, 3 };
		int[] me = new int[3];

		int win = 0;
		int strike = 0;
		int ball = 0;
		while (true) {

			for (int i = 0; i < 3; i++) {
				System.out.print(com[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < 3; i++) {
				System.out.print(me[i] + " ");
			}
			System.out.println();

			System.out.println("��Ʈ����ũ" + strike);
			System.out.println("��" + ball);

			if (win == 3) {
				System.out.println("��ⳡ");
			}

			boolean check = true;
			for (int i = 0; i < 3; i++) {
				System.out.printf("\n%d) ���� �Է��ϼ���", i + 1);
				int inputN = sc.nextInt();
				for (int j = 0; j < 3; j++) {
					if (me[j] == inputN) {
						check = false;
					}
				}

				if (check == true) {
					me[i] = inputN;
				}

			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (com[i] == me[j]) {
						if (i == j) {
							strike++;
							win++;
						} else {
							ball++;
						}
					}
				}
			}

		}
		
		
	}

}

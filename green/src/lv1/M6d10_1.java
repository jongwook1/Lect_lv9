package lv1;

import java.util.Random;
import java.util.Scanner;

public class M6d10_1 {

	public static void main(String[] args) {
		/*
		 * # ����Ų���31
		 * 1. p1�� p2�� �����ư��鼭 1~3�� �Է��Ѵ�.
		 * 2. br�� p1�� p2�� �Է°��� �����ؼ� �����Ѵ�.
		 * 3. br�� 31�� ������ ������ ����ȴ�.
		 * 4. �¸��ڸ� ����Ѵ�.
		 * 
		 * ��) 
		 * 1�� : p1(2)	br(2)
		 * 2�� : p2(1)	br(3)
		 * 3�� : p1(3)	br(6)
		 * ...
		 */
		Scanner sc = new Scanner(System.in);

		int turn = 0;
		boolean run = true;
		int br = 0;
		while (run) {
			int answer = 0;

			if (turn % 2 == 0) {
				System.out.println("p1�� ���ڸ� �Է��ϼ���");
				answer = sc.nextInt();
				br += answer;
			} else {
				System.out.println("p2�� ���ڸ� �Է��ϼ���");
				answer = sc.nextInt();
				br += answer;
			}

			if (answer < 1 || answer > 3) {
				System.out.println("1~3������ ���ڸ� �Է��ϼ���");
				turn--;
			} else {
				if (br >= 31) {
					if (turn % 2 == 0) {
						System.out.println("p2�� ��");
					} else {
						System.out.println("p1�� ��");
					}
					run = false;
				}

			}
			turn++;

		}

	}

}

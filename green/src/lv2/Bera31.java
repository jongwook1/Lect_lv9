package lv2;

import java.util.Random;
import java.util.Scanner;

public class Bera31 {

	public static void main(String[] args) {
		// ���� 10:05
		// ���� 10:30
		// �ҿ� 25��		
		/*
		 * # ����Ų���31 1. p1�� p2�� �����ư��鼭 1~3�� �Է��Ѵ�. 2. br�� p1�� p2�� �Է°��� �����ؼ� �����Ѵ�. 3. br��
		 * 31�� ������ ������ ����ȴ�. 4. �¸��ڸ� ����Ѵ�.
		 * 
		 * ��) 1�� : p1(2) br(2) 2�� : p2(1) br(3) 3�� : p1(3) br(6) ...
		 */

		Scanner sc = new Scanner(System.in);

		int p1 = 0;
		int p2 = 0;
		int br = 0;
		int turn = 0;

		boolean run = true;

		while (run) {
			System.out.println("������ br��"+br);
			int answer = 0;
			System.out.println("br" + br);
			if (turn % 2 == 0) {
				System.out.println("p1 ���� ����");
				answer = sc.nextInt();
			} else {
				System.out.println("p2 ���� ����");
				answer = sc.nextInt();
			}
			
			if (answer >= 1 && answer <= 3) {
				br += answer;
				if (br >= 31) {
					if (turn % 2 == 0) {
						System.out.println("p2��");
					} else {
						System.out.println("p1��");
					}
					run = false;
				}
			} else {
				System.out.println("1~3�� �Է�����");
				turn--;
			}
			turn++;
		}

	}
}

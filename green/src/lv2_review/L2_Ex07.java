package lv2_review;

import java.util.Scanner;

public class L2_Ex07 {

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
		
		int p1 = 0;
		int p2 = 0;

		int br = 0;
		int turn = 0; // turn0�϶� p1���� turn1�϶� p2����

//		int i=0;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (true) {

			if (turn % 2 == 0) {
				System.out.println("p1�� �����Է��ϼ���");
				int p1N = sc.nextInt();
				if (p1N >= 1 && p1N <= 3) {
					turn++;
					br += p1N;
				} else {
					System.out.println("1~3���̼��ڸ� �Է��ϼ���");
				}
			} else if (turn % 2 == 1) {
				System.out.println("p2�� �����Է��ϼ���");
				int p2N = sc.nextInt();
				if (p2N >= 1 && p2N <= 3) {
					turn++;
					br += p2N;
				} else {
					System.out.println("1~3���̼��ڸ� �Է��ϼ���");
				}

			}
			System.out.println("br" + br);
			if (br >= 31) {
				if (turn % 2 == 0) {
					System.out.println("p1��");
				} else if (turn % 2 == 1) {
					System.out.println("p2��");
				}
				break;
			}

		}
		

	}

}

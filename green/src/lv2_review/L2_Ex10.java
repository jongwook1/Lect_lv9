package lv2_review;

import java.util.Scanner;

public class L2_Ex10 {

	public static void main(String[] args) {
		/*
		 * # �ִ밪 ���ϱ�[2�ܰ�]
		 * 1. 3ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
		 * 2. �Է¹��� 3���� ���� �� ���� ū ���� ����Ѵ�.
		 */

		Scanner sc = new Scanner(System.in);
		int i = 0;
		int max = 0;
		while (i < 3) {
			System.out.println("������ �Է����ּ���");
			int inputN = sc.nextInt();
			if (max < inputN) {
				max = inputN;
			}

			i++;
		}
		System.out.println("�ִ밪" + max);
	}

}

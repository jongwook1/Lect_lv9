package lv2_review;

import java.util.Scanner;

public class L2_Ex09 {

	public static void main(String[] args) {
		/*
		 * # �Ҽ�ã��[1�ܰ�]
		 * 1. �Ҽ���, 1�� �ڱ��ڽ����θ� �������� ��
		 * 2. ��) 2, 3, 5, 7, 11, 13, ..
		 * 3. ��Ʈ
		 * 1) �ش� ���ڸ� 1���� �ڱ��ڽű��� ������.
		 * 2) �������� 0�� ������ ī��Ʈ�� ����.
		 * 3) �� ī��Ʈ ���� 2�̸� �Ҽ��̴�.
		 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	�Ҽ�x
		 * 
		 * ���� �� ���� �Է¹޾�, �ش� ���ڰ� �Ҽ����� �ƴ��� �Ǻ��Ѵ�.
		 */

		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.println("���ڸ��Է��ϼ���");
		int inputN = sc.nextInt();
		int cnt = 0;
		while (i <= inputN) {
			if (inputN % i == 0) {
				cnt++;
			}

			i++;
		}
		if (cnt == 2) {
			System.out.println(inputN + "�� �Ҽ��̴�");
		} else {
			System.out.println(inputN + "�� �Ҽ��� �ƴϴ�");
		}

	}

}

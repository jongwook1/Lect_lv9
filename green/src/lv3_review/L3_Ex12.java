package lv3_review;

import java.util.Random;

public class L3_Ex12 {

	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[1�ܰ�]
		 * 1. 0~4 ������ ���ڸ� arr�迭�� �����Ѵ�.
		 * 2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�.
		 * ��Ʈ) ���� ���ڸ� check�迭�� �ε����� Ȱ���Ѵ�.
		 * 
		 * ��)
		 * �������� : 1
		 * check = {0, 1, 0, 0, 0}
		 * arr   = {1, 0, 0, 0, 0}
		 * �������� : 3
		 * check = {0, 1, 0, 1, 0}
		 * arr   = {1, 3, 0, 0, 0}
		 * �������� : 2
		 * check = {0, 1, 1, 1, 0}
		 * arr   = {1, 3, 2, 0, 0}
		 */
		
		Random rn = new Random();

		int[] check = new int[5];
		int[] arr = new int[5];

		int idx = 0;
		while (idx < 5) {
			int rN = rn.nextInt(5);
			if (check[rN] == 0) {
				arr[idx] = rN;
				check[rN] = 1;
				idx++;
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}

	}

}

package lv4_review;

import java.util.Scanner;

public class Ex00 {

	public static void main(String[] args) {
		/*
		 * # �ִ밪 ���ϱ�
		 * 1. ���� ū ���� ã�� �Է��Ѵ�.
		 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
		 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
		 * ��)
		 * 11, 87, 42, 100, 24
		 * �Է� : 100
		 * 
		 * 11, 87, 42, 0, 24
		 * �Է� : 87
		 * 
		 * 11, 0, 42, 0, 24
		 */
		
		Scanner sc = new Scanner(System.in);

		int[] arr = { 11, 87, 42, 100, 24 };

		while (true) {
			int cnt = 0;
			int idx = 0;
			int max = arr[idx];
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				if (max < arr[i]) {
					max = arr[i];
					idx = i;

				}
				if (arr[i] == 0) {
					cnt++;
				}
			}
			System.out.println("�ִ밪�Է� ��");
			int maxN = sc.nextInt();
			if (maxN == max) {
				arr[idx] = 0;
			}

		}

	}

}

package lv4;

import java.util.Scanner;

public class A_01 {

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
			int idx = 0;
			int max = arr[idx];
			int cnt = 0;

			for (int i = 0; i < 5; i++) {
				System.out.print(arr[i] + " ");
				if (max < arr[i]) {
					max = arr[i];
					idx = i;
				}
				if (arr[i] == 0) {
					cnt++;
				}
			}
			System.out.println();
			if (cnt == 5) {
				break;
			}
			System.out.print("�ִ밪�Է¤���");
			int answer = sc.nextInt();
			if (answer == max) {
				arr[idx] = 0;
			}

		}

	}

}

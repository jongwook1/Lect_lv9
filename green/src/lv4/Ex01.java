package lv4;

import java.util.Scanner;

public class Ex01 {

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

		int[] arr = { 11, 87, 42, 100, 24 };
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("arr�迭�� ��Ȳ");
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("\n���� �Է��ϼ���");
			int n = sc.nextInt();

			for (int i = 0; i < 5; i++) {
				if (arr[i] == n) {
					arr[i] = 0;
					cnt++;
				}
			}
			if (cnt == 5) {
				System.out.println("��θ������Ƿ� �����ϰڽ��ϴ�");
				run = false;
			}

		}

	}

}

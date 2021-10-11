package lv3;

import java.util.Scanner;

public class Ex07_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[] = { 10, 49, 51, 36, 17 };

		int b[] = { 0, 0, 0, 0, 0 };

		for (int i = 0; i < 5; i++) {
			if (a[i] % 2 == 1) {
				// System.out.println(i);
				b[i] = a[i];
				System.out.println(b[i]);
			} else {
				System.out.println(b[i]);
			}

		}

	}

}

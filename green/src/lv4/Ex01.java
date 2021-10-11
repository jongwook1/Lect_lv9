package lv4;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * # 최대값 구하기
		 * 1. 가장 큰 값을 찾아 입력한다.
		 * 2. 정답이면 해당 값을 0으로 변경한다.
		 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
		 * 예)
		 * 11, 87, 42, 100, 24
		 * 입력 : 100
		 * 
		 * 11, 87, 42, 0, 24
		 * 입력 : 87
		 * 
		 * 11, 0, 42, 0, 24
		 */

		int[] arr = { 11, 87, 42, 100, 24 };
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("arr배열의 현황");
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("\n답을 입력하세요");
			int n = sc.nextInt();

			for (int i = 0; i < 5; i++) {
				if (arr[i] == n) {
					arr[i] = 0;
					cnt++;
				}
			}
			if (cnt == 5) {
				System.out.println("모두맞췄으므로 종료하겠습니다");
				run = false;
			}

		}

	}

}

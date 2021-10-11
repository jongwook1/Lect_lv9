package lv3;

import java.util.Scanner;

public class Test05_lv3 {

	public static void main(String[] args) {
		// 시작 09:00
		// 종료 09:13
		// 소요 13분		
		/*
		 * # 소수찾기[2단계]
		 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
		 * 예)
		 * 입력 : 20
		 * 2, 3, 5, 7, 11, 13, 17, 19
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세여");
		int n = sc.nextInt();

		for (int i = 2; i <=n; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.println("소수"+i);
			}
		}

	}

}

package lv4_review;

import java.util.Scanner;

public class Ex00 {

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
			System.out.println("최대값입력 ㄱ");
			int maxN = sc.nextInt();
			if (maxN == max) {
				arr[idx] = 0;
			}

		}

	}

}

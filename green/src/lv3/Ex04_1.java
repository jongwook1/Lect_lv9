package lv3;

import java.util.Scanner;

public class Ex04_1 {

	public static void main(String[] args) {
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11 인덱스 : 1
		Scanner sc = new Scanner(System.in);
		int[] arr = { 87, 11, 45, 98, 23 };
		System.out.println("성적을 입력해주세요");
		int inN2 = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			if (arr[i] == inN2) {
				System.out.println(i);
				//System.out.println(arr[i]);
				
				// 87, 98
				// 11, 98
				// 45, 98
				// 98, 98
				// 23, 98
			}
		}

	}

}

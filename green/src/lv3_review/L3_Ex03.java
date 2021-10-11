package lv3_review;

import java.util.Scanner;

public class L3_Ex03 {

	public static void main(String[] args) {
		// 인덱스 0 1 2 3 4
		int[] arr = { 87, 11, 45, 98, 23 };

		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1 성적 : 11점

		Scanner sc = new Scanner(System.in);
		System.out.println("인덱스를 입력하세요");
		int idx = sc.nextInt();
		System.out.println(arr[idx] + "점");

		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11 인덱스 : 1

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		System.out.println("성적을 입력하세요");
		int data = sc.nextInt();
		int idx1 = -1;
		for (int i = 0; i < 5; i++) {
			if (scores[i] == data) {
				idx1 = i;
			}
		}
		System.out.println("성적입력받아 인덱스출력: " + idx1);

		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003 성적 : 45점
		System.out.println("학번입력해주세요");
		int hakbunsD = sc.nextInt();
		int idx2 = -1;
		for (int i = 0; i < 5; i++) {
			if (hakbuns[i] == hakbunsD) {
				idx2 = i;
			}
		}
		System.out.println("학번입력받아 성적출력: " + scores[idx2] + "점");

	}

}

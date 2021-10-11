package lv3;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003 성적 : 45점
		Scanner sc = new Scanner(System.in);

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };


		int idx = -1;// 인덱스 정보를 갖는 변수는 -> 초기화를 할때 , 0으로 하면안됨

		// int check =0;// 0 false, 1 true
		// boolean check = false;
		while (true) {
			System.out.println("학번입력");
			int num = sc.nextInt();
			// 검사 ( hakbuns 배열에 존재하는가)
			for (int i = 0; i < 5; i++) {
				if (hakbuns[i] == num) {
					// ? i기억
					idx = i;
				}
			}
			if (idx != -1) {// out bound 오류 출력됨 // 중단위험
				// check 변수 활용 -> 결과값 도출
				System.out.println(scores[idx]);
			}
		}
	}
}

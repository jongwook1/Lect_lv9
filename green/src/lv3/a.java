package lv3;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// 문제) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		Scanner sc = new Scanner(System.in);
		int index = -1;
		boolean check = true;
		while (true) {
			System.out.println("학번을 입력하세요");
			int n = sc.nextInt();
			for (int i = 0; i < 5; i++) {
				if (hakbuns[i] == n) {
					index = i;
					// System.out.println(i);
					check = false;
				}
			}
			if (check == false) {
				System.out.println("학번: " + n + " 성적: " + scores[index]);

				break;
			} else {
				System.out.println("없는 학번입니다");
			}

		}
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		int max = 0;
		int dex = -1;
		for (int i = 0; i < 5; i++) {
			if (scores[i] > max) {
				max = scores[i];
				dex = i;
			}
		}
		System.out.println("1등의 학번: " + hakbuns[dex] + "  성적" + max);

	}

}

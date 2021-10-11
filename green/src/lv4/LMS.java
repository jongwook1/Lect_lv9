package lv4;

import java.util.Scanner;

public class LMS {

	public static void main(String[] args) {
		/*
		 * - 학생성적관리 프로그램 만들기 - 학번 및 성적을 입력 받아 성적을 등록할 수 있고, - 등록된 학번을 입력하면 성적과 함께 등급이
		 * 출력됨 - 등급기준 : 90점 이상 A / 80점 이상 B / 70점 이상 C / 60점 미만 F
		 */
		Scanner sc = new Scanner(System.in);
		int[] hackbunarr = new int[5];
		int[] scorearr = new int[5];
		int cnt = 0;
		int idx = -1;
		String grade = "";
		for (int i = 0; i < hackbunarr.length; i++) {
			System.out.println("학번을 입력하세요");
			int hackbun = sc.nextInt();
			System.out.println("성적을 입력하세요");
			int score = sc.nextInt();
			hackbunarr[i] = hackbun;
			idx = hackbunarr[i];
			scorearr[i] = score;
		}
		for (int i = 0; i < scorearr.length; i++) {
			if (scorearr[i] >= 90) {
				grade = "A";
			}
			if (scorearr[i] >= 80) {
				grade = "B";
			}
			if (scorearr[i] >= 70) {
				grade = "C";
			}
			if (scorearr[i] < 60) {
				grade = "D";
			}
		}
		System.out.println("출력할학번을입력하세요");
		int inputhackbun = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			if (inputhackbun == hackbunarr[i]) {
				System.out.println(scorearr[i] + grade);
			}
		}

	}

}

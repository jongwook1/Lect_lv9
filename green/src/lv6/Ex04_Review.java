package lv6;

import java.util.Scanner;

class Lv6Ex {
	String name = "";

	int[] arHakbun = { 1001, 1002, 1003, 1004, 1005 };
	int[] arScore = { 92, 38, 87, 100, 11 };

}

public class Ex04_Review {

	public static void main(String[] args) {
		Lv6Ex l = new Lv6Ex();
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("=== " + mega.name + "===");
		 * System.out.println("1.전교생 성적확인"); System.out.println("2.1등학생 성적확인");
		 * System.out.println("3.꼴등학생 성적확인"); System.out.println("4.성적확인하기");
		 * System.out.println("5.종료하기");
		 */
		int max = 0;
		int first = -1;

		for (int i = 0; i < l.arScore.length; i++) {
			if (max < l.arScore[i]) {
				max = l.arScore[i];
				first = i;
			}
		}

		int min = 100;
		int minIdx = -1;

		for (int i = 0; i < l.arScore.length; i++) {
			if (min > l.arScore[i]) {
				min = l.arScore[i];
				minIdx = i;
			}
		}

		while (true) {
			System.out.println("\n=== " + l.name + "Green");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			System.out.println("메뉴선택");
			int sel = sc.nextInt();
			if (sel == 1) {
				for (int i = 0; i < l.arScore.length; i++) {
					System.out.print(l.arScore[i] + " ");
				}
			} else if (sel == 2) {
				System.out.println("1등학생의 성적: " + max);
			} else if (sel == 3) {
				System.out.println("꼴등학생의 성적: " + min);
			} else if (sel == 4) {
				System.out.println("학번입력");
				int h = sc.nextInt();
				int idx = -1;
				for (int i = 0; i < l.arHakbun.length; i++) {
					if (l.arHakbun[i] == h) {
						idx = i;
					}
				}
				System.out.println(l.arScore[idx]);
			} else if (sel == 5) {
				break;
			}

		}

	}

}

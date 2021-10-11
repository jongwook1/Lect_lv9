package lv4_review;

import java.util.Random;
import java.util.Scanner;

public class Z_07 {

	public static void main(String[] args) {
		// # 빙고 Ver2(플레이어 2명)

		// 시작 12:30
		// 종료 13:10
		// 소요 00:40

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int maxNum = 5;
		int size = 50;
		int[][] p1 = new int[maxNum][maxNum];
		int[][] p2 = new int[maxNum][maxNum];
		int[][] meMark = new int[maxNum][maxNum];
		int[][] youMark = new int[maxNum][maxNum];
		int[] temp = new int[maxNum * maxNum];

		int turn = 1;

		// 랜덤값넣기 중복없이
		// p1

		for (int i = 0; i < maxNum; i++) {
			for (int j = 0; j < maxNum; j++) {
				int rN = ran.nextInt(30) + 1;
				int check = 1;
				for (int a = 0; a < maxNum; a++) {
					for (int b = 0; b < maxNum; b++) {
						if (p1[a][b] == rN) {
							check = -1;
						}
					}
				}
				if (check == 1) {
					p1[i][j] = rN;
				} else {
					j--;
				}

			}
		}
		// p2
		for (int i = 0; i < maxNum; i++) {
			for (int j = 0; j < maxNum; j++) {
				int rN = ran.nextInt(30) + 1;
				int check = 1;
				for (int a = 0; a < maxNum; a++) {
					for (int b = 0; b < maxNum; b++) {
						if (p2[a][b] == rN) {
							check = -1;
						}
					}
				}
				if (check == 1) {
					p2[i][j] = rN;
				} else {
					j--;
				}

			}
		}

		System.out.println("몇 빙고로 할지 입력하세요");
		int n = sc.nextInt();
		int end = 0;

		while (true) {
			int win1 = 0;
			int win2 = 0;

			// 출력
			System.out.println("p1빙고판");
			for (int i = 0; i < maxNum; i++) {
				for (int j = 0; j < maxNum; j++) {
					if (p1[i][j] == 0) {
						System.out.print("*\t");
					} else {
						System.out.print(p1[i][j] + "\t ");
					}
				}
				System.out.println();
			}
			System.out.println("p2빙고판");
			for (int i = 0; i < maxNum; i++) {
				for (int j = 0; j < maxNum; j++) {
					if (p2[i][j] == 0) {
						System.out.print("*\t ");
					} else {
						System.out.print(p2[i][j] + "\t ");
					}
				}
				System.out.println();
			}
			// 종료

			if (end != 0) {
				System.out.printf("p%d  %d빙고", end, n);
				break;
			}

			// run
			System.out.printf("p%d: ", turn);
			int num = sc.nextInt();

			for (int i = 0; i < maxNum; i++) {
				for (int j = 0; j < maxNum; j++) {
					if (p1[i][j] == num) {
						p1[i][j] = 0;
					}
					if (p2[i][j] == num) {
						p2[i][j] = 0;
					}
				}
			}

			// 검사문
			// ㅡ
			for (int i = 0; i < maxNum; i++) {
				int cnt1 = 0;
				int cnt2 = 0;
				for (int j = 0; j < maxNum; j++) {
					if (p1[i][j] == 0) {
						cnt1++;
					}
					if (p2[i][j] == 0) {
						cnt2++;
					}
				}
				if (cnt1 == maxNum)
					win1++;
				if (cnt2 == maxNum)
					win2++;
			}

			// |
			for (int i = 0; i < maxNum; i++) {
				int cnt1 = 0;
				int cnt2 = 0;
				for (int j = 0; j < maxNum; j++) {
					if (p1[j][i] == 0)
						cnt1++;

					if (p2[j][i] == 0)
						cnt2++;

				}
				if (cnt1 == maxNum)
					win1++;

				if (cnt2 == maxNum)
					win2++;
			}

			// \
			int cnt1 = 0;
			int cnt2 = 0;
			for (int i = 0; i < maxNum; i++) {
				if (p1[i][i] == 0) {
					cnt1++;
				}
				if (p2[i][i] == 0) {
					cnt2++;
				}
			}
			if (cnt1 == maxNum) {
				win1++;
			}
			if (cnt2 == maxNum) {
				win2++;
			}

			// /

			cnt1 = 0;
			cnt2 = 0;
			for (int i = 0; i < maxNum; i++) {
				if (p1[i][4 - i] == 0) {
					cnt1++;
				}
				if (p2[i][4 - i] == 0) {
					cnt2++;
				}
			}
			if (cnt1 == maxNum) {
				win1++;
			}
			if (cnt2 == maxNum) {
				win2++;
			}

			if (win1 == n) {
				end = 1;
			}
			if (win2 == n) {
				end = 2;
			}

			turn = turn == 1 ? 2 : 1;
		}

	}

}

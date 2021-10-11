package lv3_review;

import java.util.Scanner;

public class L3_Ex08 {

	public static void main(String[] args) {
		// 문제 1) 아래 배열 a 에서 내가 입력한 값만 빼고 b 에 저장
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 0, 0, 0, 0, 0 };
		// 예) 30 ==> b[] = {10,20,40,50,0};

		Scanner sc = new Scanner(System.in);
		System.out.println("뺄값을 입력하세요");
		int inputD = sc.nextInt();

		int idx = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != inputD) {
				b[idx] = a[i];
				idx++;
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}

		System.out.println();
		// 문제 2) 아래 배열에서 내가 입력한 번호 와 값 만 빼고 d 에 저장
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = { 0, 0, 0, 0, 0, 0 };
		// 예) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
		System.out.println("학번또는 학점입력하세요");
		int inD = sc.nextInt();
		int delIdx = -1;
		for (int i = 0; i < 6; i++) {
			if (c[i] == inD) {
				if (i % 2 == 0) {
					delIdx = i;
				} else if (i % 2 == 1) {
					delIdx = i - 1;
				}
			}
		}
		int uIdx = 0;
		for (int i = 0; i < 6; i += 2) {
			if (i != delIdx) {
				d[uIdx] = c[i];
				d[uIdx + 1] = c[i + 1];
				uIdx += 2;
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(d[i] + " ");
		}

	}

}

package lv3;

import java.util.Scanner;

public class M06D16_1 {

	public static void main(String[] args) {
		// 문제 1) 아래 배열 a 에서 내가 입력한 값만 빼고 b 에 저장
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 0, 0, 0, 0, 0 };
		// 예) 30 ==> b[] = {10,20,40,50,0};
		Scanner sc = new Scanner(System.in);
		System.out.println("값입력 ㄱㄱ");
		int ipt = sc.nextInt();

		int idx = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] != ipt) {
				b[idx] = a[i];
				idx++;
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(b[i]);
		}

		// 문제 2) 아래 배열에서 내가 입력한 번호 와 값 만 빼고 d 에 저장
		int c[] = { 1001, 40, 1002, 65, 1003, 70 }; // 짝 홀 짝 홀 짝 홀
		int d[] = { 0, 0, 0, 0, 0, 0 };
		// 예) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};

		System.out.println("학번 또는 점수 ㄱㄱ");
		int ipt2 = sc.nextInt();
		int delidx = -1;
		for (int i = 0; i < 6; i++) {
			if (c[i] == ipt2) {
				if (i % 2 == 0) {
					delidx = i;
				} else {
					delidx = i - 1;
				}
			}
		}
		int didx = 0;
		for (int i = 0; i < 6; i += 2) {
			if (i != delidx) {
				d[didx] = c[i];
				d[didx + 1] = c[i + 1];
				didx += 2;
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(d[i]);
		}
	}
}

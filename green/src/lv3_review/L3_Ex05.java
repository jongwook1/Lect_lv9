package lv3_review;

import java.util.Scanner;

public class L3_Ex05 {

	public static void main(String[] args) {
		int a[] = { 10, 49, 51, 36, 17 };
		// 문제 1) 다음 리스트를 값을 입력하면 번호 출력
		// 예) 51 ==> 2
		// 예) 10 ==> 0
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요");
		int inputD = sc.nextInt();
		int idx = -1;
		for (int i = 0; i < 5; i++) {
			if (a[i] == inputD) {
				idx = i;
			}
		}
		System.out.println(idx);

		System.out.println();
		// 문제 2) 다음 리스트를 이용해서 a 의 값중 홀수만 b 에 저장(위치는 동일한위치에 저장)
		// 예) b = [0, 49, 51, 0, 17]
		int b[] = { 0, 0, 0, 0, 0 };

		for (int i = 0; i < 5; i++) {
			if (a[i] % 2 == 1) {
				b[i] = a[i];
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		// 문제 3) 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장(위치는 앞에서 부터 저장)
		// 2번문제와 조금 다름
		// 예) c = [49, 51, 17, 0, 0]
		int c[] = { 0, 0, 0, 0, 0 };
		int idx3 = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] % 2 == 1) {
				c[idx3] = a[i];
				idx3++;
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		// -------------------------------------------------
		int arr[] = { 1001, 20, 1002, 45, 1003, 54 };
		// 학번과 점수가 한쌍이다. ==> 1001:20 , 1002:45 , 1003:54
		// 문제4) 학번을 입력하면 점수 출력
		// 예) 1001==>20 , 1003 ==> 54
		System.out.println("학번입력해주세요");
		int inH = sc.nextInt();

		for (int i = 0; i < 5; i++) {
			if (arr[i] == inH) {
				System.out.printf("%d-->%d", arr[i], arr[i + 1]);
			}
		}
		System.out.println();
		// 문제5) 점수를 입력하면 학번 출력
		// 예) 20 ==> 1001 , 45 ==> 1002
		System.out.println("점수입력해주세요");
		int score = sc.nextInt();

		for (int i = 0; i < 5; i++) {
			if (arr[i] == score) {
				System.out.printf("%d-->%d", arr[i], arr[i - 1]);
			}
		}

	}

}

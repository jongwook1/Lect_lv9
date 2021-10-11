package lv3_review;

import java.util.Scanner;

public class L3_Ex13 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1 , 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}
		Scanner sc = new Scanner(System.in);
		System.out.println("1)인덱스값입력하세요");
		int idx1 = sc.nextInt();
		System.out.println("2)인덱스값입력하세요");
		int idx2 = sc.nextInt();

		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40 , 값2 입력 : 20
		// {10, 20, 30, 40, 50}

		System.out.println("1)값입력하세요");
		int data1 = sc.nextInt();
		System.out.println("2)값입력하세요");
		int data2 = sc.nextInt();

		int idx3 = -1;
		int idx4 = -1;
		for (int i = 0; i < 5; i++) {
			if (arr[i] == data1) {
				idx3 = i;
			}
			if (arr[i] == data2) {
				idx4 = i;
			}
		}
		int temp2 = arr[idx3];
		arr[idx3] = arr[idx4];
		arr[idx4] = temp2;

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예 3) 학번1 입력 : 1002 , 학번2 입력 : 1003
		// {87, 45, 11, 98, 23}

		System.out.println("1)학번입력하세요");
		int h1 = sc.nextInt();
		System.out.println("2)학번입력하세요");
		int h2 = sc.nextInt();

		int idx5 = -1;
		int idx6 = -1;
		for (int i = 0; i < 5; i++) {
			if (hakbuns[i] == h1) {
				idx5 = i;
			}
			if (hakbuns[i] == h2) {
				idx6 = i;
			}
		}
		int temp3 = scores[idx5];
		scores[idx5] = scores[idx6];
		scores[idx6] = temp3;

		for (int i = 0; i < 5; i++) {
			System.out.print(scores[i] + " ");
		}

	}

}

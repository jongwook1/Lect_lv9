package lv3_review;

import java.util.Scanner;

public class L3_Ex13 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1 , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}
		Scanner sc = new Scanner(System.in);
		System.out.println("1)�ε������Է��ϼ���");
		int idx1 = sc.nextInt();
		System.out.println("2)�ε������Է��ϼ���");
		int idx2 = sc.nextInt();

		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 20, 30, 40, 50}

		System.out.println("1)���Է��ϼ���");
		int data1 = sc.nextInt();
		System.out.println("2)���Է��ϼ���");
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
		// ���� 3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
		// �� 3) �й�1 �Է� : 1002 , �й�2 �Է� : 1003
		// {87, 45, 11, 98, 23}

		System.out.println("1)�й��Է��ϼ���");
		int h1 = sc.nextInt();
		System.out.println("2)�й��Է��ϼ���");
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

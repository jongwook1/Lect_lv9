package lv3_review;

import java.util.Scanner;

public class L3_Ex03 {

	public static void main(String[] args) {
		// �ε��� 0 1 2 3 4
		int[] arr = { 87, 11, 45, 98, 23 };

		// ����1) �ε����� �Է¹޾� ���� ���
		// ����1) �ε��� �Է� : 1 ���� : 11��

		Scanner sc = new Scanner(System.in);
		System.out.println("�ε����� �Է��ϼ���");
		int idx = sc.nextInt();
		System.out.println(arr[idx] + "��");

		// ����2) ������ �Է¹޾� �ε��� ���
		// ����2) ���� �Է� : 11 �ε��� : 1

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		System.out.println("������ �Է��ϼ���");
		int data = sc.nextInt();
		int idx1 = -1;
		for (int i = 0; i < 5; i++) {
			if (scores[i] == data) {
				idx1 = i;
			}
		}
		System.out.println("�����Է¹޾� �ε������: " + idx1);

		// ����3) �й��� �Է¹޾� ���� ���
		// ����3) �й� �Է� : 1003 ���� : 45��
		System.out.println("�й��Է����ּ���");
		int hakbunsD = sc.nextInt();
		int idx2 = -1;
		for (int i = 0; i < 5; i++) {
			if (hakbuns[i] == hakbunsD) {
				idx2 = i;
			}
		}
		System.out.println("�й��Է¹޾� �������: " + scores[idx2] + "��");

	}

}

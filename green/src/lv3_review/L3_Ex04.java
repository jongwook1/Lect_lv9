package lv3_review;

import java.util.Scanner;

public class L3_Ex04 {

	public static void main(String[] args) {

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// ����) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// ��)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.

		Scanner sc = new Scanner(System.in);
		System.out.println("�й��� �Է����ּ���");
		int inpHakbuns = sc.nextInt();

		int check = -1;
		for (int i = 0; i < 5; i++) {
			if (hakbuns[i] == inpHakbuns) {
				check = i;
			}
		}
		if (check != -1) {
			for (int i = 0; i < 5; i++) {
				System.out.println(scores[check]);
			}
		} else {
			System.out.println("�ش��й��� ���������ʽ��ϴ�");
		}

	}

}

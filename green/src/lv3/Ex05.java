package lv3;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// ����3) �й��� �Է¹޾� ���� ���
		// ����3) �й� �Է� : 1003 ���� : 45��
		Scanner sc = new Scanner(System.in);

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };


		int idx = -1;// �ε��� ������ ���� ������ -> �ʱ�ȭ�� �Ҷ� , 0���� �ϸ�ȵ�

		// int check =0;// 0 false, 1 true
		// boolean check = false;
		while (true) {
			System.out.println("�й��Է�");
			int num = sc.nextInt();
			// �˻� ( hakbuns �迭�� �����ϴ°�)
			for (int i = 0; i < 5; i++) {
				if (hakbuns[i] == num) {
					// ? i���
					idx = i;
				}
			}
			if (idx != -1) {// out bound ���� ��µ� // �ߴ�����
				// check ���� Ȱ�� -> ����� ����
				System.out.println(scores[idx]);
			}
		}
	}
}

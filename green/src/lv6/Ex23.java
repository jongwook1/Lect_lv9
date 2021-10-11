package lv6;

import java.util.Random;
import java.util.Scanner;

class Test3 {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);

	void printq1(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			int rN = ran.nextInt(100) + 1;
			scores[i] = rN;
			System.out.print(scores[i] + " ");
		}
	}

	void printTotalAvg(int[] scores) {
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		int avg = total / scores.length;
		System.out.println("����: " + total);
		System.out.println("���: " + avg);
	}

	void printPass(int[] scores) {
		int pCnt = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				pCnt++;
			}
		}
		System.out.println("������ 60�� �̻��� �հݻ���: " + pCnt);
	}

	void printScores(int[] scores) {
		System.out.print("�ε����Է�: ");
		int inIdx = sc.nextInt();
		System.out.println("����: " + scores[inIdx]);
	}

	void printIdx(int[] scores) {
		System.out.print("�����Է�: ");
		int inScore = sc.nextInt();
		int idx = -1;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == inScore) {
				idx = i;
			}
		}
		System.out.println("�ε���: " + idx);
	}

	void printInHakOutScore(int[] hakbuns, int[] scores) {
		for (int i = 0; i < hakbuns.length; i++) {
			System.out.print(hakbuns[i] + " ");
		}
		System.out.println("�й��� �Է��ϼ���");
		int inHak = sc.nextInt();
		int idx = -1;
		for (int i = 0; i < hakbuns.length; i++) {
			if (inHak == hakbuns[i]) {
				idx = i;
			}
		}
		if (idx != -1) {

			System.out.println("�й��� �Է¹޾� ���� ���: " + scores[idx]);
		} else {
			System.out.println("�������� �ʴ� �й��Դϴ�");
		}

	}

	void printMax(int[] hakbuns, int[] scores) {
		int maxNum = 0;
		int maxIdx = 0;
		for (int i = 0; i < scores.length; i++) {
			if (maxNum < scores[i]) {
				maxNum = scores[i];
				maxIdx = i;
			}
		}
		System.out.println("1���л��� ����: " + maxNum + "  1���л��� �й�: " + maxIdx);
	}
}

public class Ex23 {

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];

		// ����1) scores�迭�� 1~100�� ������ ���� ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		test3.printq1(scores);
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		test3.printTotalAvg(scores);
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		test3.printPass(scores);
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		test3.printScores(scores);
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		test3.printIdx(scores);
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 45��
		test3.printInHakOutScore(hakbuns, scores);
		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		test3.printInHakOutScore(hakbuns, scores);
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		test3.printMax(hakbuns, scores);
	}

}

package lv6;

import java.util.Random;
import java.util.Scanner;

class Test999 {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();

	public Test999() {
		System.out.println("�����ڻ���");
	}

	public void inputScore(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			int rN = rn.nextInt(100) + 1;
			scores[i] = rN;
			System.out.print(scores[i] + " ");
		}
	}

	public void printTotalAvg(int scores[]) {
		int total = 0;
		double avg = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		avg = total / scores.length;
		System.out.println("\n����: " + total + " ���: " + avg);
	}

	public void printPass(int scores[]) {
		int cnt = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				cnt++;
			}
		}
		System.out.println("�հݻ��� �� " + cnt);
	}

	// ����4) �ε����� �Է¹޾� ���� ���
	// ����4) �ε��� �Է� : 1 ���� : 11��
	public void printInputIdxScores(int scores[]) {
		System.out.println("�ε����Է�");
		int index = sc.nextInt();
		System.out.println(scores[index]);
	}

	// ����5) ������ �Է¹޾� �ε��� ���
	// ����5) ���� �Է� : 11 �ε��� : 1
	public void inputScorePrintIdx(int scores[]) {
		System.out.println("�����Է�");
		int a = sc.nextInt();
		int idx = -1;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == a) {
				idx = i;
			}
		}
		System.out.println(idx);
	}

	// ����6) �й��� �Է¹޾� ���� ���
	// ����6) �й� �Է� : 1003 ���� : 45��
	public void inputHakPrintScore(int hakbuns[], int scores[]) {
		System.out.println("�й��Է�");
		int hak = sc.nextInt();
		int idx = -1;
		for (int i = 0; i < hakbuns.length; i++) {
			if (hak == hakbuns[i]) {
				idx = i;
			}
		}
		System.out.println(scores[idx]);
	}

	// ����7) �й��� �Է¹޾� ���� ���
	// ��, �����й� �Է� �� ����ó��
	// �� 7)
	// �й� �Է� : 1002 ���� : 11��
	// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
	public void inputHakPrintS(int hakbuns[], int scores[]) {
		System.out.println("�й��Է�");
		int hak = sc.nextInt();
		int idx = -1;
		for (int i = 0; i < hakbuns.length; i++) {
			if (hak == hakbuns[i]) {
				idx = i;
			}
		}
		if (idx == -1) {
			System.out.println("���� �й��Դϴ�");
		} else {
			System.out.println(scores[idx]);
		}
	}

	// ����8) 1���л��� �й��� ���� ���
	// ����8) 1004��(98��)
	public void printFirstS(int hakbuns[], int scores[]) {
		int first = scores[0];
		int firstIdx = -1;
		for (int i = 0; i < scores.length; i++) {
			if (first < scores[i]) {
				first = scores[i];
				firstIdx = i;
			}
		}
		System.out.println("1���л� �й� " + hakbuns[firstIdx] + " ���� " + first);
	}

}

public class Ex23_Method_test3_Review {

	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];

		Test999 test = new Test999();

		// ����1) scores�迭�� 1~100�� ������ ���� ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		test.inputScore(scores);

		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		test.printTotalAvg(scores);

		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		test.printPass(scores);

		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		test.printInputIdxScores(scores);

		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		test.inputScorePrintIdx(scores);

		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 45��
		test.inputHakPrintScore(hakbuns, scores);

		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		test.inputHakPrintS(hakbuns, scores);

		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		test.printFirstS(hakbuns, scores);

	}

}

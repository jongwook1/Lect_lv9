package lv6;

import java.util.Random;
import java.util.Scanner;

class hak999 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class Ex03_Review {

	public static void main(String[] args) {
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		hak999 hak = new hak999();
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		for (int i = 0; i < hak.scores.length; i++) {
			int rN = rn.nextInt(100) + 1;
			hak.scores[i] = rN;
		}
		for (int i = 0; i < hak.scores.length; i++)
			System.out.print(hak.scores[i] + " ");
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		int total = 0;
		int avg = 0;
		for (int i = 0; i < hak.scores.length; i++) {
			total += hak.scores[i];

		}
		avg = total / hak.scores.length;
		System.out.println("\n����: " + total + " ���: " + avg);
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		int pass = 0;
		for (int i = 0; i < hak.scores.length; i++) {
			if (hak.scores[i] >= 60) {
				pass++;
			}
		}
		System.out.println(pass + "��");
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		System.out.println("�ε����Է� ");
		int idx = sc.nextInt();
		System.out.println(hak.scores[idx]);
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		System.out.println("�����Է�");
		int inScore = sc.nextInt();
		for (int i = 0; i < hak.scores.length; i++) {
			if (hak.scores[i] == inScore) {
				System.out.println(i);
			}
		}
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 92��
		System.out.println("�й��Է�");
		int hakBun = sc.nextInt();
		int idx2 = -1;
		for (int i = 0; i < hak.hakbuns.length; i++) {
			if (hak.hakbuns[i] == hakBun) {
				idx2 = i;
			}
		}
		System.out.println("����: " + hak.scores[idx2]);
		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		System.out.println("�й��� �Է��ϼ���");
		int hakBun2 = sc.nextInt();
		int idx3 = -1;
		for (int i = 0; i < hak.hakbuns.length; i++) {
			if (hak.hakbuns[i] == hakBun) {
				idx3 = i;
			}
		}
		if (idx3 != -1) {
			System.out.println("����: " + hak.scores[idx3]);
		} else {
			System.out.println("�ش��й��� ���������ʽ��ϴ�");
		}

		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		int max = 0;
		int first = -1;
		for (int i = 0; i < hak.scores.length; i++) {
			if (max < hak.scores[i]) {
				max = hak.scores[i];
				first = i;
			}
		}
		System.out.println(hak.hakbuns[first]+"�� " + max+"��");

	}

}

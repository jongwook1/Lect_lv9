package lv6;

import java.util.Random;
import java.util.Scanner;

class hak {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}


public class Ex03 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		hak h = new hak();	//Ŭ���� �ʱ�ȭ

		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		System.out.println("����: ");
		for (int i = 0; i < h.scores.length; i++) {
			int rN = ran.nextInt(100) + 1;
			h.scores[i] = rN;
			System.out.print(h.scores[i] + " ");
		}

		System.out.println();
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		int total = 0;
		double avg = 0;
		for (int i = 0; i < h.scores.length; i++) {
			total += h.scores[i];
		}
		System.out.println("����: " + total);
		avg = total / h.scores.length;
		System.out.println("���: " + avg);

		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		int cnt = 0;
		for (int i = 0; i < h.scores.length; i++) {
			if (h.scores[i] >= 60) {
				System.out.println("�հ�");
				cnt++;
			}
		}

		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		System.out.println("��ȸ�� ������ �ε��� �Է��ϼ���");
		int inIdx = sc.nextInt();
		System.out.println(h.scores[inIdx]+"��");
		System.out.println();

		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		int idx0=-1;
		System.out.println("�ε����� ��ȸ�� ������ �Է��ϼ���");
		int inS = sc.nextInt();
		for (int i = 0; i < h.scores.length; i++) {
			if (h.scores[i] == inS) {
				idx0=i;
			}
		}
		if(idx0 !=-1) {
			System.out.println("idx: "+ idx0);
		}else {
			System.out.println("���������ʴ¼����Դϴ�");
		}
		System.out.println();

		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 45��
		System.out.println("�й�:");
		for (int i = 0; i < h.hakbuns.length; i++) {
			System.out.print(h.hakbuns[i] + " ");
		}

		System.out.println("�й��� �Է��ϼ���");
		int inN1 = sc.nextInt();
		int idx1 = -1;		//�������� �ʴ°� ������ �ֱ⶧���� -1��
		for (int i = 0; i < h.hakbuns.length; i++) {
			if (inN1 == h.hakbuns[i]) {
				idx1 = i;
			}
		}
		System.out.println(h.scores[idx1] + "��");

		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		System.out.println("�й��� �Է��ϼ���");
		int inN2 = sc.nextInt();

		int idx2 = -1;
		int check = -1;
		for (int i = 0; i < h.hakbuns.length; i++) {
			if (inN2 == h.hakbuns[i]) {
				check = i;
			}
		}
		if (check != -1) {
			System.out.println(h.scores[idx2] + "��");
		} else {
			System.out.println("�ش��й��� �������� �ʽ��ϴ�");
		}
		System.out.println();

		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		int max = 0;
		int first = -1;
		for (int i = 0; i < h.scores.length; i++) {
			if (h.scores[i] > max) {
				max = h.scores[i];
				first = i;
			}
		}
		System.out.println("1�� : " + h.hakbuns[first] + "�� " + max + "��");
	}

}

package lv4;

import java.util.Scanner;

public class LMS {

	public static void main(String[] args) {
		/*
		 * - �л��������� ���α׷� ����� - �й� �� ������ �Է� �޾� ������ ����� �� �ְ�, - ��ϵ� �й��� �Է��ϸ� ������ �Բ� �����
		 * ��µ� - ��ޱ��� : 90�� �̻� A / 80�� �̻� B / 70�� �̻� C / 60�� �̸� F
		 */
		Scanner sc = new Scanner(System.in);
		int[] hackbunarr = new int[5];
		int[] scorearr = new int[5];
		int cnt = 0;
		int idx = -1;
		String grade = "";
		for (int i = 0; i < hackbunarr.length; i++) {
			System.out.println("�й��� �Է��ϼ���");
			int hackbun = sc.nextInt();
			System.out.println("������ �Է��ϼ���");
			int score = sc.nextInt();
			hackbunarr[i] = hackbun;
			idx = hackbunarr[i];
			scorearr[i] = score;
		}
		for (int i = 0; i < scorearr.length; i++) {
			if (scorearr[i] >= 90) {
				grade = "A";
			}
			if (scorearr[i] >= 80) {
				grade = "B";
			}
			if (scorearr[i] >= 70) {
				grade = "C";
			}
			if (scorearr[i] < 60) {
				grade = "D";
			}
		}
		System.out.println("������й����Է��ϼ���");
		int inputhackbun = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			if (inputhackbun == hackbunarr[i]) {
				System.out.println(scorearr[i] + grade);
			}
		}

	}

}

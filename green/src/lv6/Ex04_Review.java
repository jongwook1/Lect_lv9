package lv6;

import java.util.Scanner;

class Lv6Ex {
	String name = "";

	int[] arHakbun = { 1001, 1002, 1003, 1004, 1005 };
	int[] arScore = { 92, 38, 87, 100, 11 };

}

public class Ex04_Review {

	public static void main(String[] args) {
		Lv6Ex l = new Lv6Ex();
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("=== " + mega.name + "===");
		 * System.out.println("1.������ ����Ȯ��"); System.out.println("2.1���л� ����Ȯ��");
		 * System.out.println("3.�õ��л� ����Ȯ��"); System.out.println("4.����Ȯ���ϱ�");
		 * System.out.println("5.�����ϱ�");
		 */
		int max = 0;
		int first = -1;

		for (int i = 0; i < l.arScore.length; i++) {
			if (max < l.arScore[i]) {
				max = l.arScore[i];
				first = i;
			}
		}

		int min = 100;
		int minIdx = -1;

		for (int i = 0; i < l.arScore.length; i++) {
			if (min > l.arScore[i]) {
				min = l.arScore[i];
				minIdx = i;
			}
		}

		while (true) {
			System.out.println("\n=== " + l.name + "Green");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");
			System.out.println("�޴�����");
			int sel = sc.nextInt();
			if (sel == 1) {
				for (int i = 0; i < l.arScore.length; i++) {
					System.out.print(l.arScore[i] + " ");
				}
			} else if (sel == 2) {
				System.out.println("1���л��� ����: " + max);
			} else if (sel == 3) {
				System.out.println("�õ��л��� ����: " + min);
			} else if (sel == 4) {
				System.out.println("�й��Է�");
				int h = sc.nextInt();
				int idx = -1;
				for (int i = 0; i < l.arHakbun.length; i++) {
					if (l.arHakbun[i] == h) {
						idx = i;
					}
				}
				System.out.println(l.arScore[idx]);
			} else if (sel == 5) {
				break;
			}

		}

	}

}

package lv4_review;

import java.util.Scanner;

public class Z_04 {

	public static void main(String[] args) {
		//���� 14:00
		//���� 14:45(���½ð���ħ)
		//�ҿ� 00:30
		/*
		 * # ���θ� [��ٱ���]
		 * 1. �α��� �� ���� �޴��� �����ϸ�, ������ ���� ��ǰ����� �����ش�.
		 * 	1) ���
		 *  2) �ٳ���
		 *  3) ����
		 * 2. ��ȣ�� ������ ��ǰ�� ��ٱ��Ͽ� ���� �� �ִ�.
		 * 3. �α��� ȸ���� �ε��� ��ȣ�� �� ���� ù��° ���� �����Ѵ�.
		 * 4. �ش� ȸ���� ������ ��ǰ�� �ε��� ��ȣ�� �� ���� �ι�° ���� �����Ѵ�.
		 * ��)
		 * {
		 * 		{0, 1},				qwerȸ�� 			> �������
		 * 		{1, 2},				javakingȸ�� 		> �ٳ�������
		 * 		{2, 1},				abcdȸ��			> �������
		 * 		{0, 3},				qwerȸ��			> ���ⱸ��
		 * 		...
		 * }
		 */
		Scanner sc = new Scanner(System.in);

		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		int cnt = 0;
		String[] items = { "���", "�ٳ���", "����" };
		int log = -1;
		while (true) {
			System.out.println("[MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��     ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��     ��");
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			if (sel == 1) {
				if (log == -1) {
					System.out.println("�Ƶ��Է����ּ���");
					String id = sc.next();
					System.out.println("����Է����ּ���");
					String pw = sc.next();
					for (int i = 0; i < ids.length; i++) {
						if (ids[i].equals(id) && pws[i].equals(pw)) {
							System.out.println(id + " �� �α��εǼ̽��ϴ�");
							log = i;
						}
					}
				} else {
					System.out.println("�α׾ƿ��������ּ���");
				}
			} else if (sel == 2) {
				if (log != -1) {
					System.out.println("�α׾ƿ��Ǽ˽��ϴ�");
				} else {
					System.out.println("�α����� �������ּ���");
				}
			} else if (sel == 3) {
				if (log != -1) {
					while (true) {
						for (int i = 0; i < items.length; i++) {
							System.out.printf("%d%s\n", i + 1, items[i]);
						}
						System.out.println("0)�ڷΰ���");
						System.out.println("��ȣ�� �������ּ���");
						int pick = sc.nextInt() - 1;
						if (pick == -1) {
							break;
						} else if (pick >= 0 && pick < items.length) {
							jang[cnt][0] = log;
							jang[cnt][1] = pick; // 0//1//2
							cnt++;
						}
					}
				}
			} else if (sel == 4) {
				int myItem[] = new int[items.length];

				for (int i = 0; i < cnt; i++) {
					if (jang[i][0] == log) {
						myItem[jang[i][1]]++;
					}
				}
				for (int i = 0; i < myItem.length; i++) {
					if (myItem[i] > 0) {
						System.out.print(items[i] + " ");
						System.out.println(myItem[i] + " ");
					}
				}
			} else if (sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}
		}

	}

}

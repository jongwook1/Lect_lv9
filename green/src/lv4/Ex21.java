package lv4;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		/*
		 * # ���θ� [������]
		 * 1. ī�װ��� �������� �Է¹޾� �Ʒ��� ���ÿ� ���� �����Ѵ�.
		 * 2. ī�װ��� �� ���� ù��° ���� �����Ѵ�.
		 * 3. �������� �� ���� �ι�° ���� �����Ѵ�.
		 *    ��, �������� �������� �߰��� �� �ֵ��� ������(/)�� �����ڷ� �������ش�.
		 * ��)
		 * {
		 * 		{"����", "���/����/"},
		 * 		{"����", "Ȩ����/�ɸ���/"},
		 * 		{"����", "�ݶ�/"},
		 * 		{"����", "�Ұ��/"}
		 * 		...
		 * } 
		 */

		Scanner sc = new Scanner(System.in);
		String[][] items = new String[100][2];
		for (int i = 0; i < items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		int itemCount = 0;
		while (true) {
			System.out.println("[������ ���]");
			System.out.println("[1]ī�װ� ����");
			System.out.println("[2]�� �� ��  ����");
			System.out.println("[3]��üǰ�� ���");
			System.out.print(": ");
			int sel = sc.nextInt();
			if (sel == 1) { // ���ڿ��񱳷� ī�װ� ����ó���ϱ�
				System.out.println("ī�װ����� �߰����ּ���");
				String cate = sc.next();
				int check = 1;
				for (int i = 0; i < itemCount; i++) {
					if (cate.equals(items[i][0])) { // �ߺ�Ȯ�� (���ڿ� �񱳴� ==�񱳿����� ���X -> equals() �޼ҵ� ���O)
						check = -1;
					}
				}
				if (check == 1) {
					items[itemCount][0] = cate;
					itemCount += 1;
				}
			} else if (sel == 2) {
				System.out.println("ī�װ���ȣ�� �Է����ּ���");
				int catename = sc.nextInt() - 1;
				System.out.println("�����۸��� �߰����ּ���");
				String item = sc.next();

				items[catename][1] += item;
				items[catename][1] += "/";
			} else if (sel == 3) {
				for (int i = 0; i < itemCount; i++) {
					System.out.println(items[i][0] + " " + items[i][1]);
				}

			}
		}

	}

}

package lv5;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * # �ܾ� �˻�
		 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
		 * 2. �ܾ �����ϸ� true
		 *    �ܾ ������ false�� ����Ѵ�.
		 */

		Scanner sc = new Scanner(System.in);
		String text = "Life is too short.";
		System.out.println(text);
//		System.out.print(text.substring(12,  text.length()-1));
		System.out.println();
		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
		String word = sc.next();

		String result[] = text.split(" "); // �ܾ� �и��ϱ�
		for (int i = 0; i < result.length; i++) { // �и� �ߵǾ����� Ȯ��
			System.out.println(result[i]);
		}

		System.out.println();

		int cnt = 0;
		for (int i = 0; i < result.length; i++) {
			if (word.equals(result[i])) {
				cnt = 1;
				break;
			} else if (i == result.length - 1) {	//�������ܾ��� .���� �˻��ϱ�
				if (word.equals(text.substring(12, text.length() - 1))) {
					cnt = 1;
					break;
				}
			} else {
				cnt = 2;
			}
		}
		if (cnt == 1)
			System.out.println("true");
		else if (cnt == 2)
			System.out.println("false");

	}
}

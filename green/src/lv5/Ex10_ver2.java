package lv5;

import java.util.Scanner;

public class Ex10_ver2 {

	public static void main(String[] args) {
		/*
		 * # �ܾ� �˻�
		 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
		 * 2. �ܾ �����ϸ� true
		 *    �ܾ ������ false�� ����Ѵ�.
		 */

		Scanner scan = new Scanner(System.in);

		String text = "Life is, too short!";
		//			   012345678901234567	text.length = 18;
		System.out.println(text);

		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
		String word = scan.next();
		
		
		//text�� �ܾ arr[i]�� ����.
		char[] arr = new char[text.length()];
		for(int i = 0; i < text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
		int size = word.length();

		int check = -1;
		for (int i = 0; i < arr.length - size + 1; i++) {

			int count = 0;

			for (int j = 0; j < size; j++) {

				if (arr[i + j] == word.charAt(j)) {

					count++;
				}
			}

			if (count == size) {
				check = 1;
			}
		}

		if (check == 1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}


		
	




	}

}

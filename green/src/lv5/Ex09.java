package lv5;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		/*
		 * # ���ڿ� �� ���ڰ˻�
		 * ��) adklajsiod
		 * 	     ���ڸ� �ִ�.
		 * ��) 123123
		 *    ���ڸ� �ִ�.
		 * ��) dasd12312asd
		 *    ���ڿ� ���ڰ� �����ִ�.
		 */
		
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�Է� : ");
			String text = sc.next();

			char n[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

			int cnt = 0;
			for (int i = 0; i < n.length; i++) {
				for (int j = 0; j < text.length(); j++) {
					if (n[i] == text.charAt(j)) {
						cnt++;
					}
				}
			}

			if (cnt == 0) {
				System.out.println("���ڸ��ִ�");
			} else if (cnt == text.length()) {
				System.out.println("���ڸ��ִ�");
			} else {
				System.out.println("���ڿ� ���ڰ� �����ִ�");
			}
		}
	}
}

package lv5;

import java.util.Scanner;

//���� 16:00
//���� 16:20
//�ҿ� 00:20
public class Test_lv5_2 {

	public static void main(String[] args) {
		/*
		 * # �ܾ� ��ü�ϱ�(replace)
		 * 1. text���� ���� �ӿ��� �����ϰ� ���� �ܾ �Է¹޾�,
		 * 2. ��ü���ִ� ����� �����Ѵ�.
		 * ��)
		 * 		Life is too short.
		 * 		�����ϰ� ���� �ܾ��Է� : Life
		 * 		�ٲ� �ܾ��Է� : Time
		 * 
		 * 		Time is too short.
		 */

//		. next() �޼���� ������ �������� �����
//		. nextLint() �޼���� �ٹٲ��� �������� ������

		
		Scanner sc = new Scanner(System.in);

		String text = "Life is, too short!";

		System.out.println(text);
//		for(int i=0;i<text.length();i++) {
//			System.out.print(i);
//		}
		System.out.print("\n�˻��� �ܾ �Է��ϼ���");
		String word = sc.nextLine();

		char temp[] = new char[text.length()];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = text.charAt(i);
//			System.out.print(temp[i]);
		}

		int wordSize = word.length();

		int idx = -1;
		boolean check = false;
		for (int i = 0; i < temp.length - wordSize + 1; i++) {
			int cnt = 0;
			for (int j = 0; j < wordSize; j++) {
				if (temp[i + j] == word.charAt(j)) {
					cnt++;
				}
			}
			if (cnt == wordSize) {
				check = true;
				idx = i;
			}
		}

		if (check == true) {
			System.out.println("�ٲܴܾ��̸� �Է��ϼ���");
			String cWord = sc.nextLine();

			String front = text.substring(0, idx);
			String back = text.substring(idx + word.length());
			String answer = front + cWord + back;
			System.out.print(answer);
		}

	}

}

package lv5;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 * # �����ձ� ����
		 * ���þ� : ������
		 * �Է� : �Ź�
		 * ���þ� : �Ź�
		 * �Է� : �̼�
		 * ...
		 */
		Scanner sc = new Scanner(System.in);

		String start = "������";
		System.out.println(start.length());
		while (true) {

			System.out.println("���þ� : " + start);
//		System.out.println(start.charAt(start.length()-1));
//		System.out.println(start.substring(2,3));
//		System.out.println(start.substring(start.length()-1,start.length()));
//		System.out.println(start.substring(0,start.length()-(start.length()-1)));

			String inputName = sc.next();

			if (start.substring(start.length() - 1, start.length())
					.equals(inputName.substring(0, inputName.length() - (inputName.length() - 1)))) {
				System.out.println(
						"���� �Է��� ������ ù����: " + inputName.substring(0, inputName.length() - (inputName.length() - 1)));
				start = inputName;
			}
		}

	}

}

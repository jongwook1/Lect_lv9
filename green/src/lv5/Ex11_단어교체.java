package lv5;

import java.util.Scanner;

public class Ex11_�ܾü {

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
		for (int i = 0; i < text.length(); i++) {
			System.out.print(i);
		}
		System.out.print("\n�˻��� �ܾ �Է��ϼ��� : ");
		String word = sc.nextLine();

		// text���� temp�迭
		char temp[] = new char[text.length()];

//        System.out.println(temp.length);            //temp�迭��ũ�Ⱑ text.length�� ������ Ȯ��

		// temp�� text���� �ֱ�
		for (int i = 0; i < temp.length; i++) {
			temp[i] = text.charAt(i);
//            System.out.println(temp[i]);            //���� �ߵ��� Ȯ��
		}

		// �˻��� �ܾ��� word�� ���̸� size������ ����
		int size = word.length();

		int idx = -1;
		boolean check = false;
		for (int i = 0; i < temp.length - size + 1; i++) { // temp.length-size+1�� ���� size�� ���� ������ i�� size�� �Ȼ���ŭ �� ���Ƽ�
															// �ƿ��ٿ���� //+1�� ���������� text�� ���� �����Ͽ� �˻������� +1�� ���ϸ� ã������
			int cnt = 0;
			for (int j = 0; j < size; j++) {
				if (temp[i + j] == word.charAt(j)) {
					cnt++;
				}
			}
			if (cnt == word.length()) {
				check = true;
				idx = i;				//ife�˻��� idx=1 fe �˻��� idx=2 
			}
		}
		if (check == true) {
			System.out.println("�ٲܴܾ �Է��ϼ���");
			String cWord = sc.nextLine();

			String front = text.substring(0, idx);
			String back = text.substring(idx + word.length());

			String answer = front + cWord + back;
			System.out.print(answer);
		}
	}
}

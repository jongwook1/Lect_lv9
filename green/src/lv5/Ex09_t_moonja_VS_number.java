package lv5;

import java.util.Scanner;

public class Ex09_t_moonja_VS_number {

	public static void main(String[] args) {
		/*
		 * # ���ڿ� �� ���ڰ˻�
		 * ��) adklajsiod
		 * 	    ���ڸ� �ִ�.
		 * ��) 123123
		 *    ���ڸ� �ִ�.
		 * ��) dasd12312asd
		 *    ���ڿ� ���ڰ� �����ִ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String text = sc.next();
		int check = 0;
		for (int i = 0; i < text.length(); i++) {
			int x =  text.charAt(i);			//�������� ascii�� �ٲ���?
			if (x >= (int) '0' && x <= (int) '9') {		//������0��48...������1��49...........������9��57  ????
				check++;
			}
		}
		// print
		if (check == text.length()) {
			System.out.println("���ڸ� �ִ�.");
		} else if (check == 0) {
			System.out.println("���ڸ� �ִ�.");
		} else {
			System.out.println("�� �� �ִ�.");
		}

	}

}

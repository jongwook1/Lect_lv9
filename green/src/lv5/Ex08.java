package lv5;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/*
		 * # ���ڿ� ��
		 * . equals() �޼��� ������ ������ ��ġ���� ��
		 * ��)
		 * �ڳ���
		 * �Է� = Ƽ�����罺
		 * ��� = false
		 */
		
		Scanner sc = new Scanner(System.in);
		String name = "�ڳ���";
		System.out.print("���� �̸��� �Է��ϼ��� : "); // ex) Ƽ�����罺
		String myName = sc.next();

		int check = -1;
		if (name.length() == myName.length()) { // ���� ���̰� ������ ��ġ�ϴ¹�����Ȯ������
			check = 1;
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) != myName.charAt(i)) { // ���ڿ��� �ε��� �ϳ�����
					check = -1;
				}

			}
		}
		if (check == 1) {
			System.out.println("true");
		} else if (check == -1) {
			System.out.println("false");
		}

	}

}

package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex25_MY {

	public static void main(String[] args) {

		/*
		 * # Up & Down ����[2�ܰ�] 
		 * 1. com �� �������� 1~100���̸� �����Ѵ�. 
		 * 2. me �� 1~100���̸� �Է��Ѵ�. 
		 * 3. com �� me �� ���ؼ� com ũ�� "ũ��" , com �������� "�۴�" ��Ʈ���� 4. ������ ���߸� ������ ����ȴ�.
		 */
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int com = ran.nextInt(100) + 1;

		
		boolean run = true;

		// if(me >1 && me <= 100) {	//�̷��� �ϸ� Ʋ��
		while (run) {
			System.out.println("������ �Է��ϼ���");
			int me = sc.nextInt();
			if (me >= 1 && me <= 100) {
				if (me == com) {
					System.out.println("�����Դϴ�.");
					run = false;

				} else if (me < com) {
					System.out.println("com�� ŭ");

				} else if (me > com) {
					System.out.println("com�� �۴�");
				}
			} else {
				System.out.println("1~100���� ���ڸ� �Է��ϼ���");
			}
		}
		// }else {	//�̷����ϸ� Ʋ��
		// System.out.println("1~100���� ���ڸ� �Է��ϼ���");
		// }

	}

}

package lv2;

import java.util.Random;
import java.util.Scanner;

public class Test1_lv2 {

	public static void main(String[] args) {
		// ���� 09:35
		// ���� 09:43
		// �ҿ� 00��

		/*
		 * # Up & Down ����[2�ܰ�] 1. com �� �������� 1~100���̸� �����Ѵ�. 2. me �� 1~100���̸� �Է��Ѵ�. 3.
		 * com �� me �� ���ؼ� com ũ�� "ũ��" , com �������� "�۴�" ��Ʈ���� 4. ������ ���߸� ������ ����ȴ�.
		 */

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int com = ran.nextInt(100) + 1;
		System.out.println("com�� �� : "+com);

		boolean run = true;
		while (run) {
			System.out.println("�����Է����ּ���");
			int me = sc.nextInt();
			if (me >= 1 && me <= 100) {
				if (com == me) {
					System.out.println("����");
					run = false;
				} else if (com > me) {
					System.out.println("com�� ũ��");
				} else if (com < me) {
					System.out.println("com�� �۴�");
				}
			} else {
				System.out.println("1~100���� ���ڸ� �Է����ּ���");
			}
		}

	}

}

package lv1_review;

import java.util.Scanner;

public class Ex09_l1 {

	public static void main(String[] args) {
		/*
		 * # �α���[2�ܰ�]
		 * 1. Id�� Pw�� �Է¹޾� ȸ�������� �����Ѵ�.
		 * 2. ���� �α����� ���� �ٽ� Id�� Pw�� �Է¹޴´�.
		 * 3. ���� �� ����� �����Ϳ� �α��� �� �Է¹��� �����͸� ���Ѵ�.
		 * ��) �α��� ���� or �α��� ����
		 */

		int dbId = 0;
		int dbPw = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("�ѤѤ�ȸ�����ԤѤѤѤ�");
		System.out.println("������ �Ƶ��Է����ּ���");
		dbId = sc.nextInt();
		System.out.println("������ ����Է����ּ���");
		dbPw = sc.nextInt();

		System.out.println("�α���");
		System.out.println("�Ƶ��Է����ּ���");
		int myId = sc.nextInt();
		System.out.println("�Ƶ��Է����ּ���");
		int myPw = sc.nextInt();

		if (dbId == myId && dbPw == myPw) {
			System.out.println("�α��μ���");
		}
		if (dbId != myId || dbPw != myPw) {
			System.out.println("�α��ν���");
		}

	}

}

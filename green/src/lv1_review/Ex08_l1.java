package lv1_review;

import java.util.Scanner;

public class Ex08_l1 {

	public static void main(String[] args) {
		/*
		 * # �α���[1�ܰ�]
		 * 1. Id�� Pw�� �Է¹޴´�.
		 * 2. �Է¹��� �����Ϳ� db�����͸� ���� �α��� ó���� �����Ѵ�.
		 * ��) �α��� ���� or �α��� ����
		 */

		int dbId = 1234;
		int dbPw = 1111;

		
		Scanner sc = new Scanner(System.in);

		System.out.println("�Ƶ��Է����ּ���");
		int id=sc.nextInt();
		System.out.println("����Է����ּ���");
		int pw=sc.nextInt();
		
		if(dbId==id&&dbPw==pw) {
			System.out.println("�α��μ���!");
		}if(dbId!=id||dbPw!=pw) {
			System.out.println("�α��ν���!");
		}

	}

}

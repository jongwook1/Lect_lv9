package lv1_review;

import java.util.Scanner;

public class Ex10_l1 {

	public static void main(String[] args) {
		/*
		 * # �α���[3�ܰ�]
		 * 1. Id�� �Է¹޾� dbId�� ��ġ�� ��쿡�� Pw�� �Է��� �� �ִ�.
		 * 2. Id�� Ʋ�� ���, "Id�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
		 * 3. Pw�� Ʋ�� ���, "Pw�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
		 * 4. Id�� Pw�� ��� ��ġ�ϴ� ���, "�α��� ����"��� �޼����� ����Ѵ�.
		 */

		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�ѤѤѤѤѷα��ΤѤѤѤѤѤ�");
		System.out.println("�Ƶ��Է����ּ���");
		int myId=sc.nextInt();
		
		if(dbId==myId) {
			System.out.println("������Է����ּ���");
			int myPw=sc.nextInt();
			if(dbPw==myPw) {
				System.out.println("�α��μ���");
			}else {
				System.out.println("�����Ȯ�����ּ���");
			}
		}else {
			System.out.println("�Ƶ� Ȯ�����ּ���");
		}
		
	}

}

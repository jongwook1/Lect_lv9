package lv1_review;

import java.util.Scanner;

public class Ex07_l1 {

	public static void main(String[] args) {
		/*
		 * # ����(0)����(1)��(2) ����[1�ܰ�]
		 * 1. com�� ����(1)�� �� �� �ִ�.
		 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�.
		 * 3. com�� me�� ����,
		 * 		1) ����.
		 * 		2) ���� �̰��.
		 * 		3) ���� ����.			�� ����Ѵ�.
		 */
		Scanner sc=new Scanner(System.in);
				
		int com = 1;
		System.out.println("0~2������ ���ڸ� �Է��ϼ���");
		int me=sc.nextInt();
		
		if(me==com) {
			System.out.println("����");
		}
		if(me>com) {
			System.out.println("�����̰��");
		}
		if(me<com) {
			System.out.println("��������");
		}
		

	}

}

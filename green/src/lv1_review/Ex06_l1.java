package lv1_review;

import java.util.Scanner;

public class Ex06_l1 {

	public static void main(String[] args) {
		/*
		 * # Up & Down ����[1�ܰ�]
		 * 1. com�� 8�̴�.
		 * 2. me�� ���ڸ� �ϳ��Է¹޴´�.
		 * 3. com �� me �� ���ؼ� ������ ���� �޼����� ����Ѵ�.
		 * 1) me < com	: Up!
		 * 2) me == com : Bingo!
		 * 3) me > com  : Down!
		 */
		
		Scanner sc=new Scanner(System.in);
		
		int com = 8;
		
		System.out.println("�����Է� !");
		int me=sc.nextInt();
		
		if(me<com) {
			System.out.println("Up");
		}
		if(me==com) {
			System.out.println("Bingo");
		}
		if(me>com) {
			System.out.println("Down");
		}
		
	}

}

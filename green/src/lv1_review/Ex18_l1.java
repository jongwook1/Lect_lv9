package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class Ex18_l1 {

	public static void main(String[] args) {
		/*
		 * # ����(0)����(1)��(2) ����[2�ܰ�] 
		 * 1. com�� 0~2 ������ ������ ���ڸ� �����Ѵ�.
		 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�. 
		 * 3. com�� me�� ����, 1) ����. 2) ���� �̰��. 3) ���� ����. �� ����Ѵ�.
		 */
		
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		
		int com=rn.nextInt(3);
		System.out.println("������"+com);
		System.out.println("����(0~2)�� �Է��ϼ���");
		int me = sc.nextInt();
		
		if(com==me) {
			System.out.println("����");
		}
		if(com == 0 && me == 1) {
			System.out.println("�̰��.");
		}
		if(com == 1 && me == 2) {
			System.out.println("�̰��.");
		}
		if(com == 2 && me == 0) {
			System.out.println("�̰��.");
		}
		
		if(com == 0 && me == 2) {
			System.out.println("����.");
		}
		if(com == 1 && me == 0) {
			System.out.println("����.");
		}
		if(com == 2 && me == 1) {
			System.out.println("����.");
		}
	}

}

package lv2_review;

import java.util.Random;
import java.util.Scanner;

public class L2_test1 {

	public static void main(String[] args) {

		/*
		 * # Up & Down ����[2�ܰ�]
		 * 1. com �� �������� 1~100���̸� �����Ѵ�.
		 * 2. me �� 1~100���̸� �Է��Ѵ�. 	 
		 * 3. com �� me �� ���ؼ� com ũ�� "ũ��" , com �������� "�۴�" ��Ʈ���� 
		 * 4. ������ ���߸� ������ ����ȴ�.
		 */
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		int com=rn.nextInt(100)+1;
		
		while(true) {
			System.out.println("1~100���� �����Է����ּ���");
			int me=sc.nextInt();
			if(me==com) {
				System.out.println("����!");
				System.out.println("com"+com);
				break;
			}else if(me>com) {
				System.out.println("����ŭ");
			}else if(me<com) {
				System.out.println("��������");
			}
			
		}
		

	}

}

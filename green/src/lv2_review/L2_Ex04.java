package lv2_review;

import java.util.Random;
import java.util.Scanner;

public class L2_Ex04 {

	public static void main(String[] args) {
		/*
		 * # Up & Down ����[2�ܰ�]
		 * 1. com �� �������� 1~100���̸� �����Ѵ�.
		 * 2. me �� 1~100���̸� �Է��Ѵ�. 	 
		 * 3. com �� me �� ���ؼ� com ũ�� "ũ��" , com �������� "�۴�" ��Ʈ���� 
		 * 4. ������ ���߸� ������ ����ȴ�.
		 */

		Random rn=new Random();
		Scanner sc=new Scanner(System.in);
	
		int com=rn.nextInt(100)+1;
		System.out.println(com);	
		boolean run=true;
		while(run) {
			System.out.println("1~100���� �����Է����ּ���");			
			int me=sc.nextInt();
			
		if(com==me) {
			System.out.println("�����Դϴ�");
			System.out.println("com:"+com);
			run=false;
		}
		else if(com>me) {
			System.out.println("�����۴�");
		}
		else if(com<me) {
			System.out.println("����ũ��");
		}	
		
		}
		
		
		
	}

}

package lv2_review;

import java.util.Random;
import java.util.Scanner;

public class L2_Ex02 {

	public static void main(String[] args) {
		
		/*
		 * # ������ ����[3�ܰ�]
		 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
		 * 2. ������ ���߸� 20���̴�.
		 * 3. ���� ���� ��, ������ ����Ѵ�.
		 */
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		int score=0;
		int i=0;
		while(i<5) {
			int a=rn.nextInt(10)+1;
			int b=rn.nextInt(10)+1;
			
			int c=a*b;
			
			System.out.println(a+" X "+b+"= "+"?");
			
			System.out.println("�����Է����ּ���");
			int inputN=sc.nextInt();
			
			if(inputN==c) {
				System.out.println("�����Դϴ� 20��ȹ��");
				score+=20;
			}else {
				System.out.println("�� ������ȹ��");
			}
			
			
			i++;
		}
		System.out.println("������:  "+score);
		

	}

}

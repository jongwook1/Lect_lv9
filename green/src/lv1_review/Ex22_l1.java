package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class Ex22_l1 {

	public static void main(String[] args) {
		/*
		 * # ��� ���� ���߱� ����
		 * 1. 150~250 ������ ���� ���� ����
		 * 2. ���� ������ ��� ���ڸ� ���ߴ� �����̴�.
		 * ��)
		 * 		249		: 4
		 */

		Random rn=new Random();
		Scanner sc=new Scanner(System.in);
		int rN=rn.nextInt(101)+150;
		System.out.println(rN);
		
		int a=rN/10%10;
		
		System.out.println("����ڸ��� �Է��ϼ���");
		int inputN=sc.nextInt();
		
		if(inputN==a) {
			System.out.println("����");
		}else {
			System.out.println("��");
		}
		
//		System.out.println(351/10%10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

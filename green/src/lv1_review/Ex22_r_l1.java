package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class Ex22_r_l1 {

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
		
		int a=rN/10%10;		//����ڸ�
		
		System.out.println("������ڸ� ���纸����");
		int inputN=sc.nextInt();
		
		if(a==inputN) {
			System.out.println("����");
		}else {
			System.out.println("��");
		}

	}

}

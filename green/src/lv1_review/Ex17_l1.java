package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class Ex17_l1 {

	public static void main(String[] args) {
		/*
		 * # Ȧ¦ ����
		 * 1. 1~100������ ���� ���ڸ� �����Ѵ�.
		 * 2. ����� ���� ���ڸ� �����ְ�,
		 * 3. �ش� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
		 */

	Scanner sc = new Scanner(System.in);
	Random rn=new Random();	
	
		System.out.println("1.Ȧ��");
		System.out.println("2.¦��");

		System.out.print("��ȣ�� �����ϼ��� : ");
		int choice = sc.nextInt();
		
		int rN=rn.nextInt(100)+1;
			System.out.println(rN);
	
		if(choice==1) {
			if(rN%2==1) {
				System.out.println("����");
			}else {
				System.out.println("��");
			}
		}
		if(choice==2) {
			if(rN%2==0) {
				System.out.println("����");
			}
			else {
				System.out.println("��");
			}
		}
		
		
	}

}

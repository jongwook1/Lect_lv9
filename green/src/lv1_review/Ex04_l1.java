package lv1_review;

import java.util.Scanner;

public class Ex04_l1 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		// ���� 1) ���� 2���� �Է¹޾�, �� ���
		System.out.println("�����Է�");
		int n1=sc.nextInt();
		System.out.println("�����Է�");
		int n2=sc.nextInt();
		int sum=n1+n2;
		System.out.println("����: "+sum);		
		
		
		// ���� 2) ���� 1���� �Է¹޾�, Ȧ���̸� true ���
		System.out.println("�����Ѱ��Է�");
		int n3=sc.nextInt();
		
		System.out.println(n3%2!=0);
		
		// ���� 3) ������ �Է¹޾�, 60�� �̻��̰� 100�� �����̸� true ���
		System.out.println("�����Է�");
		int a=sc.nextInt();
	
		
		System.out.println(a>=60||a<=100);
	}

}

package lv1_review;

import java.util.Scanner;

public class Ex14_l1 {

	public static void main(String[] args) {
		/*
		 * # �ִ밪 ���ϱ�[1�ܰ�]
		 * 1. ���� 3���� �Է¹޴´�.
		 * 2. �Է¹��� 3���� ���� ���Ͽ�,
		 * 3. ���� ū ��(MAX)�� ����Ѵ�.
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڸ��Է����ּ���");
		int n1=sc.nextInt();
		System.out.println("���ڸ��Է����ּ���");
		int n2=sc.nextInt();
		System.out.println("���ڸ��Է����ּ���");
		int n3=sc.nextInt();
		
		int max=n1;
		if(n1<n2) {
			max=n2;
		}if(n2<n3) {
			max=n3;
		}

		System.out.println("�ִ밪��: " +max);
	}

}

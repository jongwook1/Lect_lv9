package lv1_review;

import java.util.Scanner;

public class Ex15_l1 {

	public static void main(String[] args) {
		/*
		 * # ������ ����[1�ܰ�]
		 * 1. ������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�.
		 * 2. �Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�.
		 * ��)	3 x 7 = ?
		 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
		 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
		 */

		Scanner sc=new Scanner(System.in);
		
		System.out.println("����1�Է��ϼ���");
		int n1=sc.nextInt();
		System.out.println("����2�Է��ϼ���");
		int n2=sc.nextInt();
		
		int answer=n1*n2;
		
		System.out.println("���� �Է�");
		int mAnswer=sc.nextInt();
		
		if(answer==mAnswer) {
			System.out.println("����");
		}else if(answer!=mAnswer) {
			System.out.println("��");
		}
	}

}

package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class Ex25_l1 {

	public static void main(String[] args) {
		/*
		 * # ������ ��ȣ ���߱� ����
		 * 1. 1~10 ������ ���� ���� 2���� �����Ѵ�.
		 * 2. 1~4 ������ ���� ���� 1���� �����Ѵ�.
		 * 3. �� ���ڴ� ������ ��ȣ�� �ش�ȴ�.
		 * 	  1) ����	  2)  �E��     3) ����	 4) ������
		 * 4. ����ڴ� ������ ��ȣ�� ���ߴ� �����̴�.
		 * ��) 3 ? 4  = 7
		 *    1) + 2) - 3) * 4) %
		 *    ���� : 2��
		 */
	Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		int a=rn.nextInt(10)+1;
		int b=rn.nextInt(10)+1;
	
		
		int answer=rn.nextInt(4)+1;
		System.out.println(answer);
		int x=0;
		if(answer==1) {
			x=a+b;
		}
		else if(answer==2) {
			x=a-b;
		}
		else if(answer==3) {
			x=a*b;
		}
		else if(answer==4) {
			x=a/b;
		}
		
		System.out.println(a+ " ? "+b+ " = "+x);
	System.out.println("1) + 2) - 3) * 4) %");
	System.out.println("�����ȣ�� �Է��ϼ���");
		int sel=sc.nextInt();
		
		if(answer==sel) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		

	}

}

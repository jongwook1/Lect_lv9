package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class Ex16_l1 {

	public static void main(String[] args) {
		/*
		 * # ���� ����
		 * 1. 0 �Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
		 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
		 * 3. ������ �յ޸��� ���ߴ� �����̴�.
		 */

		Random rn = new Random();
		Scanner sc=new Scanner(System.in);
		int coin = rn.nextInt(2);
		System.out.println("�������(0�Ǵ�1)�� �Է��ϼ���");
		int me=sc.nextInt();
//		if(coin==0) {
//			System.out.println("��");
//		}else if(coin==1) {
//			System.out.println("��");
//		}
//		
		if(coin==me) {
			System.out.println("����");
		}else if(coin!=me) {
			System.out.println("��");
		}
		
	}

}

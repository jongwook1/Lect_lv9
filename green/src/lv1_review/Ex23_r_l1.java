package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class Ex23_r_l1 {

	public static void main(String[] args) {
		/*
		 * # 369����[1�ܰ�]
		 * 1. 1~50 ������ ���� ���ڸ� �����Ѵ�.
		 * 2. �� ���� 369�� ������
		 * 	1) 2���̸�, ¦¦�� ���
		 *  2) 1���̸�, ¦�� ���
		 *  3) 0���̸�, �ش� ���ڸ� ���
		 * ��)
		 * 		33	 : ¦¦
		 * 		16	 : ¦
		 * 		 7	 : 7
		 */
		
		Random rn=new Random();
		int rN=rn.nextInt(50)+1;
		System.out.println(rN);
		
		int cnt=0;
		int a=rN/10;
		int b=rN%10;
		
		
		if(a==3||a==6||a==9) {
			cnt++;
		}
		if(b==3||b==6||b==9) {
			cnt++;
		}
				
		if(cnt==1) {
			System.out.println("¦");
		}else if(cnt==2) {
			System.out.println("¦¦");
		}else {
			System.out.println(rN);
		}
		

	}

}

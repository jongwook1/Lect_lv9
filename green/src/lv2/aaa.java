package lv2;

import java.util.Random;
import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {
		/*
		 * # �����л�
		 * 1. 10ȸ �ݺ��� �Ѵ�.
		 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
		 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
		 * ---------------------------------------
		 * . ������(10��)�� ������ ����� ����Ѵ�.
		 * . �հ��� ���� ����Ѵ�.
		 * . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
		 */
		
		int a = 0;
		int cnt = 0;
		int sum = 0;
		int max =0;
		int check=0;
		Random ran = new Random();
		
		while(a<10) {
			int rN = ran.nextInt(100)+1;
			System.out.println(rN);
			if(rN>=60) {				
				cnt++;				
			}sum +=rN;						
			a++;
			
			if(max<rN) {
				max = rN;
				check = a;
			}
			
			
		}
		
		
		
		
		System.out.println("����"+sum);	
		System.out.println("���"+sum/10);	
		System.out.println("�հ��ڼ�"+cnt);	
		System.out.println("1���ȣ"+check+"����"+max);	
	}

}

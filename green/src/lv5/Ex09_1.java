package lv5;

import java.util.Scanner;

public class Ex09_1 {

	public static void main(String[] args) {
		/*
		 * # ���ڿ� �� ���ڰ˻�
		 * ��) adklajsiod
		 * 	     ���ڸ� �ִ�.
		 * ��) 123123
		 *    ���ڸ� �ִ�.
		 * ��) dasd12312asd
		 *    ���ڿ� ���ڰ� �����ִ�.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String text = sc.next();
		
		int num=0;
		
		for(int i=0;i<text.length();i++) {
			 num=text.charAt(i);
			 System.out.println();
		}
		int cnt=0;
		int mix=0;
		if((num>=65&&num<=90)||(num>=97&&num<=122)) {			
			if(num>=48&&num<=57) {
//				System.out.println("���ڿ� ���ڰ� �����ִ�");				
				mix+=1;
			}else {
				System.out.println("���ڸ��ִ�");
//				cnt=1;
			}
		}else if(num>=48&&num<=57) {
			System.out.println("���ڸ��ִ�");
//			cnt=2;
		}		
	}
}

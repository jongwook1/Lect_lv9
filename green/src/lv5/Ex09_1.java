package lv5;

import java.util.Scanner;

public class Ex09_1 {

	public static void main(String[] args) {
		/*
		 * # 문자열 속 숫자검사
		 * 예) adklajsiod
		 * 	     문자만 있다.
		 * 예) 123123
		 *    숫자만 있다.
		 * 예) dasd12312asd
		 *    문자와 숫자가 섞여있다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
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
//				System.out.println("문자와 숫자가 섞여있다");				
				mix+=1;
			}else {
				System.out.println("문자만있다");
//				cnt=1;
			}
		}else if(num>=48&&num<=57) {
			System.out.println("숫자만있다");
//			cnt=2;
		}		
	}
}

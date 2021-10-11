package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class Ex23_r_l1 {

	public static void main(String[] args) {
		/*
		 * # 369게임[1단계]
		 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
		 * 2. 위 수에 369의 개수가
		 * 	1) 2개이면, 짝짝을 출력
		 *  2) 1개이면, 짝을 출력
		 *  3) 0개이면, 해당 숫자를 출력
		 * 예)
		 * 		33	 : 짝짝
		 * 		16	 : 짝
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
			System.out.println("짝");
		}else if(cnt==2) {
			System.out.println("짝짝");
		}else {
			System.out.println(rN);
		}
		

	}

}

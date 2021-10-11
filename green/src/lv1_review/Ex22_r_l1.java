package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class Ex22_r_l1 {

	public static void main(String[] args) {
		/*
		 * # 가운데 숫자 맞추기 게임
		 * 1. 150~250 사이의 랜덤 숫자 저장
		 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
		 * 예)
		 * 		249		: 4
		 */
		
		Random rn=new Random();
		Scanner sc=new Scanner(System.in);
		
		int rN=rn.nextInt(101)+150;
		System.out.println(rN);
		
		int a=rN/10%10;		//가운데자리
		
		System.out.println("가운데숫자를 맞춰보세요");
		int inputN=sc.nextInt();
		
		if(a==inputN) {
			System.out.println("정답");
		}else {
			System.out.println("땡");
		}

	}

}

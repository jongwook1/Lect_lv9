package lv1_review;

import java.util.Scanner;

public class Ex07_l1 {

	public static void main(String[] args) {
		/*
		 * # 가위(0)바위(1)보(2) 게임[1단계]
		 * 1. com은 바위(1)만 낼 수 있다.
		 * 2. me는 0~2 사이의 숫자를 입력받는다.
		 * 3. com과 me를 비교해,
		 * 		1) 비겼다.
		 * 		2) 내가 이겼다.
		 * 		3) 내가 졌다.			를 출력한다.
		 */
		Scanner sc=new Scanner(System.in);
				
		int com = 1;
		System.out.println("0~2사이의 숫자를 입력하세요");
		int me=sc.nextInt();
		
		if(me==com) {
			System.out.println("비겼다");
		}
		if(me>com) {
			System.out.println("내가이겼다");
		}
		if(me<com) {
			System.out.println("내가졌다");
		}
		

	}

}

package lv2_review;

import java.util.Random;
import java.util.Scanner;

public class L2_test1 {

	public static void main(String[] args) {

		/*
		 * # Up & Down 게임[2단계]
		 * 1. com 은 랜덤으로 1~100사이를 저장한다.
		 * 2. me 는 1~100사이를 입력한다. 	 
		 * 3. com 과 me 를 비교해서 com 크면 "크다" , com 이작으면 "작다" 힌트제공 
		 * 4. 정답을 맞추면 게임은 종료된다.
		 */
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		int com=rn.nextInt(100)+1;
		
		while(true) {
			System.out.println("1~100사이 숫자입력해주세요");
			int me=sc.nextInt();
			if(me==com) {
				System.out.println("정답!");
				System.out.println("com"+com);
				break;
			}else if(me>com) {
				System.out.println("내가큼");
			}else if(me<com) {
				System.out.println("내가작음");
			}
			
		}
		

	}

}

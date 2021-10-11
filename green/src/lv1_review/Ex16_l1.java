package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class Ex16_l1 {

	public static void main(String[] args) {
		/*
		 * # 코인 게임
		 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
		 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
		 * 3. 동전의 앞뒷면을 맞추는 게임이다.
		 */

		Random rn = new Random();
		Scanner sc=new Scanner(System.in);
		int coin = rn.nextInt(2);
		System.out.println("맞출숫자(0또는1)를 입력하세요");
		int me=sc.nextInt();
//		if(coin==0) {
//			System.out.println("앞");
//		}else if(coin==1) {
//			System.out.println("뒤");
//		}
//		
		if(coin==me) {
			System.out.println("정답");
		}else if(coin!=me) {
			System.out.println("땡");
		}
		
	}

}

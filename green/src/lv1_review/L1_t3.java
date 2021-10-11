package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class L1_t3 {

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
		System.out.println("0(앞)또는1(뒤)을 입력하세요");
		int me =sc.nextInt();
		
		if(coin == me) {
			System.out.println("정답!");
		}
		if(coin != me) {
			System.out.println("땡!");
		}
		
		
	}

}

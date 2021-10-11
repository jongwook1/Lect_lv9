package lv1;

import java.util.Random;

public class Test2_lv1 {

	public static void main(String[] args) {
				// 직접구현 1. 홀짝게임
				// 시작 09:50
				// 종료 09:55
				// 소요 10분
		
		/*
		 * # 홀짝 게임
		 * 1. 1~100사이의 랜덤 숫자를 저장한다.
		 * 2. 저장된 랜덤 숫자를 보여주고,
		 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
		 */
		
		Random ran = new Random();
		int Rn = ran.nextInt(100)+1;
		System.out.println(Rn);
		
		if(Rn % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}		

	}

}

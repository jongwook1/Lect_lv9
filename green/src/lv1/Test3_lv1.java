package lv1;

import java.util.Random;

public class Test3_lv1 {

	public static void main(String[] args) {
		// 직접구현 1. 코인 게임
				// 시작 10:05
				// 종료 10:08
				// 소요 3분 00
		
		/*
		 * # 코인 게임
		 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
		 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
		 * 3. 동전의 앞뒷면을 맞추는 게임이다.
		 */
		
		Random ran =  new Random();
		
		int Rn = ran.nextInt(2);
		
		if(Rn == 0) {
			System.out.println("뒷면이다");
		}else {
			System.out.println("앞면이다");
		}		
		
	}

}

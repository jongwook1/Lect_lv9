package lv4;

import java.util.Random;

public class Ex05 {
//ex20 22
	public static void main(String[] args) {
		/* 
		 * # 1 to 50을 ==> 1 to 18
		 * 1. 구글에서 1 to 50 이라고 검색한다.
		 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
		 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
		 * 4. 숫자 1~9는 front 배열에 저장하고,
		 *    숫자 10~18은 back 배열에 저장한다.
		 */
		
		final int SIZE = 9;					//상수(고정값) ---재 초기화 불가	(전체대문자로 표기)
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		int gamenum=1;
	
		
		Random ran=new Random();
		
		
	//		int rn = ran.nextInt(9) + 1; // 1~9
	//		int rn=ran.nextInt(9)+10; //10~18
			
		
			
			
			
//		for (int i = 0; i < 1000; i++) {
//			
//			int temp = front[0];
//			front[0] = arr[i];			
//			arr[i] = temp;
//			
//			int temp1 = back[0];
//			back[0] = back[rIdx2];			
//			back[rIdx2] = temp1;
								
//		}
//		for(int i=0;i<9;i++) {
//			System.out.print(front[i]);
//		}

		

	}

}

package lv4;

import java.util.Random;

public class Ex23_my_lotto {

	public static void main(String[] args) {
		/*
		 * # 당첨복권 1셋트
		 * 1. 3이 연속으로 3번 등장하면 당첨복권이다.			//랜덤값0 1) 2개부여 ->1이 나올때 3으로 대체
		 * 2. 랜덤으로 5개의 복권을 생성하되,
		 *    당첨복권은 한 개만 생성되도록 설정한다.
		 */
		Random ran=new Random();
		
		int[][] lottoSet = new int[5][7];
		
		
		boolean win=false;
		for (int i = 0; i < lottoSet.length; i++) {
			int cnt = 0;
			for (int j = 0; j < lottoSet[i].length; j++) {
				int r = ran.nextInt(2);
				if (r == 1) {
					lottoSet[i][j] = 3;
					cnt++;
				} else {
					lottoSet[i][j] = 0;
					cnt = 0; // cnt--; 가 아니라 아예0으로 처음부터
				}

				if (cnt == 3) {
					if (win == false) {
						win = true;
					} else {
						i--; // cnt로 착각하지않기
						break;
					}
				}
			}
			if (win == false && i == lottoSet.length - 1) { // lottoSet.length은5// i==lottoSet.length-1은 for문 다돌았다는것
				i--;
			}
			;
		}
		for(int i=0;i<lottoSet.length;i++) {
			for(int j=0;j<lottoSet[i].length;j++) {
				System.out.print(lottoSet[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}

package lv4_review;

import java.util.Random;

public class Z_05 {

	public static void main(String[] args) {
		//시작 14:50
		//종료 15:14
		//소요 00:24
		/*
		 * # 당첨복권 1셋트
		 * 1. 3이 연속으로 3번 등장하면 당첨복권이다.
		 * 2. 랜덤으로 5개의 복권을 생성하되,
		 *    당첨복권은 한 개만 생성되도록 설정한다.
		 */
		
		Random ran = new Random();

		int[][] lottoSet = new int[5][7];
		boolean win = false;

		for (int i = 0; i < lottoSet.length; i++) {
			int cnt = 0;
			for (int j = 0; j < lottoSet[i].length; j++) {
				int rN = ran.nextInt(2);
				if (rN == 1) {
					lottoSet[i][j] = 3;
					cnt++;
				} else {
					lottoSet[i][j] = rN;
					cnt = 0;
				}
				if (cnt == 3) {
					if (win == false) {
						win = true;
					} else {
						i--;
						break;
					}
				}
			}
			if (win == false && i == lottoSet.length - 1) {
				i--;
			}

		}
		for (int i = 0; i < lottoSet.length; i++) {
			for (int j = 0; j < lottoSet[i].length; j++) {
				System.out.print(lottoSet[i][j]);
			}
			System.out.println();
		}

	}

}

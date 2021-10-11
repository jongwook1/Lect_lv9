package lv4_review;

import java.util.Random;

public class Z_05 {

	public static void main(String[] args) {
		//���� 14:50
		//���� 15:14
		//�ҿ� 00:24
		/*
		 * # ��÷���� 1��Ʈ
		 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.
		 * 2. �������� 5���� ������ �����ϵ�,
		 *    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
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

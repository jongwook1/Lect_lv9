package lv4;

import java.util.Random;

public class Ex23_my_lotto {

	public static void main(String[] args) {
		/*
		 * # ��÷���� 1��Ʈ
		 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.			//������0 1) 2���ο� ->1�� ���ö� 3���� ��ü
		 * 2. �������� 5���� ������ �����ϵ�,
		 *    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
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
					cnt = 0; // cnt--; �� �ƴ϶� �ƿ�0���� ó������
				}

				if (cnt == 3) {
					if (win == false) {
						win = true;
					} else {
						i--; // cnt�� ���������ʱ�
						break;
					}
				}
			}
			if (win == false && i == lottoSet.length - 1) { // lottoSet.length��5// i==lottoSet.length-1�� for�� �ٵ��Ҵٴ°�
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

package lv2_review;

public class L2_Ex08_r {

	public static void main(String[] args) {
		/*
		 * # 369����[2�ܰ�]
		 * 1. 1~50���� �ݺ��� �Ѵ�.
		 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
		 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
		 */
		
		int i = 1;

		while (i <= 50) {
			int a = i % 10;
			int b = i / 10;
			int cnt = 0;
			if (a != 0 && a % 3 == 0) {
				cnt++;
			}
			if (b != 0 && b % 3 == 0) {
				cnt++;
			}
			if (cnt == 1) {
				System.out.println("¦");
			} else if (cnt == 2) {
				System.out.println("¦¦");
			} else {
				System.out.println(i);
			}
			i++;
		}

	}

}

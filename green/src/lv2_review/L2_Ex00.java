package lv2_review;

public class L2_Ex00 {

	public static void main(String[] args) {
		// ����1) 1~10���� �ݺ��� 5~9 ���
		// ����1) 5, 6, 7, 8, 9

		int i = 1;
		while (i <= 10) {
			if (i > 4 && i < 10) {
				System.out.print(i + " ");
			}
			i++;
		}

		System.out.println();
		// ����2) 10~1���� �ݺ��� 6~3 �Ųٷ� ���
		// ����2) 6, 5, 4, 3

		i = 10;
		while (i > 1) {
			if (i >= 3 && i <= 6) {
				System.out.print(i);
			}
			i--;
		}
		System.out.println();
		// ����3) 1~10���� �ݺ��� ¦���� ���
		// ����3) 2, 4, 6, 8, 10
		i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.print(i);
			}

			i++;
		}

	}

}
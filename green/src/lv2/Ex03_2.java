package lv2;

public class Ex03_2 {

	public static void main(String[] args) {
		// ����3) 8�� ����� 150���� �۰� 150 �� ���� �������� ��� ==> �� : 144
		// max���ᵵ �ǰ� �Ųٷ� ����������

		// boolean run = true;
		// int max = 0;
		int a = 150;

		while (a > 1) {
			if (a % 8 == 0) {
				System.out.println(a);
				a = 0;
			}
			a--;
		}

		int max = 0;
		for (int b = 0; b < 150; b += 8) {
			if (b > max) {
				max = b;
			}
		}
		System.out.println(max);

		for (int c = 150; c > 1; c--) {
			if (c % 8 == 0) {
				System.out.println(c);
				c = -1;
			}
		}

	}

}

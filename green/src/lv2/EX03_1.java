package lv2;

public class EX03_1 {

	public static void main(String[] args) {
		// ����2) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 63
		int a = 0;
		boolean run = true;

		while (run) {
			if (a % 9 == 0 && a / 10 == 6) {
				System.out.println(a);
				run = false;
			}
			a++;
		}

		for (int b = 0; b < 100; b++) {
			if (b % 9 == 0 && b / 10 == 6) {
				System.out.println(b);
				b = 999;
			}
		}

		for (int c = 0; c < 100; c += 9) {
			if (c / 10 == 6) {
				System.out.println(c);
				c = 100;
			}
		}
	}
}

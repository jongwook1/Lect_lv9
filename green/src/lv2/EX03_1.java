package lv2;

public class EX03_1 {

	public static void main(String[] args) {
		// 문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력 ==> 답 : 63
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

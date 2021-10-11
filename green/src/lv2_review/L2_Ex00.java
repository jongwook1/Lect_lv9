package lv2_review;

public class L2_Ex00 {

	public static void main(String[] args) {
		// 문제1) 1~10까지 반복해 5~9 출력
		// 정답1) 5, 6, 7, 8, 9

		int i = 1;
		while (i <= 10) {
			if (i > 4 && i < 10) {
				System.out.print(i + " ");
			}
			i++;
		}

		System.out.println();
		// 문제2) 10~1까지 반복해 6~3 거꾸로 출력
		// 정답2) 6, 5, 4, 3

		i = 10;
		while (i > 1) {
			if (i >= 3 && i <= 6) {
				System.out.print(i);
			}
			i--;
		}
		System.out.println();
		// 문제3) 1~10까지 반복해 짝수만 출력
		// 정답3) 2, 4, 6, 8, 10
		i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.print(i);
			}

			i++;
		}

	}

}

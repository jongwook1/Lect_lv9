package lv1;

public class M6D9_3 {
	public static void main(String[] args) {
		// 문제3)
		// 문2- 1~10까지 반복해 3미만 7이상만 출력들
		// 의 합 출력

		int a = 1;
		int sum = 0;
		// int count = 1;
		while (a <= 10) {
			if (a < 3 || a >= 7) {
				sum += a;
				System.out.println(+a);
			}
			a++;
		}System.out.println("위조건의 합 : "+sum);
	}
}

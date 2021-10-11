package lv1;

public class M6D9_4 {

	public static void main(String[] args) {
		// 문제4)
		// 문2- 1~10까지 반복해 3미만 7이상만 출력
		// 의 개수 출력
		int a = 1;
		int count = 0;

		// int count = 1;
		while (a <= 10) {
			if (a < 3 || a >= 7) {
				count++;
				System.out.println(+a);
			}
			a++;
		}
		System.out.println("개수 : " + count);

	}

}

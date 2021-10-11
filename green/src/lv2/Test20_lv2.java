package lv2;

public class Test20_lv2 {

	public static void main(String[] args) {
		// 시작 21:00
		// 종료 21:05
		// 소요시간 5분

		// # 문제3) 18의 약수의 갯수 더하기 21의 약수의 갯수를 출력

		int a = 1;
		int cnt = 0;
		int cnt2 = 0;
		int sum = 0;

		while (a <= 21) {
			if (18 % a == 0) {
				System.out.println("18의 약수들: " + a);
				cnt++;
			}
			if (21 % a == 0) {
				System.out.println("21의 약수들: " + a);
				cnt2++;
			}
			a++;
		}
		System.out.println("18약수의 갯수" + cnt);
		System.out.println("21약수의 갯수" + cnt2);
		System.out.println("18약수의 갯수 +21약수의 갯수 : " + (cnt + cnt2));
	}

}

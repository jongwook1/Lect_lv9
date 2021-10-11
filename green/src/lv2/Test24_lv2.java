package lv2;

public class Test24_lv2 {

	public static void main(String[] args) {
		// 시작 21:40
		// 종료 21:41
		// 소요 1분
		// # 문제4) 25 , 75 의 최대 공약수를 출력

		int a = 1;
		int max = 0;
		while (a <= 75) {
			if (25 % a == 0 && 75 % a == 0) {
				if (a > max) {
					max = a;
				}
			}
			a++;
		}
		System.out.println("25 , 75 의 최대 공약수" + max);
	}

}

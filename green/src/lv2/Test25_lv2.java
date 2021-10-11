package lv2;

public class Test25_lv2 {

	public static void main(String[] args) {
//		시작 21:53
//		종료 21:54
//		소요 1분
//		# 문제5) 연필 42자루와 지우개 28개를 최대한 많은 학생에가 남김없이 똑같이 나누어 주려고합니다
//		# 몇명까지 나누어 줄수있는지 출력

		int a = 1;
		int p = 42;
		int e = 28;
		int max = 0;

		while (a <= 42) {
			if (p % a == 0 && e % a == 0) {
				if (a > max) {
					max = a;
				}
			}
			a++;
		}
		System.out.println("최대로 나눠줄수있는 게수: " + max);
	}

}

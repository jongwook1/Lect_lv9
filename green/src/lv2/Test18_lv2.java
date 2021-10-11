package lv2;

public class Test18_lv2 {

	public static void main(String[] args) {
		// 시작 20:40
		// 종료 20:45
		// 소요 5분
		// # 문제1) 36의 약수 를 전부 출력
		// # 약수는 36과 나눠서 나머지가 0인수를 말한다.
		// # 1,2,4,6.....

		int a = 1;		

		while (a <= 36) {
			if (36 % a == 0) {
				System.out.println(a);
			}
			a++;
		}

	}

}

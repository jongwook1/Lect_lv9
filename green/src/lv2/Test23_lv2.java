package lv2;

public class Test23_lv2 {

	public static void main(String[] args) {
//	시작 21:33
//  종료 21:36		
//  소요 1분		

//	# 문제2) 6과 8의 공약수를 모두 출력
//	# 공약수란 각수의 공통인약수를 말한다.
//	# 예)  6 ==>  1 , 2, 3, 6
//	#       8 ==> 1, 2, 4, 8
//	# 공약수는  1, 2

		// # 문제3) 위 수의 최대 공약수 출력
		// # 최대공약수란 공약수중에서 가장큰수

		int a = 1;
		int max = 0;
		while (a <= 6) {
			if (6 % a == 0 && 8 % a == 0) {
				System.out.println("6과 8의 공약수: " + a);
				if (a > max) {
					max = a;
				}
			}
			a++;
		}
		System.out.println("6과 8의 최대공약수: " + max);
	}

}

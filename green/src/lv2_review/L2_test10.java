package lv2_review;

public class L2_test10 {

	public static void main(String[] args) {
//	# 문제1) 7의 배수를 차례대로 출력했을대 8번째 배수를 출력
		int i = 1;
		int cnt = 0;
		while (i < 100) {
			if (i % 7 == 0) {
				cnt++;
				if (cnt == 8) {
					System.out.println(i);
					break;
				}

			}
			i++;
		}

//	# 문제2) 6과 8의 공약수를 모두 출력
//	# 공약수란 각수의 공통인약수를 말한다.
//	# 예)  6 ==>  1 , 2, 3, 6
//	#       8 ==> 1, 2, 4, 8
//	# 공약수는  1, 2

//	# 문제3) 위 수의 최대 공약수 출력
//	# 최대공약수란 공약수중에서 가장큰수 
		boolean run = true;
		i = 1;
		int max = 0;
		while (i <= 6) {
			if (6 % i == 0 && 8 % i == 0) {
				System.out.println("6과 8의 공약수" + i);
				if (max < i) {
					max = i;
				}
			}

			i++;
		}
		System.out.println("최대공약수 : " + max);

//	# 문제4) 25 , 75 의 최대 공약수를 출력
		i = 1;
		int max2 = 0;
		while (i <= 75) {
			if (25 % i == 0 && 75 % i == 0) {
				if (max < i) {
					max2 = i;
				}
			}
			i++;
		}
		System.out.println("25 , 75 의 최대 공약수: " + max2);

//	# 문제5) 연필 42자루와 지우개 28개를 최대한 많은 학생에가 남김없이 똑같이 나누어 주려고합니다
//	# 몇명까지 나누어 줄수있는지 출력
		i = 1;
		int max3 = 0;
		while (i <= 42) {
			if (28 % i == 0 && 42 % i == 0) {
				if (max < i) {
					max3 = i;
				}
			}
			i++;
		}
		System.out.println("최대로 나눠줄수있는 개수: " + max3);

	}

}

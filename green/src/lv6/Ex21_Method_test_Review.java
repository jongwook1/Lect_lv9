package lv6;

class Test99999 {
	void printEvenOrOdd(int x) {
		if (x % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

	void sumBetweenValues(int x, int y) {
		int total = 0;
		for (int i = x; i < y; i++) {
			total += i;
		}
		System.out.println(total);
	}

	void printPrimeNums(int primeNumber) {
		for (int i = 2; i < primeNumber; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}

public class Ex21_Method_test_Review {

	public static void main(String[] args) {
		Test99999 test = new Test99999();
		// 문제 1) a 가 홀수인지 짝수인지 출력
		int a = 19;
		test.printEvenOrOdd(a);

		// 문제 2) x부터 y까지의 합을 출력하는 메서드
		int x = 1;
		int y = 10;
		test.sumBetweenValues(x, y);

		// 문제3) 숫자 1개를 인자로 사용해서 2부터 인자까지의 소수 전부 출력 //1과 자기자신으로만 나누어떨어지는수
		int primeNumber = 20;
		test.printPrimeNums(primeNumber);

	}

}

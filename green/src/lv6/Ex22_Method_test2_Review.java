package lv6;

class Test9999 {
	void printSum(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
	}

	void printSumMultiple4(int[] arr) {
		int multiple = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				multiple += arr[i];
			}
		}
		System.out.println(multiple);
	}

	void printCountMultiple4(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	void printEvenNumber(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}

public class Ex22_Method_test2_Review {

	public static void main(String[] args) {
		Test9999 test = new Test9999();
		int[] arr = { 87, 100, 11, 72, 92 };

		// 문제 1) 전체 합 출력
		// 정답 1) 362
		test.printSum(arr);

		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		test.printSumMultiple4(arr);
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		test.printCountMultiple4(arr);
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		test.printEvenNumber(arr);
	}

}

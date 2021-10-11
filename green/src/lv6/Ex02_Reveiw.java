package lv6;

class Arr999 {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class Ex02_Reveiw {

	public static void main(String[] args) {

		Arr999 temp = new Arr999();

		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int total = 0;
		for (int i = 0; i < temp.arr.length; i++) {
			total += temp.arr[i];
		}
		System.out.println(total);

		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		int total2 = 0;
		int fCnt = 0;
		int jjakCnt = 0;
		for (int i = 0; i < temp.arr.length; i++) {
			if (temp.arr[i] % 4 == 0) {
				total2 += temp.arr[i];
				fCnt++;
			}
			if (temp.arr[i] % 2 == 0) {
				jjakCnt++;
			}
		}
		System.out.println(total2);

		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		System.out.println(fCnt);
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		System.out.println(jjakCnt);
	}

}

package lv6;

class Arr {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class Ex02 {
	
	
	public static void main(String[] args) {
		
		// 클래스명 변수명= new 클래스명();
		   Arr    temp =new Arr();
		
		// 문제 1) 전체 합 출력
				// 정답 1) 362
		
		int total = 0;
		for (int i = 0; i < temp.arr.length; i++) {
			total += temp.arr[i];
		}
		System.out.println(total);

		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
//문제 2,3 한번에도 가능
//		int sum = 0;
//		int cnt =0;
//		for (int i = 0; i < temp.arr.length; i++) {
//			if (temp.arr[i] % 4 == 0) {
//				sum += temp.arr[i];
//				cnt++;
//			}
//		}
//		System.out.println(sum);
//		System.out.println(cnt);
		
		int sum = 0;
		for (int i = 0; i < temp.arr.length; i++) {
			if (temp.arr[i] % 4 == 0) {
				sum += temp.arr[i];
			}
		}
		System.out.println(sum);

		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int cnt = 0;
		for (int i = 0; i < temp.arr.length; i++) {
			if (temp.arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		int jjak = 0;
		for (int i = 0; i < temp.arr.length; i++) {
			if (temp.arr[i] % 2 == 0) {
				jjak++;
			}
		}
		System.out.println(jjak);

	}

}

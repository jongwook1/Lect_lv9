package lv6;
class Test2 {
	void printSum(int[] arr) {
		int total=0;
		for(int i=0;i<arr.length;i++) {
			total+=arr[i];
		}
		System.out.println("총합: "+total);
	}
	void printSumMultiple4(int[] arr) {
		int total=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%4==0) {
				total+=arr[i];
			}
		}
		System.out.println("4의배수의 합: "+total);
	}
	void printCountMultiple4(int[] arr) {
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%4==0) {
				cnt++;
			}
		}
		System.out.println("4의 배수의 개수: "+cnt);
	}
	void printCountjjak(int[] arr) {
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				cnt++;
			}
		}
		System.out.println("짝수의 개수 출력 "+ cnt);
	}
}
public class Ex22 {

	public static void main(String[] args) {
		Test2 test2=new Test2();
		int[] arr = { 87, 100, 11, 72, 92 };

		// 문제 1) 전체 합 출력
		// 정답 1) 362
		test2.printSum(arr);
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		test2.printSumMultiple4(arr);
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		test2.printCountMultiple4(arr);
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		test2.printCountjjak(arr);

	}

}

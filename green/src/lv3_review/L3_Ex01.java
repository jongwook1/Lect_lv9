package lv3_review;

public class L3_Ex01 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];

		// 문제1) 4의 배수만 출력
		// 정답1) 20 40
		for(int i=0;i<5;i++) {
			arr[i]=10*(i+1);
			if(arr[i]%4==0) {
				System.out.println(arr[i]);
			}
		}

		// 문제2) 4의 배수의 합 출력
		// 정답2) 60
		int sum=0;
		for(int i=0;i<5;i++) {
			arr[i]=10*(i+1);
			if(arr[i]%4==0) {
				sum=arr[i];
			}
		}
System.out.println("4의 배수의 합: "+sum);

		// 문제3) 4의 배수의 개수 출력
		// 정답3) 2		
		int cnt=0;
		for(int i=0;i<5;i++) {
			arr[i]=10*(i+1);
			if(arr[i]%4==0) {
				cnt++;
			}
		}
		System.out.println("4의 배수의 개수: "+cnt);
	}

}

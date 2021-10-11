package lv4;

public class Ex13_re {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
				
			}
		}
		// 문제 1) 전체 합 출력
		// 정답 1) 450
		
		int total=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
			total+=arr[i][j];
			}
			}
		System.out.println("전체의 합:"+total);		
		
		System.out.println("4의배수출력");
		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80
		int total2=0;
		int cnt2=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(arr[i][j]%4==0) {
					System.out.print(arr[i][j]+" ");
					total2+=arr[i][j];
					cnt2++;
				}
			}
			}
		
	
		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200
		System.out.println("4의배수 합출력");
		System.out.println(total2);
		
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		System.out.println("4의배수 개수출력");
		System.out.println(cnt2);
		
	}

}

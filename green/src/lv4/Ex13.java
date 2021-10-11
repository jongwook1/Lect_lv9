package lv4;

public class Ex13 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];													//{ {0}{0}{0} }{ {0}{0}{0} }{ {0}{0}{0} }
		int k = 1;
		int total=0;
		int total4=0;
		int cnt=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
				total+=arr[i][j];
				if(arr[i][j]%4==0) {					
					System.out.println("4의 배수"+  arr[i][j]);
					cnt++;
					total4+=arr[i][j];
				}
				//System.out.print(arr[i][j]+" ");
			}
			
		}
		
		// 문제 1) 전체 합 출력
		// 정답 1) 450
		System.out.println();
		System.out.println("전체합 출력: " +total);		
		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80
		
		
		
		
		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200
		System.out.print("4의 배수의 합: "+total4);
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		System.out.println("\n4의 배수의 개수 출력: " +cnt);

	}

}

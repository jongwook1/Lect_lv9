package lv4;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {						
		int[][] arr = new int[3][3];
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}														//{ {10}{20}{30} }{ {40}{50}{60} }{ {70}{80}{90} }
		}														//인덱스 	00	01  02		10   11  12      20  21  22
		Scanner sc = new Scanner(System.in);
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예 1) 인덱스1 입력 : 1 인덱스2 입력 : 2
		// 값 출력 : 60
		for (int i = 0; i < 1; i++) {
			System.out.println("인덱스 입력 ㄱㄱ");
			int idx = sc.nextInt();
			int idx1 = sc.nextInt();
			System.out.println(arr[idx][idx1]);
		}

		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예 2) 값 입력 : 60
		// 인덱스1 출력 : 1 인덱스2 출력 : 2
		System.out.println("값 입력 ㄱㄱ");
		int data = sc.nextInt();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (data == arr[i][j]) {
					System.out.println(i);
					System.out.println(j);
				}

			}
		}

		System.out.println();

		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int max = 0;
		int idx = -1;
		int idx1 = -1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
					idx = i;
					idx1 = j;
				}

			}

		}
		System.out.println(idx);		
		System.out.println(idx1);

		// 문제 4) 값 2개를 입력받아 값 교체				//인덱스 4개필요 각값마다 인덱스2개필요하므로
		System.out.println("값 입력 ㄱㄱ");
		int inData1=sc.nextInt();
		int inData2=sc.nextInt();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j]==inData1) {
					
				}

			}

		}
		
		
		
		
		
		
		
		
	}

}

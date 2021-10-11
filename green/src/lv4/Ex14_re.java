package lv4;

import java.util.Scanner;

public class Ex14_re {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		Scanner sc=new Scanner(System.in);
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.println("인덱스1입력 ㄱ");
		int inputIdx1=sc.nextInt();
		System.out.println("인덱스2입력 ㄱ");
		int inputIdx2=sc.nextInt();
		
			System.out.print(arr[inputIdx1][inputIdx2]);		
		System.out.println("\n값을입력받아 인데스2개출력");
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
			System.out.println("\n값을 입력해주세요");
			int data=sc.nextInt();
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(arr[i][j]==data) {
						System.out.println("인덱스1: "+i+" "+ "인덱스2: "+j);
					}
				}
			}
			
		
		
		System.out.println("가장큰값의 인덱스 2개출력");
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int max=arr[0][0];
		int idx1=-1;
		int idx2=-1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			if(max<arr[i][j]) {
				max=arr[i][j];
				idx1=i;
				idx2=j;
			}	
			}
			
			}
		System.out.println("인덱스1: "+idx1+" "+ "인덱스2: "+idx2);
		
		
		// 문제 4) 값 2개를 입력받아 값 교체
		int inputN1=sc.nextInt();
		int inputN2=sc.nextInt();
		
		idx1=-1;
		idx2=-1;
		int idx3=-1;
		int idx4=-1;
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
				if(arr[i][j]==inputN1) {
					idx1=i;
					idx2=j;
				}
				if(arr[i][j]==inputN2) {
					idx3=i;
					idx4=j;
				}
			}
		}
		int temp=arr[idx1][idx2];
		arr[idx1][idx2]=arr[idx3][idx4];
		arr[idx3][idx4]=temp;
		
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		

	}

}

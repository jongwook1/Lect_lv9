package lv4_review;

import java.util.Scanner;

public class L4_Ex00 {

	public static void main(String[] args) {
		/*
		 * # 최대값 구하기
		 * 1. 가장 큰 값을 찾아 입력한다.
		 * 2. 정답이면 해당 값을 0으로 변경한다.
		 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
		 * 예)
		 * 11, 87, 42, 100, 24
		 * 입력 : 100
		 * 
		 * 11, 87, 42, 0, 24
		 * 입력 : 87
		 * 
		 * 11, 0, 42, 0, 24
		 */
Scanner sc=new Scanner(System.in);
		int[] arr = {11, 87, 42, 100, 24};
		
		
		int cnt=0;
		while(true) {
			for(int i=0;i<5;i++) {
				System.out.print(arr[i]+" ");
			}
			
			System.out.println("최대값입력하세요");
			int mN=sc.nextInt();
		int idx=0;
		int max=arr[idx];
			
			for(int i=0;i<5;i++) {
				if(arr[i]>max) {
					max=arr[i];
					idx=i;
				}
			}
			if(max==mN) {
				for(int i=0;i<5;i++) {
				arr[idx]=0;
				}
			}
		}

	}

}

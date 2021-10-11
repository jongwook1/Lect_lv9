package lv3;

import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1 , 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}
		Scanner sc = new Scanner(System.in);

		int idx1=sc.nextInt();
		int idx2=sc.nextInt();
		
		int temp=arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=temp;
		
		for(int i =0;i<5;i++) {
			System.out.print(arr[i]);
		}
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40 , 값2 입력 : 20
		// {10, 20, 30, 40, 50}
		
		int data1=sc.nextInt();
		int data2=sc.nextInt();
		
		temp=arr[data1];
		arr[data1]=arr[data2];
		arr[data2]=arr[temp];
		

		
		
		
	}

}

package lv3;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1 , 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}
		Scanner sc = new Scanner(System.in);
		// System.out.println("인덱스값 입력해주세요");
		// int n= sc.nextInt();
		// int n2=sc.nextInt();
		//int idx=0;
		System.out.println("인덱스1:");
		int idx1=sc.nextInt();
		System.out.println("인덱스2:");
		int idx2=sc.nextInt();
	
		int temp= arr[idx1];	//값보존
		arr[idx1] =arr[idx2];
		arr[idx2]= temp;
		for(int i =0;i<5;i++) {
			System.out.print(arr[i]+" ");		
		}
		

		
		  System.out.println();
		//int[] arr = { 10, 20, 30, 40, 50 };
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40 , 값2 입력 : 20
		// {10, 20, 30, 40, 50}
		System.out.print("\n데이타1:");
		int data1=sc.nextInt();
		System.out.print("데이타2:");
		int data2=sc.nextInt();
		
		idx1=-1;		//
		idx2=-1;		//
		//인덱스 찾으러 가기
		for (int i = 0; i < 5; i++) {
			if (data1 == arr[i]) {
				idx1 = i;
			}
			if (data2 == arr[i]) {
				idx2 = i;
			}
		}
		//값 교체
         if(idx1 != -1 && idx2 != -1) {
        	 temp= arr[idx1];
        	 arr[idx1]=arr[idx2];
        	 arr[idx2]=temp;
         }
         
         for (int i = 0; i < 5; i++) {
        	 System.out.print(arr[i]+" ");
         }
         
         System.out.println();
         
         
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예 3) 학번1 입력 : 1002 , 학번2 입력 : 1003
		// {87, 45, 11, 98, 23}
		
		
		System.out.print("\n학번1:");
		int num1=sc.nextInt();
		System.out.print("\n학번2:");
		int num2=sc.nextInt();
		
		
		idx1=-1;
		idx2=-1;
		
		for(int i=0; i<5;i++) {
			if(hakbuns[i] ==num1) {
				idx1=i;
			}if(hakbuns[i] ==num2) {
				idx2=i;
			}
		}
		//성적 교체
		temp=scores[idx1];
		scores[idx1]=scores[idx2];
		scores[idx2]= temp;
		
		//출력
		for(int i=0; i<5;i++) {
			System.out.printf("%d번 : %d점\n", hakbuns[i],scores[i]);
		}
	}
}

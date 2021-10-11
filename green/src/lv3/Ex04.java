package lv3;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 인덱스 0 1 2 3 4
		int[] arr = { 87, 11, 45, 98, 23 };
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1 성적 : 11점
		Scanner sc= new Scanner(System.in);
		
//
//		
//		for(int i =0; i<5;i++) {			
//			System.out.println("인덱스 번호를 입력하세요");
//			int inN =sc.nextInt();
//			//System.out.println(arr[i]);
//			System.out.println("인덱스 번호: "+inN+" 성적 : " + arr[inN]);			
//		}		
//		
		System.out.println("성적출력을 원하는 인덱스 입력 (0~4):");
		int idx = sc.nextInt();
		if(idx >= 0 && idx < 5) {
			System.out.println(arr[idx]);
		}

		
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11 인덱스 : 1
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		
		System.out.println("성적입력");
		int score = sc.nextInt();
		
		for(int i = 0; i<5; i++) {
			if(scores[i] == score) {
				System.out.println(i);
			}
		}
		
		

//		for(int i =0; i<5;i++) {			
//			
//			int inN =sc.nextInt();
//			
//			
//		}
		
		
		

		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003 성적 : 45점
		
		
	
		

	}

}

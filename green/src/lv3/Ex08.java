package lv3;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 문제1)  인덱스(방번호)를 입력하면 값출력
				int a[] = { 10,20,30,40,50 };
				// 예) 3 ==> 40
				Scanner sc= new Scanner(System.in);
				System.out.println("인덱스 번호를 입력하세요");
				int idx=sc.nextInt();
				if(idx>=0&&idx<=4) {
					System.out.println(a[idx]);
				}else {
					System.out.println("0~4의값만 입력해주세요");
				}				
				
				// 문제2) 아래배열중 가장큰값 출력
				// 예) 87
				int b[] = { 12,54,23,87,1 };
				int max =0;
				for(int i=0;i<5;i++) {
					if(b[i]>max) {
						max=b[i];
					}
				}System.out.println("b배열중 최대값: "+max);
								
				
				// 문제3) 아래 배열중 홀수의 개수 출력 
				int c[] = { 12,54,23,87,1 };
				int cnt =0;
				// 예) 홀수의 개수 : 3
				for(int i=0;i<5;i++) {
					if(c[i]%2==1) {
						System.out.println("c배열의 홀수값: "+c[i]);
						cnt++;
					}
				}System.out.println("c배열 홀수의 개수: "+cnt);
				
				
				
				// 문제4) 아래배열을 거꾸로 저장 
				int d[] = { 1,2,3,4,5 };
				int e[] = { 0,0,0,0,0 };
				//예)  ={5,4,3,2,1};
				
		

	}

}

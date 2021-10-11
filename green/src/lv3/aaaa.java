package lv3;

import java.util.Scanner;

public class aaaa {

	public static void main(String[] args) {
		// 문제 1) 아래 배열 a 에서 내가 입력한 값만 빼고 b 에 저장 
		int a[] = { 10,20,30,40,50 };
		int b[] = { 0,0,0,0,0 };
		// 예) 30 ==> b[] = {10,20,40,50,0};
		Scanner sc=new Scanner(System.in);
		System.out.println("값입력 ㄱㄱ");
		int input=sc.nextInt();
		int bidx=0;
		for(int i=0;i<5;i++) {
			if(a[i]!=input) {
				b[bidx]=a[i];
				bidx++;
			}
		}for(int i=0;i<5;i++) {
			System.out.println(b[i]);
		}
		// 문제 2) 아래 배열에서 내가 입력한 번호 와 값 만 빼고 d 에 저장
				int c[] = { 1001, 40, 1002, 65, 1003,  70 };
				int d[] = { 0,0,0,0,0,0 };
//				// 예) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};	
				
			
			System.out.println("학번점수 ㄱㄱ");
			int input2=sc.nextInt();
			int didx = 0;
			for (int i = 0; i < 6; i ++) {
				if (input2 == c[i]) {
					d[didx] = c[i + 1];
					didx++;
				}
			}
		
		
		
		
	}

}

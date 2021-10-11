package lv1_review;

import java.util.Scanner;

public class Ex04_l1 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		// 문제 1) 숫자 2개를 입력받아, 합 출력
		System.out.println("숫자입력");
		int n1=sc.nextInt();
		System.out.println("숫자입력");
		int n2=sc.nextInt();
		int sum=n1+n2;
		System.out.println("합은: "+sum);		
		
		
		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
		System.out.println("숫자한개입력");
		int n3=sc.nextInt();
		
		System.out.println(n3%2!=0);
		
		// 문제 3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		System.out.println("성적입력");
		int a=sc.nextInt();
	
		
		System.out.println(a>=60||a<=100);
	}

}

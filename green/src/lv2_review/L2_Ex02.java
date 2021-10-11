package lv2_review;

import java.util.Random;
import java.util.Scanner;

public class L2_Ex02 {

	public static void main(String[] args) {
		
		/*
		 * # 구구단 게임[3단계]
		 * 1. 구구단 게임을 5회 반복한다.
		 * 2. 정답을 맞추면 20점이다.
		 * 3. 게임 종료 후, 성적을 출력한다.
		 */
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		int score=0;
		int i=0;
		while(i<5) {
			int a=rn.nextInt(10)+1;
			int b=rn.nextInt(10)+1;
			
			int c=a*b;
			
			System.out.println(a+" X "+b+"= "+"?");
			
			System.out.println("정답입력해주세요");
			int inputN=sc.nextInt();
			
			if(inputN==c) {
				System.out.println("정답입니다 20점획득");
				score+=20;
			}else {
				System.out.println("땡 점수미획득");
			}
			
			
			i++;
		}
		System.out.println("총점수:  "+score);
		

	}

}

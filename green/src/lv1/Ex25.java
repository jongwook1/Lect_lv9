package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		/*
		 * # Up & Down 게임[2단계]
		 * 1. com 은 랜덤으로 1~100사이를 저장한다.
		 * 2. me 는 1~100사이를 입력한다. 	 
		 * 3. com 과 me 를 비교해서 com 크면 "크다" , com 이작으면 "작다" 힌트제공 
		 * 4. 정답을 맞추면 게임은 종료된다.
		 */
		
		//변수 n이 5까지 도달하면 -> 반복문 종료
//		int n = 0;
//		while(n<10) {
//			if()
//			System.out.println("반복중");
//			if(n<4) {
//				n = 11;
//			}
//			n++;
//		}
	
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int quiz = rn.nextInt(100)+1;
		System.out.println("퀴즈" + quiz);
		
		//boolean isRun = true;		
		int isRun = 1;
		while(isRun == 1) {
			System.out.println("정답 :");
			int answer = sc.nextInt();
			
			if(quiz == answer) {
				System.out.println("딩동댕");
				//반복문 종료
			//	isRun = false;
				isRun = 0;
			}
			else if(quiz > answer) {
				System.out.println("업");
			}else if(quiz < answer) {
				System.out.println("다운");
			}
		}		
	}
}

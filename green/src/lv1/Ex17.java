package lv1;
import java.util.Random;
import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {		
		/*
		 * # 369게임[1단계]
		 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
		 * 2. 위 수에 369의 개수가
		 * 	1) 2개이면, 짝짝을 출력
		 *  2) 1개이면, 짝을 출력
		 *  3) 0개이면, 해당 숫자를 출력
		 * 예)
		 * 		33	 : 짝짝
		 * 		16	 : 짝
		 * 		 7	 : 7
		 */
		
		
		Random rn = new Random();		
		
		int quiz = rn.nextInt(50) +1;
		
		System.out.println(quiz);
		
		int ten = quiz / 10;		//10의자리
		int one = quiz % 10;		//1의자리
		
		int clap = 0;
		
		
		if(ten % 3 == 0 && ten != 00) {
			clap ++;
			
		}if(one % 3 == 0 && one != 00){
			clap ++;
			
		}		
		//박수 시작
		System.out.println("퀴즈:" + quiz);		
		if(clap == 2) {
			System.out.println("짝짝");
		}
		else if(clap == 1) {
			System.out.println("짝");
		}
								
		
	}

}

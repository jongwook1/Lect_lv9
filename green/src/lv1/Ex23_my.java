//내가한거
package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex23_my {

	public static void main(String[] args) {
		/*
		 * # 구구단 게임[3단계]
		 * 1. 구구단 게임을 5회 반복한다.
		 * 2. 정답을 맞추면 20점이다.
		 * 3. 게임 종료 후, 성적을 출력한다.
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int r = 0;
		
		while(r < 5) {
		
		int rN1 = ran.nextInt(9)+1;
		int rN2 = ran.nextInt(9)+1;
		int anser = rN1 * rN2;
		System.out.println(rN1 + "X" + rN2 + "=" +"?" );
		
		
		System.out.println("정답을 입력하세요");
		int inputa = sc.nextInt();
		if(anser == inputa) {
			System.out.println("정답입니다");
		}else {
			System.out.println("떙");
		}
		int n = 0;
		if(anser == inputa) {
			n ++;
		}
		r ++;
		}
		int score = 20;
		System.out.println("성적은 "+r * score +"점입니다");
	}
}

package lv1;
import java.util.Random;

import java.util.Scanner;
public class t1_2 {

	public static void main(String[] args) {
		/*
		 * # 가위(0)바위(1)보(2) 게임[2단계] 
		 * 1. com은 0~2 사이의 랜덤한 숫자를 저장한다.
		 * 2. me는 0~2 사이의 숫자를 입력받는다. 
		 * 3. com과 me를 비교해, 1) 비겼다. 2) 내가 이겼다. 3) 내가 졌다. 를 출력한다.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		Random ran = new Random();
		
		int win = 0;
		int com = ran.nextInt(3);	// 랜덤 0~2
		int me = ran.nextInt(3);
		// 비겼다
		if(com == me) {
			System.out.println("비겼다");
		}
		// 이겼다
		else if(me == 0 && com == 2) {
			System.out.println("컴퓨터 : 보자기");
			System.out.println("나 : 가위");
			win = 1;
		}
		else if(me == 1 && com == 0) {
			System.out.println("컴퓨터 : 가위 ");
			System.out.println("나 : 바위");
			win = 1;
		}
		else if(me == 2 && com == 1) {
			System.out.println("컴퓨터 : 바위");
			System.out.println("나 : 보");
			win = 1;
		}		
		
		// 졌다
		else if(me == 0  && com == 1) {
			System.out.println("졌다");
			win = 2;
		}
		else if(me == 1 && com == 2) {
			System.out.println("졌다");
			win = 2;
		}
		else if(me == 2 && com == 0) {
			System.out.println("졌다");
			win = 2;
		}
		else{
			System.out.println("반칙! ");
			win = 2;
		}
		//결과 출력
		if(win == 1) {
			System.out.println("내가 이겼다");
		}
		else if(win == 2) {
			System.out.println("켬퓨터가 이겼다");
		}
		
	}

}

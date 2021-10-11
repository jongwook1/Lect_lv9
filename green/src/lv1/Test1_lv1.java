package lv1;

import java.util.Random;

public class Test1_lv1 {

	public static void main(String[] args) {
	//직접구현 1. 가위바위보 3단계
	// 시작 09:34
	// 종료 90:45
	// 소요 11분 00초
		
		
		/*
		 * # 가위바위보 게임[2단계]를
		 *   if - else if 구문으로 변경해보자.
		 */
		
		/*
		 * # 가위(0)바위(1)보(2) 게임[2단계] 
		 * 1. com은 0~2 사이의 랜덤한 숫자를 저장한다.
		 * 2. me는 0~2 사이의 숫자를 입력받는다. 
		 * 3. com과 me를 비교해, 1) 비겼다. 2) 내가 이겼다. 3) 내가 졌다. 를 출력한다.
		 */
		
		Random ran = new Random();
		
		int com = ran.nextInt(3);
		int me = ran.nextInt(3);
		int win = 0;
		
		if(com == me) {
			System.out.println("비겼다");
		}
		
		else if(com == 0 && me == 2 ) {
			System.out.println("졌다");
			System.out.println("컴 : 가위   나 : 보");
			win = 1;
		}else if(com == 1 && me == 0) {
			System.out.println("졌다");
			System.out.println("컴 : 바위   나 : 가위");
			win = 1;
		}else if(com == 2 && me == 1) {
			System.out.println("졌다");
			System.out.println("컴 : 보   나 : 바위");
			win = 1;
		}
		
		else if(com == 0 && me == 1 ) {
			System.out.println("이겼다");
			System.out.println("컴 : 가위   나 : 바위");
			win = 2;
		}else if(com == 1 && me == 2) {
			System.out.println("이겼다");
			System.out.println("컴 : 바위   나 : 보");
			win = 2;
		}else if(com == 2 && me == 0) {
			System.out.println("이겼다");
			System.out.println("컴 : 보   나 : 가위");
			win = 2;
		}else {
			System.out.println("반칙");
			win =2;
			}
		
		if(win == 1) {
			System.out.println("내가졌다");			
		}else if(win == 2) {
			System.out.println("내가 이겼다");
		}	
		
	}

}

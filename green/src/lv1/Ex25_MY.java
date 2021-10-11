package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex25_MY {

	public static void main(String[] args) {

		/*
		 * # Up & Down 게임[2단계] 
		 * 1. com 은 랜덤으로 1~100사이를 저장한다. 
		 * 2. me 는 1~100사이를 입력한다. 
		 * 3. com 과 me 를 비교해서 com 크면 "크다" , com 이작으면 "작다" 힌트제공 4. 정답을 맞추면 게임은 종료된다.
		 */
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int com = ran.nextInt(100) + 1;

		
		boolean run = true;

		// if(me >1 && me <= 100) {	//이렇게 하면 틀림
		while (run) {
			System.out.println("정답을 입력하세요");
			int me = sc.nextInt();
			if (me >= 1 && me <= 100) {
				if (me == com) {
					System.out.println("정답입니다.");
					run = false;

				} else if (me < com) {
					System.out.println("com이 큼");

				} else if (me > com) {
					System.out.println("com이 작다");
				}
			} else {
				System.out.println("1~100사이 숫자를 입력하세요");
			}
		}
		// }else {	//이렇게하면 틀림
		// System.out.println("1~100사이 숫자를 입력하세요");
		// }

	}

}

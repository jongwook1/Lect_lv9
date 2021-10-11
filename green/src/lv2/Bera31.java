package lv2;

import java.util.Random;
import java.util.Scanner;

public class Bera31 {

	public static void main(String[] args) {
		// 시작 10:05
		// 종료 10:30
		// 소요 25분		
		/*
		 * # 베스킨라빈스31 1. p1과 p2가 번갈아가면서 1~3을 입력한다. 2. br은 p1과 p2의 입력값을 누적해서 저장한다. 3. br이
		 * 31을 넘으면 게임은 종료된다. 4. 승리자를 출력한다.
		 * 
		 * 예) 1턴 : p1(2) br(2) 2턴 : p2(1) br(3) 3턴 : p1(3) br(6) ...
		 */

		Scanner sc = new Scanner(System.in);

		int p1 = 0;
		int p2 = 0;
		int br = 0;
		int turn = 0;

		boolean run = true;

		while (run) {
			System.out.println("누적된 br값"+br);
			int answer = 0;
			System.out.println("br" + br);
			if (turn % 2 == 0) {
				System.out.println("p1 숫자 ㄱㄱ");
				answer = sc.nextInt();
			} else {
				System.out.println("p2 숫자 ㄱㄱ");
				answer = sc.nextInt();
			}
			
			if (answer >= 1 && answer <= 3) {
				br += answer;
				if (br >= 31) {
					if (turn % 2 == 0) {
						System.out.println("p2승");
					} else {
						System.out.println("p1승");
					}
					run = false;
				}
			} else {
				System.out.println("1~3만 입력해줘");
				turn--;
			}
			turn++;
		}

	}
}

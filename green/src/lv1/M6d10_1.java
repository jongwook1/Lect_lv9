package lv1;

import java.util.Random;
import java.util.Scanner;

public class M6d10_1 {

	public static void main(String[] args) {
		/*
		 * # 베스킨라빈스31
		 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
		 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
		 * 3. br이 31을 넘으면 게임은 종료된다.
		 * 4. 승리자를 출력한다.
		 * 
		 * 예) 
		 * 1턴 : p1(2)	br(2)
		 * 2턴 : p2(1)	br(3)
		 * 3턴 : p1(3)	br(6)
		 * ...
		 */
		Scanner sc = new Scanner(System.in);

		int turn = 0;
		boolean run = true;
		int br = 0;
		while (run) {
			int answer = 0;

			if (turn % 2 == 0) {
				System.out.println("p1님 숫자를 입력하세요");
				answer = sc.nextInt();
				br += answer;
			} else {
				System.out.println("p2님 숫자를 입력하세요");
				answer = sc.nextInt();
				br += answer;
			}

			if (answer < 1 || answer > 3) {
				System.out.println("1~3까지의 숫자만 입력하세요");
				turn--;
			} else {
				if (br >= 31) {
					if (turn % 2 == 0) {
						System.out.println("p2가 승");
					} else {
						System.out.println("p1가 승");
					}
					run = false;
				}

			}
			turn++;

		}

	}

}

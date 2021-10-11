package lv2_review;

import java.util.Scanner;

public class L2_Ex07 {

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
		
		int p1 = 0;
		int p2 = 0;

		int br = 0;
		int turn = 0; // turn0일때 p1차례 turn1일때 p2차례

//		int i=0;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (true) {

			if (turn % 2 == 0) {
				System.out.println("p1님 숫자입력하세요");
				int p1N = sc.nextInt();
				if (p1N >= 1 && p1N <= 3) {
					turn++;
					br += p1N;
				} else {
					System.out.println("1~3사이숫자만 입력하세요");
				}
			} else if (turn % 2 == 1) {
				System.out.println("p2님 숫자입력하세요");
				int p2N = sc.nextInt();
				if (p2N >= 1 && p2N <= 3) {
					turn++;
					br += p2N;
				} else {
					System.out.println("1~3사이숫자만 입력하세요");
				}

			}
			System.out.println("br" + br);
			if (br >= 31) {
				if (turn % 2 == 0) {
					System.out.println("p1승");
				} else if (turn % 2 == 1) {
					System.out.println("p2승");
				}
				break;
			}

		}
		

	}

}

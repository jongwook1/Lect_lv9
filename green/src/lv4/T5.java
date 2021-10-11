package lv4;

import java.util.Scanner;

public class T5 {
//Ex04
	public static void main(String[] args) {
		/*
		 * # 숫자 야구 게임
		 * 1. me에 1~9 사이의 숫자 3개를 저장			//		me는 자신이입력
		 *    (단, 중복되는 숫자는 저장 불가)
		 * 2. com과 me를 비교해 정답을 맞출 때까지 반복 			//3strike되면 종료
		 * 3. 숫자와 자리가 같으면 		strike += 1
		 *    숫자만 같고 자리가 틀리면 	ball += 1
		 * 예)
		 * 정답 : 1 7 3
		 * 3 1 5		: 2b
		 * 1 5 6		: 1s
		 * ...
		 */
		Scanner sc=new Scanner(System.in);
		
		int[] com = { 1, 7, 3 };
		int[] me = new int[3];

		int win = 0;
		int strike = 0;
		int ball = 0;
		while (true) {

			for (int i = 0; i < 3; i++) {
				System.out.print(com[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < 3; i++) {
				System.out.print(me[i] + " ");
			}
			System.out.println();

			System.out.println("스트라이크" + strike);
			System.out.println("볼" + ball);

			if (win == 3) {
				System.out.println("경기끝");
			}

			boolean check = true;
			for (int i = 0; i < 3; i++) {
				System.out.printf("\n%d) 값을 입력하세요", i + 1);
				int inputN = sc.nextInt();
				for (int j = 0; j < 3; j++) {
					if (me[j] == inputN) {
						check = false;
					}
				}

				if (check == true) {
					me[i] = inputN;
				}

			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (com[i] == me[j]) {
						if (i == j) {
							strike++;
							win++;
						} else {
							ball++;
						}
					}
				}
			}

		}
		
		
	}

}

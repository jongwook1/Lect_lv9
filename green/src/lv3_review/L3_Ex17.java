package lv3_review;

import java.util.Scanner;

public class L3_Ex17 {

	public static void main(String[] args) {
		/*
		 * # 숫자이동[1단계]
		 * 1. 숫자2는 캐릭터이다.
		 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
		 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
		 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
		 * 4. {0, 0, 2, 0, 0, 0, 0};  ==> 왼쪽 ==> {0, 2, 0, 0, 0, 0, 0};
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] game = { 0, 0, 2, 0, 0, 0, 0 };

		int player = -1;

		while (true) {
			for (int i = 0; i < 7; i++) {
				if (game[i] == 2) {
					player = i;
				}
				if (game[i] == 2) {
					System.out.print("옷");
				} else {
					System.out.print("_ ");
				}

			}

			System.out.println("\n1.왼쪽  2.오른쪽  3.종료//숫자 입력해주세요");
			int sel = sc.nextInt();

			if (sel == 1 && player - 1 >= 0) {
				game[player] = 0;
				game[player - 1] = 2;
			} else if (sel == 2 && player + 1 < 7) {
				game[player] = 0;
				game[player + 1] = 2;
			} else if (sel == 3) {
				System.out.println("종료합니다");
				break;
			}

		}

	}

}

package lv6;

import java.util.Scanner;

class Sadari{
	String food[]= {"라면","막국수","치킨","순대국","피자"};
	
	int x=0;
	int y=0;
	int ladder[][]= {
			{0,0,0,0,0},
			{0,0,1,1,0},
			{0,1,1,0,0},
			{1,1,0,1,1},
			{0,0,0,0,0},
			{1,1,0,0,0},
			{0,0,1,1,0},
			{0,0,0,0,0}
	};

}


public class Ex11 {

	public static void main(String[] args) {
		/*
		 * # 사다리 게임
		 * 1. 0을 만나면 아래로 내려간다.
		 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
		 * 3. x의 위치를 입력받고 사다리를 표현한다.
		 */
		Scanner sc = new Scanner(System.in);
		Sadari s = new Sadari();
		while (true) {
			for (int i = 0; i < s.ladder[0].length; i++) {
				System.out.print(" " + (i + 1) + " ");
			}
			System.out.println();
			for (int i = 0; i < s.ladder.length; i++) {
				for (int j = 0; j < s.ladder[0].length; j++) {
					if (s.ladder[i][j] == 0) {
						System.out.print(" │ ");
					} else if (j != 0 && s.ladder[i][j] == 1 && s.ladder[i][j - 1] == 1) {
						System.out.print("─┤ ");
					} else if (j != s.ladder[i].length - 1 && s.ladder[i][j] == 1 && s.ladder[i][j + 1] == 1) {
						System.out.print(" ├─");
					}

//				System.out.println();
				}
				System.out.println();
			}

			System.out.println("번호선택");
			int sel = sc.nextInt() - 1;

			s.x = sel;

			for (int i = 0; i < s.ladder.length; i++) {
				if (s.ladder[i][s.x] == 1) {
					if (s.x != 0 && s.ladder[i][s.x - 1] == 1) {
						s.x--;

					} else if (s.x != s.ladder[i].length - 1 && s.ladder[i][s.x + 1] == 1) {
						s.x++;
					}

				}
//			s.y++;
			}

			System.out.print("당첨음식: " + s.food[s.x] + "\n");

		}
	}

}

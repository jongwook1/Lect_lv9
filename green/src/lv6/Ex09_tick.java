package lv6;

import java.util.Scanner;

class Tick{
	final int SIZE=9;
	int game[]=new int[SIZE];
	int turn=1;
	int win=0;
	
	int cnt=0;
}

public class Ex09_tick {

	public static void main(String[] args) {
		/* 
		 * # ∆Ω≈√≈‰
		 * === ∆Ω≈√≈‰ ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [ ][ ][ ]
		 * [p1]¿Œµ¶Ω∫ ¿‘∑¬ : 6
		 * === ∆Ω≈√≈‰ ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [O][ ][ ]
		 * [p1]Ω¬∏Æ
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		Tick t = new Tick();

		while (true) {
			for (int i = 0; i < t.game.length; i++) {
				if (t.game[i] == 1) {
					System.out.print("O ");
				} else if (t.game[i] == 2) {
					System.out.print("X ");
				} else {
					System.out.print(i + 1 + " ");
				}
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			System.out.printf("«√∑π¿ÃæÓ%d ¡¬«•¿‘∑¬: ", t.turn);
			int idx = sc.nextInt() - 1;

			if (t.game[idx] != 0) {
				System.out.println("¿Ãº±¡¬");
			} else {
				t.game[idx] = t.turn;
				if (t.turn == 1) {
					t.turn++;
				} else {
					t.turn--;
				}
			}
			int who = t.turn == 1 ? 2 : 1;

			// §—
			for (int i = 0; i < t.game.length; i += 3) {
				int cnt = 0;
				for (int j = 0; j < 3; j++) {
					if (t.game[i + j] == who) {
						cnt++;
					}
				}
				if (cnt == 3) {
					t.win = who;
				}
			}
			// |
			for (int i = 0; i < 3; i++) {
				int cnt = 0;
				for (int j = 0; j < t.game.length; j+=3) {	//@§—§—j<3;j++
					if (t.game[i + j ] == who) {			//¿ß¿« @∑Œ «ﬂ¿ªΩ√ i+j*3  µµ∞°¥…
						cnt++;
					}
				}
				if (cnt == 3)
					t.win = who;
			}

			// \
			t.cnt = 0;
			for (int i = 0; i < t.game.length; i += 4) {
				if (t.game[i] == who)
					t.cnt++;
			}
			if (t.cnt == 3)
				t.win = who;

			// /
			t.cnt = 0;
			for (int i = 2; i < t.game.length; i += 2) {
				if (t.game[i] == who)
					t.cnt++;
			}
			if (t.cnt == 3)
				t.win = who;

			if (t.win == 1) {
				System.out.println("P1Ω¬");
				break;
			} else if (t.win == 2) {
				System.out.println("P2Ω¬");
				break;
			}

		}

	}

}

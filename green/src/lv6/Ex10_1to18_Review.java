package lv6;
import java.util.Random;
import java.util.Scanner;
/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

class To18 {
	final int SIZE = 9;
	int[] front = new int[SIZE];
	int[] back = new int[SIZE];
}

public class Ex10_1to18_Review {

	public static void main(String[] args) {
		int gameN = 1;

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		To18 game = new To18();

		for (int i = 0; i < game.front.length; i++) {
			game.front[i] = i + 1;
			game.back[i] = i + 10;
		}

		// shuffle
		for (int i = 0; i < 1000; i++) {
			int rN = rn.nextInt(game.front.length);
			int temp = game.front[0];
			game.front[0] = game.front[rN];
			game.front[rN] = temp;

			int rN2 = rn.nextInt(game.back.length);
			int temp2 = game.back[0];
			game.back[0] = game.back[rN2];
			game.back[rN2] = temp2;

		}

		while (true) {
			for (int i = 0; i < game.front.length; i++) {
				System.out.print(game.front[i] + " ");
				if (i % 3 == 2) {
					System.out.println();
				}
			}

			if (gameN > game.SIZE * 2) {
				break;
			}

			System.out.println("제일작은값의 인덱스입력하세요");
			int idx = sc.nextInt() - 1;

			if (idx >= 0 && idx < game.SIZE) {
				if (game.front[idx] == gameN) {
					game.front[idx] = game.back[idx];
					game.back[idx] = 0;
					gameN++;
				}
			}

		}

	}

}

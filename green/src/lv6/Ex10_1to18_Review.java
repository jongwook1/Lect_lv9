package lv6;
import java.util.Random;
import java.util.Scanner;
/* 
 * # 1 to 50[3�ܰ�] : 1 to 18
 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
 * 4. ���� 1~9�� front �迭�� �����ϰ�,
 *    ���� 10~18�� back �迭�� �����Ѵ�.
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

			System.out.println("������������ �ε����Է��ϼ���");
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

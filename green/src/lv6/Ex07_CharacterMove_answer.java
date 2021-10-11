package lv6;

import java.util.Random;
import java.util.Scanner;
class Move{
	int x;
	final int P1=2;
	final int WALL=1;
	final int SIZE =10;
	int map[]=new int [SIZE];
}
public class Ex07_CharacterMove_answer {

	public static void main(String[] args) {
		/*
		 * # �����̵�[3�ܰ�] : Ŭ���� + ����
		 * 1. ����2�� ĳ�����̴�.
		 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
		 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
		 * 3. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
		 * 4. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
		 * 5. �¿� ���� �����ص� ��� �ݴ������� �̵��� �����ϴ�.
		 * ��) 
		 *  0 0 0 0 0 0 0 2 
		 *  ����(1) ������(2) : 2
		 *  
		 *  2 0 0 0 0 0 0 0 
		 */
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		Move game = new Move();
		// setting
		game.x = rn.nextInt(game.SIZE);
		game.map[game.x] = game.P1;

		for (int i = 0; i < 2; i++) {
			int rNum = rn.nextInt(game.SIZE);
			if (game.map[rNum] == 0) {
				game.map[rNum] = game.WALL;
			} else {
				i--;
			}
		}

		// run
		while (true) {
			for (int i = 0; i < game.map.length; i++) {
				if (game.map[i] == game.P1) {
					System.out.print("�� ");
				} else if (game.map[i] == game.WALL) {
					System.out.print("| ");
				} else {
					System.out.print("_ ");
				}
			}
			System.out.println();
			System.out.println("1.�� 2.�� 3.�Ѽ�\n");
			System.out.println("�޴�: ");
			int sel = sc.nextInt();

			int xx = game.x;
			if (sel == 1) {
				xx--;
			} else if (sel == 2) {
				xx++;
			}
			if (xx >= 0 && xx < game.SIZE && game.map[xx] == 0) {
				// move
				game.map[game.x] = 0;
				game.x = xx;
				game.map[game.x] = game.P1;
			}

			if (sel == 3) {
				if (game.x - 1 >= 0 && game.map[game.x - 1] == game.WALL) {
					game.map[game.x - 1] = 0;
				} else if (game.x + 1 < game.SIZE && game.map[game.x + 1] == game.WALL) {
					game.map[game.x + 1] = 0;

				}
			}

		}

	}

}

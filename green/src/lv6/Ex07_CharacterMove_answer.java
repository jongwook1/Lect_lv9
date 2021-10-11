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
		 * # 숫자이동[3단계] : 클래스 + 변수
		 * 1. 숫자2는 캐릭터이다.
		 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
		 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
		 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
		 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
		 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
		 * 예) 
		 *  0 0 0 0 0 0 0 2 
		 *  왼쪽(1) 오른쪽(2) : 2
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
					System.out.print("옷 ");
				} else if (game.map[i] == game.WALL) {
					System.out.print("| ");
				} else {
					System.out.print("_ ");
				}
			}
			System.out.println();
			System.out.println("1.왼 2.오 3.뿌셔\n");
			System.out.println("메뉴: ");
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

package lv6;

import java.util.Scanner;

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
* 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
* 6. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */
class NumMove {
	Scanner sc = new Scanner(System.in);
	int[] game = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };
	int pIdx = -1;

	void printGame() {
		for (int i = 0; i < this.game.length; i++) {
			if (this.game[i] == 0) {
				System.out.print("_");
			} else if (this.game[i] == 1) {
				System.out.print("|");
			} else if (this.game[i] == 2) {
				System.out.print("옷");
				this.pIdx = i;
			}
		}
	}

	void sel() {
		System.out.println("\n1.왼 2.오 3.격파");
		int move = sc.nextInt();
		if (move == 1) {
			walkLeft();

		} else if (move == 2) {
			walkRight();
		} else if (move == 3) {
			defeat();

		}

	}

	// 이동
	void walkLeft() {
		if (this.pIdx - 1 >= 0 && this.game[this.pIdx - 1] != 1) {
			this.game[this.pIdx] = 0;
			this.pIdx--;
			this.game[this.pIdx] = 2;
		}
	}

	void walkRight() {
		if (this.pIdx + 1 < this.game.length && this.game[this.pIdx + 1] != 1) {
			this.game[this.pIdx] = 0;
			this.pIdx++;
			this.game[this.pIdx] = 2;
		}
	}

	// 벽격파
	void defeat() {

		if (this.pIdx - 1 >= 0 && game[this.pIdx - 1] == 1) {
			game[this.pIdx - 1] = 0;
			System.out.println("격파");
		} else if (this.pIdx + 1 < this.game.length && game[this.pIdx + 1] == 1) {
			game[this.pIdx + 1] = 0;
			System.out.println("격파");
		}

	}

	public void run() {

		while (true) {
			printGame();
			sel();

		}
	}

}

public class Ex27_NumMove {

	public static void main(String[] args) {
		NumMove numMove = new NumMove();
		numMove.run();
	}
}

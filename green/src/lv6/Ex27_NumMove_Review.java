package lv6;

import java.util.Scanner;

class NumberMove99 {
	Scanner sc = new Scanner(System.in);
	private int game[];
	private int pIdx = -1;

	public NumberMove99(int game[]) {
		this.game = game;
	}

	public void printGame() {
		for (int i = 0; i < this.game.length; i++) {
			if (this.game[i] == 0) {
				System.out.print("_ ");
			} else if (this.game[i] == 1) {
				System.out.print("| ");
			} else if (this.game[i] == 2) {
				System.out.print("옷 ");
				this.pIdx = i;
			}
		}
	}

	public void move() {
		System.out.println("\n1.왼쪽 2.오른쪽 3.격파");
		int sel = sc.nextInt();

		int xx = this.pIdx;

		if (sel == 1) {
			if (xx - 1 >= 0 && this.game[xx - 1] != 1) {
				this.game[xx] = 0;
				this.game[xx - 1] = 2;
				pIdx = xx - 1;
			} else {
				System.out.println("움직일수없습니다");
			}
		} else if (sel == 2) {
			if (xx + 1 < game.length && game[xx + 1] != 1) {
				this.game[xx] = 0;
				this.game[xx + 1] = 2;
				pIdx = xx + 1;
			} else {
				System.out.println("움직일수없습니다");
			}
		} else if (sel == 3) {
			if (this.pIdx - 1 >= 0 && game[this.pIdx - 1] == 1) {
				game[this.pIdx - 1] = 0;
				System.out.println("격파");
			} else if (this.pIdx + 1 < this.game.length && game[this.pIdx + 1] == 1) {
				game[this.pIdx + 1] = 0;
				System.out.println("격파");
			}
		}

	}

	public void run() {
		while (true) {
			printGame();
			move();
		}
	}

}

public class Ex27_NumMove_Review {

	public static void main(String[] args) {
		int game[] = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };

		NumberMove99 num = new NumberMove99(game);
		num.run();

	}

}

package lv6;

import java.util.Scanner;

class Tic9 {
	Scanner sc = new Scanner(System.in);
	int game[];
	int turn = 1;
	int win = 0;
	int who = 0;

	public Tic9(int game[]) {
		this.game = game;
	}

	public int getTurn() {
		return this.turn;
	}

	public void setWin(int who) {
		this.win = who;
	}

	public int getWin() {
		return this.win;
	}

	public int getWho() {
		return this.who;
	}

	public void printGame() {
		for (int i = 0; i < this.game.length; i++) {
			if (this.game[i] == 0) {
				System.out.print(i + 1 + " ");
			} else if (this.game[i] == 1) {
				System.out.print("O ");
			} else if (this.game[i] == 2) {
				System.out.print("X ");
			}
			if (i % 3 == 2) {
				System.out.println();
			}
		}
	}

	public void mark() {
		System.out.printf("ÇÃ·¹ÀÌ¾î%d ´Ô ÁÂÇ¥ÀÔ·Â", getTurn());
		int idx = sc.nextInt() - 1;
		if (this.getTurn() == 1 && this.game[idx] == 0 && this.game[idx] != 2) {
			this.game[idx] = this.getTurn();
			this.turn++;
		} else if (this.getTurn() == 2 && this.game[idx] == 0 && this.game[idx] != 1) {
			this.game[idx] = this.getTurn();
			this.turn--;
		}
		this.who = this.getTurn() == 1 ? 2 : 1;
	}

	public void checkGaro() {
		for (int i = 0; i < game.length; i += 3) {
			int cnt = 0;
			for (int j = 0; j < 3; j++) {
				if (game[i + j] == this.getWho()) {
					cnt++;
				}
			}
			if (cnt == 3) {
				this.setWin(this.getWho());
			}
		}
	}

	public void checkSero() {
		for (int i = 0; i < 3; i++) {
			int cnt = 0;
			for (int j = 0; j < this.game.length; j += 3) {
				if (this.game[i + j] == this.getWho()) {
					cnt++;
				}
			}
			if (cnt == 3)
				this.setWin(this.getWho());
		}
	}

	public void checkLDeagak() {
		int cnt = 0;
		for (int i = 0; i < this.game.length; i += 4) {
			if (this.game[i] == this.getWho())
				cnt++;
		}
		if (cnt == 3)
			this.setWin(this.getWho());

	}

	public void checkRDeagak() {
		int cnt = 0;
		for (int i = 2; i < this.game.length; i += 2) {
			if (this.game[i] == this.getWho())
				cnt++;
		}
		if (cnt == 3)
			this.setWin(this.getWho());
	}

	public boolean end() {
		if (this.getWin() == 1) {
			printGame();
			System.out.println("ÇÃ·¹ÀÌ¾î1 ½Â ");
			return false;
		} else if (this.getWin() == 2) {
			printGame();
			System.out.println("ÇÃ·¹ÀÌ¾î2 ½Â");
			return false;
		}
		return true;
	}

	public void run() {
		while (end()) {
			printGame();
			mark();
			checkGaro();
			checkSero();
			checkLDeagak();
			checkRDeagak();
		}
	}

}

public class Ex28_Tic_Reivew {

	public static void main(String[] args) {

		int game[] = new int[9];
		Tic9 t = new Tic9(game);
		t.run();

	}

}

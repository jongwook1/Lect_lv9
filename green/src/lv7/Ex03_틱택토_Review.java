package lv7;

import java.util.Scanner;

class Tic8888 {
	private boolean check;
	private int owner;

	public Tic8888(boolean c) {
		this.check = c;
		System.out.println("TicÇÑÄ­ÀÇ °´Ã¼»ý¼º!");
	}

	boolean getCheck() {
		return this.check;
	}

	int getOwner() {
		return this.owner;
	}

	void setCheck(boolean check) {
		this.check = check;
	}

	void setOwner(int owner) {
		this.owner = owner;
	}

}

class Tictactoe8888 {
	// °ÔÀÓ ±¸Çö
	Scanner sc = new Scanner(System.in);
	Tic8888 tic[] = new Tic8888[9];

	private int turn = 1;
	private int win = 0;
	private int who = 0;
	private boolean c = false;

	public int getTurn() {
		return this.turn;
	}

	public int getWin() {
		return this.win;
	}

	public void setAddTurn(int t) {
		this.turn = t + 1;
	}

	public void setMiTurn(int t) {
		this.turn = t - 1;
	}

	public void setWin(int w) {
		this.win = w;
	}

	public void setTictactoe() {
		for (int i = 0; i < this.tic.length; i++) {
			tic[i] = new Tic8888(c);
		}
	}

	public void printGame() {
		for (int i = 0; i < this.tic.length; i++) {
			if (this.tic[i].getOwner() == 1) {
				System.out.print("O ");
			} else if (this.tic[i].getOwner() == 2) {
				System.out.print("X ");
			} else {
				System.out.print(i + 1 + " ");
			}
			if (i % 3 == 2) {
				System.out.println();
			}
		}
	}

	public void inputIdx() {
		System.out.printf("ÇÃ·¹ÀÌ¾î %d ÁÂÇ¥ÀÔ·Â: ", this.getTurn());
		int idx = sc.nextInt() - 1;

		if (tic[idx].getCheck() == true) {
			System.out.println("ÀÌ¼±ÁÂ");
		} else {
			this.tic[idx].setOwner(getTurn());
			this.tic[idx].setCheck(true);
			if (this.getTurn() == 1) {
				this.setAddTurn(getTurn());
			} else if (this.getTurn() == 2) {
				this.setMiTurn(getTurn());
			}
		}

		this.who = this.getTurn() == 1 ? 2 : 1; ///

	}

	public boolean end() {
		if (this.getWin() == 1) {
			System.out.println("p1½Â");
			return false;
		} else if (this.getWin() == 2) {
			System.out.println("p2½Â");
			return false;
		}
		return true;
	}

	void checkGaro() {
		for (int i = 0; i < this.tic.length; i += 3) {
			int cnt = 0;
			for (int j = 0; j < 3; j++) {
				if (this.tic[i + j].getOwner() == this.who) {
					cnt++;
				}
			}
			if (cnt == 3) {
				this.setWin(who);
			}
		}
	}

	void checkSero() {
		for (int i = 0; i < 3; i++) {
			int cnt = 0;
			for (int j = 0; j < this.tic.length; j += 3) {
				if (this.tic[i + j].getOwner() == this.who) {
					cnt++;
				}
			}
			if (cnt == 3)
				this.setWin(who);
		}
	}

	void checkLDeagak() {
		int cnt = 0;
		for (int i = 0; i < this.tic.length; i += 4) {
			if (this.tic[i].getOwner() == this.who)
				cnt++;
		}
		if (cnt == 3)
			this.setWin(who);

	}

	void checkRDeagak() {
		int cnt = 0;
		for (int i = 2; i < this.tic.length; i += 2) {
			if (this.tic[i].getOwner() == this.who)
				cnt++;
		}
		if (cnt == 3)
			this.setWin(who);
	}

	public void run() {
		setTictactoe();
		while (true) {
			printGame();
			if (end()) {
				inputIdx();
				checkGaro();
				checkSero();
				checkLDeagak();
				checkRDeagak();
			} else {
				break;
			}
		}

	}

}

public class Ex03_Æ½ÅÃÅä_Review {

	public static void main(String[] args) {
		Tictactoe8888 ttt = new Tictactoe8888();
		ttt.run();

	}

}

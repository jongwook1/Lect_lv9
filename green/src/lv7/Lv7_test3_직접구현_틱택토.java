package lv7;

//Ω√¿€ 12:50
//¡æ∑· 13:40
//º“ø‰ 00:50
import java.util.Scanner;

class Tic9 {
	private boolean check;
	private int owner;

	// getter
	boolean getCheck() {
		return this.check;
	}

	int getOwner() {
		return this.owner;
	}

	// setter
	void setCheck(boolean check) {
		this.check = check;
	}

	void setOwner(int owner) {
		this.owner = owner;
	}
}

class Tictactoe9 {
	Scanner sc = new Scanner(System.in);
	Tic9 tic[] = new Tic9[9];
	int game[] = new int[9];
	private int turn = 1;
	private int win = 0;
	int who = 0;

	// getter
	int getTurn() {
		return this.turn;
	}

//	int getWho() {
//		return this.who;
//	}
	int getWin() {
		return this.win;
	}

	// setter
	void setaddTurn(int turn) {
		this.turn = turn + 1;
	}

	void setmiTurn(int turn) {
		this.turn = turn - 1;
	}

//	void setWho(int who) {
//		this.who=who;
//	}
	void setWin(int win) {
		this.win = win;
	}

	void setTictactoe() {
		for (int i = 0; i < tic.length; i++) {
			tic[i] = new Tic9();
		}
	}

	void printGame() {
		for (int i = 0; i < this.game.length; i++) {
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

	void inputIdx() {
		System.out.printf("«√∑π¿ÃæÓ%d ¡¬«•¿‘∑¬: ", this.getTurn());
		int idx = sc.nextInt() - 1;

		if (tic[idx].getCheck() == true) {
			System.out.println("¿Ãº±¡¬");
		} else {
			this.tic[idx].setOwner(getTurn());
			this.tic[idx].setCheck(true);
			if (this.getTurn() == 1) {
				this.setaddTurn(getTurn());
			} else if (this.getTurn() == 2) {
				this.setmiTurn(getTurn());
			}

		}
		for (int i = 0; i < tic.length; i++) {
			this.who = this.getTurn() == 1 ? 2 : 1;
		}

	}

	boolean end() {
		if (this.getWin() == 1) {
			System.out.println("p1Ω¬");
			return false;
		} else if (this.getWin() == 2) {
			System.out.println("p2Ω¬");
			return false;
		}
		return true;
	}

	void checkGaro() {
		for (int i = 0; i < this.game.length; i += 3) {
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
			for (int j = 0; j < this.game.length; j += 3) {
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
		for (int i = 0; i < this.game.length; i += 4) {
			if (this.tic[i].getOwner() == this.who)
				cnt++;
		}
		if (cnt == 3)
			this.setWin(who);

	}

	void checkRDeagak() {
		int cnt = 0;
		for (int i = 2; i < this.game.length; i += 2) {
			if (this.tic[i].getOwner() == this.who)
				cnt++;
		}
		if (cnt == 3)
			this.setWin(who);
	}

	void run() {
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

public class Lv7_test3_¡˜¡¢±∏«ˆ_∆Ω≈√≈‰ {

	public static void main(String[] args) {
		Tictactoe9 ttt = new Tictactoe9();
		ttt.run();

	}

}

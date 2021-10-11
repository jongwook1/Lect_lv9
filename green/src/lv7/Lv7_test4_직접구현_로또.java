package lv7;

import java.util.Random;

//시작 13:45
//종료 14:15
//소요 00:30
class Lotto999 {
	private int num;

	// getter
	int getNum() {
		return this.num;
	}

	// setter
	void setNum(int num) {
		this.num = num;
	}
}

class LottoSet999 {
	Random rn = new Random();
	private int win = 0;

	// getter
	int getWin() {
		return this.win;
	}

	// setter
	void setWin(int win) {
		this.win = win;
	}

	Lotto999 lotto[][] = new Lotto999[5][7];

	void lottoSet() {
		for (int i = 0; i < this.lotto.length; i++) {
			for (int j = 0; j < this.lotto[i].length; j++) {
				this.lotto[i][j] = new Lotto999();
			}
		}
	}

	void lottoSetInput() {
		for (int i = 0; i < this.lotto.length; i++) {
			for (int j = 0; j < this.lotto[i].length; j++) {
				int rN = rn.nextInt(2);
				if (rN == 1) {
					this.lotto[i][j].setNum(3);
				} else {
					this.lotto[i][j].setNum(0);
				}
			}
			int check = -1;
			int cnt = 0;
			for (int j = 0; j < this.lotto[i].length; j++) {
				if (this.lotto[i][j].getNum() == 3) {
					cnt++;
				} else {
					cnt = 0;
				}
				if (cnt == 3) {
					check = 1;
				}
			}
			if (check == 1 && win == 0) {
				this.setWin(1);
			} else if (check == 1 && this.getWin() == 1) {
				i--;
			} else if (check == -1 && this.getWin() == 0) {
				i--;
			}
		}
	}

	void printLotto() {
		for (int i = 0; i < this.lotto.length; i++) {
			for (int j = 0; j < this.lotto[i].length; j++) {
				System.out.print(this.lotto[i][j].getNum() + " ");
			}
			System.out.println();
		}
	}

	void run() {
		lottoSet();
		lottoSetInput();
		printLotto();
	}

}

public class Lv7_test4_직접구현_로또 {

	public static void main(String[] args) {
		LottoSet999 game = new LottoSet999();
		game.run();

	}

}

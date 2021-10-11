package lv7;

import java.util.Random;

class Lotto555 {
	private int num;

	public Lotto555(int n) {
		this.num = n;
	}

	public void setNum(int n) {
		this.num = n;
	}

	public int getNum() {
		return this.num;
	}

}

class LottoSet555 {
	Random rn = new Random();
	Lotto555 lottos[][] = new Lotto555[5][7];
	private int win;

	public void setWin(int w) {
		this.win = w;
	}

	public int getWin() {
		return this.win;
	}

	public void setLotto() {
		int n = 0;
		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < lottos[i].length; j++) {
				lottos[i][j] = new Lotto555(n);

			}
		}

	}

	public void lottoInput() {
		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < lottos[i].length; j++) {
				int rN = rn.nextInt(2);
				if (rN == 1) {
					this.lottos[i][j].setNum(3);

				} else {
					this.lottos[i][j].setNum(0);

				}
			}
			int check = -1;
			int cnt = 0;
			for (int j = 0; j < this.lottos[i].length; j++) {
				if (this.lottos[i][j].getNum() == 3) {
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

	public void printLotto() {
		for (int i = 0; i < this.lottos.length; i++) {
			for (int j = 0; j < this.lottos[i].length; j++) {
				System.out.print(this.lottos[i][j].getNum() + " ");
			}
			System.out.println();
		}

	}

	public void run() {
		setLotto();
		lottoInput();
		printLotto();
	}

}

public class Ex04_lotto_Review {

	public static void main(String[] args) {
		LottoSet555 game = new LottoSet555();
		game.run();

	}

}

package lv7;

import java.util.Random;

//1개 게임만 당첨인 5개짜리 로또세트 완성

class Lotto99 {
	int num;
}

class LottoSet99 {
	Random rn = new Random();
	int win = 0;

	Lotto99 lotto[][] = new Lotto99[5][7];

	void lottoSet() {
		for (int i = 0; i < this.lotto.length; i++) {
			for (int j = 0; j < this.lotto[i].length; j++) {
				this.lotto[i][j] = new Lotto99();
			}
		}
	}

	void printLotto() {
		for (int i = 0; i < this.lotto.length; i++) {
			for (int j = 0; j < this.lotto[i].length; j++) {
				System.out.print(this.lotto[i][j].num + " ");
			}
			System.out.println();
		}
	}

	void lottoSetInput() {
		for (int i = 0; i < this.lotto.length; i++) {
			for (int j = 0; j < this.lotto[i].length; j++) {
				int rN = rn.nextInt(2);
				if (rN == 1) {
					this.lotto[i][j].num = 3;
				} else {
					this.lotto[i][j].num = 0;
				}
			}
			int check = -1;
			int cnt = 0;
			for (int j = 0; j < this.lotto[i].length; j++) {
				if (this.lotto[i][j].num == 3) {
					cnt++;
				} else {
					cnt = 0;
				}
				if (cnt == 3) {
					check = 1;
				}
			}

			if (check == 1 && win == 0) {
				win = 1;
			} else if (check == 1 && win == 1) {
				i--;
			} else if (check == -1 && win == 0) {
				i--;
			}

		}

	}

	public void run() {
		lottoSet();
		lottoSetInput();
		printLotto();
	}
}

public class Ex04 {

	public static void main(String[] args) {
		LottoSet99 game = new LottoSet99();
		game.run();

	}

}

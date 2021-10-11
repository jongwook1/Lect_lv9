package lv7;

import java.util.Random;

class LottoSet5555 {
	Random rn = new Random();
	Integer lotto[][] = new Integer[5][7];
	private int win;

	public void setWin(int w) {
		this.win = w;
	}

	public int getWin() {
		return this.win;
	}

	public void setLotto() {
		int n = 0;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto[i].length; j++) {
				lotto[i][j] = new Integer(n);
//				래퍼클래스는 값초기화(객체생성) 시,
//				// = new Integer(값); // JDK9 이하 버전
//				= 값; // 으로 초기화하면 됩니다.				
			}
		}

	}

	public void lottoInput() {
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto[i].length; j++) {
				int rN = rn.nextInt(2);
				if (rN == 1) {

					this.lotto[i][j] = 3;

				} else {

					this.lotto[i][j] = 0;
				}
			}
			int check = -1;
			int cnt = 0;
			for (int j = 0; j < this.lotto[i].length; j++) {

				if (this.lotto[i][j] == 3) {
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

		for (int i = 0; i < this.lotto.length; i++) {
			for (int j = 0; j < this.lotto[i].length; j++) {
				System.out.print(this.lotto[i][j] + " ");
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

public class Ex04_lotto_Integer_Review {

	public static void main(String[] args) {
		LottoSet5555 game = new LottoSet5555();
		game.run();

	}

}

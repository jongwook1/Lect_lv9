package lv7;

import java.util.Random;
import java.util.Scanner;

class Card0 {
	String shape;
	int shapeCode;
	int number;
	boolean fliped;

	void setCard(String shape, int shapeCode, int number) {
		this.shape = shape;
		this.shapeCode = shapeCode;
		this.number = number;
	}

	void printCard(String[][] shapeList) {
		System.out.printf("%s | %d | %s\n", shapeList[this.shapeCode][1], this.number,
				this.fliped == true ? "◼︎" : "☐");
	}
}

class CardPlayer0 {
	int money = 1000;
	Card0 cards[] = new Card0[2];
}

class CardGame0 {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();

	String shapeList[][] = { { "Diamond", "♦︎" }, { "Heart", "♥︎" }, { "spade", "♠︎" }, { "clover", "♣︎" } };
	Card0 cards[]; // 클래스 배열
	CardPlayer0 cardPlayers[];
	int wins[];
	int total[];

	int turn;
	int players;

	void setCards() {
		this.cards = new Card0[40];

		int shape = 0;
		for (int i = 0; i < this.cards.length; i++) {
			this.cards[i] = new Card0();
			this.cards[i].setCard(this.shapeList[shape][0], shape, i % 10 + 1);
			if (i % 10 == 9)
				shape++;
		}
		shuffleCards();
	}

	void shuffleCards() {
		for (int i = 0; i < 5000; i++) {
			int r = rn.nextInt(this.cards.length);

			Card0 temp = this.cards[0]; // 클래스 배열의 값(주소)을 셔플
			this.cards[0] = this.cards[r];
			this.cards[r] = temp;
		}
	}

	void setGame() {
		while (true) {
			System.out.print("number of participants: ");
			int num = sc.nextInt();

			if (num > 0) {
				this.players = num;
				this.turn = 1;
				this.cardPlayers = new CardPlayer0[this.players];
				for (int i = 0; i < this.cardPlayers.length; i++) {
					this.cardPlayers[i] = new CardPlayer0();
				}
				this.wins = new int[this.players];
				this.total = new int[this.players];
				break;
			}
		}
	}

	void printWholeCards() {
		System.out.println("-----------------");
		for (int i = 0; i < this.cards.length; i++) {
			this.cards[i].printCard(this.shapeList);
		}
		System.out.println("-----------------");
	}

	void printCards(int turn, CardPlayer0 player) {
		System.out.printf("p%d >>\n", turn);
		for (int i = 0; i < player.cards.length; i++) {
			player.cards[i].printCard(this.shapeList);
		}
	}

	void flipCards() {
		this.total[this.turn - 1] = 0;
		int round = 0;
		while (round < 2) {
			int r = rn.nextInt(this.cards.length);
			if (this.cards[r].fliped)
				continue;
			this.cardPlayers[this.turn - 1].cards[round] = new Card0();
			this.cardPlayers[this.turn - 1].cards[round].setCard(this.cards[r].shape, this.cards[r].shapeCode,
					this.cards[r].number);
			this.cards[r].fliped = true;
			this.total[this.turn - 1] += this.cards[r].number;
			round++;
		}
		printCards(this.turn, this.cardPlayers[this.turn - 1]);
		if (this.turn == this.players) {
			int win = checkWin();
			this.wins[win]++;
			System.out.println("-----------------");
			System.out.printf("p%d win!\n", win + 1);
		}
		this.turn = this.turn == this.players ? 1 : ++this.turn;
	}

	int checkWin() {
		int max = 0;
		int idx = -1;
		for (int i = 0; i < this.total.length; i++) {
			if (max < this.total[i]) {
				max = this.total[i];
				idx = i;
			}
		}
		for(int i=0; i<this.cardPlayers.length; i++) {
			if(i != idx) {
				this.cardPlayers[i].money -= 100;
				this.cardPlayers[idx].money += 100;
			}
		}
		return idx;
	}

	boolean end() {
		if (this.turn == 1) {
			int check = 0;
			for (int i = 0; i < this.cards.length; i++) {
				if (!this.cards[i].fliped)
					check++;
			}
			if (check < this.players * 2)
				return true;
		}
		return false;
	}

	void printResult() {
		for (int i = 0; i < this.wins.length; i++)
			System.out.printf("p%d win point : %d (%d won)\n", i + 1, this.wins[i], this.cardPlayers[i].money);

		int max = 0;
		for (int i = 0; i < this.wins.length; i++) {
			if (this.wins[i] >= max) {
				max = this.wins[i];
			}
		}
		for (int i = 0; i < this.wins.length; i++) {
			if (max == this.wins[i]) {
				System.out.printf(">> p%d Final Win! <<\n", i + 1);
			}
		}
		printWholeCards();
	}

	void run() {
		setCards();
		setGame();
		System.out.println("--- CARD GAME ---");
		while (!end()) {
			flipCards();
			System.out.println("-----------------");
			try {
				Thread.sleep(300);
			} catch (Exception e) {
			}
		}
		printResult();
	}
}



public class Ett {

	public static void main(String[] args) {
		CardGame0 game = new CardGame0();
		game.run();
	}

}

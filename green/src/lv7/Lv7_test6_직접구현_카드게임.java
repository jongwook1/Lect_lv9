package lv7;

import java.util.Random;
import java.util.Scanner;

//시작 17:40
//종료 19:10
//소요 01:30
class Card999 {
	String shape;
	int number;
	boolean fliped;

	String getShape() {
		return this.shape;
	}

	int getNumber() {
		return this.number;
	}

	boolean getFliped() {
		return this.fliped;
	}

	void setCard(String shape, int number) {
		this.shape = shape;
		this.number = number;
	}

	void setFliped(boolean fliped) {
		this.fliped = fliped;
	}

	void printCard() {
		System.out.println(this.getShape() + " : " + this.getNumber());
	}

}

class CardPlayer999 {

	Card999 card[] = new Card999[2];

}

class CardGame999 {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();

	Card999 cards[] = new Card999[40];
	CardPlayer999 cardPlayers[];

	private int players;
	private int turn;
	int total[];
	int winCnt[];

	int getPlayers() {
		return this.players;
	}

	void setPlayer(int player) {
		this.players = player;
	}

	int getTurn() {
		return this.turn;
	}

	void setTurn(int turn) {
		this.turn = turn + 1;
	}

	String shapeList[] = { "다이아", "하트", "스페이드", "클로버" };

	void setGame() {
		System.out.print("참여인원 :");
		int num = sc.nextInt();

		if (num > 1) {
			this.setPlayer(num);
			this.cardPlayers = new CardPlayer999[this.getPlayers()];
			for (int i = 0; i < this.cardPlayers.length; i++) {
				this.cardPlayers[i] = new CardPlayer999();
			}
			this.total = new int[this.getPlayers()];
			this.winCnt = new int[this.getPlayers()];
		}
		this.setTurn(1);
	}

	void setCards() {
		int shape = 0;
		for (int i = 0; i < this.cards.length; i++) {
			this.cards[i] = new Card999();
			this.cards[i].setCard(shapeList[shape], i % 10 + 1);
			if (i % 10 == 9) {
				shape++;
			}
		}
		shuffle();
	}

	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int rN = rn.nextInt(this.cards.length);
			Card999 temp = cards[0];
			cards[0] = this.cards[rN];
			this.cards[rN] = temp;
		}
	}

	void printWholeCards() {
		for (int i = 0; i < this.cards.length; i++) {
			System.out.printf("%s %d\n", this.cards[i].getShape(), this.cards[i].getNumber());
		}
	}

	void flipCards() {
		this.cardPlayers[turn - 1].card = new Card999[2];
		for (int i = 0; i < 2; i++) {
			this.cardPlayers[turn - 1].card[i] = new Card999();
		}
		this.total[turn - 1] = 0;

		int n = 0;
		while (n < 2) {
			int r = rn.nextInt(this.cards.length);
			if (this.cards[r].getFliped())
				continue;
			this.cards[r].setFliped(true);

			this.cardPlayers[turn - 1].card[n].setCard(this.cards[r].getShape(), this.cards[r].getNumber());
			this.cardPlayers[turn - 1].card[n].printCard();
			this.total[turn - 1] += this.cards[r].getNumber();
			n++;
		}
		System.out.println("------------");
		if (this.getTurn() == this.getPlayers()) {
			checkWin();
		}
		this.turn = this.turn == this.getPlayers() ? 1 : ++this.turn;
	}

	boolean end() {
		if (this.getTurn() == 1) {
			int check = 0;
			for (int i = 0; i < this.cards.length; i++) {
				if (this.cards[i].getFliped())
					check++;
			}
			if (check > this.getPlayers() * 2) {
				return true;
			}
		}
		return false;
	}

	void checkWin() {
		int max = 0;
		for (int i = 0; i < this.total.length; i++) {
			if (max < this.total[i]) {
				max = this.total[i];
			}
		}
		for (int i = 0; i < this.total.length; i++) {
			if (this.total[i] == max) {
				System.out.printf("p%d win!\n", i + 1);
				this.winCnt[i]++;
			}
		}
		System.out.println("---------------");
	}

	void finalWin() {
		int max = 0;
		for (int i = 0; i < this.winCnt.length; i++) {
			if (max < this.winCnt[i])
				max = this.winCnt[i];
		}
		for (int i = 0; i < this.winCnt.length; i++) {
			if (max == this.winCnt[i]) {
				System.out.printf("p%d 파이널 윈!!\n", i + 1);
			}
		}
	}

	void run() {
		setGame();
		setCards();
//		printWholeCards();

		while (!end()) {
			flipCards();
		}
		finalWin();
	}

}

public class Lv7_test6_직접구현_카드게임 {

	public static void main(String[] args) {
		CardGame999 cardgame = new CardGame999();
		cardgame.run();
	}

}

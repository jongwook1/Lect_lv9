package lv7;

import java.util.Random;
import java.util.Scanner;

class Card333 {
	private String shape;
	private int number;
	private boolean fliped;

	public String getShape() {
		return this.shape;
	}

	public int getNumber() {
		return this.number;
	}

	public boolean getFliped() {
		return this.fliped;
	}

	public void setCard(String shape, int number) {
		this.shape = shape;
		this.number = number;
	}

	public void setFliped(boolean fliped) {
		this.fliped = fliped;
	}

	public void printCard() {
		System.out.println(shape + " : " + number);
	}
}

class CardPlayer333 {
	Card333 card[] = new Card333[2]; // 한사람당 카드한쌍(2개)

}

class CardGame333 {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();

	private Card333 cards[] = new Card333[40];

	private CardPlayer333 cardPlayers[];

	private int players;
	private int turn;
	private int total[];
	private int winCnt[];

	public void setWinCnt(int arr[]) {
		this.winCnt = arr;
	}

	public void setTotal(int arr[]) {
		this.total = arr;
	}

	public int getPlayers() {
		return this.players;
	}

	public void setPlayer(int player) {
		this.players = player;
	}

	public int getTurn() {
		return this.turn;
	}

	public void setTurn(int turn) {
		this.turn = turn + 1;
	}

	private String shapeList[] = { "다이아", "하트", "스페이드", "클로버" };

	public void setGame() {
		System.out.println("참여인원");
		int num = sc.nextInt();

		if (num > 1) {
			this.setPlayer(num);
			this.cardPlayers = new CardPlayer333[this.getPlayers()];
			for (int i = 0; i < this.cardPlayers.length; i++) {
				this.cardPlayers[i] = new CardPlayer333();
			}
			this.setTotal(new int[this.getPlayers()]);
			this.setWinCnt(new int[this.getPlayers()]);
		}
		this.setTurn(1);
	}

	public void setCards() {
		int shape = 0;
		for (int i = 0; i < this.cards.length; i++) {
			this.cards[i] = new Card333();
			this.cards[i].setCard(this.shapeList[shape], i % 10 + 1);
			if (i % 10 == 9) {
				shape++;
			}
		}
		shuffle();
	}

	public void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int rN = rn.nextInt(this.cards.length);
			Card333 temp = cards[0];
			cards[0] = cards[rN];
			cards[rN] = temp;
		}
	}

	public void printWholeCards() {
		for (int i = 0; i < cards.length; i++) {
			System.out.printf("%s %d\n", this.cards[i].getShape(), this.cards[i].getNumber());
		}
	}

	public void flipCards() {
		this.cardPlayers[this.getTurn() - 1].card = new Card333[2];
		for (int i = 0; i < 2; i++) {
			this.cardPlayers[turn - 1].card[i] = new Card333();
		}
		this.total[this.getTurn() - 1] = 0;

		int n = 0;
		while (n < 2) {
			int r = rn.nextInt(this.cards.length);
			if (this.cards[r].getFliped()) // true 면 뽑힌카드이므로 continue해서 다시뽑기
				continue;
			this.cards[r].setFliped(true);

			this.cardPlayers[turn - 1].card[n].setCard(this.cards[r].getShape(), this.cards[r].getNumber());
			this.cardPlayers[turn - 1].card[n].printCard();
			this.total[turn - 1] += this.cards[r].getNumber();
			n++;
		}
		System.out.println("--------------");
		if (this.getTurn() == this.getPlayers()) {
			checkWin();
		}
		this.turn = this.getTurn() == this.getPlayers() ? 1 : ++this.turn;
//		this.setTurn(this.getTurn()==this.getPlayers() ? 1:++this.turn);

	}

	public boolean end() {
		if (this.getTurn() == 1) {
			int check = 0;
			for (int i = 0; i < this.cards.length; i++) {
				if (!this.cards[i].getFliped())
					check++;
			}
			if (check > this.getPlayers() * 2) {
				return true;
			}
		}
		return false;
	}

	public void checkWin() {
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

	public void finalWin() {
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

public class Ex07_카드게임_Review {

	public static void main(String[] args) {
		CardGame333 game = new CardGame333();
		game.run();

	}

}

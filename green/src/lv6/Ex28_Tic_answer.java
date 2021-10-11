package lv6;
/*틱택토
* === 틱택토 ===
* [X][X][O]
* [ ][O][ ]
* [ ][ ][ ]
* [p1]인덱스 입력 : 6
* === 틱택토 ===
* [X][X][O]
* [ ][O][ ]
* [O][ ][ ]
* [p1]승리
* 
*/

import java.util.Scanner;

class Tick1 {
	Scanner sc = new Scanner(System.in);
	final int size = 9;
	int game[] = new int[this.size];
	int turn = 1;
	int win = 0;
	int cnt = 0;
	int who;

	// 게임현황
	void printGame() {
		for (int i = 0; i < this.game.length; i++) {
			if (this.game[i] == 1) {
				System.out.print("O ");
			} else if (this.game[i] == 2) {
				System.out.print("X ");
			} else {
				System.out.print(i + 1 + " ");
			}
			if (i % 3 == 2) {
				System.out.println();
			}
		}
	}

	// 인덱스입력받기
	void inputIdx() {
		System.out.printf("플레이어%d 좌표입력: ", this.turn);
		int idx = sc.nextInt() - 1;
		if (this.game[idx] != 0) {
			System.out.println("이선좌");
		} else {
			this.game[idx] = turn;
			if (this.turn == 1) {
				this.turn++;
			} else {
				this.turn--;
			}
		}
		this.who = this.turn == 1 ? 2 : 1;
	}

	// 종료조건
	boolean end() {
		if (this.win == 1) {
			System.out.println("p1승");
			return false;
		} else if (this.win == 2) {
			System.out.println("p2승");
			return false;
		}
		return true;
	}

	// 가로세칸누가먹는지 확인하기
	void checkGaro() {
		for (int i = 0; i < this.game.length; i += 3) {
			int cnt = 0;
			for (int j = 0; j < 3; j++) {
				if (this.game[i + j] == this.who) {
					cnt++;
				}
			}
			if (cnt == 3)
				this.win = this.who;
		}
	}

	// 세로 세칸 누가먹는지 확인하기
	void checkSero() {
		for (int i = 0; i < 3; i++) {
			int cnt = 0;
			for (int j = 0; j < this.game.length; j += 3) {
				if (this.game[i + j] == this.who) {
					cnt++;
				}
			}
			if (cnt == 3)
				this.win = this.who;
		}
	}

	// \ 세칸 누가먹는지 확인하기
	void checkLDeagak() {
		int cnt = 0;
		for (int i = 0; i < this.game.length; i += 4) {
			if (this.game[i] == this.who)
				cnt++;
		}
		if (cnt == 3)
			this.win = this.who;

	}

	// \ 세칸 누가먹는지 확인하기
	void checkRDeagak() {
		int cnt = 0;
		for (int i = 2; i < this.game.length; i += 2) {
			if (this.game[i] == this.who)
				cnt++;
		}
		if (cnt == 3)
			this.win = this.who;
	}

	public void run() {
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

public class Ex28_Tic_answer {

	public static void main(String[] args) {
		Tick1 tick = new Tick1();
		tick.run();
	}

}

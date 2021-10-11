package lv6;
/*ƽ����
* === ƽ���� ===
* [X][X][O]
* [ ][O][ ]
* [ ][ ][ ]
* [p1]�ε��� �Է� : 6
* === ƽ���� ===
* [X][X][O]
* [ ][O][ ]
* [O][ ][ ]
* [p1]�¸�
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

	// ������Ȳ
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

	// �ε����Է¹ޱ�
	void inputIdx() {
		System.out.printf("�÷��̾�%d ��ǥ�Է�: ", this.turn);
		int idx = sc.nextInt() - 1;
		if (this.game[idx] != 0) {
			System.out.println("�̼���");
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

	// ��������
	boolean end() {
		if (this.win == 1) {
			System.out.println("p1��");
			return false;
		} else if (this.win == 2) {
			System.out.println("p2��");
			return false;
		}
		return true;
	}

	// ���μ�ĭ�����Դ��� Ȯ���ϱ�
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

	// ���� ��ĭ �����Դ��� Ȯ���ϱ�
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

	// \ ��ĭ �����Դ��� Ȯ���ϱ�
	void checkLDeagak() {
		int cnt = 0;
		for (int i = 0; i < this.game.length; i += 4) {
			if (this.game[i] == this.who)
				cnt++;
		}
		if (cnt == 3)
			this.win = this.who;

	}

	// \ ��ĭ �����Դ��� Ȯ���ϱ�
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

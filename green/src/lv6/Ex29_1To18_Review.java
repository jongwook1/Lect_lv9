package lv6;

import java.util.Random;
import java.util.Scanner;

class NumToNum9 {
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	int front[];
	int back[];
	int gameN = 1;
	int SIZE;

	public NumToNum9(int front[], int back[]) {
		this.front = front;
		this.back = back;
		this.SIZE = this.front.length;
	}

	public void setGameN() {
		this.gameN = this.getGameN() + 1;
	}

	public int getGameN() {
		return this.gameN;
	}

	public int getSize() {
		return this.SIZE;
	}

	public void inputData() {
		for (int i = 0; i < this.front.length; i++) {
			this.front[i] = i + 1;
			this.back[i] = i + 10;
		}
		shuffle();
	}

	public void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int rN = rn.nextInt(this.front.length);
			int temp = this.front[0];
			this.front[0] = this.front[rN];
			this.front[rN] = temp;

			int rN2 = rn.nextInt(this.back.length);
			int temp2 = this.back[0];
			this.back[0] = this.back[rN2];
			this.back[rN2] = temp2;

		}

	}

	public void printGame() {
		for (int i = 0; i < this.front.length; i++) {
			System.out.print(this.front[i] + " ");
			if (i % 3 == 2) {
				System.out.println();
			}
		}

	}

	public void mark() {
		System.out.println("제일 작은번호값의 인덱스(1부터시작) 입력해주세요");
		int idx = sc.nextInt() - 1;
		if (idx >= 0 && idx < this.front.length) {
			if (this.gameN == this.front[idx]) {
				this.front[idx] = this.back[idx];
				this.back[idx] = 0;
				this.gameN++;
			}
		}
	}

	public boolean end() {
		if (this.gameN > this.getSize() * 2) {
			System.out.println("모두 맞췄으므로 종료");
			return false;
		}
		return true;
	}

	public void run() {
		inputData();
		while (end()) {
			printGame();
			mark();
		}

	}

}

public class Ex29_1To18_Review {

	public static void main(String[] args) {
		int front[] = new int[9];
		int back[] = new int[front.length];

		NumToNum9 n = new NumToNum9(front, back);
		n.run();
	}

}

package lv6;

import java.util.Random;
import java.util.Scanner;

class Memory99999 {
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	private int front[];
	private int back[];
	private int cnt = 0;

	public int getCnt() {
		return this.cnt;
	}

	public void setCnt() {
		this.cnt = this.cnt + 1;
	}

	public Memory99999(int front[], int back[]) {
		this.front = front;
		this.back = back;

	}

	public void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int rN = rn.nextInt(this.front.length);
			int temp = front[0];
			front[0] = front[rN];
			front[rN] = temp;
		}
	}

	public void printGame() {
		for (int i = 0; i < this.front.length; i++) {
			System.out.print(i + 1 + " ");
		}
		System.out.println();
		for (int i = 0; i < front.length; i++) {
			System.out.print(front[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < back.length; i++) {
			System.out.print(back[i] + " ");
		}
	}

	public void play() {
		System.out.println("\n카드번호 압력1");
		int idx1 = sc.nextInt() - 1;
		System.out.println("카드번호 압력2");
		int idx2 = sc.nextInt() - 1;
		if (idx1 == idx2 || idx1 < 0 || idx1 >= this.front.length || idx2 < 0 || idx2 >= this.front.length) {
			System.out.println("카드번호 확인해주세요");
		} else if (this.front[idx1] == this.front[idx2] && this.back[idx1] == 0 & this.back[idx2] == 0) {

			this.back[idx1] = this.front[idx1];
			this.back[idx2] = this.front[idx2];
			this.setCnt();

		}
	}

	public boolean end() {
		if (this.getCnt() == 5) {
			System.out.println("모두맞췄으므로 종료!!");
			return false;
		}
		return true;

	}

	public void run() {
		shuffle();
		while (true) {
			if (end()) {
				printGame();
				play();
			} else {
				break;
			}
		}

	}

}

public class Ex26_memory_Review {

	public static void main(String[] args) {
		int front[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int back[] = new int[front.length];

		Memory99999 m = new Memory99999(front, back);
		m.run();

	}

}

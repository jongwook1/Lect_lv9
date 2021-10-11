package lv6;

import java.util.Scanner;

class Num777 {
	private int num;

	public Num777(int num) {
		this.num = num;
	}

	public int getNum() {
		return this.num;
	}
}

class Number777 { // 실행 클래스

	public static Scanner sc = new Scanner(System.in);

	private int cnt;
	private Num777 arr[] = null;

	public void run() {
		while (true) {
			printArr();
			printMenu();
			select();
		}
	}

	private void select() {
		int sel = sc.nextInt();

		if (sel == 1) {
			System.out.print("data: ");
			int data = sc.nextInt();

			addNum(data);
		}

	}

	private void addNum(int data) {
		Num777 temp[] = this.arr;
		this.arr = new Num777[this.cnt + 1];

		if (this.cnt > 0) {
			for (int i = 0; i < this.cnt; i++) {
				this.arr[i] = temp[i];
			}
		}

		this.arr[this.cnt] = new Num777(data);
		this.cnt++;
	}

	private void printMenu() {
		System.out.println("1. 추가 ");

	}

	private void printArr() {
		System.out.println("cnt : " + this.cnt);
		if (this.cnt > 0) {
			for (int i = 0; i < this.cnt; i++) {
				System.out.print(this.arr[i].getNum() + " ");
			}
			System.out.println();
		}
	}

}

public class Ex_카피타이핑 {
	public static void main(String[] args) {
		Number777 number = new Number777();
		number.run();
	}
}
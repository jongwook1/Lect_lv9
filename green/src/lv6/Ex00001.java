package lv6;

import java.util.Scanner;

class Num123 {
	private int num;

	public Num123(int num) {
		this.num = num;
	}

	public int getNum() {
		return this.num;
	}
}

class Number123 { // 실행 클래스

	public static Scanner sc = new Scanner(System.in);

	private int cnt;
	private Num123 arr[] = null;

	public void run() {
		select();
	}

	private void select() {
		while (true) {
			printArr();
			printMenu();
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.print("data: ");
				int data = sc.nextInt();

				addNum(data);
			} else if (sel == 2) {
				System.out.println("삽입할 위치");
				int idx = sc.nextInt();
				System.out.println("data");
				int data = sc.nextInt();

				insertNum(idx, data);
			} else if (sel == 3) {
				System.out.println("삭제할 인덱스");
				int delIdx = sc.nextInt();

				delIdx(delIdx);
			} else if (sel == 4) {
				System.out.println("---출력----");
				if (this.cnt > 0) {
					for (int i = 0; i < this.cnt; i++) {
						System.out.print(this.arr[i].getNum() + " ");
					}
					System.out.println();
				}
			} else if (sel == 5) {
				break;
			}

		}
	}

	private boolean end(boolean check) {
		if (check) {
			return true;
		}
		return false;
	}

	private void addNum(int data) {
		Num123 temp[] = this.arr;
		this.arr = new Num123[this.cnt + 1];

		if (this.cnt > 0) {
			for (int i = 0; i < this.cnt; i++) {
				this.arr[i] = temp[i];
			}
		}

		this.arr[this.cnt] = new Num123(data);
		this.cnt++;
	}

	private void insertNum(int idx, int data) {
		Num123 temp[] = this.arr;
		this.arr = new Num123[this.cnt + 1];

		if (idx >= 0 && idx < this.cnt) {
			for (int i = 0; i < temp.length; i++) {
				if (i < idx) {
					this.arr[i] = temp[i];
				} else {
					this.arr[i + 1] = temp[i];
				}
			}
			this.arr[idx] = new Num123(data);
			this.cnt++;
		}
	}

	private void delIdx(int delIdx) {
		if (this.cnt == 1) {
			this.arr = null;
		} else {
			Num123 temp[] = this.arr;
			this.arr = new Num123[this.cnt - 1];
			int idx = 0;
			for (int i = 0; i < temp.length; i++) {

				if (i != delIdx) {
					this.arr[idx] = temp[i];
					idx++;
				}
			}
		}
		this.cnt--;
	}

	private void printMenu() {

		System.out.println("1.추가 2.삽입 3.삭제 4.출력 5.종료");

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

public class Ex00001 {

	public static void main(String[] args) {

		Number123 number = new Number123();
		number.run();

	}

}

package lv6;

import java.util.Scanner;

class POS2 {
	Scanner sc = new Scanner(System.in);
	String menu[] = { "치즈버거", "한우버거", "치킨", "콜라" };
	int price[] = { 8000, 5000, 6500, 5800 };
	int choice[];

	int moneys[] = { 50000, 10000, 5000, 1000, 500, 100 };
	int charge[] = { 1, 1, 1, 5, 7, 10 };

	void print() {
		System.out.println("메뉴");
		for (int i = 0; i < this.menu.length; i++) {
			System.out.printf("%d)%s %d원\n", i + 1, this.menu[i], this.price[i]);
		}
		System.out.println("0)결제 하기");
		System.out.println("9)종료");
	}

	boolean select() {
		choice = new int[this.menu.length];

		while (true) {
			System.out.println("메뉴를 선택해주세요");
			int sel = sc.nextInt() - 1;
			for (int i = 0; i < choice.length; i++) {
				choice[sel]++;
			}
			if (sel == -1) {
				break;
			}
			if (sel == 8) {
				return false;
			}
		}
		return true;
	}

	int[] cal() {
		int result[] = new int[2];
		int sum = 0;
		for (int i = 0; i < this.choice.length; i++) {
			sum += this.choice[i] * this.price[i];
		}
		System.out.println("총 결제할 금액: " + sum + "원");
		System.out.println("1.현금\n 2.카드\n선택");
		int sel = sc.nextInt();

		if (sel == 1) {
			System.out.println("현금: ");
			int cash = sc.nextInt();
			if (cash >= sum) {
				result[0] = sum;
				result[1] = cash - sum;

				int extra = cash - sum;
				int temp[] = new int[this.charge.length];
				for (int i = 0; i < temp.length; i++) {
					temp[i] = this.charge[i];
				}
				for (int i = 0; i < this.moneys.length; i++) {
					if (extra >= this.moneys[i] && this.charge[i] > 0) {
						temp[i]--;
						extra -= this.moneys[i];
						i--;
					}
				}
				if (extra > 0) {
					System.out.println("잔돈 부족");
				} else {
					for (int i = 0; i < this.moneys.length; i++) {
						if (cash >= this.moneys[i]) {
							temp[i]++;
							cash -= this.moneys[i];
							i--;
						}
					}
					this.charge = temp;
				}

			} else {
				System.out.println("현금이 부족합니다");
			}

		} else if (sel == 2) {
			System.out.println("결제완료");
		}
		return result;

	}

	void recipe(int[] result) {
		System.out.println("---------영수증--------");
		for (int i = 0; i < this.choice.length; i++) {
			System.out.printf("%s %d개\n", this.menu[i], this.choice[i]);
		}
		System.out.println("--------");
		System.out.println("--총 금액: " + result[0] + "원");
		System.out.println("--거스름돈: " + result[1] + "원");
		System.out.println("--------");
	}

	public void run() {

		while (true) {
			print();
			if (select()) {
				recipe(cal());
			} else {
				break;
			}
		}

	}

}

public class Ex19_Review {

	public static void main(String[] args) {
		POS2 pos = new POS2();

		pos.run();

	}

}

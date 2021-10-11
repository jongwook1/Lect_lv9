package lv6;

import java.util.Scanner;

/*
 * # 영수증 출력하기 : 클래스[변수]
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 */

class BurgerShop {
	Scanner sc = new Scanner(System.in);

	private int total;
	private String menu[] = { "감버", "치버", "팬케이크", "콜라" };
	private int price[] = { 9000, 6000, 4000, 1500 };

	private int moneys[] = { 5000, 10000, 5000, 10000, 500, 100 };
	private int charges[] = { 1, 1, 1, 5, 7, 3 };
	private int choice[];

	public void printMenu() {
		System.out.println();
		for (int i = 0; i < this.menu.length; i++) {
			System.out.printf("%d) %s\t%d원\n", i + 1, this.menu[i], this.price[i]);
		}
		System.out.println("0) 결제하기");
		System.out.println("9) 종료");
	}

	public boolean selectMenu() {
		this.choice = new int[menu.length];
		while (true) {
			System.out.print("메뉴선택");
			int sel = sc.nextInt() - 1;
			if (sel >= 0 && sel < this.menu.length) {
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

	public int[] calculate() {
		int result[] = new int[2];
		int sum = 0;
		for (int i = 0; i < this.choice.length; i++) {
			sum += this.choice[i] * this.price[i];
		}
		System.out.println("총 결제 금액: " + sum + "원");

		System.out.println("1.현금\n 2.카드\n선택:");
		int sel = sc.nextInt();

		if (sel == 1) {
			System.out.println("현금");
			int cash = sc.nextInt();
			if (cash < sum) {
				System.out.println("현금부족");
			} else {
				result[0] = sum;
				result[1] = cash - sum;

				int extra = cash - sum;
				int temp[] = new int[this.charges.length];
				for (int i = 0; i < temp.length; i++) {
					temp[i] = this.charges[i];
				}
				for (int i = 0; i < this.moneys.length; i++) {
					if (extra >= this.moneys[i] && temp[i] > 0) {
						temp[i]--;
						extra -= this.moneys[i];
						i--;

					}

				}

				if (extra > 0) {
					System.out.println("잔돈이 부족합니다. 관리자에게 문의요망");
				} else {

					for (int i = 0; i < this.moneys.length; i++) {
						if (cash >= this.moneys[i]) {
							temp[i]++;
							cash -= this.moneys[i];
							i--;
						}
					}
					this.charges = temp;
				}
			}
		} else if (sel == 2) {
			System.out.println("결제완료");
		}
		return result;

	}

	public void printRecipe(int[] result) {
		System.out.println("-------영수증-------");
		for (int i = 0; i < this.choice.length; i++) {
			if (this.choice[i] > 0)
				System.out.printf("%s\t%d개\n", this.menu[i], this.choice[i]);
		}
		System.out.println("----------");
		System.out.println("총 금액: " + result[0] + "원");
		System.out.println("거스름돈: " + result[1] + "원");
		System.out.println("----------");
	}

	public void run() {
		while (true) {
			for (int i = 0; i < this.charges.length; i++) {
				System.out.print(this.charges[i] + " ");
			}
			printMenu();
			if (selectMenu()) {
				printRecipe(calculate());
			} else {
				break;
			}

		}

	}

}

public class Ex19_R {

	public static void main(String[] args) {
		BurgerShop moms = new BurgerShop();

		moms.run();

	}

}

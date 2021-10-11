package lv6;

import java.util.Scanner;

/*
 * # ������ ����ϱ� : Ŭ����[����]
 * 1. �ܹ��� �ֹ��� �޾� �������� ����Ѵ�.
 * 2. ��³����� �� �޴��� �ֹ� ������ �� �ݾ� �� �ܵ��� ǥ���Ѵ�.
 */

class BurgerShop {
	Scanner sc = new Scanner(System.in);

	private int total;
	private String menu[] = { "����", "ġ��", "������ũ", "�ݶ�" };
	private int price[] = { 9000, 6000, 4000, 1500 };

	private int moneys[] = { 5000, 10000, 5000, 10000, 500, 100 };
	private int charges[] = { 1, 1, 1, 5, 7, 3 };
	private int choice[];

	public void printMenu() {
		System.out.println();
		for (int i = 0; i < this.menu.length; i++) {
			System.out.printf("%d) %s\t%d��\n", i + 1, this.menu[i], this.price[i]);
		}
		System.out.println("0) �����ϱ�");
		System.out.println("9) ����");
	}

	public boolean selectMenu() {
		this.choice = new int[menu.length];
		while (true) {
			System.out.print("�޴�����");
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
		System.out.println("�� ���� �ݾ�: " + sum + "��");

		System.out.println("1.����\n 2.ī��\n����:");
		int sel = sc.nextInt();

		if (sel == 1) {
			System.out.println("����");
			int cash = sc.nextInt();
			if (cash < sum) {
				System.out.println("���ݺ���");
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
					System.out.println("�ܵ��� �����մϴ�. �����ڿ��� ���ǿ��");
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
			System.out.println("�����Ϸ�");
		}
		return result;

	}

	public void printRecipe(int[] result) {
		System.out.println("-------������-------");
		for (int i = 0; i < this.choice.length; i++) {
			if (this.choice[i] > 0)
				System.out.printf("%s\t%d��\n", this.menu[i], this.choice[i]);
		}
		System.out.println("----------");
		System.out.println("�� �ݾ�: " + result[0] + "��");
		System.out.println("�Ž�����: " + result[1] + "��");
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

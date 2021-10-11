package lv6;

import java.util.Scanner;

class POS {
	Scanner sc = new Scanner(System.in);

	int total;
	String menu[] = { "������ũ����", "ġ�����", "�ؽ���������", "�ݶ�" };
	int price[] = { 9000, 6000, 4000, 1500 };

	int moneys[] = { 50000, 10000, 5000, 1000, 500, 100 };
	int charges[] = { 1, 1, 1, 5, 7, 3 };
	int choice[]; // count �뵵

	void printMenu() {
		System.out.println();
		for (int i = 0; i < this.menu.length; i++) {
			System.out.printf("%d) %s\t%d��\n", i + 1, this.menu[i], this.price[i]);
		}
		System.out.println("0) �����ϱ�");
		System.out.println("9) ����");
	}

	boolean selectMenu() {
		choice = new int[menu.length];
		while (true) {
			System.out.print("�޴�����: ");
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

	int[] calculate() {
		int result[] = new int[2];
		int sum = 0;
		for (int i = 0; i < this.choice.length; i++) {
			sum += this.choice[i] * this.price[i];
		}
		System.out.println("�� ������ �ݾ�: " + sum + "��");

		System.out.println("1.����\n2.ī��\n����:");
		int sel = sc.nextInt();

		if (sel == 1) {
			System.out.println("����: ");
			int cash = sc.nextInt();
			if (cash < sum) {
				System.out.println("������ �����մϴ�");

			} else {
				result[0] = sum;
				result[1] = cash - sum;

				// POS�� ���� ���� ����
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
			System.out.println("�����Ϸ�!");
		}

		return result;
	}

	void printRecipe(int[] result) {
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
			for (int i = 0; i < this.moneys.length; i++) {				
				System.out.print(this.moneys[i]+" ");				
			}
			System.out.println();
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

public class Ex19_answer {

	public static void main(String[] args) {
		POS pos = new POS();
		pos.run();

	}

}

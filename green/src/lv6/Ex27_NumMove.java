package lv6;

import java.util.Scanner;

/*
 * # ���� �̵��ϱ� : Ŭ���� + �޼���
 * 1. ���� 8�� ĳ�����̴�.
 * 2. ���� 1�� �Է��ϸ�, ĳ���Ͱ� �������� �̵��Ѵ�.
 * 3. ���� 2�� �Է��ϸ�, ĳ���Ͱ� �����������̵��Ѵ�.
 * 4. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
* 5. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
* 6. �¿� ���� �������� �� ������ �߻����� �ʵ��� ����ó���� ���ش�.
 */
class NumMove {
	Scanner sc = new Scanner(System.in);
	int[] game = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };
	int pIdx = -1;

	void printGame() {
		for (int i = 0; i < this.game.length; i++) {
			if (this.game[i] == 0) {
				System.out.print("_");
			} else if (this.game[i] == 1) {
				System.out.print("|");
			} else if (this.game[i] == 2) {
				System.out.print("��");
				this.pIdx = i;
			}
		}
	}

	void sel() {
		System.out.println("\n1.�� 2.�� 3.����");
		int move = sc.nextInt();
		if (move == 1) {
			walkLeft();

		} else if (move == 2) {
			walkRight();
		} else if (move == 3) {
			defeat();

		}

	}

	// �̵�
	void walkLeft() {
		if (this.pIdx - 1 >= 0 && this.game[this.pIdx - 1] != 1) {
			this.game[this.pIdx] = 0;
			this.pIdx--;
			this.game[this.pIdx] = 2;
		}
	}

	void walkRight() {
		if (this.pIdx + 1 < this.game.length && this.game[this.pIdx + 1] != 1) {
			this.game[this.pIdx] = 0;
			this.pIdx++;
			this.game[this.pIdx] = 2;
		}
	}

	// ������
	void defeat() {

		if (this.pIdx - 1 >= 0 && game[this.pIdx - 1] == 1) {
			game[this.pIdx - 1] = 0;
			System.out.println("����");
		} else if (this.pIdx + 1 < this.game.length && game[this.pIdx + 1] == 1) {
			game[this.pIdx + 1] = 0;
			System.out.println("����");
		}

	}

	public void run() {

		while (true) {
			printGame();
			sel();

		}
	}

}

public class Ex27_NumMove {

	public static void main(String[] args) {
		NumMove numMove = new NumMove();
		numMove.run();
	}
}

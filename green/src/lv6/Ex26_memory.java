package lv6;
/*
 * # ���� ���� : Ŭ���� + �޼���
 * 1. front �迭 ī�� 10���� ���´�.
 * 2. front �迭���� ���� ī�带 ��� ī���� ��ġ�� �Է��Ѵ�.
 * 3. ������ 2���� ī�尡 ���� ī���̸�, back �迭�� ǥ���Ѵ�.
 * 4. ��� ī�尡 ��������(back�迭�� 0�� �������) ������ ����ȴ�. 
 */

import java.util.Random;
import java.util.Scanner;

class Memory2 {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);

	int front[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	int back[] = new int[this.front.length];
	int cnt = 0;

	// ����
	void suffle() {
		int i = 0;
		while (i < 1000) {
			int rN = ran.nextInt(10);
			int temp = this.front[0];
			this.front[0] = this.front[rN];
			this.front[rN] = temp;
			i++;
		}
	}

	// ī����Ȳ���
	void printCard() {
		System.out.print("ī���ȣ ");
		for (int i = 0; i < this.front.length; i++) {
			System.out.print(i + 1 + " ");
		}
		System.out.println();
		System.out.print("ī�� �� ");
		for (int i = 0; i < this.front.length; i++) {
			System.out.print(this.front[i] + " ");
		}
		System.out.println();
		System.out.print("���� ī�� ");
		for (int i = 0; i < this.front.length; i++) {
			System.out.print(this.back[i] + " ");
		}
	}

	// ��������
	void play() {
		System.out.println("\nī���ȣ �Է�1");
		int idx1 = sc.nextInt() - 1;
		System.out.println("ī���ȣ �Է�2");
		int idx2 = sc.nextInt() - 1;

		if (idx1 == idx2 || idx1 < 0 || idx1 >= this.front.length || idx2 < 0 || idx2 >= this.front.length) {
			System.out.println("ī���ȣ Ȯ�����ּ���");
		} else {
			if (this.front[idx1] == this.front[idx2] && this.back[idx1] == 0) {
				System.out.println("����");
				this.back[idx1] = this.front[idx1];
				this.back[idx2] = this.front[idx2];
				this.cnt++;
			}
		}
	}

	// ����
	boolean end() {
		if (this.cnt == 5) {
			System.out.println("��θ������Ƿ� ����!");
			return false;
		}
		return true;
	}

	public void run() {
		suffle();
		while (true) {
			if (end()) {
				printCard();
				play();
			} else {
				break;
			}
		}
	}

}

public class Ex26_memory {

	public static void main(String[] args) {
		Memory2 memory2 = new Memory2();
		memory2.run();

	}

}

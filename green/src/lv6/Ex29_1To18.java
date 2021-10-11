package lv6;

import java.util.Random;
import java.util.Scanner;

//1 to 50
/* 
 * # 1 to 50[3�ܰ�] : 1 to 18
 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
 * 4. ���� 1~9�� front �迭�� �����ϰ�,
 *    ���� 10~18�� back �迭�� �����Ѵ�.
 */
class NumToNum {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	final int size = 9;
	int front[] = new int[size];
	int back[] = new int[size];
	int gameN = 1;

	// front�迭,back�迭�� ���ֱ�
	void inputN() {
		for (int i = 0; i < this.front.length; i++) {
			this.front[i] = i + 1;
			this.back[i] = i + 10;
		}
	}

	// ����
	void FrontSuffle() {
		for (int i = 0; i < 1000; i++) {
			int rN = ran.nextInt(this.size);
			int temp = this.front[0];
			this.front[0] = this.front[rN];
			this.front[rN] = temp;
		}
	}

	void BackSuffle() {
		for (int i = 0; i < 1000; i++) {
			int rN = ran.nextInt(this.size);
			int temp = this.back[0];
			this.back[0] = this.back[rN];
			this.back[rN] = temp;
		}
	}

	// ��Ȳ���
	void printGame() {
		for (int i = 0; i < this.front.length; i++) {
			System.out.print(this.front[i] + " ");
			if (i % 3 == 2) {
				System.out.println();
			}
		}
	}

	// ��������
	void play() {
		System.out.println("����������ȣ���� �ε���(1���ͽ���) �Է����ּ���");
		int idx = sc.nextInt() - 1;

		if (idx >= 0 && idx < this.size) {
			if (this.front[idx] == this.gameN) {
				this.front[idx] = this.back[idx];
				this.back[idx] = 0;
				this.gameN++;
			}
		}
	}

	// ��������
	boolean end() {
		if (this.gameN > this.size * 2) {
			System.out.println("��θ������Ƿ� ����!");
			return false;
		}
		return true;
	}
	//

	public void run() {
		inputN();
		FrontSuffle();
		BackSuffle();
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

public class Ex29_1To18 {

	public static void main(String[] args) {
		NumToNum ntn = new NumToNum();
		ntn.run();

	}

}

package lv6;

import java.util.Random;

class Test99 {
	Random rn = new Random();
	int[] answer = { 1, 3, 4, 2, 5 }; // ������
	int[] hgd = new int[5]; // �л����

	int cnt = 0; // ���� ���� ����
	int score = 0; // ����

	void setHgd() {
		for (int i = 0; i < this.hgd.length; i++) {
			int rN = rn.nextInt(5) + 1;
			hgd[i] = rN;
		}
	}

	void checkAnswer() {
		for (int i = 0; i < this.hgd.length; i++) {
			if (this.answer[i] == this.hgd[i]) {
				System.out.print("O ");
			} else {
				System.out.print("X ");
			}
		}
		System.out.println();
		for (int i = 0; i < this.answer.length; i++) {
			if (this.answer[i] == this.hgd[i]) {
				this.score += 20;
				this.cnt++;
			}
		}
	}

	void print() {
		System.out.printf("���ᰳ��: %d ����: %d", this.cnt, this.score);
	}

	void run() {
		setHgd();
		checkAnswer();
		print();
	}
}

/*
 * # OMRī�� : Ŭ���� + ����
 * 1. �迭 answer�� ���蹮���� �������̴�.
 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
 * 4. �� ������ 20���̴�.
 * ��)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * ����ǥ     = {O, X, O, X, X}
 * ����        = 40��
 */


public class Ex05_Omr_Review {

	public static void main(String[] args) {
		Test99 t = new Test99();
		t.run();

	}

}

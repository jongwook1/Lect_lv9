package lv6;
/*
 * # OMRī�� : Ŭ���� + �޼���
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
import java.util.Random;

class OMR2 {
	Random ran = new Random();
	int answer[] = { 1, 2, 3, 2, 5 };
	int hgd[] = new int[answer.length];

	int cnt = 0;
	int score = 0;

	// ����
	void save() {
		for (int i = 0; i < this.answer.length; i++) {
			int rN = ran.nextInt(5) + 1;
			hgd[i] = rN;
		}
	}

	// ��
	void check() {
		for (int i = 0; i < this.hgd.length; i++) {
			if (this.answer[i] == this.hgd[i]) {
				System.out.print("O ");
				score += 20;
			} else {
				System.out.print("X ");
			}
		}
		System.out.println();
	}

	// �������
	void printScore() {
		System.out.println("����: " + score);
	}

	public void run() {
		save();
		check();
		printScore();

	}

}

public class Ex24_OMR2 {

	public static void main(String[] args) {
		OMR2 omr = new OMR2();
		omr.run();

	}

}

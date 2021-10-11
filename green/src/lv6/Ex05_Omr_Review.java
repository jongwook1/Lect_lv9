package lv6;

import java.util.Random;

class Test99 {
	Random rn = new Random();
	int[] answer = { 1, 3, 4, 2, 5 }; // 시험답안
	int[] hgd = new int[5]; // 학생답안

	int cnt = 0; // 정답 맞춘 개수
	int score = 0; // 성적

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
		System.out.printf("맞춘개수: %d 성적: %d", this.cnt, this.score);
	}

	void run() {
		setHgd();
		checkAnswer();
		print();
	}
}

/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */


public class Ex05_Omr_Review {

	public static void main(String[] args) {
		Test99 t = new Test99();
		t.run();

	}

}

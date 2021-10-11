package lv6;
/*
 * # OMR카드 : 클래스 + 메서드
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
import java.util.Random;

class OMR2 {
	Random ran = new Random();
	int answer[] = { 1, 2, 3, 2, 5 };
	int hgd[] = new int[answer.length];

	int cnt = 0;
	int score = 0;

	// 저장
	void save() {
		for (int i = 0; i < this.answer.length; i++) {
			int rN = ran.nextInt(5) + 1;
			hgd[i] = rN;
		}
	}

	// 비교
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

	// 성적출력
	void printScore() {
		System.out.println("성적: " + score);
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

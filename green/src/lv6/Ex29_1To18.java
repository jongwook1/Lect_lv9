package lv6;

import java.util.Random;
import java.util.Scanner;

//1 to 50
/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */
class NumToNum {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	final int size = 9;
	int front[] = new int[size];
	int back[] = new int[size];
	int gameN = 1;

	// front배열,back배열에 값넣기
	void inputN() {
		for (int i = 0; i < this.front.length; i++) {
			this.front[i] = i + 1;
			this.back[i] = i + 10;
		}
	}

	// 셔플
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

	// 현황출력
	void printGame() {
		for (int i = 0; i < this.front.length; i++) {
			System.out.print(this.front[i] + " ");
			if (i % 3 == 2) {
				System.out.println();
			}
		}
	}

	// 게임진행
	void play() {
		System.out.println("제일작은번호값의 인덱스(1부터시작) 입력해주세요");
		int idx = sc.nextInt() - 1;

		if (idx >= 0 && idx < this.size) {
			if (this.front[idx] == this.gameN) {
				this.front[idx] = this.back[idx];
				this.back[idx] = 0;
				this.gameN++;
			}
		}
	}

	// 종료조건
	boolean end() {
		if (this.gameN > this.size * 2) {
			System.out.println("모두맞췄으므로 종료!");
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

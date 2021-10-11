package lv6;
/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

import java.util.Random;
import java.util.Scanner;

class Memory2 {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);

	int front[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	int back[] = new int[this.front.length];
	int cnt = 0;

	// 셔플
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

	// 카드현황출력
	void printCard() {
		System.out.print("카드번호 ");
		for (int i = 0; i < this.front.length; i++) {
			System.out.print(i + 1 + " ");
		}
		System.out.println();
		System.out.print("카드 값 ");
		for (int i = 0; i < this.front.length; i++) {
			System.out.print(this.front[i] + " ");
		}
		System.out.println();
		System.out.print("게임 카드 ");
		for (int i = 0; i < this.front.length; i++) {
			System.out.print(this.back[i] + " ");
		}
	}

	// 게임진행
	void play() {
		System.out.println("\n카드번호 입력1");
		int idx1 = sc.nextInt() - 1;
		System.out.println("카드번호 입력2");
		int idx2 = sc.nextInt() - 1;

		if (idx1 == idx2 || idx1 < 0 || idx1 >= this.front.length || idx2 < 0 || idx2 >= this.front.length) {
			System.out.println("카드번호 확인해주세요");
		} else {
			if (this.front[idx1] == this.front[idx2] && this.back[idx1] == 0) {
				System.out.println("정답");
				this.back[idx1] = this.front[idx1];
				this.back[idx2] = this.front[idx2];
				this.cnt++;
			}
		}
	}

	// 종료
	boolean end() {
		if (this.cnt == 5) {
			System.out.println("모두맞췄으므로 종료!");
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

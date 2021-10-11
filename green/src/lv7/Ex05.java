package lv7;

import java.util.Random;

//경마

class Horse {
	// 경주마 한 마리
	int move;
	int rank;

}

class Racing {
	Random ran = new Random();
	// 게임 구현
	int map[][] = new int[5][20];
	Horse horse[] = new Horse[5];
	int mal = 1;
	int max = 20;
	int n = 1;

	void ready() {

		for (int i = 0; i < horse.length; i++) {
			map[i][0] = mal;
			printGame();
		}
	}

	void horseSet() {
		for (int i = 0; i < horse.length; i++) {

			horse[i] = new Horse();

		}
	}

	void printGame() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == mal) {
					System.out.print("말 ");
				} else {
					System.out.print("_ ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	boolean end() {
		if (n > horse.length) {
			return false;
		} else {
			return true;
		}
	}

	void printRank() {
		for (int i = 0; i < horse.length; i++) {
			System.out.printf("%d번째말 의 랭크:%d  ", i, horse[i].rank);
		}
	}

	void jump() {
		boolean goal = false;
		for (int i = 0; i < horse.length; i++) {
			if (horse[i].move < max - 1) {
				int jump = ran.nextInt(4) + 1;
				int xx = horse[i].move + jump;

				if (xx < max - 1) {
					map[i][horse[i].move] = 0;
					horse[i].move = xx;
				} 
				// goal
				else {
					// exception 동시도착 예외처리
					if (goal) {
						i--;
						break;
					} else {
						map[i][horse[i].move] = 0;
						horse[i].move = max - 1;
						goal = true;
						horse[i].rank = n;
						n++;
					}
				}
				map[i][horse[i].move] = mal;
			}
		}
		try {
			Thread.sleep(300);
		} catch (Exception e) {
		}

	}

	void run() {
		ready();
		horseSet();
		while (true) {
			if (end()) {
				jump();
				printGame();
			} else {
				printRank();
				break;
			}
		}
	}
}

public class Ex05 {

	public static void main(String[] args) {

		Racing game = new Racing();
		game.run();

	}

}

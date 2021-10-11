package lv7;

import java.util.Random;

class Horse333 {
	// 경주마 한 마리
	private int move;
	private int rank;
	private int n;

	public Horse333(int n) {
		this.n = n;
		System.out.println(n + "번 경주마탄생");
	}

	public int getMove() {
		return this.move;
	}

	public int getRank() {
		return this.rank;
	}

	public int getN() {
		return this.n;
	}

	public void setMove(int m) {
		this.move = m;
	}

	public void setRank(int r) {
		this.rank = r;
	}

}

class Racing333 {
	// 게임 구현
	Random rn = new Random();
	private Horse333 horse[] = new Horse333[5];
	private int map[][] = new int[5][20];

	private int mal = 1;
	private int max = 20;
	private int number = 1;

	public int getMal() {
		return this.mal;
	}

	public int getMax() {
		return this.max;
	}

	public int getN() {
		return this.number;
	}

	public void addSetN(int n) {
		this.number = n + 1;
	}

	public void ready() {
		for (int i = 0; i < map.length; i++) {
			map[i][0] = this.getMal();
		}

	}

	public void printGame() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 0) {
					System.out.print("_ ");
				} else if (map[i][j] == this.getMal()) {
					System.out.print(horse[i].getN() + "번말 ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void horseSet() {
		for (int i = 0; i < horse.length; i++) {
			horse[i] = new Horse333(i + 1);
		}
	}

	public boolean end() {
		if (this.getN() > horse.length) {
			return true;
		} else {
			return false;
		}
	}

	public void printRank() {
		for (int i = 0; i < horse.length; i++) {
			System.out.printf("%d번말의 랭크 : %d ", horse[i].getN(), horse[i].getRank());
		}
	}

	public void move() {
		boolean goal = false;
		for (int i = 0; i < horse.length; i++) {
			if (horse[i].getMove() < this.getMax() - 1) {
				int jump = rn.nextInt(4) + 1;
				int xx = jump + horse[i].getMove();

				if (xx < this.getMax() - 1) { // 골라인 도착안한말들
					map[i][horse[i].getMove()] = 0;
					horse[i].setMove(xx);
				}
				// 골라인 도착
				else {
					// 동시도착 예외처리
					if (goal) {
						i--;
						break;
					} else {
						map[i][horse[i].getMove()] = 0;
						horse[i].setMove(getMax() - 1);
						goal = true;
						horse[i].setRank(getN());
						this.addSetN(number);
					}
				}
				map[i][horse[i].getMove()] = mal;
			}

		}

		try {
			Thread.sleep(400);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		ready();
		horseSet();
		while (true) {
			if (!end()) {
				move();
				printGame();
			} else {
				printRank();
				break;
			}
		}

	}

}

public class Ex05_경마_Review {

	public static void main(String[] args) {
		Racing333 game = new Racing333();
		game.run();

	}

}

package lv7;

//시작 14:30
//종료 15:20
//소요 00:50
import java.util.Random;

class Horse999 {
	// 경주마 한 마리
	private int move;
	private int rank;

	// getter
	int getMove() {
		return this.move;
	}

	int getRank() {
		return this.rank;
	}

	// setter
	void setMove(int move) {
		this.move = move;
	}

	void setRank(int rank) {
		this.rank = rank;
	}

}

class Racing999 {
	Random rn = new Random();
	Horse999 horse[] = new Horse999[5];
	int map[][] = new int[5][20];

	int mal = 1;
	int max = 20;
	int n = 1;

	// getter
	int getMal() {
		return this.mal;
	}

	int getMax() {
		return this.max;
	}

	int getN() {
		return this.n;
	}

	// setter
//	void setMal(int mal) {
//		this.mal=mal;
//	}
//	void setMax(int max) {
//		this.max=max;
//	}
	void addSetN(int n) {
		this.n = n + 1;
	}

	void ready() {
		for (int i = 0; i < map.length; i++) {
			map[i][0] = this.getMal();
		}
		printGame();
	}

	void horseSet() {
		for (int i = 0; i < horse.length; i++) {
			horse[i] = new Horse999();
		}
	}

	void printGame() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == this.getMal()) {
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
			System.out.printf("%d번째말 의 랭크 : %d  ", i, horse[i].getRank());
		}
	}

	void jump() {
		boolean goal = false;

		for (int i = 0; i < horse.length; i++) {
			if (horse[i].getMove() < this.getMax() - 1) {
				int jump = rn.nextInt(4) + 1;
				int xx = horse[i].getMove() + jump;

				if (xx < this.getMax() - 1) {		//골라인 도착안한말들
					map[i][horse[i].getMove()] = 0;	//원래있던곳
					horse[i].setMove(xx);			//이동한곳
				}
				// goal
				else {
					// exception 동시도착 예외처리
					if (goal) {
						i--;
						break;
					} else {
						map[i][horse[i].getMove()] = 0;
						horse[i].setMove(getMax() - 1);
						goal = true;
						horse[i].setRank(getN());
						this.addSetN(n);
					}
				}
				map[i][horse[i].getMove()] = mal;
			}
		}
		try {
			Thread.sleep(400);
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

public class Lv7_test5_직접구현_경마 {

	public static void main(String[] args) {
		Racing999 racing = new Racing999();
		racing.run();

		// TODO Auto-generated method stub

	}

}

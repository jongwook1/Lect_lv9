package lv8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

class Tictactoe9 {

	Scanner sc = new Scanner(System.in);

	ArrayList<Vector<Integer>> tic = new ArrayList<>();
	int turn = 1;
	int win = 0;

	private void setGame() {
		for (int i = 0; i < 3; i++) {
			Vector<Integer> temp = new Vector<Integer>();
			for (int j = 0; j < 3; j++) {
				temp.add((Integer) 0);

			}
			tic.add(temp);
		}

	}

	private void printGame() {
		for (int i = 0; i < tic.size(); i++) {
			System.out.println(tic.get(i));
		}

	}

	private void input() {
		while (true) {
			System.out.printf("p%d Y:", turn);
			int y = sc.nextInt();
			System.out.printf("p%d X:", turn);
			int x = sc.nextInt();

			if (y < 0 || y >= tic.size() || x < 0 || x >= tic.get(0).size() || this.tic.get(y).get(x) != 0)
				continue;

			tic.get(y).set(x, turn);
			break;
		}
	}

	private boolean end() {
		if (win == 0) {
			return true;
		} else {
			return false;
		}
	}

	private void chekGaro() {
		for (int i = 0; i < tic.size(); i++) {
			int cnt = 0;
			for (int j = 0; j < tic.get(i).size(); j++) {
				if (tic.get(i).get(j) == this.turn)
					cnt++;
			}
			if (cnt == 3)
				this.win = turn;
		}
	}

	private void checkSero() {
		for (int i = 0; i < tic.size(); i++) {
			int cnt = 0;
			for (int j = 0; j < tic.get(i).size(); j++) {
				if (tic.get(j).get(i) == turn)
					cnt++;
			}
			if (cnt == 3)
				win = turn;
		}

	}

	private void checkDeagakL() {
		int cnt = 0;
		for (int i = 0; i < tic.size(); i++) {
			if (tic.get(i).get(i) == turn)
				cnt++;
		}
		if (cnt == 3)
			win = turn;

	}

	private void checkDeagakR() {
		int cnt = 0;
		for (int i = 0; i < tic.size(); i++) {

			if (tic.get(i).get(this.tic.get(i).size() - i - 1) == turn)
				cnt++;
		}
		if (cnt == 3)
			win = turn;
	}

//	void p() {
//		System.out.println(tic.size());			//3
//		for(int i=0;i<tic.size();i++) {			
//				System.out.print(tic.get(i).size());			//3
//			
//		}
//	}

	private void chageTurn() {
		this.turn = this.turn == 1 ? 2 : 1;
	}

	public void run() {
		setGame();
//		p();
		boolean check = true;
		while (check) {
			if (end()) {
				printGame();
				input();
				chekGaro();
				checkSero();
				checkDeagakL();
				checkDeagakR();
				chageTurn();
			} else {
				System.out.printf("p%d win!!", win);
				check = false;
			}

		}
	}

}

public class Ex07 {

	public static void main(String[] args) {
		Tictactoe9 game = new Tictactoe9();
		game.run();

	}

}

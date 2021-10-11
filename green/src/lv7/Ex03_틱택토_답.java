package lv7;

import java.util.Scanner;

class Tic {
	boolean check;
	int owner;		

}

class Tictactoe {
	// °ÔÀÓ ±¸Çö
	Scanner sc=new Scanner(System.in);
	Tic tic[]=new Tic[9];
	int game[]=new int[9];
	int turn=1;
	int who=0;
	int win=0;
	void printGame() {
		for (int i = 0; i < this.game.length; i++) {
			if (this.tic[i].owner == 1) {
				System.out.print("O ");
			} else if (this.tic[i].owner == 2) {
				System.out.print("X ");
			} else {
				System.out.print(i + 1 + " ");
			}
			if (i % 3 == 2) {
				System.out.println();
			}
		}
	}
	
	void inputIdx() {
		System.out.printf("ÇÃ·¹ÀÌ¾î%d ÁÂÇ¥ÀÔ·Â: ", this.turn);
		int idx = sc.nextInt() - 1;
		
		if (tic[idx].check == true) {
			System.out.println("ÀÌ¼±ÁÂ");
		} else {
			this.tic[idx].owner = turn;
			tic[idx].check=true;
			if (this.turn == 1) {
				this.turn++;
			} else {
				this.turn--;
			}
		}
		for(int i=0;i<tic.length;i++) {
		this.who = this.turn == 1 ? 2 : 1;
		}
	}
	
	boolean end() {
		if (this.win == 1) {
			System.out.println("p1½Â");
			return false;
		} else if (this.win == 2) {
			System.out.println("p2½Â");
			return false;
		}
		return true;
	}
	
	
	void checkGaro() {
		for (int i = 0; i < this.game.length; i += 3) {
			int cnt = 0;
			for (int j = 0; j < 3; j++) {
				if (this.tic[i + j].owner == this.who) {
					cnt++;
				}
			}
			if (cnt == 3) {
				this.win = this.who;			
			}
		}
	}
	
	void checkSero() {
		for (int i = 0; i < 3; i++) {
			int cnt = 0;
			for (int j = 0; j < this.game.length; j += 3) {
				if (this.tic[i + j].owner == this.who) {
					cnt++;
				}
			}
			if (cnt == 3)
				this.win = this.who;
		}
	}
	
	void checkLDeagak() {
		int cnt = 0;
		for (int i = 0; i < this.game.length; i += 4) {
			if (this.tic[i].owner == this.who)
				cnt++;
		}
		if (cnt == 3)
			this.win = this.who;

	}
	
	void checkRDeagak() {
		int cnt = 0;
		for (int i = 2; i < this.game.length; i += 2) {
			if (this.tic[i].owner == this.who)
				cnt++;
		}
		if (cnt == 3)
			this.win = this.who;
	}
	
	
	void setTictactoe() {
		for(int i=0;i<tic.length;i++) {
			tic[i]=new Tic();
		}
	}
	
//	void printGame() {
//		for (int i = 0; i < tic.length; i++) {
//			tic[i].printGame();
//		}
//		System.out.println();
//	}	

	public void run() {
		setTictactoe();
		while(true) {
		printGame();
		if (end()) {
			inputIdx();
			checkGaro();
			checkSero();
			checkLDeagak();
			checkRDeagak();
		} else {
			break;
		}
		}
		
	}

}
public class Ex03_Æ½ÅÃÅä_´ä {

	public static void main(String[] args) {
		
			Tictactoe ttt = new Tictactoe();
			ttt.run();
			

	}

}

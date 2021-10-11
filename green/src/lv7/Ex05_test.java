package lv7;

import java.util.Random;

class Horse99{
	String name = "";
	int pos = 0;
	int rank = 0;
	boolean win = false;
}

class Racing99{
	Random ran = new Random();
	int size = 4;
	Horse99[] horses = new Horse99[size];
	int line = 20;
	int track[][] = new int[size][line];
	
	void run() {
		String names = "abcd";
		for(int i = 0; i < size; i++) {
			horses[i] = new Horse99();
			horses[i].name = names.charAt(i) + "";
		}
		play();
		printHorse();
	}
	void printHorse() {
		System.out.println();
		for(int i = 0; i < size; i++) {
			for(int n = 0; n < line; n++) {
				if(horses[i].pos == n) {
					System.out.print("[" + horses[i].name + "]");
				}
				else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}
	}
	void play() {
		boolean loop = true;
		int cnt = 0;
		while(loop) {
			printHorse();
			for(int i = 0; i < size; i++) {
				if(horses[i].win == true) {
					continue;
				}
				int r = ran.nextInt(4)+1;
				horses[i].pos += r;
				if(horses[i].pos >= 19) {
					horses[i].pos = 19;
					horses[i].rank = cnt + 1;
					horses[i].win = true;
					cnt += 1;
					if(cnt >= size) {
						loop = false;
						break;
					}
				}
			}
			try {
				Thread.sleep(500);
			} 
			catch (Exception e) {
			}
		}
	}
}



public class Ex05_test {

	public static void main(String[] args) {
		Racing99 race = new Racing99();
		race.run();




	}

}

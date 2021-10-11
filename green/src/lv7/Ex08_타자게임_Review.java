package lv7;

import java.util.Random;
import java.util.Scanner;

class Word333 {
	private String word;

	public String getWord() {
		return this.word;
	}

	public void setWord(String word) {
		this.word = word;
	}

}

class WordSample333 {
	private String[] wordSampleList = { "java", "jsp", "python", "android", "spring" };

	public String getWordSampleList(int i) {
		return this.wordSampleList[i];
	}

	public int wordSampleListSize() {
		return this.wordSampleList.length;
	}
}

class WordGame333 {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();

	private WordSample333 sample = new WordSample333();
	private Word333 wordList[];
	private int size;

	private int score;
	private int cnt;

	public void setAddScore() {
		this.score += 20;
	}

	public void setMiScore() {
		this.score -= 5;
	}

	public int getScore() {
		return this.score;
	}

	public void setCnt() {
		this.cnt = this.cnt + 1;
	}

	public int getCnt() {
		return this.cnt;
	}

	public void setGame() {
		this.size = this.sample.wordSampleListSize();
		wordList = new Word333[this.size];

		int check[] = new int[this.size];

		for (int i = 0; i < this.size; i++) {
			wordList[i] = new Word333();

			int r = rn.nextInt(this.size);
			if (check[r] == 0) {
				wordList[i].setWord(this.sample.getWordSampleList(r));
				check[r] = 1;
			} else {
				i--;
			}

		}
	}

	public void printWords() {
		for (int i = 0; i < this.wordList.length; i++) {
			System.out.print(this.wordList[i].getWord() + " ");
		}
		System.out.println();
	}

	public String blindWord(String str) {
		String text = "";
		int r = rn.nextInt(str.length());

		for (int i = 0; i < str.length(); i++) {
			if (i != r) {
				text += str.charAt(i);
			} else {
				text += "*";
			}
		}
		return text;
	}

	public void quize() {
		for (int i = 0; i < this.wordList.length; i++) {
			String quize = blindWord(this.wordList[i].getWord());

			while (true) {
				System.out.println(quize);
				System.out.print("단어입력:");
				String answer = sc.next();
				if (answer.equals(this.wordList[i].getWord())) {
					this.setAddScore();
					this.setCnt();
					break;
				} else {
					this.setMiScore();
				}
			}

		}
		printResult();
	}

	private void printResult() {
		System.out.println(this.getScore());

	}

	boolean end() {
		if (this.getCnt() == 5) {
			return true;
		}
		return false;
	}

	void run() {
		setGame();
		while (!end()) {
			printWords();
			quize();
		}
	}
}

public class Ex08_타자게임_Review {

	public static void main(String[] args) {
		WordGame333 game = new WordGame333();
		game.run();

	}

}

package lv7;

import java.util.Random;
import java.util.Scanner;

class Word77 {
	Random ran = new Random();
	String word;
	int rN;

	void setWord(String sample) {
		word = sample;
		int r = ran.nextInt(word.length());
		rN = r;
	}

	void print() {
		for (int i = 0; i < word.length(); i++) {
			if (i == this.rN) {
				System.out.print("*");
			} else {
				System.out.print(word.charAt(i));
			}
		}
		System.out.println();
	}

}

class WordSample77 {
	Random ran = new Random();
	String[] wordSampleList = { "java", "jsp", "python", "android", "spring" };
	boolean checkList[] = new boolean[wordSampleList.length];

	String ranWord() {
		int r = 0;
		while (true) {
			r = ran.nextInt(wordSampleList.length);
			if (checkList[r] == false) {

				checkList[r] = true;
				break;
			}
		}
		return wordSampleList[r];
	}

}

class WordGame77 {
	Scanner sc = new Scanner(System.in);
	WordSample77 wordsample2 = new WordSample77();
	Word77 wordList2[] = new Word77[wordsample2.wordSampleList.length];

	void play() {

		for (int i = 0; i < wordList2.length; i++) {
			wordList2[i] = new Word77();
		}
		boolean run = true;
		int i = 0;
		while (run) {
			wordList2[i].setWord(wordsample2.ranWord());

			while (true) {

				wordList2[i].print();
				System.out.println("단어를 입력하세요");
				String inputWord = sc.next();
				if (inputWord.equals(wordList2[i].word)) {
					System.out.println("정답");
					i++;
					break;
				} else {
					System.out.println("땡");
				}
			}
			if (i == wordList2.length) {
				System.out.println("모두맞췄으므로 종료!");
				run = false;
			}
		}

	}

	void run() {
		play();
	}
}

public class Ex08_mtest {

	public static void main(String[] args) {
		WordGame77 game = new WordGame77();
		game.run();

	}

}

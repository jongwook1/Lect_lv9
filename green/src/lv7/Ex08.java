package lv7;
import java.util.Random;
import java.util.Scanner;

class Word99 {
	Random ran = new Random();
	String word;
	int rN;

	void setWord(String sample) {
		word = sample;
		int r = ran.nextInt(word.length());
		rN = r;
	}

	void printWord() {
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

class WordSample99 {
	Random ran = new Random();
	String[] wordSampleList = { "java", "jsp", "python", "android", "spring" };
	boolean checkList[] = new boolean[wordSampleList.length];

//	void printTest() {
//		for(int i=0;i<checkList.length;i++) {
//			System.out.println(checkList[i]);
//			}
//	}	
//    int cnt=wordSampleList.length;

	String ranWord() {
		int r = 0;
		while (true) {
			r = ran.nextInt(wordSampleList.length);
			if (checkList[r] == false) {
				checkList[r] = true;
//						cnt--;
				break;
			}
		}
		return wordSampleList[r];
	}

//    void shuffle() {
//    	for(int i=0;i<1000;i++) {
//    		int size=wordSampleList.length;
//    		int r=ran.nextInt(size);
//    		String temp=wordSampleList[0];
//    		wordSampleList[0]=wordSampleList[r];
//    		wordSampleList[r]=temp;    		
//    	}
//    }

}

class WordGame99 {
	Scanner sc = new Scanner(System.in);
	WordSample99 wordsample = new WordSample99();
	Word99 wordList[] = new Word99[wordsample.wordSampleList.length];

//	void set() {
//		for (int i = 0; i < wordList.length; i++) {
//			wordList[i] = new Word99();
//			System.out.println(words[i]);
//		}
//	}


	void play() {
		for (int i = 0; i < wordList.length; i++) {
			wordList[i] = new Word99();
		}
		boolean run = true;
		int i = 0;
		while (run) {
			wordList[i].setWord(wordsample.ranWord());
			while (true) {
				wordList[i].printWord();
				System.out.println("단어를 입력하세요");
				String inputWord = sc.next();
				if (inputWord.equals(wordList[i].word)) {
					System.out.println("정답");
					i++;
					break;
				} else {
					System.out.println("땡");
				}
			}
			if (i == wordList.length) {
				System.out.println("모두맞췄으므로 종료!");
				run = false;
			}

		}
	}

	void run() {
		play();
	}
}

public class Ex08 {

	public static void main(String[] args) {
		WordGame99 game = new WordGame99();
		game.run();

	}

}

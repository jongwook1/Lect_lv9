package lv7;

import java.util.Random;
import java.util.Scanner;

class Word88{
	Random ran = new Random();
	String word;
	int ranPos;
	
	void setRandomWordPos(String sample) {
		word = sample;
		int r = ran.nextInt(word.length());
		ranPos = r;
	}
	void printWord() {
		for(int i=0;i<word.length();i++) {
			if(i == ranPos) {
				System.out.print("*");
			}
			else {
				System.out.print(word.charAt(i));
			}
		}
		System.out.println();
	}
}

class WordSample88{
	Random ran = new Random();
	String[] wordSampleList = { "java", "jsp", "python", "android", "spring" };
	boolean[] checkList = new boolean[wordSampleList.length]; // 이미선택한단어 체크용
	int count = wordSampleList.length; // 단어 개수(게임종료용 카운드)
	
	String getRandomWord() {
		int r = 0;
		while(true) {
			r = ran.nextInt(wordSampleList.length);
			if(checkList[r] == false) {
				checkList[r] = true;
				count -= 1;
				break;
			}
		}
		return wordSampleList[r];
	}
}
public class Ex08_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		WordSample88 wSample = new WordSample88();
		Word88[] wordList = new Word88[wSample.wordSampleList.length];
		
		for(int i=0;i<wordList.length;i++) {
			wordList[i] = new Word88();
		}
		
		boolean run = true;
		
		long beforeTime = System.currentTimeMillis();	// 코드실행전에 시간 받아오기
		
		while(run) {
			wordList[0].setRandomWordPos(wSample.getRandomWord());
			while(true) {
				wordList[0].printWord();
				System.out.println("단어를 입력하세요. : ");
				String inputWord = scan.next();
				if(inputWord.equals(wordList[0].word)) {
					System.out.println("정답");
					break;
				}
				else {
					System.out.println("떙");
				}
			}
			if(wSample.count == 0) {
				long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
				double secDiffTime = (afterTime - beforeTime) / 1000.0; // 두시간에 차 계산
				System.out.println("기록 : "+secDiffTime+"초");
				System.out.println("게임 종료");
				run = false;
			}
		}
		scan.close();
	}

}

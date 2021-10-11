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
	boolean[] checkList = new boolean[wordSampleList.length]; // �̹̼����Ѵܾ� üũ��
	int count = wordSampleList.length; // �ܾ� ����(��������� ī���)
	
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
		
		long beforeTime = System.currentTimeMillis();	// �ڵ�������� �ð� �޾ƿ���
		
		while(run) {
			wordList[0].setRandomWordPos(wSample.getRandomWord());
			while(true) {
				wordList[0].printWord();
				System.out.println("�ܾ �Է��ϼ���. : ");
				String inputWord = scan.next();
				if(inputWord.equals(wordList[0].word)) {
					System.out.println("����");
					break;
				}
				else {
					System.out.println("��");
				}
			}
			if(wSample.count == 0) {
				long afterTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���
				double secDiffTime = (afterTime - beforeTime) / 1000.0; // �νð��� �� ���
				System.out.println("��� : "+secDiffTime+"��");
				System.out.println("���� ����");
				run = false;
			}
		}
		scan.close();
	}

}

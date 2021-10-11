package lv6;

import java.util.Random;
import java.util.Scanner;

class OMR9{
	Scanner sc=new Scanner(System.in);
	Random rn=new Random();
	int answer[]= {3,3,2,1,4};
	int hgd[];
	
	void randomMark() {
		this.hgd =new int[this.answer.length];
		for(int i=0;i<this.hgd.length;i++) {
			int rNum=rn.nextInt(5)+1;
			this.hgd[i]=rNum;
			
		}
	}
	
	char[] checkMark(int arr[]) {
		char[] resultCard =new  char[arr.length];	//정오표 만든거
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==this.answer[i]) {
				resultCard[i] = 'O';
			}else {
				resultCard[i]='X';				
			}
		}
		return resultCard;
	}
	void printCard(char arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(this.hgd[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	int resultScore() {
		int score=0;
		for(int i=0;i<this.hgd.length;i++) {
			if(this.hgd[i]==this.answer[i])
				score+=20;
		}
		return score;
	}
	
	public void run() {
		//답안작성(랜덤_)
		randomMark();
		//정답체크
		//정오표출력
		printCard(checkMark(this.hgd));
		System.out.println(resultScore());
	}
	
	
}
public class Ex24_OMR_answer {

	public static void main(String[] args) {
		OMR9 omr=new OMR9();
		omr.run();

	}

}

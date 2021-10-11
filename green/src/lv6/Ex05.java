package lv6;

import java.util.Random;

class Omr{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int cnt = 0;						// 정답 맞춘 개수
	int score = 0;						// 성적
}

public class Ex05 {
	
	/*
	 * # OMR카드 : 클래스 + 변수
	 * 1. 배열 answer는 시험문제의 정답지이다.
	 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
	 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
	 * 4. 한 문제당 20점이다.
	 * 예)
	 * answer = {1, 3, 4, 2, 5}
	 * hgd    = {1, 1, 4, 4, 3}
	 * 정오표     = {O, X, O, X, X}
	 * 성적        = 40점
	 */

	public static void main(String[] args) {
		Omr o =new Omr();
		Random ran=new Random();
		
		
		for(int i=0;i<o.hgd.length;i++) {
			int rN=ran.nextInt(5)+1;
			o.hgd[i]=rN;
//			System.out.print(o.hgd[i]);			
		}
		int score=0;
		int passC=0;
		for(int i=0;i<o.answer.length;i++) {
			if(o.answer[i]==o.hgd[i]) {
				System.out.println("정답입니다");
				score+=20;
				passC++;
			}else {
				System.out.println("오답입니다");
			}
		}
		System.out.println("정답의개수: "+passC+" 성적: " +score);
	}

}

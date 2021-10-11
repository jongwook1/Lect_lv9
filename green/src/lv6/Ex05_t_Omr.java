package lv6;

import java.util.Random;

class Test{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int cnt = 0;						// 정답 맞춘 개수
	int score = 0;						// 성적
}
public class Ex05_t_Omr {

	public static void main(String[] args) {
		Random rn= new Random();
		
		Test test= new Test();
		
		int score=0;
		for(int i=0;i<test.hgd.length;i++) {
			int rN=rn.nextInt(5)+1;
			test.hgd[i]=rN;
//			System.out.print(test.hgd[i]+" ");
//			if(test.answer[i]==test.hgd[i]) {
//				System.out.print("O ");
//				score+=20;
//			}else {
//				System.out.print("X ");
//				
//			}
//			System.out.println();
			
		}
		for(int i=0;i<test.hgd.length;i++) {
			System.out.print(test.hgd[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<test.hgd.length;i++) {
			if(test.answer[i]==test.hgd[i]) {
				System.out.print("O ");
				score+=20;
			}else {
				System.out.print("X ");
			}
			
		}
		System.out.println();
		System.out.print("성적: "+score);

	}

}

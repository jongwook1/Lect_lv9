package lv1;

import java.util.Random;

public class EX31 {

	public static void main(String[] args) {
		Random rn = new Random();
		
		int total = 0;		
		int pass = 0;
		int max = 0;
		int top = 0;
		
		
		int cnt = 0;
		while(cnt < 10) {
			int score = rn.nextInt(100)+1;
			total += score;
			
			System.out.println(cnt+1 + "번 학생의 점수 : " + score + "점");
			if(score >= 60) {
				pass++;
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
			if(max < score) {
				max = score;
				top = cnt +1;
			}
			
		cnt++;
		}
		System.out.println("총점" + total);
		System.out.println("평균" + total/10);
		System.out.println("합격자수" + pass + "명");
		System.out.println("1등의번호:"+ top + "  점수: "+max);
		
	}

}

package lv2_review;

import java.util.Random;

public class L2_Ex11_r {

	public static void main(String[] args) {
		/*
		 * # 랜덤학생
		 * 1. 10회 반복을 한다.
		 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
		 * 3. 성적이 60점 이상이면 합격생이다.
		 * ---------------------------------------
		 * . 전교생(10명)의 총점과 평균을 출력한다.
		 * . 합격자 수를 출력한다.
		 * . 1등 학생의 번호와 성적을 출력한다.
		 */
		
		int i=1;
		int max=0;
		int maxN=0;
		int total=0;		
		int cnt=0;
		Random rn=new Random();
		while(i<=10) {
			int score=rn.nextInt(100)+1;
			System.out.println(score);
			if(max<score) {
				max=score;
				maxN=i;
			}
			if(score>=60) {
				cnt++;
				System.out.println("합격");
			}
			total+=score;							
			i++;
		}
		int avg=total/10;
		System.out.println("총점: "+total+"평균: "+avg);
		System.out.println("1등번호: "+maxN+"성적: "+max);
		System.out.println("합격자수 : "+cnt);
	}

}

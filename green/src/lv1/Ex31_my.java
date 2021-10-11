//내가하던거

package lv1;

import java.util.Random;

public class Ex31_my {

	public static void main(String[] args) {
		/*
		 * # 랜덤학생 (반복문 + 최대값)
		 * 1. 10회 반복을 한다.
		 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
		 * 3. 성적이 60점 이상이면 합격생이다.
		 * ---------------------------------------
		 * . 전교생(10명)의 총점과 평균을 출력한다.
		 * . 합격자 수를 출력한다.
		 * . 1등 학생의 번호와 성적을 출력한다.    //최대값
		 */

		Random ran = new Random();
		
		int a = 0;		
		int sum = 0;		
		int cnt = 0;		
		int n = 0;
		int max = 0;
		int f = 0;
		
		
		while(a < 10) {
			int rN= ran.nextInt(100)+1;
			System.out.println("성적"+rN);
									//max = rN         이부분에 하면 안됌
			if (max < rN) {
				max = rN;
				f = a +1;
			}
			 if(rN >= 60) {
				// System.out.println("합격");
				 sum +=rN;
				 cnt++;
				 
			 }else {
				 sum +=rN;
				 
			 }			 
			 a++;
		}
		System.out.println("10명의 총점 :" + sum);
		int avg = (sum /10);
		System.out.println("10명의 평균 :" + avg);
		System.out.println("합격자수 :" +cnt +"명입니다" );
		System.out.println("1등학생의 번호 :" + f);
		System.out.println("1등학생의 성적 :" + max);
	}

}

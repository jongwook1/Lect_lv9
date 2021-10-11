package lv2;

import java.util.Random;
import java.util.Scanner;

public class aaa {

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
		
		int a = 0;
		int cnt = 0;
		int sum = 0;
		int max =0;
		int check=0;
		Random ran = new Random();
		
		while(a<10) {
			int rN = ran.nextInt(100)+1;
			System.out.println(rN);
			if(rN>=60) {				
				cnt++;				
			}sum +=rN;						
			a++;
			
			if(max<rN) {
				max = rN;
				check = a;
			}
			
			
		}
		
		
		
		
		System.out.println("총점"+sum);	
		System.out.println("평균"+sum/10);	
		System.out.println("합격자수"+cnt);	
		System.out.println("1등번호"+check+"성적"+max);	
	}

}

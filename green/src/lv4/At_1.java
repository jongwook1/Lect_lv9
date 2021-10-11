package lv4;

import java.util.Random;
import java.util.Scanner;

public class At_1 {

	public static void main(String[] args) {
		/*
		 * # 당첨복권 1셋트
		 * 1. 3이 연속으로 3번 등장하면 당첨복권이다.
		 * 2. 랜덤으로 5개의 복권을 생성하되,
		 *    당첨복권은 한 개만 생성되도록 설정한다.
		 */
		int[][] lottoSet = new int[5][7];
		
		Random rn=new Random();
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<7;j++) {
				int r=rn.nextInt(2);
				
			}
		}
		



	}
}

package lv4;

import java.util.Random;
import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50을 ==> 1 to 18
		 * 1. 구글에서 1 to 50 이라고 검색한다.
		 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
		 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
		 * 4. 숫자 1~9는 front 배열에 저장하고,
		 *    숫자 10~18은 back 배열에 저장한다.
		 */

		final int SIZE = 9;
		int[] front = new int[SIZE];
		int[] back = new int[SIZE];

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		//배열에 값넣어주기
		int gameN=1;
		int idx=-1;		
		for(int i=0;i<SIZE;i++) {
			front[i]=i+1;
			back[i]=i+10;
			idx++;
		}
		//셔플
		for(int i=0;i<1000;i++) {
			int rIdx=ran.nextInt(SIZE);
			int temp=front[idx];
			front[idx]=front[rIdx];
			front[rIdx]=temp;
		}
	
		for(int i=0;i<1000;i++) {
			int rIdx=ran.nextInt(SIZE);
			int temp=back[idx];
			back[idx]=back[rIdx];
			back[rIdx]=temp;
		}
		
		//run
		
		while(true) {
			//출력
			for(int i=0;i<SIZE;i++) {
				System.out.print(front[i]+" ");
				if(i%3==2) {
					System.out.println();
				}
			}
			if(gameN>SIZE*2) {
				System.out.println("클리어");
				break;
			}
			
				System.out.println("현재 가장작은 번호를 입력하세요");
				int inputIdx = sc.nextInt() - 1;
				for(int i=0;i<SIZE;i++) {
				if (inputIdx >= 0 && inputIdx < SIZE) {
					if (front[inputIdx] == gameN) {
						front[inputIdx] = back[inputIdx];
						back[inputIdx] = 0;
						gameN++;
					}
				}
			}
			
			
			
			
			
			
		}
		
		

	}

}

package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex04_t {

	public static void main(String[] args) {
		/*
		 * # 숫자 야구 게임		
		 * 1. com에 1~9 사이의 숫자 3개를 저장			//		me는 자신이입력
		 *    (단, 중복되는 숫자는 저장 불가)
		 * 2. com과 me를 비교해 정답을 맞출 때까지 반복  //3strike 나오면 종료
		 * 3. 숫자와 자리가 같으면 		strike += 1
		 *    숫자만 같고 자리가 틀리면 	ball += 1
		 * 예)
		 * 정답 : 1 7 3
		 * 3 1 5		: 2b
		 * 1 5 6		: 1s
		 * ...
		 */
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];			//null
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		boolean win =false;
		while(!win) {
			int s=0;
			int b=0;
			
			me =new int[3];//재초기화해야 중복안됌  아니면 위쪽me =new int[3]변수에 null처리
			
			//출력
			for(int i=0;i<3;i++) {
				System.out.print(com[i]+ " ");
			}
			System.out.println();
			for(int i=0;i<3;i++) {
				System.out.print(me[i]+ " ");
			}
			System.out.println();
			
			//입력
			for(int i=0;i<3;i++) {
				System.out.printf("숫자%d: ", i+1);
				int num=sc.nextInt();
						
				int check=1;		
				for(int j=0;j<3;j++) {
					if(me[j]==num) {
						check=-1;
					}
				}
				if(check==1) {
					me[i]=num;
				}else {
					System.out.println("중복값 입력불가");
					i--;								//여기잘이해안감
				}			
				
						
			}
			//검사
			for(int i=0;i<3;i++) {		//com 배열 기준 (문제)
				for(int j=0;j<3;j++) {
					if(com[i]==me[j]) {
						if(i==j) {
							s++;
						}
						else {
							b++;
						}
						
						
					}
				}
			}
			System.out.println(s+ "s");
			System.out.println(b+ "b");
			
			
			
			//종료조건
			if(s==3) {
				System.out.println("게임 클리어");
				win =true;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

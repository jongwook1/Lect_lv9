package lv2;

import java.util.Scanner;

public class Test2_lv2_false {

	public static void main(String[] args) {
		// 시작 10:05
		// 종료 10:
		// 소요 00분		
		
		/*
		 * # 베스킨라빈스31
		 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
		 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
		 * 3. br이 31을 넘으면 게임은 종료된다.
		 * 4. 승리자를 출력한다.
		 * 
		 * 예) 
		 * 1턴 : p1(2)	br(2)
		 * 2턴 : p2(1)	br(3)
		 * 3턴 : p1(3)	br(6)
		 * ...
		 */
		Scanner sc = new Scanner(System.in);
		int turn = 0;
		int br = 0;
		int answer = 0;
		boolean run = true;
		
		
		while(run) {
			System.out.println("누적된 br값"+br);
			if(turn % 2 ==0) {
				System.out.println("p1님 숫자입력해주세요");
				answer = sc.nextInt();
				
			}else  {
				System.out.println("p2님 숫자입력해주세요");
				answer = sc.nextInt();
				
				}
			turn++;
			if(answer>=1 && answer <=3){
				br += answer;
				if(br>=31) {
					if(turn == 0) {
						System.out.println("p2님 승리하셧습니다");
					}
					else if(turn ==1) {
						System.out.println("p2님 승리하셧습니다");
					}
				}run = false;
			}
			
			
			else {
				System.out.println("1~3의 숫자만 입력해주세요");
				turn--;
			}
			
			
		}
		
		

	}

}

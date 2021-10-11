package lv1;

import java.util.Scanner;

public class Ex27_br31 {

	public static void main(String[] args) {
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
		int p1 = 0;
		int p2 = 0;
		int br = 0;
		int turn = 0;

		Scanner sc = new Scanner(System.in);

		boolean isRun = true;
		while (isRun) {
			System.out.println("br : " + br);
			int answer = 0;
			// turn에 따를 입력
			if (turn % 2 == 0) { // turn 을 써서 p1을 짝수로 가정
				// p1
				System.out.println("p1님 숫자를 입력해주세요");
				answer = sc.nextInt();
				//맨아래 turn++; 을 통하하여 넣는대신 p1 p2각각 넣어도댐
				// 아래에서부터 두번째 else 밑의 br += answer;를 여기에 넣는다고 하면 1~3이외의 숫자도 카운트 되므로 틀림
			} else { // turn 을 써서 p2를 홀수로 가정
				System.out.println("p2님 숫자를 입력해주세요"); // p2
				answer = sc.nextInt();
				// 아래에서부터 두번째 else 밑의 br += answer;를 여기에 넣는다고 하면 1~3이외의 숫자도 카운트 되므로 틀림
				//맨아래 turn++; 을 통하하여 넣는대신 p1 p2각각 넣어도댐
			}
			if (answer <= 0 || answer > 3) {
				System.out.println("1~3까지만 입력해주세요");
				turn--; // turn ++; 도 가능
			} else {
				br += answer; /// 게임숫자가 누적해서 증가됨 !!!!!!!!!이부분을 몰랐음!!!!!!
				// 종료
				if (br >= 31) {
					if (turn % 2 == 0) {
						System.out.println("p2가 승리했다");
					} else {
						System.out.println("p1가 승리했다");
					}
					isRun = false;
				}
			}
			turn++;

		}

	}
}			
			
			
/*			
			System.out.println("p1님 숫자를입력해주세요");
			int rp1 = sc.nextInt();
			turn = 1;
			
				System.out.println(rp1);
				if(rp1 > 3) {
					System.out.println("1~3까지만 입력해주세요");
					System.out.println("p1님 숫자를 다시입력해주세요");
					rp1 = sc.nextInt();
					turn = 1;
				}
			System.out.println("p2님 숫자를입력해주세요");
			int rp2 = sc.nextInt();
			turn = 2;
			
				System.out.println(rp2);
				if(rp2 > 3) {
					System.out.println("1~3까지만 입력해주세요");
					System.out.println("p2님 숫자를 다시입력해주세요");
					rp2 = sc.nextInt();
					turn = 2;
				}
			br = rp1 + rp2;
		}	
if(turn == 1) {
	System.out.println("p1님이 승리했습니다");
}else {
	System.out.println("p2님이 승리했습니다.");
}
*/


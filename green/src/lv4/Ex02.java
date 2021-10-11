package lv4;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * # 숫자이동[2단계]
		 * 1. 숫자2는 캐릭터이다.
		 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
		 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
		 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
		 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
		 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.       격파는 사용자위치랑 상관없이 누를수있다
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] game = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };
		int p = -1;
		while (true) {
			for (int i = 0; i < 9; i++) {
				System.out.print(game[i]+" ");
				if (game[i] == 2) {
					p = i;					
				}
			}
			
			System.out.println("\n이동할위치선택하세요");
			System.out.println("1.왼  2.오  3.격파  4.종료");
			int sel = sc.nextInt();
			if (sel == 1 && p - 1 >= 0 ) {
				game[p] = 0;
				game[p - 1] = 2;
			}

			else if (sel == 2 && p + 1 <9) {
				game[p] = 0;
				game[p + 1] = 2;
			} else if (sel == 3) {
				if(game[p-1]==1||game[p+1]==1) {
					System.out.println("격파할벽이 왼쪽이면 1,   오른쪽이면 2");
					sel=sc.nextInt();
					if(sel==1) {
						game[p-1]=0;
						System.out.println("벽을부섰습니다");
					}else if(sel==2) {
						game[p+1]=0;
						System.out.println("벽을부섰습니다");						
					}
				}else {
					System.out.println("벽이 없습니다 다시확인하세요");
				}		
				
			}

			else if (sel == 4) {
				System.out.println("종료함");
				break;
			}

		}

	}

}


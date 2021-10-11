package lv6;

import java.util.Scanner;

class Nm{
	int game[]={0, 0, 1, 0, 2, 0, 0, 1, 0};	
}


public class Ex07 {

	public static void main(String[] args) {
		/*
		 * # 숫자이동[3단계] : 클래스 + 변수
		 * 1. 숫자2는 캐릭터이다.
		 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
		 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
		 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
		 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
		 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
		 * 예) 
		 *  0 0 0 0 0 0 0 2 
		 *  왼쪽(1) 오른쪽(2) : 2
		 *  
		 *  2 0 0 0 0 0 0 0 
		 */

		Scanner sc = new Scanner(System.in);
		Nm m = new Nm();

		int p = -1;
		for (int i = 0; i < m.game.length; i++) {
			if (m.game[i] == 2) {
				p = i;
			}
		}

		while (true) {
			for (int i = 0; i < m.game.length; i++) {
				if (m.game[i] == 0) {
					System.out.print("_ ");
				} else if (m.game[i] == 1) {
					System.out.print("벽 ");
				} else if (m.game[i] == 2) {
					System.out.print("옷 ");
				}
			}

			System.out.println("\n1)왼쪽 2)오른쪽 3)격파");
			System.out.println("메뉴 선택해주세요");
			int sel = sc.nextInt();
			if (sel == 1) {
				if (sel == 1 && p - 1 < 0) {
					m.game[p] = 0;
					p = 8;
					m.game[p] = 2;
				} else if (sel == 1 && m.game[p - 1] != 1) {
					m.game[p] = 0;
					p--;
					m.game[p] = 2;
				}
			} else if (sel == 2) {
				if (sel == 2 && p + 1 == m.game.length) {
					m.game[p] = 0;
					p = 0;
					m.game[p] = 2;
				} else if (sel == 2 && m.game[p + 1] != 1) {
					m.game[p] = 0;
					p++;
					m.game[p] = 2;
				}
			} else if (sel == 3) {
				if (p - 1 >= 0 && m.game[p - 1] == 1) {
					m.game[p - 1] = 0;
					System.out.println("격파");

				} else if (p + 1 < m.game.length && m.game[p + 1] == 1) {
					m.game[p + 1] = 0;
					System.out.println("격파");
				}
			}

		}

	}

}

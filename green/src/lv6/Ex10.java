package lv6;

import java.util.Random;
import java.util.Scanner;

class To{
	int SIZE=9;
	int front[]=new int [SIZE];
	int back[]=new int [SIZE];
	int gameN=1;
}


public class Ex10 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50[3단계] : 1 to 18
		 * 1. 구글에서 1 to 50 이라고 검색한다.
		 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
		 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
		 * 4. 숫자 1~9는 front 배열에 저장하고,
		 *    숫자 10~18은 back 배열에 저장한다.
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		To t = new To();

//		int idx=-1;
		// 값넣기
		for (int i = 0; i < t.front.length; i++) {
			t.front[i] = i + 1;
			t.back[i] = i + 10;
//			idx=i;
		}
		// 셔플
		// 1.front
		for (int i = 0; i < 1000; i++) {
			int rN = ran.nextInt(9);
			int temp = t.front[0];
			t.front[0] = t.front[rN];
			t.front[rN] = temp;
		}
		// 2.back
		for (int i = 0; i < 1000; i++) {
			int rN = ran.nextInt(9);
			int temp = t.back[0];
			t.back[0] = t.back[rN];
			t.back[rN] = temp;
		}

//		for(int i=0;i<t.front.length;i++) {
//		System.out.print(t.front[i]+" ");
//		}
//		System.out.println();
//		for(int i=0;i<t.front.length;i++) {
//			System.out.print(t.back[i]+" ");
//			}

		// run
		while (true) {
			for (int i = 0; i < t.front.length; i++) {
				System.out.print(t.front[i] + " ");
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			System.out.println("제일작은번호값의 인덱스 입력해주세요");
			int idx = sc.nextInt() - 1;

			if (idx >= 0 && idx < t.SIZE) {
				if (t.front[idx] == t.gameN) {
					t.front[idx] = t.back[idx];
					t.back[idx] = 0;
					t.gameN++;
				}
			}
			// end
			if (t.gameN > t.SIZE * 2) {
				System.out.println("클리어");
				break;
			}
		}

	}

}

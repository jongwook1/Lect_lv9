package lv4;

import java.util.Random;
import java.util.Scanner;
//lv3ex22 연관?
public class Ex05_t_1to18 {

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

		int idx = -1;
		for (int i = 0; i < 9; i++) { // front배열과 back배열에 값넣기
			front[i] = i + 1;
			back[i] = i + 10;
			idx = i;
		}
		// 셔플
		for (int i = 0; i < 1000; i++) {
			int rn = ran.nextInt(9);
			int temp = front[idx];
			front[idx] = front[rn];
			front[rn] = temp;
		}
//		for(int i=0;i<9;i++) {
//			System.out.print(front[i]);
//		}
		for (int i = 0; i < 1000; i++) {
			int rn = ran.nextInt(9);
			int temp = back[idx];
			back[idx] = back[rn];
			back[rn] = temp;
		}
//		for(int i=0;i<9;i++) {
//			System.out.print(back[i]+" ");
//		}
		int gameN = 1;
		while (true) {
			// 출력
			for (int i = 0; i < SIZE; i++) {
				System.out.print(front[i] + " ");
				if (i % 3 == 2) { // ==0아니라 2
					System.out.println();
				}

			}//종료
			if (gameN > SIZE * 2) {
				System.out.println("클리어");
				break;
			}
//			System.out.println();
//			for(int i=0;i<9;i++) {
//				System.out.print(back[i]);			
//				}
			// 진행
			System.out.println("\n제일작은번호값의 인덱스입력해주세요");
			int inputIdx = sc.nextInt() - 1;
			if (inputIdx >= 0 && inputIdx < SIZE) {
//				for (int i = 0; i < SIZE; i++) {

					if (front[inputIdx] == gameN) {
						front[inputIdx] = back[inputIdx]; // back 값이 같은 위치의 index끌어와야 하므로 -->back[inputIdx]//
						back[inputIdx] = 0;
						gameN++;
					}

				}
			}

//		}

	}

}

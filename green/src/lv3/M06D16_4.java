package lv3;

import java.util.Scanner;

public class M06D16_4 {

	public static void main(String[] args) {
		/*
		 * # 즉석복권 1. 숫자 7이 연속으로 3번 등장하면, "당첨" 출력.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int[] lotto = { 0, 0, 7, 7, 7, 0, 7, 7 };
		// int[] lotto = {7, 0, 7, 7, 0, 7, 0, 7};
		boolean run = true;
		boolean win = false;

		while (run) {
			System.out.println("1) 복권 결과확인");
			System.out.println("2) 종료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			if (sel == 1) {
				int cnt = 0;
				for (int i = 0; i < 8; i++) {
					if (lotto[i] == 7) {
						cnt++;
					} else {
						cnt = 0;
					}
					if (cnt == 3) {
						win = true;
					}
				}
				if (win == true) {
					System.out.println("당첨!");
				} else {
					System.out.println("당첨x");
				}
			} else if (sel == 2) {
				System.out.println("종료하겠습니다!");
			}
		}
	}
}

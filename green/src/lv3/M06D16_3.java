package lv3;

import java.util.Scanner;

public class M06D16_3 {

	public static void main(String[] args) {
		/*
		 * # 영화관 좌석예매 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다. 2. 예매가 완료되면 해당 좌석 값을 1로
		 * 변경한다. 3. 이미 예매가 완료된 좌석은 재구매할 수 없다. 4. 한 좌석당 예매 가격은 12000원이다. 5. 프로그램 종료 후, 해당
		 * 영화관의 총 매출액을 출력한다. 예) seat = 0 0 0 0 0 0 0
		 * 
		 * 좌석선택 : 1 seat = 0 1 0 0 0 0 0
		 * 
		 * 좌석선택 : 3 seat = 0 1 0 1 0 0 0
		 * 
		 * 좌석선택 : 3 seat = 0 1 0 1 0 0 0 이미 예매가 완료된 자리입니다. ---------------------- 매출액 :
		 * 24000원
		 */

		Scanner sc = new Scanner(System.in);
		int[] seat = new int[7];
		boolean run = true;
		int total = 0;
		while (run) {
			for (int i = 0; i < 7; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
			for (int i = 0; i < 7; i++) {
				if (seat[i] == 1) {
					System.out.print("■ ");
				} else {
					System.out.print("□ ");
				}
			}
			System.out.println("\n=영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("좌석선택 ㄱㄱ(1~7까지만가능)");
				int input = sc.nextInt() - 1;
				if (input >= 0 && input < 7) {
					if (seat[input] == 1) {
						System.out.println("선택된자석임");
					} else {
						seat[input] = 1;
						System.out.println("예매완료!");
						total += 12000;
					}
				} else {
					System.out.println("1~7값을 입력해주세요");
				}
			} else if (sel == 2) {
				System.out.println("매출은" + total + "원");
				run = false;
			}
		}
	}
}

package lv6;

import java.util.Scanner;

/*
 * # 영화관 좌석예매 : 클래스 + 변수
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

class TMS99 {
	int[] seat = new int[7];
	int money = 0;
}

public class Ex06_Theater_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TMS99 e = new TMS99();

		while (true) {
			for (int i = 0; i < e.seat.length; i++) {
				if (e.seat[i] != 0) {
					System.out.print("■ ");
				} else {
					System.out.print("□ ");
				}
			}
			System.out.println("\nMOVIE]");
			System.out.println("[1]좌석예매");
			System.out.println("[2]종료하기");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("좌석선택");
				int idx = sc.nextInt();

				if (e.seat[idx] != 0) {
					System.out.println("이선좌");
				} else {
					e.seat[idx] = 1;
					e.money += 12000;
				}
			} else if (sel == 2) {
				System.out.println("총 매출액: "+e.money);
				break;
			}
		}

	}

}

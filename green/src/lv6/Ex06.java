package lv6;

import java.util.Scanner;

class movie{
	int seat[]=new int[7];
	int money=0;
}

public class Ex06 {

	public static void main(String[] args) {
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
		Scanner sc = new Scanner(System.in);
		movie m = new movie();

		int cnt = 0;
		while (true) {
			for (int i = 0; i < m.seat.length; i++) {
				System.out.print(m.seat[i] + " ");
			}
			System.out.println("\n1)좌석예매");
			System.out.println("2)종료");
			System.out.println("메뉴선택");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("예매할 좌석번호를 입력하세요");
				int idx = sc.nextInt() - 1;
				System.out.println("좌석 선택: "+(idx+1));

				if (m.seat[idx] == 0) {
					m.seat[idx] = 1;
					cnt++;
				} else {
					System.out.println("이미선택된 좌석");
				}
			} else if (sel == 2) {
				m.money = cnt * 12000;
				System.out.println("매출액: " +m.money + "원");
			}
		}
	}

}

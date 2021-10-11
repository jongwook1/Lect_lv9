package lv6;
/*
 * # 영화관 좌석예매 : 클래스 + 메서드
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

import java.util.Scanner;

class movie999 {
	Scanner sc = new Scanner(System.in);
	private int seat[] = null;
	private int price = 12000;
	private int total;

	movie999(int seat[]) {
		this.seat = seat;
	}

	public int getPrice() {
		return this.price;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int price) {
		this.total += price;
	}

	public void printMenu() {
		System.out.println("\n1.좌석선택");
		System.out.println("2.종료");
	}

	public void selectMenu() {
		while (true) {
			printSeat();
			printMenu();
			int sel = sc.nextInt();
			if (sel == 1) {
				choiceSeat();

			} else if (sel == 2) {
				System.out.println("총 매출액:"+this.getTotal());
				break;
			}
		}
	}

	public void printSeat() {
		for (int i = 0; i < this.seat.length; i++) {
			if (this.seat[i] == 0) {
				System.out.print("□ ");
			} else if (this.seat[i] == 1) {
				System.out.print("■ ");
			}
		}
	}

	public void choiceSeat() {
		System.out.println("좌선번호입력하세요");
		int idx = sc.nextInt() - 1;
		if (this.seat[idx] == 1) {
			System.out.println("이선좌");
		} else if (this.seat[idx] == 0) {
			this.seat[idx] = 1;
			this.setTotal(this.getPrice());
			System.out.println("예매완료");
		}
	}

	public void run() {
		selectMenu();

	}

}

public class Ex25_movie_Review {

	public static void main(String[] args) {
		int seat[] = new int[10];
		movie999 tms = new movie999(seat);
		tms.run();

	}

}

package lv3;

import java.util.Scanner;

public class Test01_lv3 {

	public static void main(String[] args) {
		// 시작 13:45
		// 종료 14:05
		// 소요 20분

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
		int arr[] = new int[7];
		int total = 0;
		boolean run = true;
		while (run) {
			for (int i = 0; i < 7; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();

			for (int i = 0; i < 7; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("\n=영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("좌석을 선택하세요(1~7)");
				int input = sc.nextInt() - 1;

				if (input >= 0 && input < 7) {
					if (arr[input] == 1) {
						System.out.println("이미선택된 좌석입니다");
					} else {
						System.out.println("좌석을 선택하세요(1~7)");
						arr[input] = 1;
						total += 12000;
						System.out.println("예매가 완료되었습니다");
					}
				} else {
					System.out.println("좌석을 확인하세요");
				}

			} else if (sel == 2) {
				System.out.println("영화관의 매출액은" + total + "원 입니다");
				System.out.println("종료하겠습니다");
				run = false;
			}

		}

	}

}

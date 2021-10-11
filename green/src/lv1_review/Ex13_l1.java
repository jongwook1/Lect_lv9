package lv1_review;

import java.util.Scanner;

public class Ex13_l1 {

	public static void main(String[] args) {
		/*
		 * # 영수증 출력[1단계]
		 * 1. 메뉴판을 출력한다.
		 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
		 * 3. 현금을 입력받는다.
		 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
		 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
		 */
		Scanner sc = new Scanner(System.in);

		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;

		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		System.out.println("메뉴선택해주세요");
		int sel = sc.nextInt();
		System.out.println("지불할금액입력해주세요");
		int payM = sc.nextInt();

		int charge = 0;
		if (sel == 1) {
			charge = payM - price1;
		}
		if (sel == 2) {
			charge = payM - price2;
		}
		if (sel == 3) {
			charge = payM - price3;
		}

		if (charge >= 0) {
			System.out.println("잔돈은: " + charge + "원 입니다");
		}
		if (charge < 0) {
			System.out.println("지불금액이 부족합니다");
		}

	}

}

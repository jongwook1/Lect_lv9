package lv1;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 변수의 생명주기(scope)

		// {} 중괄호 : 영역의 시작과 끝
		int a = 10;
		if (true) {
			int b = 20;

			if (true) {
				int c = 30;

				System.out.println(a); // 10
				System.out.println(b); // 20
				System.out.println(c); // 30

			}
//			System.out.println(a); 			//10
//			System.out.println(b);			//20
//			System.out.println(c);			//오류 뜸

		}
//		System.out.println(a); 			//10
//		System.out.println(b);			//오류 뜸
//		System.out.println(c);			//오류 뜸	

		/*
		 * # 영수증 출력[1단계] 
		 * 1. 메뉴판을 출력한다.
		 *  2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
		 *   3. 현금을 입력받는다. 
		 *   4.입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다. 
		 *   5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
		 */
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");

		Scanner sc = new Scanner(System.in);

		System.out.println("메뉴선택 : ");
		int sel = sc.nextInt();

		System.out.println("현금입력 : ");
		int cash = sc.nextInt();

		// case 3가지
		int total = 0;

		if (sel == 1) {
			total = price1;
		} else if (sel == 2) {
			total = price2;
		} else if (sel == 3) {
			total = price3;
		} else {
			System.out.println("존재하지 않는 메뉴입니다. 돌아가세요.");
		}

		// total과 cash를 비교 -> 거스름돈 도출
		if (total != 0) {

			if (total > cash) {
				System.out.println("현금이 부족합니다!");
			} else {
				// 영수증 출력
				// 구매한 메뉴와 가격 표시 -> 거스름돈 출력

				System.out.println("----영 수 증 ---");
				if (sel == 1) {
					System.out.println("불고기1개 " + price1 + "원");
				} else if (sel == 2) {
					System.out.println("새우1개 " + price2 + "원");
				} else {
					System.out.println("콜라1개 " + price3 + "원");
				}
				System.out.println("거스름돈 : " + (cash - total) + "원");
				System.out.println("---------------");
			}
		}

		/*
		 * # 최대값 구하기[1단계] 1. 숫자 3개를 입력받는다. 2. 입력받은 3개의 수를 비교하여, 3. 가장 큰 수(MAX)를 출력한다.
		 */
		/*
		 * Scanner sc = new Scanner(System.in); int num1 = sc.nextInt(); int num2 =
		 * sc.nextInt(); int num3 = sc.nextInt();
		 * 
		 * 
		 * 
		 * /*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * /* # 구구단 게임[1단계] 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다. 2. 입력받은 숫자를 토대로 구구단 문제를
		 * 출력한다. 예) 3 x 7 = ? 3. 문제에 해당하는 정답을 입력받는다. 4. 정답을 비교 "정답" 또는 "땡"을 출력한다. 내가 한거
		 * Scanner sc = new Scanner(System.in); int n1 = sc.nextlnt(); int n2 =
		 * sc.nextlnt();
		 * 
		 * int c = n1 * n2
		 * 
		 * System.out.println(+n1+" X" +n2 "=" +c);
		 * 
		 */

	}

}

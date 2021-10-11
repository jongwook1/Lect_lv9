package lv5;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		//미니프로젝트;
		
		// 식권 자판기 프로그램 		
		// 1) 관리자   2) 사용자 
		//관리자 ==> 1) 식권충전   2) 잔돈 충전 	 3)뒤로가기
		//사용자 ==> 1) 구입 ==> ==> 입금 금액 입력 ==> 구매 매수 입력  ==> 잔돈출력 	
	    //	       2)뒤로가기
		// 조건 ) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장출력 
		//화면 
		// 식권 가격 : 3200원 
		// 식권 	  : ??매  (매진시 매진) 
		// 50000원 : ?? 매  	// 10000원 : ?? 매	// 5000원 : ?? 매
		// 1000원 : ?? 매		//  500원 : ?? 개	  	//  100원 : ?? 개 



		Scanner sc = new Scanner(System.in);

		int[] money = { 50000, 10000, 5000, 1000, 500, 100 };
		int[] charges = { 1, 1, 1, 1, 5, 10 };

		int tickets = 5; // 식권 개수
		int price = 3200; // 식권 가격

		while (true) {
			int total = 0;
			for (int i = 0; i < money.length; i++) {
				total += money[i] * charges[i];
			}

			System.out.println("식권재고: [" + tickets + "]");
			System.out.println("화폐종류별 수량");
			for (int i = 0; i < money.length; i++) {
				System.out.printf("%d원[%d] ", money[i], charges[i]);
			}
			System.out.println("\n잔돈: " + total);
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");
			System.out.println("[3]종료");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				while (true) {
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("3)뒤로가기");

					System.out.print("메뉴 선택 : ");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("충전할 식권 수량입력하세요");
						int addTicket = sc.nextInt();
						tickets += addTicket;
					} else if (choice == 2) {

						while (true) {
							for (int i = 0; i < money.length; i++) {
								System.out.printf("%d) %d [%d]  ", i + 1, money[i], charges[i]);
							}
							System.out.println("0)뒤로가기");
							System.out.println("충전할 화폐의 종류를 선택하세요");
							int pick = sc.nextInt() - 1;
							if (pick == -1) {
								break;
							} else {
								charges[pick] = charges[pick] + 1;
							}

						}

					} else if (choice == 3) {
						break;
					}
				}

			} else if (sel == 2) {
				while (true) {
					System.out.println("1)구입");
					System.out.println("2)뒤로가기");

					System.out.print("메뉴 선택 : ");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("구입할 식권수를 입력하세요");
						int buyT = sc.nextInt();
						int buyPrice = buyT * price;
						System.out.println("결제하실금액은: " + buyPrice + "원 입니다");
						System.out.println("");
						System.out.println("지불할 금액을 입력하세요");
						int myM = sc.nextInt();
						
						
						

						int cMoney = myM - buyPrice;

						if (cMoney >= 0) {
							System.out.println("받으실 잔돈은: " + cMoney + "입니다");

//							int tempM = cMoney; // 거슬러줄 화폐없을때를 대비
							int tempC[] = new int[charges.length];// 거슬러줄 화폐없을때를 대비

							for (int i = 0; i < tempC.length; i++) {
								tempC[i] = charges[i];
							}

							for (int i = 0; i < money.length; i++) {
								while (true) {
									if (cMoney >= money[i] && tempC[i] > 0) {
										cMoney = cMoney - money[i];
										tempC[i] = tempC[i] - 1;
									} else {
										break;
									}
								}
							}

							if (cMoney == 0) {
								for (int i = 0; i < charges.length; i++) {
									charges[i] = tempC[i];
								}
								tickets -= buyT;
							} else {
								System.out.println("잔돈이부족합니다");
							}

						} else {
							System.out.println("지불할금액이 부족합니다");
						}

					} else if (choice == 2) {
						break;
					}
				}
			} else if (sel == 3) {
				System.out.println("종료합니다");
				break;
			}
		}

	}

}

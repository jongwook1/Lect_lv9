package lv5;

import java.util.Scanner;

public class Ex23_answer {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int[] moneys  = {50000, 10000, 5000, 1000, 500, 100};		// 화폐 종류
		int[] charges = {	 1,     1,    1,    1,   1,   5};		// 화폐 종류별 수량
		
		int ticketCount = 5;		// 식권의 재고 수량
		int ticketPrice = 3200;		// 식권의 가격
		
		while(true) {
			System.out.println("[식권 재고 수량] " + ticketCount + "장");
			System.out.println("[화폐종류별 수량]");
			for(int i=0; i<moneys.length; i++) {
				System.out.print(moneys[i] + "원(" + charges[i] + ")");
			}
			System.out.println();
			
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");
			System.out.println("[0]종료");
			
			System.out.println("메뉴를 선택하세요.");
			int select = scan.nextInt();
			
			if(select == 1) {
				while(true) {
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("3)뒤로가기");
					
					int choice = scan.nextInt();
					
					if(choice == 1) {
						System.out.println("[식권 재고 수량] " + ticketCount + "장");
						System.out.println("[식권충전]충전할 식권 수량을 작성하세요.");
						int addCount = scan.nextInt();
						
						ticketCount = ticketCount + addCount;
					}
					else if(choice == 2) {
						while(true) {
							System.out.println("[화폐종류별 수량]");
							for(int i=0; i<moneys.length; i++) {
								System.out.print(moneys[i] + "원(" + charges[i] + ")");
							}
							System.out.println();
							
							System.out.println("[잔돈충전]충전할 화폐의 종류를 선택하세요.");
							for(int i=0; i<moneys.length; i++) {
								System.out.println("[" + (i + 1) + "]" + moneys[i] + "원");
							}
							System.out.println("[0]뒤로가기");
							
							int number = scan.nextInt();
							if(number == 0) {
								break;
							}else {
								number = number - 1;
								
								charges[number] = charges[number] + 1;
							}
						}
					}
					else if(choice == 3) {
						break;
					}
				}
			}
			else if(select == 2) {
				while(true) {
					System.out.println("1)구입하기");
					System.out.println("2)뒤로가기");
					
					int choice = scan.nextInt();
					
					if(choice == 1) {
						System.out.println("[식권구매]구입할 식권 수를 입력하세요.");
						int myTicketcount = scan.nextInt();
						
						// 구매할 식권수량 > 재고수량
						if(myTicketcount > ticketCount) {
							System.out.println("[메세지]식권수가 부족합니다. 관리자에게 문의해주세요.");
							continue;
						}
						
						// 결제 금액 출력
						int payment = myTicketcount * ticketPrice;
						System.out.println("[메세지]결제하실 총 금액은 " + payment + "원 입니다.");
						
						// 지불할 금액 입력받기
						int[] myCharges = new int[charges.length];
						while(true) {
							System.out.println("[식권구매]지불할 화폐의 종류를 선택하세요.");
							for(int i=0; i<moneys.length; i++) {
								System.out.println("[" + (i + 1) + "]" + moneys[i] + "원");
							}
							System.out.println("[0]뒤로가기");
							
							int number = scan.nextInt();
							if(number == 0) {
								break;
							}else {
								number = number - 1;
								
								myCharges[number] = myCharges[number] + 1;
							}
						}
						// 지불한 총 금액 계산하기
						int myPayment = 0;
						for(int i=0; i<myCharges.length; i++) {
							myPayment = myPayment + myCharges[i] * moneys[i];
						}
						System.out.println("[메세지]지불하신 총 금액은 " + myPayment + "원 입니다.");
						
						// 지불한 총 금액 - 결제금액 >= 0 : 거래가능
						int charge = myPayment - payment;
						if(charge >= 0) {
							
							// # 만일 거스름돈을 돌려줄 화폐가 없다면 거래 불가
							// => 바로 처리하지 말고 임시변수에 저장해서 확인한 후 처리할 것
							int tempCharge = charge;
							int[] tempCharges = new int[charges.length];
							for(int i=0; i<charges.length; i++) {
								tempCharges[i] = charges[i];
							}
							System.out.println();
							
							for(int i=0; i<charges.length; i++) {
								while(true) {
									if(tempCharge >= moneys[i] && tempCharges[i] > 0) {		//잔돈이 moneys배열에있는 어느 인덱스의 값보다 클때 ,즉 잔돈을 줄수있을때
										tempCharge = tempCharge - moneys[i];
										tempCharges[i] = tempCharges[i] - 1;
									}else {
										break;
									}
								}
							}
							
							if(tempCharge == 0) {
								System.out.println("[메세지]잔돈은 " + charge + "원 입니다.\n이용해주셔서 감사합니다.");
								
								for(int i=0; i<charges.length; i++) {
									// 사용자에게 거스름돈으로 돌려주고 남은 돈 저장하기
									charges[i] = tempCharges[i];
									// 사용자가 투입한 금액 추가하기
									charges[i] = charges[i] + myCharges[i];
								}
								
								// 사용자가 구매한 식권 차감하기
								ticketCount = ticketCount - myTicketcount;
							}else {
								System.out.println("[메세지]거스름 돈이 부족해 거래가 불가합니다.");
							}
						}
						else {
							System.out.println("[메세지]금액이 부족합니다.");
						}
						
					}
					else if(choice == 2) {
						break;
					}
				}
			}
			else if(select == 0) {
				break;
			}
		}

	}

}

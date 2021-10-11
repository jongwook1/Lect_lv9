package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex14_1 {

	public static void main(String[] args) {
			
			// 1. 로그인 2. 종료
			// 로그인 -> 1. 입금 2. 출금 3. 조회
			//
			Scanner scan = new Scanner(System.in);
			int myAcc = 1234;
			int myPw = 1111;
			int myMoney = 8700;
			int yourAcc = 4321;
			int yourPw = 2222;
			int yourMoney = 12000;
			System.out.println("--- Green ATM ---");
			System.out.println("1. 로그인 2. 종료 ");
			System.out.println("-----------------");
			System.out.println("메뉴선택: ");
			int sel = scan.nextInt();
			if (sel == 1) {
				System.out.println("계좌를 입력하세요");
				int inputAcc = scan.nextInt();				
				if (inputAcc == myAcc) {
					System.out.println("비밀번호를 입력하세요");
					int inputPw = scan.nextInt();					
					if (inputPw == myPw) {
						System.out.println("1. 입금 2. 출금 3. 이체 4. 조회 ");
						sel = scan.nextInt();
						if (sel == 1) {
							int inputMoney = scan.nextInt();
							System.out.print("입금할 금액를 입력하세요 : ");							
							myMoney += inputMoney;
							System.out.println("입금이완료 됬습니다.");
							System.out.println("현재 잔액은 " + myMoney);							
						} else if (sel == 2) {
							System.out.println("출금할 금액 입력");
							int inputMoney = scan.nextInt();
							if(inputMoney > myMoney) {
								System.out.println("잔액이부족합니다");
							}else {
							System.out.print("출금할 금액를 입력하세요 : ");
							int outMoney = scan.nextInt();
							myMoney -= outMoney;}
						} else if (sel == 3) {
							// 입력받기
							System.out.print("이체할 계좌번호를 입력하세요 : ");
							inputAcc = scan.nextInt();
							// 계좌확인
							if (inputAcc == yourAcc) {
								// 이체진행
								int inputMoney = scan.nextInt();
								// 유효성 검사
								if (inputMoney > myMoney) {
									System.out.println("잔액이 부족합니다!");
								} else {
//					System.out.println("이체완료, 나의 잔액: " + (myMoney - inputMoney));
									myMoney -= inputMoney; // myMoney = myMoney - inputMoney;
									// 증감연산자 ( +=, -=, *=, /= )
									yourMoney += inputMoney;
									System.out.println("이체가 성공적으로 되었습니다!");
								}
							} else {
								System.out.println("존재하지 않는 계좌입니다. ");
							}
						} else if (sel == 4) {
							System.out.println("현재 잔액은 " + myMoney);
						} else {
							System.out.println("존재하지 않는 계좌입니다. ");
						}
					}else 
						System.out.println("존재하지 않는 계좌입니다. ");
				}
			} else if (sel == 2) {
				System.out.println("프로그램을 종료합니다.");
			} else {
				System.out.println("존재하지 않는 메뉴입니다.");
			}
	}
	
}

/*
 * myAcc = sc.nextInt(); if(myAcc == 1234) { myAcc = sc.nextInt();
 * System.out.println("myMoney = " + myMoney + "원" + "이체가능"); myMoney =
 * sc.nextInt(); if(myMoney == 8700) { System.out.println("yourMoney = " +
 * yourMoney + "원"); } else { System.out.println("이체불가"); } }
 */





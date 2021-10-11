package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex14_ATM {

	public static void main(String[] args) {
		// 1. 로그인 ==> 1.입금 2.출금 3.조회
		Scanner sc = new Scanner(System.in);
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
		int sel = sc.nextInt();
		
		if(sel == 1) {
			System.out.println("계좌입력해");
			int inputAcc = sc.nextInt();
			if(inputAcc == myAcc) {
				System.out.println("비번입력해");
				int inputPw = sc.nextInt();
				if(myPw == inputPw) {
					System.out.println("1. 입금 2. 출금 3. 이체 4. 조회 ");
					int n = sc.nextInt();
					if(n == 1) {
						System.out.println("입금할 금액입력하세요");
							int inputMoney = sc.nextInt();
							myMoney += inputMoney;
							System.out.println("입금이완료 됬습니다.");
							System.out.println("현재 잔액은 " + myMoney);	
					}
					else if(n == 2) {
						System.out.println("출금할 금액입력하세요");
						int outMoney = sc.nextInt();
						myMoney -= outMoney;
						System.out.println("출금이완료 됬습니다.");
						System.out.println("현재 잔액은 " + myMoney);						
					}
					else if(n == 3) {
						System.out.println("이체할 계좌입력하세요");
						inputAcc = sc.nextInt();
						if(inputAcc == yourAcc) {							
							System.out.println("금액을 입력하세요");
							int inputMoney = sc.nextInt();
							if (inputMoney > myMoney) {
								System.out.println("잔액이 부족합니다!");
							} else {
//				System.out.println("이체완료, 나의 잔액: " + (myMoney - inputMoney));
								myMoney -= inputMoney; // myMoney = myMoney - inputMoney;
								// 증감연산자 ( +=, -=, *=, /= )
								yourMoney += inputMoney;
								System.out.println("이체가 성공적으로 되었습니다!");
							}
						}else {
							System.out.println("존재하지않느 계좌입니다");
							}
					}
					else if(n == 4) {
						System.out.println("현재 잔액은 " + myMoney );
					}else {System.out.println("존재하지 않는메뉴입니다");}
				}else {
					System.out.println("틀린비번입니다");
					}
			}else {
				System.out.println("존재하지않는 계좌입니다");
			}
		}else if(sel == 2) {
			System.out.println("종료하겠습니다");
		}		
	}
}
//int inputmoney = sc.nextInt();
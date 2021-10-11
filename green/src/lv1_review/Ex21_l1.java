package lv1_review;

import java.util.Scanner;

public class Ex21_l1 {

	public static void main(String[] args) {
		// 1. 로그인 ==> 1.입금 2.출금 3.조회
		
		int cash = 20000;  // 입금시 감소  , 출금시 증가
		int balance = 30000; // 입금시 증가 , 출금시 감소 
		int account  = 11111; // 로그인시 사용
		int password  = 1234; // 로그인시 사용 
		Scanner sc = new Scanner(System.in);
		System.out.println("===ATM===");
		System.out.println("1.입금 2.출금 3.종료");
		System.out.println("현금: " +cash);
		System.out.println("통장잔고: " +balance);
		System.out.println("메뉴를 선택해주세요");
		int sel = sc.nextInt();
		
		
		System.out.println("계좌를 입력해주세요");
		int inputAcc=sc.nextInt();
		System.out.println("비번입력해주세요");
		int inputPw=sc.nextInt();
		if(account==inputAcc&&password==inputPw) {
				
		if(sel==1) {			
				System.out.println("입금할 금액을 입력해주세요");
				int inputM=sc.nextInt();
				if(cash>=inputM) {
				cash-=inputM;
				balance+=inputM;
				System.out.println("입금이 완료됐습니다");
				}else {
					System.out.println("현금이 부족합니다");
				}
			
			
		}else if(sel==2) {
			System.out.println("출금할 금액을 입력하세요");
			int outputM=sc.nextInt();
			if(balance>=outputM) {
			cash+=outputM;
			balance-=outputM;
			System.out.println("출금이 완료됐습니다");
			}else {
				System.out.println("통장잔액이부족합니다");
			}
		}else if(sel==3) {
			System.out.println("종료하겠습니다");
		}
		
		}else {
			System.out.println("계좌와 비밀번호를 확인해주세요");
		}
		System.out.println("현금: " +cash);
		System.out.println("통장잔고: " +balance);

	}

}

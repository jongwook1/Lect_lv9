package lv2_review;

import java.util.Scanner;

public class L2_Ex16 {

	public static void main(String[] args) {
		/*
		 * # ATM[종합]
		 * 1. 로그인
		 * . 로그인 후 재 로그인 불가
		 * . 로그아웃 상태에서만 이용 가능
		 * 2. 로그아웃
		 * . 로그인 후 이용가능
		 * 3. 입금
		 * . 로그인 후 이용가능
		 * 4. 출금
		 * . 로그인 후 이용가능
		 * 5. 이체
		 * . 로그인 후 이용가능
		 * 6. 조회
		 * . 로그인 후 이용가능
		 * 7. 종료
		 */
		
		Scanner sc = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		int log = -1; // -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)

		boolean run = true;
		while (run) {

			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				if (log == -1) {
					System.out.println("아이디를 입력해주세요");
					int inputId = sc.nextInt();
					System.out.println("비번을 입력해주세요");
					int inputPw = sc.nextInt();
					if (dbAcc1 == inputId && dbPw1 == inputPw) {
						log = 1;
						System.out.println(dbAcc1 + "님 로그인 되셨스빈다.");
					} else if (dbAcc2 == inputId && dbPw2 == inputPw) {
						log = 2;
						System.out.println(dbAcc2 + "님 로그인 되셨스빈다.");
					} else {
						System.out.println("아디와 비번을 확인해주세요");
					}

				} else {
					System.out.println("로그아웃을 먼저해주세요");
				}
			} else if (sel == 2) {
				if (log != 1) {
					System.out.println("로그아웃성공");
					log = -1;
				} else {
					System.out.println("로그인을 먼저해주세요");
				}
			} else if (sel == 3) {
				if (log != -1) {
					System.out.print("입금할 금액 입력 : ");
					int inputM = sc.nextInt();

					if (log == 1) {
						dbMoney1 = dbMoney1 + inputM;
					} else if (log == 2) {
						dbMoney2 = dbMoney2 + inputM;
					}
					System.out.println("입금을 완료하였습니다.");
				} else {
					System.out.println("로그인을 먼저해주세요");
				}
			} else if (sel == 4) {
				System.out.print("출금할 금액 입력 : ");
				int outM = sc.nextInt();
				if (log == 1) {
					if (outM <= dbMoney1) {
						dbMoney1 -= outM;
						System.out.println("출금을 완료하였습니다.");
					} else {
						System.out.println("계좌잔액이 부족합니다.");
					}
				}
				if (log == 2) {
					if (outM <= dbMoney1) {
						dbMoney1 -= outM;
						System.out.println("출금을 완료하였습니다.");
					} else {
						System.out.println("계좌잔액이 부족합니다.");
					}
				} else {
					System.out.println("로그인을 먼저해주세요");
				}
			} else if (sel == 5) {
				if (log != -1) {
					System.out.print("이체할 계좌번호 입력해주세요  ");
					int acc = sc.nextInt();
					if (log == 1) {
						if (acc == dbAcc2) {
							System.out.print("이체할 금액 입력 : ");
							int money = sc.nextInt();
							if (money <= dbMoney1) {
								dbMoney1 -= money;
								dbMoney2 += money;
								System.out.println("이체를 완료하였습니다.");
							} else {
								System.out.println("계좌잔액이 부족합니다.");
							}
						} else {
							System.out.println("계좌를 확인해주세요");
						}
					} else if (log == 2) {
						if (acc == dbAcc1) {
							System.out.print("이체할 금액 입력 : ");
							int money = sc.nextInt();
							if (money <= dbMoney2) {
								dbMoney2 -= money;
								dbMoney1 += money;
								System.out.println("이체를 완료하였습니다.");
							} else {
								System.out.println("계좌잔액이 부족합니다.");
							}
						} else {
							System.out.println("계좌를 확인해주세요");
						}
					}

				} else {
					System.out.println("로그인을 먼저해주세요");
				}
			} else if (sel == 6) {
				if (log != 1) {
					if (log == 1) {
						System.out.println("잔액: " + dbMoney1 + "원");
					} else if (log == 2) {
						System.out.println("잔액: " + dbMoney2 + "원");
					}
				} else {
					System.out.println("로그인을 먼저해주세요");
				}
			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}

}

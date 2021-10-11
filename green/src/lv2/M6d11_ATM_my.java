package lv2;

import java.util.Scanner;

public class M6d11_ATM_my {

	public static void main(String[] args) {
		/*
		 * # ATM[종합] 1. 로그인 . 로그인 후 재 로그인 불가 . 로그아웃 상태에서만 이용 가능 2. 로그아웃 . 로그인 후 이용가능 3.
		 * 입금 . 로그인 후 이용가능 4. 출금 . 로그인 후 이용가능 5. 이체 . 로그인 후 이용가능 6. 조회 . 로그인 후 이용가능 7.
		 * 종료
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
					System.out.println("계좌번호를 입력해주세요");
					int inputAcc = sc.nextInt();
					if (inputAcc == dbAcc1) {
						System.out.println("비밀번호를 입력해주세요");
						int inputPw = sc.nextInt();
						if (inputPw == dbPw1) {
							System.out.println("1님 로그인되셨씁니다");
							log = 1;
							continue;
						} else {
							System.out.println("틀린비밀번호입니다.");
							continue;
						}
					} else if (inputAcc == dbAcc2) {
						System.out.println("비밀번호를 입력해주세요");
						int inputPw = sc.nextInt();
						if (inputPw == dbPw2) {
							System.out.println("2님 로그인되셨씁니다");
							log = 2;
							continue;
						} else {
							System.out.println("틀린비밀번호입니다.");
							continue;
						}
					} else {
						System.out.println("없는계좌입니다.");
						continue;
					}
				} else if (log != -1) {
					System.out.println("이미 로그인중입니다.");
					continue;
				}

				// else {}
				// System.out.println("로그인하시기바랍니다");
				// int inputAcc = sc.nextInt();

			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("이미 로그아웃중입니다");
					continue;
				} else {
					System.out.println("로그아웃되셨습니다");
					log = -1;
					continue;
				}
			} // 입금
			else if (sel == 3) {
				if (log == 1) {
					System.out.println("계좌를 입력해주시기 바랍니다.");
					int input = sc.nextInt();
					if (input == dbAcc1) {
						System.out.println("입금할 금액을 입력하세요");
						int inputMoney = sc.nextInt();
						dbMoney1 += inputMoney;
						System.out.println("입금이 완료됐습니다.");
						continue;
					} else {
						System.out.println("계좌를 확인해주시기바랍니다");
						continue;
					}
				} else if (log == 2) {
					System.out.println("계좌를 입력해주시기 바랍니다.");
					int input = sc.nextInt();
					if (input == dbAcc2) {
						System.out.println("입금할 금액을 입력하세요");
						int inputMoney = sc.nextInt();
						dbMoney2 += inputMoney;
						System.out.println("입금이 완료됐습니다.");
						continue;
					} else {
						System.out.println("계좌를 확인해주시기바랍니다");
						continue;
					}
				} else {
					System.out.println("로그인해주시기 바랍니다");
					continue;
				}

			} else if (sel == 4) {
				System.out.println("계좌를 입력해주시기 바랍니다.");
				int input = sc.nextInt();
				if (log == 1) {
					if (input == dbAcc1) {
						System.out.println("출금할 금액을 입력하세요");
						int outMoney = sc.nextInt();
						dbMoney1 -= outMoney;
						System.out.println("출금이 완료됐습니다.");
						continue;
					} else {
						System.out.println("계좌를 확인해주시기바랍니다");
						continue;
					}
				} else if (log == 2) {
					System.out.println("계좌를 입력해주시기 바랍니다.");
					int input1 = sc.nextInt();
					if (input1 == dbAcc2) {
						System.out.println("출금할 금액을 입력하세요");
						int outMoney = sc.nextInt();
						dbMoney2 -= outMoney;
						System.out.println("출금이 완료됐습니다.");
						continue;
					} else {
						System.out.println("계좌를 확인해주시기바랍니다");
						continue;
					}
				} else {
					System.out.println("로그인해주시기 바랍니다4");
					continue;
				}
			}

			else if (sel == 5) {
				if (log == 1) {
					System.out.println("이체할 금액을 입력하세요");
					int oMoney = sc.nextInt();
					if (dbMoney1 < oMoney) {
						System.out.println("잔고가 부족합니다");
					} else {
						dbMoney1 -= oMoney;
						dbMoney2 += oMoney;
						System.out.println("이체가 완료되었습니다");
						continue;
					}
				} else if (log == 2) {
					System.out.println("이체할 금액을 입력하세요");
					int oMoney = sc.nextInt();
					if (dbMoney1 < oMoney) {
						System.out.println("잔고가 부족합니다");
					} else {
						dbMoney2 -= oMoney;
						dbMoney1 += oMoney;
						System.out.println("이체가 완료되었습니다");
						continue;
					}
				} else {
					System.out.println("로그인해주시기 바랍니다");
					continue;
				}
			} // 조회
			else if (sel == 6) {
				if (log == -1) {
					System.out.println("로그인을 먼저 해주세요!");
					continue;
				} else {
					if (log == 1) {
						System.out.println("1님의 현재 잔액: " + dbMoney1 + "원");
					} else if (log == 2) {
						System.out.println("2님의 현재 잔액: " + dbMoney2 + "원");
					}
					continue;
				}
			} else if (sel == 0) {
				//run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}

	}
}

package lv1;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		/*
		 * # ATM[종합] 1. 로그인 . 로그인 후 재 로그인 불가 . 로그아웃 상태에서만 이용 가능 2. 로그아웃 . 로그인 후 이용가능 3.
		 * 입금 . 로그인 후 이용가능 4. 출금 . 로그인 후 이용가능 5. 이체 . 로그인 후 이용가능 6. 조회 . 로그인 후 이용가능 7.
		 * 종료
		 */
		Scanner scan = new Scanner(System.in);

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
			int sel = scan.nextInt();
			if (sel == 1) {
				if (log == -1) {
					System.out.println("계좌번호를 입력하세요");
					int inputAcc = scan.nextInt();
					if (inputAcc != dbAcc1 || inputAcc != dbAcc2) {
						System.out.println("없는 계좌입니다 계좌번호를 확인해주세요");
					} else if (inputAcc == dbAcc1) {
						System.out.println("1님 비밀번호를 입력해주세요");
						int inputdbPw1 = scan.nextInt();
						if (inputdbPw1 == dbPw1) {
							System.out.println("1님 로그인되셨습니다");
							log = +1;
						} else if (inputdbPw1 != dbPw1) {
							System.out.println("틀린 비밀번호입니다 ");
						} else if (inputAcc == dbAcc2) {
							System.out.println("2님 비밀번호를 입력해주세요");
							int inputdbPw2 = scan.nextInt();
							if (inputdbPw2 == dbPw2) {
								System.out.println("1님 로그인되셨습니다");
								log = +2;
							}
							if (inputdbPw2 != dbPw2) {
								System.out.println("틀린 비밀번호입니다 ");
							}
						} else {
							System.out.println("이미 로그인 되어 있습니다");
						}
						System.out.println("로그인하였습니다");

					} else if (sel == 2) {
						if (log == -1) {
							System.out.println("이미 로그아웃 되어 있습니다");
						} else {
							System.out.println("로그아웃이 되었습니다");
							log = -1;
						}
					} else if (sel == 3) {
						System.out.println("계좌번호를 입력하세요");
						int inputAcc2 = scan.nextInt();
						if (inputAcc2 != dbAcc1 || inputAcc2 != dbAcc2) {
							System.out.println("없는 계좌입니다 계좌번호를 확인해주세요");
						} else if (inputAcc2 == dbAcc1) {
							System.out.println("1님 비밀번호를 입력해주세요");
							int inputdbPw = scan.nextInt();
							if (inputdbPw == dbPw1) {
								System.out.println("1님 입금하실금액을 입력해주세요");
								int inputMoney = scan.nextInt();
								dbMoney1 += inputMoney;
							}
						} else if (inputAcc2 == dbAcc2) {
							System.out.println("2님 비밀번호를 입력해주세요");
							int inputdbPw = scan.nextInt();
							if (inputdbPw == dbPw2) {
								System.out.println("2님 입금하실금액을 입력해주세요");
								int inputMoney = scan.nextInt();
								dbMoney2 += inputMoney;
							}
						}
					} else if (sel == 4) {
						if (log == 1) {
							System.out.println("얼마를 출금하시겠습니까");
							int outMoney = scan.nextInt();
							if (outMoney <= dbMoney1) {
								dbMoney1 -= outMoney;
								System.out.println("입금이 완료됐습니다");
							} else if (outMoney > dbMoney1) {
								System.out.println("잔액이 부족합니다");
							}
						} else if (log == 2) {
							System.out.println("얼마를 출금하시겠습니까");
							int outMoney = scan.nextInt();
							if (outMoney <= dbMoney2) {
								dbMoney2 -= outMoney;
								System.out.println("입금이 완료됐습니다");
							} else if (outMoney > dbMoney2) {
								System.out.println("잔액이 부족합니다");
							}
						} else {
							System.out.println(" 로그인 해주시기바랍니다");
						}
					} else if (sel == 5) {
						if (log == 1) {
							System.out.println("이체할 계좌번호를 입력해주세요");
							int inputAcc3 = scan.nextInt();
							if (inputAcc3 != dbAcc2) {
								System.out.println("없는 계좌입니다 계좌번호를 확인해주세요");
							} else {
								System.out.println("이체할금액을 입력해주세요");
								int outMoney3 = scan.nextInt();
								if (outMoney3 <= dbMoney1) {
									System.out.println("이체가 완료됐습니다");
									dbMoney1 -= outMoney3;
									dbMoney2 += outMoney3;
								}
							}
						} else if (log == 2) {
							System.out.println("이체할 계좌번호를 입력해주세요");
							int inputAcc4 = scan.nextInt();
							if (inputAcc4 != dbAcc1) {
								System.out.println("없는 계좌입니다 계좌번호를 확인해주세요");
							} else {
								System.out.println("이체할금액을 입력해주세요");
								int outMoney4 = scan.nextInt();
								if (outMoney4 <= dbMoney2) {
									System.out.println("이체가 완료됐습니다");
									dbMoney2 -= outMoney4;
									dbMoney1 += outMoney4;
								}
							}
						} else {
							System.out.println("이미 로그인 해주시기바랍니다");
						}
					} else if (sel == 6) {
						if (log == 1) {
							System.out.println("현재잔액은 " + dbMoney1 + "원 입니다");
						}
						if (log == 2) {
							System.out.println("현재잔액은 " + dbMoney2 + "원 입니다");
						} else {
							System.out.println(" 로그인 해주시기바랍니다");
						}

					} else if (sel == 7) {
						run = false;

						System.out.println("프로그램 종료");

					}
				}
			}
		}
	}
}

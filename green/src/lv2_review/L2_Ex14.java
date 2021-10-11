package lv2_review;

import java.util.Scanner;

public class L2_Ex14 {

	public static void main(String[] args) {
		/*
		 * # ATM
		 * 1. 로그인
		 * . 로그인 후 재 로그인 불가
		 * . 로그아웃 상태에서만 이용 가능
		 * 2. 로그아웃
		 * . 로그인 후 이용가능
		 */


		Scanner sc = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;

		int log = -1; // -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)

		boolean run = true;
		while (run) {

			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				if (log == -1) {
					System.out.println("아디를 입력해주세요");
					int inputId = sc.nextInt();
					System.out.println("비번을 입력해주세요");
					int inputPw = sc.nextInt();
					if (inputId == dbAcc1 && inputPw == dbPw1) {
						log = 1;
						System.out.println(dbAcc1 + "님, 로그인되셨습니다.");
					} else if (inputId == dbAcc2 && inputPw == dbPw2) {
						log = 2;
						System.out.println(dbAcc2 + "님, 로그인되셨습니다.");
					} else {
						System.out.println("계좌번호와 비밀번호를 확인해주세요.");
					}

				} else {
					System.out.println("로그아웃을 먼저해주세요");
				}

			} else if (sel == 2) {
				if (log == 1) {
					System.out.println("로그아웃되셨습니다");
					log = -1;
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

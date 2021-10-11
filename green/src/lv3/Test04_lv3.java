package lv3;

import java.util.Scanner;

public class Test04_lv3 {

	public static void main(String[] args) {
		// 시작 16:45
		// 종료 17:25
		// 소요 40분
		/*
		 * # 회원가입 1. 가입 . 아이디 와 비밀번호를 입력받아 가입 . 아이디 중복검사 
		 * 2. 탈퇴 . 아이디 를 입력받아 탈퇴
		 */
		Scanner sc = new Scanner(System.in);
		int[] id = { 1001, 1002, 0, 0, 0 };
		int[] pw = { 1111, 2222, 0, 0, 0 };

		boolean run = true;
		int cnt = 2;
		while (run) {
			for (int i = 0; i < 5; i++) {
				System.out.print("아디: " + id[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < 5; i++) {
				System.out.print("비번: " + pw[i] + " ");
			}
			System.out.println();

			System.out.println("#회원가입");
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");

			System.out.println("메뉴를 선택해주세요");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("id를 입력해주세여");
				int inputId = sc.nextInt();

				boolean check = true;
				for (int i = 0; i < cnt; i++) {
					if (id[i] == inputId) {
						check = false;
					}
				}
				if (check = true) {
					System.out.println("비밀번호를 입력해주세요.");
					int inputPw = sc.nextInt();

					id[cnt] = inputId;
					pw[cnt] = inputPw;
					cnt++;

					System.out.println("회원가입이 되었습니다");
				} else {
					System.out.println("중복된 아이디입니다.");
				}

			} else if (sel == 2) {
				System.out.println("탈퇴할 아이디를 입력하세요");
				int inputId = sc.nextInt();

				int didx = -1;
				for (int i = 0; i < 5; i++) {
					if (id[i] == inputId) {
						didx = i;
					}
				}
				if (didx != -1) {
					System.out.println("탈퇴할 아이디의 비밀번호를 입력하세요");
					int inputPw = sc.nextInt();

					if (pw[didx] == inputPw) {
						for (int i = didx; i < cnt - 1; i++) {
							id[i] = id[i + 1];
							pw[i] = pw[i + 1];
						}
						id[cnt - 1] = 0;
						pw[cnt - 1] = 0;
						cnt--;

					} else {
						System.out.println("탈퇴할 아이디의 비밀번호가 틀립니다");
					}

				} else {
					System.out.println("탈퇴할 아디가 존재하지않습니다.");
				}
			} else if (sel == 3) {
				System.out.println("종료하겠습니다");
				break;
			}

		}

	}

}

package lv4;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		/*
		 * # 회원가입 
		 * 1. 가입
		 * . 아이디 와 비밀번호를 입력받아 가입
		 * . 아이디 중복검사
		 * 2. 탈퇴
		 * . 아이디 를 입력받아 탈퇴
		 */
		Scanner sc = new Scanner(System.in);
		int[] ids = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		int cnt = 2;
		boolean run = true;
		while (run) {
			for (int k = 0; k < ids.length; k++) {
				System.out.printf("아이디%d  비번%d", ids[k], pws[k]);
				System.out.println();
			}
			System.out.println("\n1.가입");
			System.out.println("2.탈퇴");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("아이디를 입력해주세요");
				int inputId = sc.nextInt();
				System.out.println("비밀번호를 입력해주세요");
				int inputPw = sc.nextInt();

				boolean check = true;
				for (int i = 0; i < 5; i++) {
					if (ids[i] == inputId) {
						check = false;
					}
				}

				if (ids != null && check == true) {
					int temp[] = ids;
					int temp2[] = pws;
					ids = new int[5];
					pws = new int[5];
					for (int i = 0; i < 5; i++) {
//					if (inputId != ids[i]) {						
						ids[i] = temp[i];
						pws[i] = temp2[i];
//					}else {
//						System.out.println("중복된 아이디입니다");
//					}
					}
					ids[cnt] = inputId;
					pws[cnt] = inputPw;
					cnt++;
					System.out.println(inputId + "님 회원가입이 완료되었습니다");
				} else {
					System.out.println("중복된 아이디입니다");
				}
			}

			else if (sel == 2) {
				System.out.println("탈퇴할 아이디를 입력하세요");
				int inputId = sc.nextInt();

				int didx = -1;
				for (int i = 0; i < 5; i++) {
					if (ids[i] == inputId) {
						didx = i;
					}
				}

				if (didx != -1) {
					System.out.println("비번입력해주세요");
					int inputPw = sc.nextInt();

					if (pws[didx] == inputPw) {
						for (int i = didx; i < cnt - 1; i++) {
							ids[i] = ids[i + 1];
							pws[i] = pws[i + 1];
						}
						ids[cnt - 1] = 0;
						pws[cnt - 1] = 0;
						cnt--;

					}else {
						System.out.println("비밀번호가 일치하지않습니다");
					}

				}else {
					System.out.println("가입되지 않은 아이디입니다");
				}

			}
		}

	}

}

package lv4;

import java.util.Scanner;

public class Ex22_hint {

	public static void main(String[] args) {
		/*
		 * 0인덱스 : 회원의 log값
		 * 1인덱스 : 아이템의 index
		 * 
		 * {0,1}
		 * {0,1}
		 * {1,1}
		 * {1,1}
		 *...
		 */
		
		
		/*
		 * # 쇼핑몰 [장바구니]
		 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
		 * 	1) 사과
		 *  2) 바나나
		 *  3) 딸기
		 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
		 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
		 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
		 * 예)
		 * {
		 * 		{0, 1},				qwer회원 			> 사과구매
		 * 		{1, 2},				javaking회원 		> 바나나구매
		 * 		{2, 1},				abcd회원			> 사과구매
		 * 		{0, 3},				qwer회원			> 딸기구매
		 * 		...
		 * }
		 */
		Scanner sc = new Scanner(System.in);			
			String[] ids = {"qwer", "javaking", "abcd"};
			String[] pws = {"1111",     "2222", "3333"};
			int MAX_SIZE = 100;
			int[][] jang = new int[MAX_SIZE][2];
			int count = 0;
			String[] items = {"사과", "바나나", "딸기"};
			int log = -1;		//-1로그아웃상태
			while (true) {
				System.out.println("[MART]");
				System.out.println("[1]로 그 인");
				System.out.println("[2]로그아웃");
				System.out.println("[3]쇼     핑");
				System.out.println("[4]장바구니");
				System.out.println("[0]종     료");
				System.out.print("메뉴 선택 : ");
				int sel = sc.nextInt();

				if (sel == 1) {
					if (log == -1) {
						System.out.println("아이디를 입력하세요");
						String inputId = sc.next();
						System.out.println("비밀번호를 입력하세요");
						String inputPws = sc.next();
						for (int i = 0; i < 3; i++) {
							if (ids[i].equals(inputId) && pws[i].equals(inputPws)) {
								System.out.println(inputId + " 님 로그인되셨습니다");
								log = 1;
							}
						}

					} else {
						System.out.println("로그아웃을 먼저해주세요");
					}
				} else if (sel == 2) {
					if (log != -1) {
						System.out.println("로그아웃되셨습니다");
						log = -1; // 이부분놓침
					} else {
						System.out.println("로그인을 먼저해주세요");
					}

				} else if (sel == 3) {
					if (log == 1) {
						boolean run = true;
						while (run) { // 이부분놓침
							for (int i = 0; i < items.length; i++) {
								System.out.printf("%d) %s\n", i + 1, items[i]);
							}
							System.out.println("0) 뒤로가기");
							System.out.print("구매할상품을 선택해주세요");
							int buyI = sc.nextInt() - 1;
							if (buyI == -1) { // 0입력시 인덱스는 -1
								break;
							}
							if (buyI >= 0 && buyI < items.length) { // 이부분놓침
								jang[count][0] = log; //
								jang[count][1] = buyI;
								count++;
							}
						}
					} else {
						System.out.println("로그인을 먼저해주세요");
					}

				} else if (sel == 4) { // 이부분이 특히어려움
					int myitem[] = new int[items.length];

					if (log != -1) {
						for (int i = 0; i < count; i++) {
							if (jang[i][0] == log) {
								myitem[jang[i][1]]++; 
							}
						}

						for (int i = 0; i < myitem.length; i++) {
							if (myitem[i] > 0) {
								System.out.print(items[i] + ": ");
								System.out.println(myitem[i] + "개");
							}
						}

					} else {
						System.out.println("로그인을 먼저해주세요");
					}

				} else if (sel == 0) {
					System.out.println("프로그램 종료");
					break;
				}
			}

		}

	}

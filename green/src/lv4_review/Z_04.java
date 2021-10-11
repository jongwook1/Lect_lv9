package lv4_review;

import java.util.Scanner;

public class Z_04 {

	public static void main(String[] args) {
		//시작 14:00
		//종료 14:45(쉬는시간걸침)
		//소요 00:30
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

		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		int cnt = 0;
		String[] items = { "사과", "바나나", "딸기" };
		int log = -1;
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
					System.out.println("아디입력해주세요");
					String id = sc.next();
					System.out.println("비번입력해주세요");
					String pw = sc.next();
					for (int i = 0; i < ids.length; i++) {
						if (ids[i].equals(id) && pws[i].equals(pw)) {
							System.out.println(id + " 님 로그인되셨습니다");
							log = i;
						}
					}
				} else {
					System.out.println("로그아웃먼저해주세요");
				}
			} else if (sel == 2) {
				if (log != -1) {
					System.out.println("로그아웃되셧습니다");
				} else {
					System.out.println("로그인을 먼저해주세요");
				}
			} else if (sel == 3) {
				if (log != -1) {
					while (true) {
						for (int i = 0; i < items.length; i++) {
							System.out.printf("%d%s\n", i + 1, items[i]);
						}
						System.out.println("0)뒤로가기");
						System.out.println("번호를 선택해주세요");
						int pick = sc.nextInt() - 1;
						if (pick == -1) {
							break;
						} else if (pick >= 0 && pick < items.length) {
							jang[cnt][0] = log;
							jang[cnt][1] = pick; // 0//1//2
							cnt++;
						}
					}
				}
			} else if (sel == 4) {
				int myItem[] = new int[items.length];

				for (int i = 0; i < cnt; i++) {
					if (jang[i][0] == log) {
						myItem[jang[i][1]]++;
					}
				}
				for (int i = 0; i < myItem.length; i++) {
					if (myItem[i] > 0) {
						System.out.print(items[i] + " ");
						System.out.println(myItem[i] + " ");
					}
				}
			} else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}

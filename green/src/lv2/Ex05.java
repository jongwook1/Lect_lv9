//내가한거
package lv2;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 보조제어문을 사용해
		/*
		 * # 쇼핑몰 뒤로가기
		 * 
		 * 문제) 쇼핑몰메인메뉴에서 남성의류를 선택해서 뒤로가기 누르기전까지 남성의류 페이지 를 유지하려고한다. 힌트) 개층 별로 반복문을 추가
		 * 해주면된다. 1. 남성의류 1) 티셔츠 2) 바지 3) 뒤로가기 2. 여성의류 1) 가디건 2) 치마 3) 뒤로가기 3. 종료
		 */

		Scanner sc = new Scanner(System.in);
		boolean isRun = true;

		while (isRun) {
			System.out.println(" -----green shop-----");
			System.out.println("1.남성의류 \n2.여성의류\n3. 종료");
			System.out.println("----------");
			System.out.println("메뉴입력");
			int sel = sc.nextInt();
			if (sel == 1) {
				boolean dpr = true;
				while (dpr) {
					System.out.println("1.남성의류");
					System.out.println("    1)티셔츠");
					System.out.println("    2)바지");
					System.out.println("    3)뒤로가기");

					sel = sc.nextInt();
					if (sel == 1) {
						System.out.println("1.티셔츠");
						continue;
					} else if (sel == 2) {
						System.out.println("2.바지");
						continue;
					} else if (sel == 3) {
						break;
					}
				}
			} else if (sel == 2) {
				boolean dpr = true;
				while (dpr) {
					System.out.println("1.여성의류");
					System.out.println("    1)가디건");
					System.out.println("    2)치마");
					System.out.println("    3)뒤로가기");

					sel = sc.nextInt();
					if (sel == 1) {
						System.out.println("1.가디건");
						continue;
					} else if (sel == 2) {
						System.out.println("2.치마");
						continue;
					} else if (sel == 3) {
						break;
					}
				}
			} else if (sel == 3) {
				System.out.println("종료하겠습니다");
				isRun = false;
			}

		}

	}
}

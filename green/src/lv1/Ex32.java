package lv1;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		/*
		 * # 쇼핑몰 뒤로가기
		 * 
		 * 문제) 쇼핑몰메인메뉴에서 남성의류를 선택해서 
		 *      뒤로가기 누르기전까지 남성의류 페이지 를 유지할려고한다.
		 * 힌트) 개층 별로 반복문을 추가 해주면된다. 
		 * 1. 남성의류
		 * 		1) 티셔츠
		 * 		2) 바지
		 * 		3) 뒤로가기
		 * 2. 여성의류
		 * 		1) 가디건
		 * 		2) 치마
		 * 		3) 뒤로가기
		 * 3. 종료
		 */

		// escape 문자
		// \n : 줄바꿈
		// \t : 탭(공백 4칸)

		Scanner sc = new Scanner(System.in);

		boolean isRun = true;

		while (isRun) {
			System.out.println(" -----green shop-----");
			System.out.println("1.남성의류 \n2.여성의류\n3. 종료");
			System.out.println("----------");
			System.out.println("메뉴입력");
			int sel = sc.nextInt();

			if (sel == 1) {
				boolean depth = true;
				while (depth) {
					System.out.println(" -----남성의류-----");
					System.out.println("1.티셔추");
					System.out.println("2.바지");
					System.out.println("뒤로가기");
					System.out.println("----");
					System.out.println("메뉴입력");
					sel = sc.nextInt();

					if (sel == 1) {
						System.out.println("티셔츠1개를 선택하셨습니다.");
					} else if (sel == 2) {
						System.out.println("바지1개를 선택하셨습니다.");
					} else if (sel == 3) {// 뒤로가기
						depth = false;
					}
				}
			} else if (sel == 2) {
				boolean depth = true;
				while(depth) {
				System.out.println(" -----여성의류-----");
				System.out.println("1.티셔추");
				System.out.println("2.바지");
				System.out.println("뒤로가기");
				System.out.println("----");
				System.out.println("메뉴입력");
				sel = sc.nextInt();
				if (sel == 1) {
					System.out.println("티셔츠1개를 선택하셨습니다.");
				} else if (sel == 2) {
					System.out.println("바지1개를 선택하셨습니다.");
				} else if (sel == 3) {// 뒤로가기
					depth = false;
				}
				}
			} else if (sel == 3) {
				System.out.println("종료하겠습니다");
				isRun = false;
			}
		}

	}

}

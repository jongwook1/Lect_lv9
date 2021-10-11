package lv1_review;

import java.util.Scanner;

public class Ex08_l1 {

	public static void main(String[] args) {
		/*
		 * # 로그인[1단계]
		 * 1. Id와 Pw를 입력받는다.
		 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
		 * 예) 로그인 성공 or 로그인 실패
		 */

		int dbId = 1234;
		int dbPw = 1111;

		
		Scanner sc = new Scanner(System.in);

		System.out.println("아디입력해주세요");
		int id=sc.nextInt();
		System.out.println("비번입력해주세요");
		int pw=sc.nextInt();
		
		if(dbId==id&&dbPw==pw) {
			System.out.println("로그인성공!");
		}if(dbId!=id||dbPw!=pw) {
			System.out.println("로그인실패!");
		}

	}

}

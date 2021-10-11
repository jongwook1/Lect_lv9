package lv1_review;

import java.util.Scanner;

public class Ex09_l1 {

	public static void main(String[] args) {
		/*
		 * # 로그인[2단계]
		 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
		 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
		 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
		 * 예) 로그인 성공 or 로그인 실패
		 */

		int dbId = 0;
		int dbPw = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("ㅡㅡㅡ회원가입ㅡㅡㅡㅡ");
		System.out.println("가입할 아디입력해주세요");
		dbId = sc.nextInt();
		System.out.println("가입할 비번입력해주세요");
		dbPw = sc.nextInt();

		System.out.println("로그인");
		System.out.println("아디입력해주세요");
		int myId = sc.nextInt();
		System.out.println("아디입력해주세요");
		int myPw = sc.nextInt();

		if (dbId == myId && dbPw == myPw) {
			System.out.println("로그인성공");
		}
		if (dbId != myId || dbPw != myPw) {
			System.out.println("로그인실패");
		}

	}

}

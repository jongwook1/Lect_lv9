package lv1_review;

import java.util.Scanner;

public class Ex10_l1 {

	public static void main(String[] args) {
		/*
		 * # 로그인[3단계]
		 * 1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
		 * 2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
		 * 3. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
		 * 4. Id와 Pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
		 */

		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ㅡㅡㅡㅡㅡ로그인ㅡㅡㅡㅡㅡㅡ");
		System.out.println("아디입력해주세요");
		int myId=sc.nextInt();
		
		if(dbId==myId) {
			System.out.println("비번을입력해주세요");
			int myPw=sc.nextInt();
			if(dbPw==myPw) {
				System.out.println("로그인성공");
			}else {
				System.out.println("비번을확인해주세요");
			}
		}else {
			System.out.println("아디를 확인해주세요");
		}
		
	}

}

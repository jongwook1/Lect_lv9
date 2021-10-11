package lv5;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/*
		 * # 문자열 비교
		 * . equals() 메서드 사용없이 문자의 일치여부 비교
		 * 예)
		 * 코끼리
		 * 입력 = 티라노사우루스
		 * 출력 = false
		 */
		
		Scanner sc = new Scanner(System.in);
		String name = "코끼리";
		System.out.print("동물 이름을 입력하세요 : "); // ex) 티라노사우루스
		String myName = sc.next();

		int check = -1;
		if (name.length() == myName.length()) { // 글자 길이가 같으면 일치하는문자일확률있음
			check = 1;
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) != myName.charAt(i)) { // 문자열의 인덱스 하나씩비교
					check = -1;
				}

			}
		}
		if (check == 1) {
			System.out.println("true");
		} else if (check == -1) {
			System.out.println("false");
		}

	}

}

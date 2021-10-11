package lv5;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * # 단어 검색
		 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
		 * 2. 단어가 존재하면 true
		 *    단어가 없으면 false를 출력한다.
		 */

		Scanner sc = new Scanner(System.in);
		String text = "Life is too short.";
		System.out.println(text);
//		System.out.print(text.substring(12,  text.length()-1));
		System.out.println();
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = sc.next();

		String result[] = text.split(" "); // 단어 분리하기
		for (int i = 0; i < result.length; i++) { // 분리 잘되었는지 확인
			System.out.println(result[i]);
		}

		System.out.println();

		int cnt = 0;
		for (int i = 0; i < result.length; i++) {
			if (word.equals(result[i])) {
				cnt = 1;
				break;
			} else if (i == result.length - 1) {	//마지막단어의 .빼고 검사하기
				if (word.equals(text.substring(12, text.length() - 1))) {
					cnt = 1;
					break;
				}
			} else {
				cnt = 2;
			}
		}
		if (cnt == 1)
			System.out.println("true");
		else if (cnt == 2)
			System.out.println("false");

	}
}

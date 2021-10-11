package lv5;

import java.util.Scanner;

//시작 16:00
//종료 16:20
//소요 00:20
public class Test_lv5_2 {

	public static void main(String[] args) {
		/*
		 * # 단어 교체하기(replace)
		 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
		 * 2. 교체해주는 기능을 구현한다.
		 * 예)
		 * 		Life is too short.
		 * 		변경하고 싶은 단어입력 : Life
		 * 		바꿀 단어입력 : Time
		 * 
		 * 		Time is too short.
		 */

//		. next() 메서드는 공란을 기준으로 끊어옴
//		. nextLint() 메서드는 줄바꿈을 기준으로 가져옴

		
		Scanner sc = new Scanner(System.in);

		String text = "Life is, too short!";

		System.out.println(text);
//		for(int i=0;i<text.length();i++) {
//			System.out.print(i);
//		}
		System.out.print("\n검색할 단어를 입력하세요");
		String word = sc.nextLine();

		char temp[] = new char[text.length()];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = text.charAt(i);
//			System.out.print(temp[i]);
		}

		int wordSize = word.length();

		int idx = -1;
		boolean check = false;
		for (int i = 0; i < temp.length - wordSize + 1; i++) {
			int cnt = 0;
			for (int j = 0; j < wordSize; j++) {
				if (temp[i + j] == word.charAt(j)) {
					cnt++;
				}
			}
			if (cnt == wordSize) {
				check = true;
				idx = i;
			}
		}

		if (check == true) {
			System.out.println("바꿀단어이를 입력하세요");
			String cWord = sc.nextLine();

			String front = text.substring(0, idx);
			String back = text.substring(idx + word.length());
			String answer = front + cWord + back;
			System.out.print(answer);
		}

	}

}

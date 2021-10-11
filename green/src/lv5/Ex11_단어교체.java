package lv5;

import java.util.Scanner;

public class Ex11_단어교체 {

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
		for (int i = 0; i < text.length(); i++) {
			System.out.print(i);
		}
		System.out.print("\n검색할 단어를 입력하세요 : ");
		String word = sc.nextLine();

		// text담을 temp배열
		char temp[] = new char[text.length()];

//        System.out.println(temp.length);            //temp배열의크기가 text.length와 같은지 확인

		// temp에 text문자 넣기
		for (int i = 0; i < temp.length; i++) {
			temp[i] = text.charAt(i);
//            System.out.println(temp[i]);            //문자 잘들어갔나 확인
		}

		// 검색할 단어인 word의 길이를 size변수에 담음
		int size = word.length();

		int idx = -1;
		boolean check = false;
		for (int i = 0; i < temp.length - size + 1; i++) { // temp.length-size+1인 이유 size를 빼지 않으면 i가 size를 안뺀만큼 더 돌아서
															// 아웃바운스오류 //+1을 하지않으면 text의 끝을 포함하여 검색햇을시 +1을 안하면 찾지못함
			int cnt = 0;
			for (int j = 0; j < size; j++) {
				if (temp[i + j] == word.charAt(j)) {
					cnt++;
				}
			}
			if (cnt == word.length()) {
				check = true;
				idx = i;				//ife검색시 idx=1 fe 검색시 idx=2 
			}
		}
		if (check == true) {
			System.out.println("바꿀단어를 입력하세요");
			String cWord = sc.nextLine();

			String front = text.substring(0, idx);
			String back = text.substring(idx + word.length());

			String answer = front + cWord + back;
			System.out.print(answer);
		}
	}
}

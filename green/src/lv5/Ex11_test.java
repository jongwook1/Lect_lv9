package lv5;

import java.util.Scanner;

public class Ex11_test {

	public static void main(String[] args) {
//		 * # 단어 교체하기(replace)
//		 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
//		 * 2. 교체해주는 기능을 구현한다.
//		 * 예)
//		 * 		Life is too short.
//		 * 		변경하고 싶은 단어입력 : Life
//		 * 		바꿀 단어입력 : Time
//		 * 
//		 * 		Time is too short.

		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		char[] arr = new char[text.length()];
		for(int i = 0; i < text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		//검사의 for문 (arr[i]에 변경하고 싶은 단어가 들어있는지)
		int idx = -1;
		int check = -1;
		int size = word.length();
		for(int i = 0; i < arr.length-size+1; i++) {
			int cnt = 0;
			for(int j = 0; j < size; j++) {
				if(arr[i+j] == word.charAt(j)) {
					cnt++;
				}
			}
			if(cnt == size) {
				check = 1;
				idx = i;			//ife검색시 idx=1 fe 검색시 idx=2 
			}
		}
//		System.out.println("idx "+idx);
		if(check == 1) {
			//바꿀 단어를 입력하면 --> 변경하고자 하는 단어랑 자리 교체. 
			//바꿀 단어 입력.
			System.out.print("바꿀 단어를 입력하세요 : ");
			String transWord = scan.nextLine();
			
			//변경하고자 하는 단어 확인 및 교체.
			// 0) idx~idx+word.length() 를 (삭제)
			// 1) idx를 기준으로 앞부분을 substring하고, idx+word.length()이후로 잘라내기.
			// 2) front + new + back
			
			String front = text.substring(0,idx);
			String back = text.substring(idx+word.length());
			
//			front = transWord;
//			System.out.println(front);
			System.out.println(back);
			
			text = front + transWord + back;
			System.out.println(text);
//			System.out.println(front + transWord + back);
			
		}
		else {
			System.out.println("변경할 단어가 없습니다.");
		}




	}

}

package lv5;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 * # 끝말잇기 게임
		 * 제시어 : 자전거
		 * 입력 : 거미
		 * 제시어 : 거미
		 * 입력 : 미술
		 * ...
		 */
		Scanner sc = new Scanner(System.in);

		String start = "자전거";
		System.out.println(start.length());
		while (true) {

			System.out.println("제시어 : " + start);
//		System.out.println(start.charAt(start.length()-1));
//		System.out.println(start.substring(2,3));
//		System.out.println(start.substring(start.length()-1,start.length()));
//		System.out.println(start.substring(0,start.length()-(start.length()-1)));

			String inputName = sc.next();

			if (start.substring(start.length() - 1, start.length())
					.equals(inputName.substring(0, inputName.length() - (inputName.length() - 1)))) {
				System.out.println(
						"내가 입력한 문자의 첫글자: " + inputName.substring(0, inputName.length() - (inputName.length() - 1)));
				start = inputName;
			}
		}

	}

}

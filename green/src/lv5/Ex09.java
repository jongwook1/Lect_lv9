package lv5;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		/*
		 * # 문자열 속 숫자검사
		 * 예) adklajsiod
		 * 	     문자만 있다.
		 * 예) 123123
		 *    숫자만 있다.
		 * 예) dasd12312asd
		 *    문자와 숫자가 섞여있다.
		 */
		
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 : ");
			String text = sc.next();

			char n[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

			int cnt = 0;
			for (int i = 0; i < n.length; i++) {
				for (int j = 0; j < text.length(); j++) {
					if (n[i] == text.charAt(j)) {
						cnt++;
					}
				}
			}

			if (cnt == 0) {
				System.out.println("문자만있다");
			} else if (cnt == text.length()) {
				System.out.println("숫자만있다");
			} else {
				System.out.println("문자와 숫자가 섞여있다");
			}
		}
	}
}

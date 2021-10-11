package lv5;

import java.util.Scanner;

public class Ex09_t_moonja_VS_number {

	public static void main(String[] args) {
		/*
		 * # 문자열 속 숫자검사
		 * 예) adklajsiod
		 * 	    문자만 있다.
		 * 예) 123123
		 *    숫자만 있다.
		 * 예) dasd12312asd
		 *    문자와 숫자가 섞여있다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = sc.next();
		int check = 0;
		for (int i = 0; i < text.length(); i++) {
			int x =  text.charAt(i);			//문자형을 ascii로 바꿔줌?
			if (x >= (int) '0' && x <= (int) '9') {		//문자형0은48...문자형1은49...........문자형9는57  ????
				check++;
			}
		}
		// print
		if (check == text.length()) {
			System.out.println("숫자만 있다.");
		} else if (check == 0) {
			System.out.println("문자만 있다.");
		} else {
			System.out.println("둘 다 있다.");
		}

	}

}

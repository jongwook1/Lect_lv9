package lv2;

import java.util.Scanner;

public class Test6_lv2 {

	public static void main(String[] args) {
		// 시작 12:25
		// 종료 00:28
		// 소요 3분

		/*
		 * 5회 반복을 하면서 정수를 입력받는다. 2. 입력받은 정수를 전부 합을 출력한다. 3. 만약에 입력받은 합이 100 이상이면 반복이 5회가
		 * 아닐지라도 즉시 종료
		 * 
		 * 예) 7 ==> 합 : 7 , 14 ==> 합 : 21 , 1000 ==> 합 : 1021 !종료
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int total = 0;

		while (a < 5) {
			System.out.println("숫자를 입력하세요");
			int input = sc.nextInt();
			total += input;
			if (total >= 100) {
				System.out.println("합 100이 넘으므로 종료하겠습니다.");

				break;
			}
			a++;
		}
		System.out.println("5회 입력을 초과하였으로 종료");

	}

}

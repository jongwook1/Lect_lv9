package lv2_review;

import java.util.Scanner;

public class L2_test6 {

	public static void main(String[] args) {
		/*
		 * # 답없음 문제 
		 * 1. 5회 반복을 하면서 정수를 입력받는다.
		 * 2. 입력받은 정수를 전부 합을 출력한다. 
		 * 3. 만약에 입력받은 합이 100 이상이면  반복이 5회가 아닐지라도 즉시 종료 
		 * 
		 * 예) 7 ==> 합 : 7 ,  14 ==> 합 : 21 , 1000 ==> 합 : 1021 !종료
		 * 
		 */	
		
		Scanner sc = new Scanner(System.in);

		int total = 0;
		int i = 0;
		while (i < 5) {
			System.out.println("정수입력하세요");
			int inputN = sc.nextInt();
			total += inputN;
			if (total >= 100) {
				System.out.println("100이상이므로 종료합니다");
				break;
			}
			i++;
		}
		System.out.println("5회 초과했으므로 종료");
	}

}

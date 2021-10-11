package lv1_review;

import java.util.Scanner;

public class Ex24_r_l1 {

	public static void main(String[] args) {
		/*
		 * # 지하철 요금 계산
		 * 1. 이용할 정거장 수를 입력받는다.
		 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
		 * 3. 요금표
		 * 1) 1~5	: 500원
		 * 2) 6~10	: 600원
		 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)
		 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
		 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
		 * ... 
		 */
		Scanner sc = new Scanner(System.in);
		int inputN = sc.nextInt();

		int price = 0;

		if (1 >= inputN && inputN <= 5) {
			price = 500;
		} else if (6 >= inputN && inputN <= 10) {
			price = 600;
		} else {
			int add = inputN - 10;
			if (inputN % 2 == 1) {
				add += 1;
			}
			price = 600 + add / 2 * 50;
		}
		System.out.println("지하철의 요금은: " + price);

	}

}

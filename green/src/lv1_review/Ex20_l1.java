package lv1_review;

import java.util.Scanner;

public class Ex20_l1 {

	public static void main(String[] args) {
		/*
		 * # ATM[1단계] : 이체하기
		 * 1. 이체할 계좌번호를 입력받는다.
		 * 2. 계좌번호가 일치하면,
		 * 3. 이체할 금액을 입력받는다.
		 * 4. 이체할 금액 <= myMoney	: 이체가능
		 * 			myMoney   - 이체할 금액
		 * 			yourMoney + 이체할 금액
		 *    이체할 금액  > myMoney 	: 이체불가
		 */

		int myAcc = 1234;
		int myMoney = 8700;

		int yourAcc = 4321;
		int yourMoney = 12000;

		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");

		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호입력해주세요");
		int inputAcc = sc.nextInt();

		if (yourAcc == inputAcc) {
			System.out.println("이체할 금액 입력해주세요");
			int inputMoney = sc.nextInt();
			if (myMoney >= inputMoney) {
				myMoney -= inputMoney;
				yourMoney += inputMoney;
				System.out.println("이체완료");
			} else {
				System.out.println("잔액이부족합니다");
			}
		} else {
			System.out.println("계좌가 일치하지 않습니다");
		}

		System.out.println("myMoney:" + myMoney);
		System.out.println("yourMoney:" + yourMoney);

	}

}

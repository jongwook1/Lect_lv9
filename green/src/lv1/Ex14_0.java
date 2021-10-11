package lv1;
import java.util.Random;
import java.util.Scanner;
public class Ex14_0 {

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
		
		Random ran = new Random();
		int rNum = ran.nextInt();	
		//1. 로그인 2. 종료
		// 로그인 -> 1. 입금 2. 출금 3.조회
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		int yourAcc = 4321;
		int yourMoney = 12000;
	
		
		//입력받기
		System.out.println("이체할 계좌번호를 입력하세요");
		int inputAcc = sc.nextInt();
		
		//계좌확인
		if(inputAcc == yourAcc) {
			int inputMoney = sc.nextInt();
			//유효성검사
			if(inputMoney> myMoney) {
				System.out.println("잔액이 부족합다");
			}else {
				//System.out.println("이체완료, 나의 잔액: "(마이머니-인풉머니); 틀린거
				myMoney -= inputMoney;
				yourMoney += inputMoney;
			}
			
		}else {
			System.out.println("존재하지 않는 계좌입니다");
		}
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
		
		/*myAcc = sc.nextInt();
		if(myAcc == 1234) {
			myAcc = sc.nextInt();
			System.out.println("myMoney = " + myMoney + "원" + "이체가능");
			myMoney = sc.nextInt();
			if(myMoney == 8700) {				
				System.out.println("yourMoney = " + yourMoney + "원");			
			}
			else {
				System.out.println("이체불가");
			}
		}	*/		

	}

}



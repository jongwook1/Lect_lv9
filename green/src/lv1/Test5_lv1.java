package lv1;

import java.util.Scanner;

public class Test5_lv1 {

	public static void main(String[] args) {
		// 직접구현 1. 가위바위보 3단계 
				// 시작 10:24
				// 종료 10:48
				// 소요 22분 00		
		/*
		 * # 영수증 출력[1단계]
		 * 1. 메뉴판을 출력한다.
		 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
		 * 3. 현금을 입력받는다.
		 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
		 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
		 */

		int price1 = 50000;
		int price2 = 60000;
		int price3 = 70000;
		System.out.println("그린컴퓨터몰");
		System.out.println("1.컴터가격 = " + price3 + "원입니다");
		System.out.println("2.스피커가격 = " + price2 + "원입니다");
		System.out.println("3.마우스가격 = " + price1 + "원입니다");
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("주문할 번호를 입력하세요");
		int choice = sc.nextInt();
		
		
		int total = 0;
		
		if(choice == 1) {
			total = price1;	
		}else if(choice == 2) {
			total = price2;	
		}else if(choice == 3) {
			total = price3;	
		}else {
			System.out.println("없는 메뉴입니다");
			}
		
		System.out.println("주실 현금을 입력하세요");
		int intputMoney = sc.nextInt();
		if(total != 0) {
		if(total > intputMoney) {
			System.out.println("현금이 부족합니다!");
		}else {
			System.out.println("----영 수 증 ---");
			if(total == price3) {
				System.out.println("컴터가격" + price3 + " 원입니다");
			}
			else if(total == price2) {
				System.out.println("스피커" + price2 + " 원입니다");
			}
			else if(total == price1) {
				System.out.println("마우스가격" + price1 + " 원입니다");
			}
			System.out.println("거스름돈은" +  + (intputMoney-total) + "원입니다");
			System.out.println("저희매장을 이용해주셔서 감사합니다");		
			}	
		}		
	}
}

package lv1_review;

import java.util.Scanner;

public class L1_t5 {

	public static void main(String[] args) {
		/*
		 * # 영수증 출력[1단계]
		 * 1. 메뉴판을 출력한다.
		 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
		 * 3. 현금을 입력받는다.
		 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
		 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
		 */
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		System.out.println("메뉴 선택해주세요");
		int sel=sc.nextInt();
		
		System.out.println("지불할금액 입력해주세요");
		int outM=sc.nextInt();
		
		int charge=0;
		if(sel==1) {			
				charge=outM-price1;		
		}else if(sel==2) {
			charge=outM-price2;		
		}else if(sel==3) {
			charge=outM-price3;		
		}
		if(charge>=0) {
			System.out.println("잔돈: "+charge+"원");
		}
		if(charge<0) {
			System.out.println("구매할 돈이부족합니다");
		}
		

	}

}

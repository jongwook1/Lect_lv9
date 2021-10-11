package lv2_review;

import java.util.Scanner;

public class L2_Ex03 {

	public static void main(String[] args) {
		/*
		 * # 영수증 출력[2단계]
		 * 1. 5번 주문을 받는다.
		 * 2. 주문이 끝난 후, 돈을 입력받는다.
		 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
		 * 
		 * 예)
		 * 메뉴 선택 : 1
		 * 메뉴 선택 : 1
		 * 메뉴 선택 : 2
		 * 메뉴 선택 : 2
		 * 메뉴 선택 : 3
		 * 총 금액 = 31300원
		 * 현금 입력 : 32000
		 * === 롯데리아 영수증 ===
		 * 1. 불고기 버거 : 2개
		 * 2. 새우    버거 : 2개
		 * 3. 콜         라 : 1개
		 * 4. 총   금   액 : 31300원
		 * 5. 잔         돈 : 700원
		 */

		
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		int total=0;		
		
		Scanner sc=new Scanner(System.in);
	
		int p1=0;
		int p2=0;
		int p3=0;
		
		int i=0;
		while (i < 5) {

			System.out.println("=== 롯데리아 ===");
			System.out.println("1.불고기 버거 : " + price1 + "원");
			System.out.println("2.새우    버거 : " + price2 + "원");
			System.out.println("3.콜         라 : " + price3 + "원");
			System.out.println("메뉴를 선택해주세요");

			int sel = sc.nextInt();

			if (sel == 1) {
				p1++;
			} else if (sel == 2) {
				p2++;
			} else if (sel == 3) {
				p3++;
			}
			i++;
			
		}
		total=p1*price1+p2*price2+p3*price3;
		
		System.out.println("지불할금액을 입력해주세요");
		int outM=sc.nextInt();
		int charge=outM-total;
		if(charge>=0) {		
			System.out.println("----영수증-----");
			System.out.println("1. 불고기 버거 :"+p1+"개");
			System.out.println("2. 새우    버거 :"+p2+"개");
			System.out.println("3. 콜         라 :"+p3+"개");
			System.out.println("4. 총   금   액 :"+total+"원");
			System.out.println("5. 잔         돈 :"+charge+"원");
		}
		else {
			System.out.println("지불할금액이 부족합니다");
		}
		
	}

}

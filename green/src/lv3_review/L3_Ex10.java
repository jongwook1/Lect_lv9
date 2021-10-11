package lv3_review;

import java.util.Scanner;

public class L3_Ex10 {

	public static void main(String[] args) {
		/*
		 * # 영화관 좌석예매
		 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
		 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
		 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
		 * 4. 한 좌석당 예매 가격은 12000원이다.
		 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
		 * 예)
		 * seat = 0 0 0 0 0 0 0
		 * 
		 * 좌석선택 : 1
		 * seat = 0 1 0 0 0 0 0
		 * 
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 * 
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 * 이미 예매가 완료된 자리입니다.
		 * ----------------------
		 * 매출액 : 24000원
		 */

		Scanner sc = new Scanner(System.in);		
		int[] seat = new int[7];
		int cnt=0;
		int price=0;
		boolean run = true;
		while(run) {
			System.out.println("좌석 현황");
			for(int i=0;i<seat.length;i++) {
				System.out.print(seat[i]+" ");
			}
			System.out.println("\n=영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.println("좌석을 선택해주세요");
				int inputN=sc.nextInt()-1;
				
				if(inputN>=0&&inputN<7) {
				if(seat[inputN]!=1) {
				//for(int i=0;i<seat.length;i++) {
					
					seat[inputN]=1;
					cnt++;
			//	}
					}else {
						System.out.println("이미 예매된 좌석입니다");
					}
			}else {
				System.out.println("해당하지않는좌석입니다");
			}
				
			}
			else if(sel == 2) {
				 price = cnt * 12000;
				System.out.println("매출액 = " +price + "원");
				run = false;
			}
		}
		
	}

}

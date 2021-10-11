package lv6;
/*
 * # 영화관 좌석예매 : 클래스 + 메서드
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

import java.util.Scanner;

class MOVIE1{
	Scanner sc=new Scanner(System.in);
	
	int total;
	final int size=10;
	final int price=12000;
	int seat[]=new int[size];
	//메뉴선택
	void selectM() {
		System.out.println("1.예매 2.종료");
		int sel=sc.nextInt();
		if(sel==1) {
			printNow();
		}if(sel==2) {
			return;
		}
	}
	
	
	//현황출력
	void printNow(){
		for(int i=0;i<this.seat.length;i++) {
			if(this.seat[i]==0) {
				System.out.println("O ");
			}else {
				System.out.println("● ");
			}
		}
	}
	//예매하기
	
	//매출표시
	
	
	
	
	
}


public class Ex25_movie {

	public static void main(String[] args) {
		MOVIE1 movie=new MOVIE1();
		

	}

}

package lv6;

import java.util.Scanner;

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
class Theater{
	Scanner sc=new Scanner(System.in);
	String name="";
	int total;
	final int size=10;
	final int price=12000;
	int seat[]=new int[size];
	
	boolean selectM() {
		
		System.out.println("메뉴선택: ");
		int choice=sc.nextInt();
		if(choice==1) {
			choiceSeat();
		}else if(choice==2) {
			showSales();
			return false;
		}
		
		return true;
		
	}
	
	
	void show() {
		System.out.println("--------"+name+"-------");
		System.out.println("1.예매하기");
		System.out.println("2.종료");
//		showSeat();
	}
	
	void showSeat() {
		for(int i=0;i<this.seat.length;i++) {
			if(this.seat[i]==0) {
				System.out.print("O ");
			}else {
				System.out.print("● ");
			}
		}
	}
	
	void choiceSeat(){
		showSeat();
		
		System.out.println("좌석번호 입력: ");
		int num=sc.nextInt()-1;
		
		if(num>=0&&num<this.size&&this.seat[num]==0) {
			this.seat[num]=1;
			this.total+=this.price;
		}else {
			System.out.println("이선좌");
		}
		
	}
	
	void showSales() {
		System.out.println("총 매출: "+total+"원");
	}

	public void run() {
		while(true) {
			show();			
			if(selectM()) {}
			else {	break;}
			
			
//			System.out.println("메뉴선택: ");
//			int choice=sc.nextInt();
//			if(choice==1) {
//				choiceSeat();
//			}else if(choice==2) {
//				showSales();
//			}
		}
		
	}
	
	
	
	
}


public class Ex25_m {
	
	public static void main(String[] args) {
		Theater tms=new Theater();
		
		tms.run();

	}

}

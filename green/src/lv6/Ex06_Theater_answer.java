package lv6;

import java.util.Scanner;

class TMS{
	int total;
	final int size=10;
	final int price =12000;
	int seats[]=new int[size];
}
public class Ex06_Theater_answer {

	public static void main(String[] args) {
		/*
		 * # 영화관 좌석예매 : 클래스 + 변수
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
		Scanner sc= new Scanner(System.in);
		TMS tms =new TMS();
		
		while(true) {
			System.out.println("예매 시스템");			
			for(int i=0; i<tms.size;i++) {
				System.out.print(i+1+" ");
			}
			System.out.println();
			for(int i=0; i<tms.seats.length;i++) {
				if(tms.seats[i]==0) {
					System.out.print("○ ");
				}else {
					System.out.print("● ");
				}
			}
			System.out.println("\n1. 예매\n2. 종료\n메뉴입력: ");
			
			int sel=sc.nextInt();
			
			if(sel==1) {
				System.out.println("좌석번호 입력: ");
				int num=sc.nextInt()-1;
				
				if(num>=0&&num<tms.size&&tms.seats[num]==0) {
					tms.seats[num]=1;
					tms.total+= tms.price;
				}else {
					System.out.println("이선좌");
				}
			}else if(sel==2) {
				System.out.println("총 매출: " + tms.total+"원");
				break;
			}
			
		}
		
		
		
		
		
		
		

	}

}

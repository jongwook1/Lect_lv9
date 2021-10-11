package lv7;

import java.util.Scanner;

class Seat { // 한좌석당 가지는정보
	int num;
	boolean res;
	int price;
	char level;

	void printSeat() {
		if (this.res) {
			System.out.print("● ");
		} else {
			System.out.print("○ ");
		}
	}

	void setSeat(int num, int price) {
		this.num = num;
		this.price = price;
		this.level = 1;
	}

}

class TMS {
	Scanner sc = new Scanner(System.in);
	String name = "GGV";
	int total;
	
	Seat seats[] = new Seat[10];

	int price = 12000;


	void printSeats() {

		for (int i = 0; i < seats.length; i++) {
			seats[i].printSeat();
		}
		System.out.println();

	}
	void setTms() {
		for (int i = 0; i < seats.length; i++) {			
			this.seats[i] = new Seat(); // 클래스 배열 안의 각각의 클래스를 초기화
			this.seats[i].setSeat(i+1, this.price);
		}
	}

	boolean selectSeat() {
		System.out.print("예매할 좌석 번호 입력(종료: end) : ");
		String input=sc.next();		//종료를 end로 하기위해 String 변수사용
		
		try {
			int num=-1;
			num=Integer.parseInt(input);
			if (checkSeat(num)) {
				System.out.println("예매완료!");
			} else {
				System.out.println("이선좌");
				
			}		
		} catch (Exception e) {
			if(input.equals("end")) {
				return false;
			}
		}
		return true;

	}

	boolean checkSeat(int num) {
		int idx = -1;
		for (int i = 0; i < this.seats.length; i++) {
			if (num == this.seats[i].num) 
				idx = i;
				
		}
		if (idx != -1&&!this.seats[idx].res) {
			this.seats[idx].res = true;
			this.total+=this.seats[idx].price;
			return true;
		} else
			return false;
	}


	public void run() {
		setTms();
		while (true) {
			System.out.printf("-----%s -----\n", this.name);
			printSeats();
			if(!selectSeat()) {
				break;
			}

		}
		System.out.println("총 매출: "+total+"원");

	}

}


public class Ex02_영화관예매_answer {

	public static void main(String[] args) {

		TMS tms = new TMS();
		tms.run();
	}

}

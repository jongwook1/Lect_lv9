package lv7;

import java.util.Scanner;

class Seat { // ���¼��� ����������
	int num;
	boolean res;
	int price;
	char level;

	void printSeat() {
		if (this.res) {
			System.out.print("�� ");
		} else {
			System.out.print("�� ");
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
			this.seats[i] = new Seat(); // Ŭ���� �迭 ���� ������ Ŭ������ �ʱ�ȭ
			this.seats[i].setSeat(i+1, this.price);
		}
	}

	boolean selectSeat() {
		System.out.print("������ �¼� ��ȣ �Է�(����: end) : ");
		String input=sc.next();		//���Ḧ end�� �ϱ����� String �������
		
		try {
			int num=-1;
			num=Integer.parseInt(input);
			if (checkSeat(num)) {
				System.out.println("���ſϷ�!");
			} else {
				System.out.println("�̼���");
				
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
		System.out.println("�� ����: "+total+"��");

	}

}


public class Ex02_��ȭ������_answer {

	public static void main(String[] args) {

		TMS tms = new TMS();
		tms.run();
	}

}

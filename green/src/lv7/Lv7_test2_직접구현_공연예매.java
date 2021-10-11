package lv7;

import java.util.Scanner;

//����	11:45
//����	12:45
//�ҿ�	01:00
class Seat99 {
	private int num;
	private boolean res;
	private int price;
	private char level;

	// getter
	int getNum() {
		return this.num;
	}

	boolean getRes() {
		return this.res;
	}

	int getPrice() {
		return this.price;
	}

	// setter
	void setNum(int num) {
		this.num = num;
	}

	void setRes(boolean res) {
		this.res = res;
	}

	void setPrice(int price) {
		this.price = price;
	}

	void printSeat() {
		if (getRes()) {
			System.out.print("�� ");
		} else {
			System.out.print("�� ");
		}
	}

//	void setSeat(int num,)

}

class TMS99 {
	Scanner sc = new Scanner(System.in);
	String name = "CGV";
	int total;

	void setTotal(int total) {
		this.total += total;
	}

	int getTotal() {
		return this.total;
	}

	Seat99 seats[] = new Seat99[10];

	int price = 12000;

	void printSeats() {
		for (int i = 0; i < seats.length; i++) {
			seats[i].printSeat();
		}
		System.out.println();
	}

	void setTms() {
		for (int i = 0; i < seats.length; i++) {
			this.seats[i] = new Seat99();
			this.seats[i].setNum(i + 1);
			this.seats[i].setPrice(price);
		}
	}

	boolean selectSeat() {
		System.out.print("������ �¼� ��ȣ �Է�(����: end) : ");
		String input = sc.next();

		try {
			int num = -1;
			num = Integer.parseInt(input);
			if (checkSeat(num)) {
				System.out.println("���ſϷ�!");
			} else {
				System.out.println("�̼���");
			}
		} catch (Exception e) {
			if (input.equals("end")) {
				return false;
			}
		}
		return true;
	}

	boolean checkSeat(int num) {
		int idx = -1;
		for (int i = 0; i < this.seats.length; i++) {
			if (num == this.seats[i].getNum())
				idx = i;
		}
		if (idx != -1 && !this.seats[idx].getRes()) {
			this.seats[idx].setRes(true);
			setTotal(this.seats[idx].getPrice());
			return true;
		} else
			return false;
	}

	void run() {
		setTms();
		while (true) {
			System.out.printf("-----%s ------\n", this.name);
			printSeats();
			if (!selectSeat()) {
				break;
			}
		}
		System.out.println("�� ����: " + getTotal() + "��");

	}

}

public class Lv7_test2_��������_�������� {

	public static void main(String[] args) {
		TMS99 tms = new TMS99();
		tms.run();

	}

}

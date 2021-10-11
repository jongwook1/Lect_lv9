package lv7;

import java.util.Scanner;

class Seat9999 {
	private int num;
	private boolean res;
	private int price;

	public Seat9999(int num, int p) {
		this.num = num;
		this.price = p;
	}

	public int getNum() {
		return this.num;
	}

	public boolean getRes() {
		return this.res;
	}

	public void setRes() {
		this.res = true;
	}

	public int getPrice() {
		return this.price;
	}

	public void printSeat() {
		if (this.res) {
			System.out.print("�� ");
		} else {
			System.out.print("�� ");
		}
	}

}

class TMS9999 {
	Scanner sc = new Scanner(System.in);
	private String name = "GREEN";
	private int total;

	private Seat9999 seats[] = new Seat9999[10];

	private int price = 12000;

	public void printSeats() {
		for (int i = 0; i < seats.length; i++) {
			seats[i].printSeat();
		}
		System.out.println();
	}

	public void setTms() {
		for (int i = 0; i < seats.length; i++)
			this.seats[i] = new Seat9999(i + 1, price);

	}

	public boolean checkSeat(int num) {
		int idx = -1;
		for (int i = 0; i < this.seats.length; i++) {
			if (num == this.seats[i].getNum())
				idx = i;
		}
		if (idx != -1 && !this.seats[idx].getRes()) {
			this.seats[idx].setRes(); // false->true
			this.total += this.seats[idx].getPrice();
			return true;
		} else // �̼����Ͻ�
			return false;

	}

	public boolean selectSeat() {
		System.out.println("������ �¼� ��ȣ �Է�(����: end):");
		String sel = sc.next();			//���Ḧ end�� �ϱ����� String �������

		try {
			int num = -1;
			num = Integer.parseInt(sel);
			if (checkSeat(num)) {
				System.out.println("���ſϷ�!");
			} else {
				System.out.println("�̼���");
			}

		} catch (Exception e) {
			if (sel.equals("end")) {
				return false;
			}
		}
		return true;

	}

	public void run() {
		setTms();
		while (true) {
			System.out.printf("-----%s -----\n", this.name);
			printSeats();
			if (!selectSeat()) {
				break;
			}

		}
		System.out.println("�� ����: " + total + "��");

	}

}

public class Ex02_��ȭ������_Review {

	public static void main(String[] args) {
		TMS9999 tms = new TMS9999();
		tms.run();

	}

}

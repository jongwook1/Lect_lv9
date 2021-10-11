package lv6;
/*
 * # ��ȭ�� �¼����� : Ŭ���� + �޼���
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */

import java.util.Scanner;

class movie999 {
	Scanner sc = new Scanner(System.in);
	private int seat[] = null;
	private int price = 12000;
	private int total;

	movie999(int seat[]) {
		this.seat = seat;
	}

	public int getPrice() {
		return this.price;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int price) {
		this.total += price;
	}

	public void printMenu() {
		System.out.println("\n1.�¼�����");
		System.out.println("2.����");
	}

	public void selectMenu() {
		while (true) {
			printSeat();
			printMenu();
			int sel = sc.nextInt();
			if (sel == 1) {
				choiceSeat();

			} else if (sel == 2) {
				System.out.println("�� �����:"+this.getTotal());
				break;
			}
		}
	}

	public void printSeat() {
		for (int i = 0; i < this.seat.length; i++) {
			if (this.seat[i] == 0) {
				System.out.print("�� ");
			} else if (this.seat[i] == 1) {
				System.out.print("�� ");
			}
		}
	}

	public void choiceSeat() {
		System.out.println("�¼���ȣ�Է��ϼ���");
		int idx = sc.nextInt() - 1;
		if (this.seat[idx] == 1) {
			System.out.println("�̼���");
		} else if (this.seat[idx] == 0) {
			this.seat[idx] = 1;
			this.setTotal(this.getPrice());
			System.out.println("���ſϷ�");
		}
	}

	public void run() {
		selectMenu();

	}

}

public class Ex25_movie_Review {

	public static void main(String[] args) {
		int seat[] = new int[10];
		movie999 tms = new movie999(seat);
		tms.run();

	}

}

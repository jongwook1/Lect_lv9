package lv8;

import java.util.Scanner;
import java.util.Vector;

class Tv {
	String name;
	String brand;
	int price;

	Tv(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	void printInfo() {
		System.out.printf("%s %s : %d��\n", this.name, this.brand, this.price);
	}

}

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Vector<Tv> arr = new Vector<>();
//
//		Tv temp1 = new Tv("�÷�", "�Ｚ", 1000);
//		arr.add(temp1);
//
//		Tv temp2 = new Tv("���", "LG", 2000);
//		arr.add(temp2);
//
//		Tv temp3 = new Tv("����Ʈ", "���", 1500);
//		arr.add(temp3);
//
//		System.out.println(temp1.name + temp1.brand + temp1.price);
//		System.out.println(temp2.name + temp2.brand + temp2.price);
//		System.out.println(temp3.name + temp3.brand + temp3.price);

		while (true) {
			// print
			for (int i = 0; i < arr.size(); i++) {
				arr.get(i).printInfo();
			}

			System.out.println("1.�߰� 2.���� 3.����(�ε���) 4.����(��) 5.���� 0.����");
			System.out.println("�޴� ����: ");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.print("�߰��� Tv�� �̸�: ");
				String name = sc.next();
				System.out.print("�߰��� Tv�� �귣���: ");
				String brand = sc.next();
				System.out.print("�߰��� Tv�� ����: ");
				int price = sc.nextInt();
				Tv newTv = new Tv(name, brand, price);
				arr.add(newTv);
				
//				arr.add(new Tv(name,brand,price));				
			} else if (sel == 2) {
				System.out.println("������ ��ġ�� �Է����ּ���");
				int addIdx = sc.nextInt();
				System.out.print("�߰��� Tv�� �̸�: ");
				String name = sc.next();
				System.out.print("�߰��� Tv�� �귣���: ");
				String brand = sc.next();
				System.out.print("�߰��� Tv�� ����: ");
				int price = sc.nextInt();
				Tv newTv = new Tv(name, brand, price);
				arr.add(addIdx, newTv);

			} else if (sel == 3) {
				System.out.println("������ ��ġ �Է����ּ���");
				int delIdx = sc.nextInt();
				arr.remove(delIdx);
			} else if (sel == 4) {
				System.out.print("������ Tv�� �̸�: ");
				String name = sc.next();
				System.out.print("������ Tv�� �귣���: ");
				String brand = sc.next();
				System.out.print("������ Tv�� ����: ");
				int price = sc.nextInt();
				Tv newTv = new Tv(name, brand, price);
				arr.remove(newTv);				
			} else if (sel == 5) {
				System.out.println("������ ��ġ�� �Է����ּ���");
				int setIdx = sc.nextInt();
				System.out.print("������ Tv�� �̸�: ");
				String name = sc.next();
				System.out.print("������ Tv�� �귣���: ");
				String brand = sc.next();
				System.out.print("������ Tv�� ����: ");
				int price = sc.nextInt();
				Tv newTv = new Tv(name, brand, price);
				arr.set(setIdx, newTv);
			} else if(sel==0) {
				break;
			}
		}

	}

}

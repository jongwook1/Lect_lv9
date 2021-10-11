package lv8;

import java.util.Scanner;

class MyVector999 {
	int size;
	Tv999[] arr;

//	void setNewTv(String name,String brand,int price) {
//		for (int i = 0; i < size; i++) {
//			newTv[i] = new Tv999(name, brand, price);			
//		}
//	}	

	void add(Tv999 element) {
		if (this.size == 0) {
			arr = new Tv999[size + 1];
		} else if (size > 0) {
			Tv999[] temp = this.arr;
			arr = new Tv999[size + 1];
			for (int i = 0; i < size; i++) {
				arr[i] = temp[i];
			}
		}
		arr[size] = element;
		size++;

//		for (int i = 0; i < size; i++) {
//			arr[i].printInfo();
//		}
	}

	void add(int index, Tv999 element) {
		if (this.arr != null && index >= 0 && index < this.size) {
			Tv999[] temp = this.arr;
			this.arr = new Tv999[size + 1];
			for (int i = 0; i < this.size; i++) {
				if (i < index) {
					this.arr[i] = temp[i];
				} else
					this.arr[i + 1] = temp[i];
			}
			this.arr[index] = element;
			this.size++;
//			for (int i = 0; i < size; i++) {
//				arr[i].printInfo();
//			}
		}
	}

	void remove(int index) {
		if (this.arr != null && index >= 0 && index < this.size) {
			Tv999[] temp = this.arr;
			this.arr = new Tv999[size - 1];

			int idx = 0;
			for (int i = 0; i < this.size; i++) {
				if (i != index) {
					this.arr[idx] = temp[i];
					idx++;
				}
			}
			this.size--;
		}
	}

	void remove(Tv999 element) {
		int index = -1;
		for (int i = 0; i < this.size; i++) {
			if (this.arr[i].brand.equals(element.brand) && this.arr[i].name.equals(element.name)
					&& this.arr[i].price == element.price) {
				index = i;
			}
		}
		Tv999 temp[] = this.arr;
		this.arr = new Tv999[size - 1];

		int idx = 0;
		for (int i = 0; i < this.size; i++) {
			if (i != index) {
				this.arr[idx] = temp[i];
				idx++;
			}
		}
		this.size--;
	}

	void set(int index, Tv999 element) {
		if (this.arr != null && index >= 0 && index < this.size) {
			this.arr[index] = element;
		}
	}

	Tv999 get(int index) {
		return arr[index];
	}

	void align() {
		for (int i = 0; i < this.size; i++) {
			String first = this.arr[i].name;
			int idx = i;

			for (int j = i; j < this.size; j++) {
				if (first.compareTo(this.arr[j].name) > 0) {		//��������� first�� j.name���� ��ġ�ؾ��Ѵٴ¶�
					first = this.arr[j].name;
					idx = j;
				}
			}
			Tv999 temp = this.arr[i];
			this.arr[i] = this.arr[idx];
			this.arr[idx] = temp;
		}
	}

}

class Tv999 {
	String name;
	String brand;
	int price;

	Tv999(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	void printInfo() {
		System.out.printf("%s %s : %d��\n", this.name, this.brand, this.price);
	}

}

public class Ex04_myvector {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyVector999 arr = new MyVector999();

		while (true) {
			for (int i = 0; i < arr.size; i++) {
				arr.get(i).printInfo();
			}
			System.out.println("1.�߰� 2.���� 3.����(�ε���) 4.����(��) 5.���� 6.���� 0.����");
			System.out.println("�޴� ����: ");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.print("�߰��� Tv�� �̸�: ");
				String name = sc.next();
				System.out.print("�߰��� Tv�� �귣���: ");
				String brand = sc.next();
				System.out.print("�߰��� Tv�� ����: ");
				int price = sc.nextInt();
				Tv999 newTv = new Tv999(name, brand, price);
				arr.add(newTv);
			} else if (sel == 2) {
				System.out.println("������ ��ġ�� �Է����ּ���");
				int addIdx = sc.nextInt();
				System.out.print("�߰��� Tv�� �̸�: ");
				String name = sc.next();
				System.out.print("�߰��� Tv�� �귣���: ");
				String brand = sc.next();
				System.out.print("�߰��� Tv�� ����: ");
				int price = sc.nextInt();
				Tv999 newTv = new Tv999(name, brand, price);
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
				Tv999 newTv = new Tv999(name, brand, price);
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
				Tv999 newTv = new Tv999(name, brand, price);
				arr.set(setIdx, newTv);
			} else if (sel == 6) {
				arr.align();
			} else if (sel == 0) {
				break;
			}
		}
	}

}

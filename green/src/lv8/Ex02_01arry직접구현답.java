package lv8;
//������ ArrayList ����

import java.util.ArrayList;

//1.�߰� 2.���� 3.���� 4.����

import java.util.Scanner;

class MyArrayList777 {
	Scanner sc = new Scanner(System.in);

	private int size;
	private Integer nums[];

	public boolean add(Integer integer) {
		try {
			Integer temp[] = nums;
			nums = new Integer[this.size + 1];
			if (this.size > 0) {
				for (int i = 0; i < this.size; i++) {
					nums[i] = temp[i];
				}
			}
			nums[this.size] = integer;
			this.size++;
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}

	}

	public void add(int index, Integer data) {
		if (this.nums != null && index >= 0 && index < this.size) {
			Integer temp[] = this.nums;
			this.nums = new Integer[size + 1];
			for (int i = 0; i < this.size; i++) {
				if (i < index) {
					this.nums[i] = temp[i];
				} else
					this.nums[i + 1] = temp[i];
			}
			this.nums[index] = data;
			this.size++;
		}
	}

	public void remove(int index) {
		if (this.nums != null && index >= 0 && index < this.size) {
			Integer temp[] = this.nums;
			this.nums = new Integer[this.size - 1];

			int idx = 0;
			for (int i = 0; i < this.size; i++) {
				if (i != index) {
					this.nums[idx] = temp[i];
					idx++;
				}
			}
			this.size--;
		}
	}

	public boolean remove(Integer data) {
		try {
			int index = -1;
			for (int i = 0; i < this.size; i++) {
				if (this.nums[i] == data) {
					index = i;
				}
			}
			Integer temp[] = this.nums;
			this.nums = new Integer[size - 1];

			int idx = 0;
			for (int i = 0; i < this.size; i++) {
				if (i != index) {
					this.nums[idx] = temp[i];
					idx++;
				}
			}
			this.size--;

			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean set(int index, Integer data) {
		try {
			if (this.nums != null && index >= 0 && index < this.size) {
				this.nums[index] = data;
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Integer get(int index) {
		if (this.nums != null && index >= 0 && index < this.size)
			return this.nums[index];
		return -1;
	}

	public int size() {
		return this.size;
	}

//	Object obj;

	@Override
	public String toString() {

		String str = "[";
		for (int i = 0; i < this.size; i++) {
			str += this.nums[i] + " ";
		}
		str += "]";
		return str;
//	return super.toString();
	}

}

public class Ex02_01arry���������� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		ArrayList<Integer> arr= new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		arr.add(30);
//		System.out.println(arr);

		MyArrayList777 list = new MyArrayList777();

		while (true) {
			System.out.println(list.toString());
			System.out.println("1.�߰� 2.���� 3.����(�ε���) 4.����(��) 5.������ 6.����ȸ(�ε���) 7.������");
			System.out.println("�޴� ����: ");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("�߰��� ��: ");
				Integer data = (Integer) sc.nextInt();
				list.add(data);
			} else if (sel == 2) {
				System.out.println("������ �ε���: ");
				int idx = sc.nextInt();
				System.out.println("������ �� : ");
				Integer data = (Integer) sc.nextInt();
				list.add(idx, data);
			} else if (sel == 3) {
				System.out.println("������ �ε���: ");
				int delIdx = sc.nextInt();
				list.remove(delIdx);
			} else if (sel == 4) {
				System.out.println("������ ��: ");
				Integer delData = (Integer) sc.nextInt();
				list.remove(delData);
			} else if (sel == 5) {
				System.out.println("������ �ε��� �Է�: ");
				int setIdx = sc.nextInt();
				System.out.println("������ ��: ");
				Integer data = (Integer) sc.nextInt();
				list.set(setIdx, data);
			} else if (sel == 6) {
				System.out.println("�����ð� �Է�");
				int idx = sc.nextInt();
				System.out.println(list.get(idx));
			} 			
			else if (sel == 0) {
				break;
			}
		}

	}

}

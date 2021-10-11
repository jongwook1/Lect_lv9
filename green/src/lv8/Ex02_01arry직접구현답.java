package lv8;
//나만의 ArrayList 구현

import java.util.ArrayList;

//1.추가 2.삭제 3.삽입 4.종료

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

public class Ex02_01arry직접구현답 {

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
			System.out.println("1.추가 2.삽입 3.삭제(인덱스) 4.삭제(값) 5.값수정 6.값조회(인덱스) 7.사이즈");
			System.out.println("메뉴 선택: ");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("추가할 값: ");
				Integer data = (Integer) sc.nextInt();
				list.add(data);
			} else if (sel == 2) {
				System.out.println("삽입할 인덱스: ");
				int idx = sc.nextInt();
				System.out.println("삽입할 값 : ");
				Integer data = (Integer) sc.nextInt();
				list.add(idx, data);
			} else if (sel == 3) {
				System.out.println("삭제할 인덱스: ");
				int delIdx = sc.nextInt();
				list.remove(delIdx);
			} else if (sel == 4) {
				System.out.println("삭제할 값: ");
				Integer delData = (Integer) sc.nextInt();
				list.remove(delData);
			} else if (sel == 5) {
				System.out.println("수정할 인덱스 입력: ");
				int setIdx = sc.nextInt();
				System.out.println("변경할 값: ");
				Integer data = (Integer) sc.nextInt();
				list.set(setIdx, data);
			} else if (sel == 6) {
				System.out.println("가져올거 입력");
				int idx = sc.nextInt();
				System.out.println(list.get(idx));
			} 			
			else if (sel == 0) {
				break;
			}
		}

	}

}

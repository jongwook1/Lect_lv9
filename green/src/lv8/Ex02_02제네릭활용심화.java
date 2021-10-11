package lv8;

import javax.swing.event.ListSelectionEvent;

class MyArrayList9999<T> { // 제네릭 클래스
	int size;
	Object list[]; // 최상위 클래스 Object

	public void add(T element) { //
		Object temp[] = this.list;
		list = new Object[this.size + 1];
		if (this.size > 0) {
			for (int i = 0; i < this.size; i++)
				list[i] = temp[i];
		}
		list[this.size] = element;
		this.size++;
	}

	public void add(int idx, T element) {
		Object temp[] = this.list;
		list = new Object[this.size + 1];
		if (this.size > 0) {
			for (int i = 0; i < this.size; i++) {
				if (i < idx) {
					list[i] = temp[i];
				} else {
					list[i + 1] = temp[i];
				}
			}
			list[idx] = element;
			this.size++;
		}
	}

	void remove(int delIdx) {
		if (list != null & delIdx >= 0 && delIdx < this.size) {
			if (this.size == 1) {
				list = null;
			} else {
				Object temp[] = list;
				list = new Object[this.size - 1];
				int idx = 0;
				for (int i = 0; i < temp.length; i++) {
					if (i != delIdx) {
						list[idx] = temp[i];
						idx++;
					}
				}
			}
			this.size--;
		}
	}

	void remove(T element) {
//		try {
		if (list != null) {
			int delCnt = 0;
			for (int i = 0; i < list.length; i++) {
				if (element == list[i]) {
					delCnt++;
				}
			}
			Object temp[] = list;
			list = new Object[size - delCnt];

			int idx = 0;
			for (int i = 0; i < temp.length; i++) {
				if (temp[i] != element) {
					list[idx] = temp[i];
					idx++;
				}
			}
			this.size -= delCnt;

		} else {
			System.out.println("비어있습니다");
		}
//			return true;
//		} catch (Exception e) {
//			return false;
//		}		

	}

	void set(int idx, T element) {
		if (list != null && idx >= 0) {
			list[idx] = element;
		}
	}

	Object get(int idx) {
		return list[idx];

	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < this.size; i++)
			str += String.valueOf(list[i]) + " "; // String.valueOf()는 숫자->문자

		return str;
	}

}

public class Ex02_02제네릭활용심화 {

	public static void main(String[] args) {
		MyArrayList9999<Integer> arr = new MyArrayList9999<>();

		arr.add((Integer) 10);
		arr.add((Integer) 20);
		arr.add((Integer) 20);
		arr.add((Integer) 30);
		arr.add(1, 90);
		arr.remove(0);
		arr.remove((Integer) 20);
		arr.set(0, 50);
		System.out.println(arr.get(1));

		System.out.println(arr.toString());

	}

}

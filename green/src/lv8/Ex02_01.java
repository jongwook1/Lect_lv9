package lv8;

import java.util.ArrayList;
import java.util.Scanner;

//������ ArrayList ����
//1.�߰� 2.���� 3.���� 4.����

class MyArrayList {
	Scanner sc = new Scanner(System.in);
	int size;
	Integer nums[];

	// add()
	boolean add(Integer integer) {
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

	void add(int idx, Integer integer) {
		Integer temp[] = nums;
		nums = new Integer[this.size + 1];
		if (nums != null && idx >= 0) {
			for (int i = 0; i < temp.length; i++) {
				if (i < idx) {
					nums[i] = temp[i];
				} else {
					nums[i + 1] = temp[i];
				}
			}
			nums[idx] = integer;
			this.size++;
		}
	}

	void remove(int delIdx) {
		if (nums != null & delIdx >= 0 && delIdx < this.size) {
			if (this.size == 1) {
				nums = null;
			} else {
				Integer temp[] = nums;
				nums = new Integer[size - 1];
				int idx = 0;
				for(int i=0;i<temp.length;i++) {
					if(i!=delIdx) {
						nums[idx]=temp[i];
						idx++;
					}
				}
			}
			this.size--;
		}
	}

	boolean remove(Integer delData) {
		try {
			if (nums != null) {
				int delCnt = 0;
				for (int i = 0; i < nums.length; i++) {
					if (delData == nums[i]) {
						delCnt++;
					}
				}
				Integer temp[] = nums;
				nums = new Integer[size - delCnt];

				int idx = 0;
				for (int i = 0; i < temp.length; i++) {
					if (temp[i] != delData) {
						nums[idx] = temp[i];
						idx++;
					}
				}
				this.size -= delCnt;
			} else {
				System.out.println("����ֽ��ϴ�");
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	void set(int idx, Integer integer) {
		if (nums != null && idx >= 0) {
			nums[idx] = integer;
		}
	}

	Integer get(int idx) {		
		return nums[idx];		
	}

	void printSize() {
		System.out.println("������: "+this.size);
	}

	void printNum() {
		if (nums != null) {
			for (Integer i : nums) {
				System.out.print(i + " ");
			}
		}
	}

}

public class Ex02_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyArrayList list = new MyArrayList();
//		list add(10);
		while (true) {
			list.printSize();
			list.printNum();
			System.out.println("\n1.�߰� 2.����  3. ����(�ε���)  4. ����(��) 5. ���� 6.�������� 0. ����");
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

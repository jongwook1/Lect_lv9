package lv8;

import java.util.ArrayList;
import java.util.Scanner;

//나만의 ArrayList 구현
//1.추가 2.삭제 3.삽입 4.종료

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
				System.out.println("비어있습니다");
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
		System.out.println("사이즈: "+this.size);
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
			System.out.println("\n1.추가 2.삽입  3. 삭제(인덱스)  4. 삭제(값) 5. 수정 6.가져오기 0. 종료");
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

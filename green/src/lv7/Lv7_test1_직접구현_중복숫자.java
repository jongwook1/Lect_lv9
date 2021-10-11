package lv7;

import java.util.Random;

//시작 11:25
//종료 11:40
//소요 00:15
class RanNum999 {
	private int num;
	private boolean check;

	int getNum() {
		return this.num;
	}

//	boolean getCheck() {
//		return this.check;
//	}

	void setNum(int num) {
		this.num = num;
	}

	void setCheck(boolean check) {
		this.check = check;
	}

	void print() {
		System.out.println("번호: " + this.num);
	}

}

public class Lv7_test1_직접구현_중복숫자 {

	public static void main(String[] args) {

		// 문제) RanNum 클래스를 활용해서 중복숫자금지 출력
		// num에 1~5사이숫자를 랜덤으로 저장한다. (조건 중복숫자금지)
		Random rn = new Random();

		RanNum999 nums[] = new RanNum999[5];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = new RanNum999();

			int r = rn.nextInt(5) + 1;

			int check = 1;
			for (int j = 0; j < i; j++) {
				if (r == nums[j].getNum()) {
					check = -1;
				}
			}
			if (check == 1) {
				nums[i].setNum(r);
				nums[i].setCheck(true);
			} else {
				i--;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i].print();
		}
	}

}

package lv7;

import java.util.Random;

class RanNum0 {

	private int num;
	private boolean check;

	public RanNum0(boolean c) { // 생성자
		this.check = c;
	}

	public void setNum(int n) {
		this.num = n;
	}

	public int getNum() {
		return this.num;
	}

	public void setCheck() {
		this.check = true;
	}

}

class RunRanNum0 {
	private Random ran = new Random();
	private RanNum0 nums[] = new RanNum0[5];
	private boolean c = false;

	public void inData() {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = new RanNum0(c);

			int rN = ran.nextInt(5) + 1;
			int check = 1;

			for (int j = 0; j < i; j++) {
				if (rN == nums[j].getNum()) {
					check = -1;
				}
			}
			if (check == 1) {
				nums[i].setNum(rN);
				nums[i].setCheck();
			} else
				i--;
		}

	}

	public void printData() {
		inData();
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i].getNum());
		}
	}

	public void run() {
		printData();
	}

}

public class Ex01_중복숫자_Review {

	public static void main(String[] args) {

		RunRanNum0 rn = new RunRanNum0();

		rn.run();
	}

}

package lv7;

import java.util.Random;

//���� 11:25
//���� 11:40
//�ҿ� 00:15
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
		System.out.println("��ȣ: " + this.num);
	}

}

public class Lv7_test1_��������_�ߺ����� {

	public static void main(String[] args) {

		// ����) RanNum Ŭ������ Ȱ���ؼ� �ߺ����ڱ��� ���
		// num�� 1~5���̼��ڸ� �������� �����Ѵ�. (���� �ߺ����ڱ���)
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

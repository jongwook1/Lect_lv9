package lv7;

import java.util.Random;

class RanNum {
	Random ran = new Random();

	void n() {
		int num[] = new int[5];

		for (int i = 0; i < 5; i++) {
			int rN = ran.nextInt(5) + 1;
			boolean check = true;
			for (int j = 0; j < 5; j++) {
				if (num[j] == rN) {
					check = false;
				}
			}
			if (check == true) {
				num[i] = rN;
			} else {
				i--;
			}

		}
		for (int i = 0; i < 5; i++) {
			System.out.println(num[i]);
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		RanNum rN = new RanNum();

		rN.n();
		// ����) RanNum Ŭ������ Ȱ���ؼ� �ߺ����ڱ��� ���
		// num�� 1~5���̼��ڸ� �������� �����Ѵ�. (���� �ߺ����ڱ���)
		

	}

}

package lv3_review;

public class L3_Ex09 {

	public static void main(String[] args) {
		// ����1) a�� ���� b�� ���� �����ư��鼭 c�� ����
		// ��) c = {10,40,20,50,30,60}
		int a[] = { 10, 20, 30 };
		int b[] = { 40, 50, 60 };
		int c[] = { 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < 3; i++) {
			c[i * 2] = a[i];
			c[i * 2 + 1] = b[i];
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(c[i] + " ");
		}

		System.out.println();
		// ���� 2) aa �迭�� ������ ������ ��ĭ�� ���� �ǵڿ� bb�� ���� ����
		int aa[] = { 10, 20, 30, 40, 50 };
		int bb = 90;
		// ��) aa = {20,30,40,50,90};
		for (int i = 0; i < 5; i++) {
			if (i < 4) {
				aa[i] = aa[i + 1];
			}
		}
		aa[4] = bb;

		for (int i = 0; i < 5; i++) {
			System.out.print(aa[i] + " ");
		}

		System.out.println();
		// ���� 3) cc �� �迭�� �ڷ� �ϳ��� �о�� �� �տ� dd�� ���� ����
		int cc[] = { 10, 20, 30, 40, 50 };
		int dd = 60;
		// ��) cc[] = {60,10,20,30,40};

		for (int i = 4; i > 0; i--) {
			cc[i] = cc[i - 1];
		}
		cc[0] = 60;
		for (int i = 0; i < 5; i++) {
			System.out.print(cc[i] + " ");
		}

	}

}

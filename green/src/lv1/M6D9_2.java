package lv1;

public class M6D9_2 {

	public static void main(String[] args) {
		// ����2) 1~10���� �ݺ��� 3�̸� 7�̻� ���
		// ����2) 1, 2, 7, 8, 9, 10

		int a = 1;
		// int count = 1;
		while (a <= 10) {
			if (a < 3 || a >= 7) {
				System.out.println(+a);
			}
			a++;
		}

	}

}

package lv1;

public class M6D9_4 {

	public static void main(String[] args) {
		// ����4)
		// ��2- 1~10���� �ݺ��� 3�̸� 7�̻� ���
		// �� ���� ���
		int a = 1;
		int count = 0;

		// int count = 1;
		while (a <= 10) {
			if (a < 3 || a >= 7) {
				count++;
				System.out.println(+a);
			}
			a++;
		}
		System.out.println("���� : " + count);

	}

}

package lv1;

public class M6D9_3 {
	public static void main(String[] args) {
		// ����3)
		// ��2- 1~10���� �ݺ��� 3�̸� 7�̻� ��µ�
		// �� �� ���

		int a = 1;
		int sum = 0;
		// int count = 1;
		while (a <= 10) {
			if (a < 3 || a >= 7) {
				sum += a;
				System.out.println(+a);
			}
			a++;
		}System.out.println("�������� �� : "+sum);
	}
}

package lv2;

public class Test24_lv2 {

	public static void main(String[] args) {
		// ���� 21:40
		// ���� 21:41
		// �ҿ� 1��
		// # ����4) 25 , 75 �� �ִ� ������� ���

		int a = 1;
		int max = 0;
		while (a <= 75) {
			if (25 % a == 0 && 75 % a == 0) {
				if (a > max) {
					max = a;
				}
			}
			a++;
		}
		System.out.println("25 , 75 �� �ִ� �����" + max);
	}

}

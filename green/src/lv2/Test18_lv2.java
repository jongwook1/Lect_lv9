package lv2;

public class Test18_lv2 {

	public static void main(String[] args) {
		// ���� 20:40
		// ���� 20:45
		// �ҿ� 5��
		// # ����1) 36�� ��� �� ���� ���
		// # ����� 36�� ������ �������� 0�μ��� ���Ѵ�.
		// # 1,2,4,6.....

		int a = 1;		

		while (a <= 36) {
			if (36 % a == 0) {
				System.out.println(a);
			}
			a++;
		}

	}

}

package lv2;

public class Test26_lv2 {

	public static void main(String[] args) {
		// ���� 22:00
		// ���� 22:03
		// �ҿ� 3��

//	#���� 1) 8 �� 12 �� �ּ� ������� ���Ͻÿ�
//	# �ּ� ������� �� ���� ����� �����Ѵ��� ó������ �������ڸ� ���Ѵ�.
//	# ��) 8 16 24... 
//	# ��) 12 24....
//	# ���⼭ 24�� �ּҰ�����̴�.
		boolean run = true;
		int a = 1;

		System.out.println(a);
		while (run) {
			if (a % 8 == 0 && a % 12 == 0) {
				System.out.println("8 �� 12 �� �ּ� �����: " + a);
				run = false;
			}
			a++;
		}

	}

}

package lv2;

public class Test23_lv2 {

	public static void main(String[] args) {
//	���� 21:33
//  ���� 21:36		
//  �ҿ� 1��		

//	# ����2) 6�� 8�� ������� ��� ���
//	# ������� ������ �����ξ���� ���Ѵ�.
//	# ��)  6 ==>  1 , 2, 3, 6
//	#       8 ==> 1, 2, 4, 8
//	# �������  1, 2

		// # ����3) �� ���� �ִ� ����� ���
		// # �ִ������� ������߿��� ����ū��

		int a = 1;
		int max = 0;
		while (a <= 6) {
			if (6 % a == 0 && 8 % a == 0) {
				System.out.println("6�� 8�� �����: " + a);
				if (a > max) {
					max = a;
				}
			}
			a++;
		}
		System.out.println("6�� 8�� �ִ�����: " + max);
	}

}

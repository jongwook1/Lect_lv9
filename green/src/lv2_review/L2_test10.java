package lv2_review;

public class L2_test10 {

	public static void main(String[] args) {
//	# ����1) 7�� ����� ���ʴ�� ��������� 8��° ����� ���
		int i = 1;
		int cnt = 0;
		while (i < 100) {
			if (i % 7 == 0) {
				cnt++;
				if (cnt == 8) {
					System.out.println(i);
					break;
				}

			}
			i++;
		}

//	# ����2) 6�� 8�� ������� ��� ���
//	# ������� ������ �����ξ���� ���Ѵ�.
//	# ��)  6 ==>  1 , 2, 3, 6
//	#       8 ==> 1, 2, 4, 8
//	# �������  1, 2

//	# ����3) �� ���� �ִ� ����� ���
//	# �ִ������� ������߿��� ����ū�� 
		boolean run = true;
		i = 1;
		int max = 0;
		while (i <= 6) {
			if (6 % i == 0 && 8 % i == 0) {
				System.out.println("6�� 8�� �����" + i);
				if (max < i) {
					max = i;
				}
			}

			i++;
		}
		System.out.println("�ִ����� : " + max);

//	# ����4) 25 , 75 �� �ִ� ������� ���
		i = 1;
		int max2 = 0;
		while (i <= 75) {
			if (25 % i == 0 && 75 % i == 0) {
				if (max < i) {
					max2 = i;
				}
			}
			i++;
		}
		System.out.println("25 , 75 �� �ִ� �����: " + max2);

//	# ����5) ���� 42�ڷ�� ���찳 28���� �ִ��� ���� �л����� ������� �Ȱ��� ������ �ַ����մϴ�
//	# ������ ������ �ټ��ִ��� ���
		i = 1;
		int max3 = 0;
		while (i <= 42) {
			if (28 % i == 0 && 42 % i == 0) {
				if (max < i) {
					max3 = i;
				}
			}
			i++;
		}
		System.out.println("�ִ�� �����ټ��ִ� ����: " + max3);

	}

}

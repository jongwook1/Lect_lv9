package lv2;

public class Test25_lv2 {

	public static void main(String[] args) {
//		���� 21:53
//		���� 21:54
//		�ҿ� 1��
//		# ����5) ���� 42�ڷ�� ���찳 28���� �ִ��� ���� �л����� ������� �Ȱ��� ������ �ַ����մϴ�
//		# ������ ������ �ټ��ִ��� ���

		int a = 1;
		int p = 42;
		int e = 28;
		int max = 0;

		while (a <= 42) {
			if (p % a == 0 && e % a == 0) {
				if (a > max) {
					max = a;
				}
			}
			a++;
		}
		System.out.println("�ִ�� �����ټ��ִ� �Լ�: " + max);
	}

}

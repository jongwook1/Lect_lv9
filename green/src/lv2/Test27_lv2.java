package lv2;

public class Test27_lv2 {

	public static void main(String[] args) {
//	����	22:20
//	���� 22:25
//	�ҿ� 5��
//	# ����2) �����̴� 4�� ���� �������� ���� ���ִ� 6�ϸ��� �����忡����
//	# �λ����  4�� 3�Ͽ� �����ٸ� ������ �������� �����ΰ�?
		int n = 1;
		int a = 4;
		int b = 6;
		boolean run = true;
		while (run) {
			if (n % a == 0 && n % b == 0) {
				System.out.println("�ּҰ����:"+n);
				System.out.println("���� �������� 4��3�Ͽ� 4��6�� �ּҰ������ ���Ѵ�" + (3 + n) + "��");
				run = false;
			}
			n++;
		}

	}

}

package lv2;

public class Test28_lv2 {

	public static void main(String[] args) {
//		���� 22:30
//		���� 22:35
//		�ҿ� 5��		
////	# ����3) ���ΰ� 12 �̰� ���ΰ� 8�� ���簢������� ���̸� �þ����
////	# ������ִ� �������� ���簢���� ��������Ѵ�. ���簢���������� �ʿ��Ѱ�?

		int x = 12;
		int y = 8;
		int a = 1;
		boolean run = true;
		while (run) {
			if (a % x == 0 && a % y == 0) {
				System.out.println("���簢���� " + a + "�� �ʿ�");
				run = false;
			}
			a++;
		}
	}
}

package lv2;

public class Test17_lv2 {

	public static void main(String[] args) {
		// # ����4) ������ÿ� ��ü �α��� 400000 ���ε� ���̰� 19�� ���� �α��� 35�ۼ�Ʈ
		// # 40�� �̻��α��� 25�ۼ�Ʈ�϶�
		// # 19�������α� - 40���̻��α� ���� ���Ͻÿ�

		double total = 400000;
		double a = 0;
		double b = 0;

		while (a / total < 0.35) {
			a++;
		}
		while (b / total < 0.25) {
			b++;
		}
		System.out.println("19�������� �α���: " + a);
		System.out.println("40�� �̻��α���: " + b);
		System.out.println("19�������α���-40���̻��α���: " + (a - b));

	}

}

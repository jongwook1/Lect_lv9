package lv2;

public class Test10_lv2 {

	public static void main(String[] args) {
		// ���� 15:45
		// ���� 16:00
		// �ҿ� 15��
		// # ����4)
		// # �� 6���� ���Դ� 840g, ��� 3���� ���Դ� 750g �Դϴ�.
		// # ��5���� ��� 4���� ���Դ� ��g���� ��� (�� ������ �ֳ��� ���Դ� ���� ������ ��������� ���԰�����)

		int sumg = 0;
		int gg = 840 / 6; // 140
		int ag = 750 / 3; // 250

		int g = 5;
		int a = 4;

		while (g >= 0 && a >= 0) {

			// System.out.println("g"+g);
			// System.out.println("a"+a);
			if (g == 0) {
				sumg += ag;
			}
			if (a == 0) {
				sumg += gg;
			} else {
				sumg += (gg + ag);
			}
			//System.out.println(sumg);

			g--;
			a--;

		}
		System.out.println("��5���� ���4���� ����:" +sumg+"g");

	}
}

package lv2;

public class Test12_lv2 {

	public static void main(String[] args) {
		// ���� 16:00
		// ���� 16:10
		// �ҿ� 10��

		// # ���� 2) �μ��� �� �л��� 26���Դϴ�
		// # �μ��׹� �л��鿡�� ��ȭ���� 2 �徿 ������ �ַ����մϴ�.
		// # ��ȭ���� 10�坼 �������θ� �Ǹ��ϰ� 10�忡 1200���Դϴ�.
		// # �Ѿ󸶰� �ʿ��Ѱ���?

		int total = 26;
		int bun = 10;
		int divide = 2;
		int td = 1;
		int cash = 0;

		while (total > 0) {

			if (bun == 0) {
				bun = 10;
				td++;
			}
			bun -= divide;
			total--;
		}
		System.out.println("�ʿ��� ������ ��: " + td);
		cash = td * 1200;
		System.out.println("�ʿ��� ���� : " + cash);

	}

}

package lv2;

public class Test8_lv2 {

	public static void main(String[] args) {
		// ���� 14:15
		// ���� 14:35
		// �ҿ� 20��

		// # ����2)
		// # ���� 7Ÿ�� ���л� 2��� ���л� 4���� ������� �Ȱ��� ������ �־�����
		// # �ѻ���� ������ �� �ڷ� ������ �Ǵ� �� ��� (���� 1Ÿ�� 12�ڷ�)
		// # ��Ʈ ) 7 * 12 / 6

		int total = 7 * 12;
		int girl = 2;
		int boy = 4;
		int cnt = 0;
		while (total > 0) {
			while (boy + girl > 0) {
				if (boy > 0) {
					boy--;
				} else if (girl > 0) {
					girl--;
				}
				total--;
			}
			
			// System.out.println(total);
			cnt++;
			girl = 2;
			boy = 4;
		}
		System.out.println("�ѻ���� ������ ���ʰ��� : " + cnt);
	}
}

package lv2;

public class Test20_lv2 {

	public static void main(String[] args) {
		// ���� 21:00
		// ���� 21:05
		// �ҿ�ð� 5��

		// # ����3) 18�� ����� ���� ���ϱ� 21�� ����� ������ ���

		int a = 1;
		int cnt = 0;
		int cnt2 = 0;
		int sum = 0;

		while (a <= 21) {
			if (18 % a == 0) {
				System.out.println("18�� �����: " + a);
				cnt++;
			}
			if (21 % a == 0) {
				System.out.println("21�� �����: " + a);
				cnt2++;
			}
			a++;
		}
		System.out.println("18����� ����" + cnt);
		System.out.println("21����� ����" + cnt2);
		System.out.println("18����� ���� +21����� ���� : " + (cnt + cnt2));
	}

}

package lv2_review;

public class L2_Ex06 {

	public static void main(String[] args) {
		
		// ����4) 50���� 100���� �ڿ����߿��� 9�� ����� ������ ��� # �� : 6 (54,63,72,81,90,99)
		int cnt = 0;
		int i = 50;
		while (i <= 100) {
			if (i % 9 == 0) {
				cnt++;
			}
			i++;
		}
		System.out.println(cnt);

		// ����5) 28�� ��� �߿��� ���� ū ���ڸ� ���� ��� ==> �� : 980
		i = 0;
		int cnt1 = 0;
		while (i < 1000) {
			if (i % 28 == 0) {
				cnt1 = i;
			}
			i++;
		}
		System.out.println(cnt1);

		// ����6) 8�� ����� ���������� 5�� ��� ==> �� : 0,8,16,24,32
		i = 0;
		int cnt3 = 0;
		while (i < 100) {
			if (i % 8 == 0) {
				System.out.print(i + " ");
				cnt3++;
			}

			if (cnt3 >= 5) {
				break;
			}
			i++;
		}

	}

}

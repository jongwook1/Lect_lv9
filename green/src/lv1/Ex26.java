package lv1;

import java.util.Random;

public class Ex26 {

	public static void main(String[] args) {
		// ����1) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 36 // %10
		boolean run = true;
		int n = 1;
		while (run) {
			if (n % 9 == 0 && n % 10 == 6) {
				System.out.println(n);
				run = false;
			}
			n++; // n += 9;
		}

		// ����2) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 63 // /10
		run = true;
		n = 1;
		while (run) {
			if (n % 9 == 0 && n / 10 == 6) {
				System.out.println(n);
				run = false;
			}
			n++; // n += 9;
		}
		// ����3) 8�� ����� 150���� �۰� 150 �� ���� �������� ��� ==> �� : 144

		run = true;
		n = 150;			//150���� 149 148..�̷������� ��
		while (run) {
			if (n % 8 == 0) {
				System.out.println(n);
				run = false;
			}
			n--;
		}

		// ����4) 50���� 100���� �ڿ����߿��� 9�� ����� ������ ��� # �� : 6 (54,63,72,81,90,99)

		int cnt = 0;
		n = 50;
		run = true;
		while (n <= 100) {
			if (n % 9 == 0) {
				cnt++;
			}
			n++;
		}
		System.out.println("cnt :" + cnt);

		// ����5) 28�� ��� �߿��� ���� ū ���ڸ� ���� ��� ==> �� : 980

		n = 1;
		int max = n;
		while (n < 1000) {
			if (n % 28 == 0 && max < n) {
				max = n;
			}
			n++;
		}
		System.out.println("max :" + max);

		// ����6) 8�� ����� ���������� 5�� ��� ==> �� : 0,8,16,24,32
		n = 0;
		cnt = 0;
		run = true;
		while (run) {
			if (n % 8 == 0) {
				System.out.println(n);
				cnt++;
			}
			// ��������
			if (cnt == 5) {
				run = false;
			}
			n++;
		}

	}

}

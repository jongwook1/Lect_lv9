package lv3;

import java.util.Scanner;

public class M06D16_1 {

	public static void main(String[] args) {
		// ���� 1) �Ʒ� �迭 a ���� ���� �Է��� ���� ���� b �� ����
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 0, 0, 0, 0, 0 };
		// ��) 30 ==> b[] = {10,20,40,50,0};
		Scanner sc = new Scanner(System.in);
		System.out.println("���Է� ����");
		int ipt = sc.nextInt();

		int idx = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] != ipt) {
				b[idx] = a[i];
				idx++;
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(b[i]);
		}

		// ���� 2) �Ʒ� �迭���� ���� �Է��� ��ȣ �� �� �� ���� d �� ����
		int c[] = { 1001, 40, 1002, 65, 1003, 70 }; // ¦ Ȧ ¦ Ȧ ¦ Ȧ
		int d[] = { 0, 0, 0, 0, 0, 0 };
		// ��) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};

		System.out.println("�й� �Ǵ� ���� ����");
		int ipt2 = sc.nextInt();
		int delidx = -1;
		for (int i = 0; i < 6; i++) {
			if (c[i] == ipt2) {
				if (i % 2 == 0) {
					delidx = i;
				} else {
					delidx = i - 1;
				}
			}
		}
		int didx = 0;
		for (int i = 0; i < 6; i += 2) {
			if (i != delidx) {
				d[didx] = c[i];
				d[didx + 1] = c[i + 1];
				didx += 2;
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(d[i]);
		}
	}
}

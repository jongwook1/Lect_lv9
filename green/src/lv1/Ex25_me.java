//�����Ѱ�
package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex25_me {

	public static void main(String[] args) {
		/*
		 * # Up & Down ����[2�ܰ�] 1. com �� �������� 1~100���̸� �����Ѵ�. 2. me �� 1~100���̸� �Է��Ѵ�. 3.
		 * com �� me �� ���ؼ� com ũ�� "ũ��" , com �������� "�۴�" ��Ʈ���� 4. ������ ���߸� ������ ����ȴ�.
		 */

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int com = ran.nextInt(100) + 1;
		// System.out.println(com);

		int result = 0;
		while (result < 1) {
			System.out.println("�������Է��ϼ���");
			int me = sc.nextInt();
			if (me > 0 && me < 101) {
				if (com == me) {
					result++;
				} else if (com > me) {
					System.out.println("ũ��");
				} else if (com < me) {
					System.out.println("�۴�");
				}

				// ����� result�� ��� ��ġ�ؾ��ϴ����� �������
				if (result == 1) {
					System.out.println("�����Դϴ�");
					System.out.println("��������");
				}
			} else {
				System.out.println("1~100������ ���ڸ� �Է��ϼ���");
			}
		}
	}
}

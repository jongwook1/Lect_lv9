package lv2;

import java.util.Scanner;

public class Test6_lv2 {

	public static void main(String[] args) {
		// ���� 12:25
		// ���� 00:28
		// �ҿ� 3��

		/*
		 * 5ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�. 2. �Է¹��� ������ ���� ���� ����Ѵ�. 3. ���࿡ �Է¹��� ���� 100 �̻��̸� �ݺ��� 5ȸ��
		 * �ƴ����� ��� ����
		 * 
		 * ��) 7 ==> �� : 7 , 14 ==> �� : 21 , 1000 ==> �� : 1021 !����
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int total = 0;

		while (a < 5) {
			System.out.println("���ڸ� �Է��ϼ���");
			int input = sc.nextInt();
			total += input;
			if (total >= 100) {
				System.out.println("�� 100�� �����Ƿ� �����ϰڽ��ϴ�.");

				break;
			}
			a++;
		}
		System.out.println("5ȸ �Է��� �ʰ��Ͽ����� ����");

	}

}

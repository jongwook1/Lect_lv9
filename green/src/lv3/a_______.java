package lv3;

import java.util.Scanner;

public class a_______ {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int b[] = new int[5];
		/*
		 * # �Ҽ�ã��[1�ܰ�]
		 * 1. �Ҽ���, 1�� �ڱ��ڽ����θ� �������� ��
		 * 2. ��) 2, 3, 5, 7, 11, 13, ..
		 * 3. ��Ʈ
		 * 1) �ش� ���ڸ� 1���� �ڱ��ڽű��� ������.
		 * 2) �������� 0�� ������ ī��Ʈ�� ����.
		 * 3) �� ī��Ʈ ���� 2�̸� �Ҽ��̴�.
		 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	�Ҽ�x
		 * 
		 * ���� �� ���� �Է¹޾�, �ش� ���ڰ� �Ҽ����� �ƴ��� �Ǻ��Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int rN = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= rN; i++) {
			if (rN % i == 0) {
				cnt++;
			}
		}
		if (cnt == 2) {
			System.out.println(rN + "��(��) �Ҽ��̴�");
		} else {
			System.out.println(rN + "��(��) �Ҽ��� �ƴϴ�");
		}
	}
}

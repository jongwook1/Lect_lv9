package lv3;

import java.util.Scanner;

public class AAAAAAA_04 {

	public static void main(String[] args) {
		/*
		 * [�ݺ��� ��ȭ����]
		 * 
		 * 1. -1�� ���� ������ �Ϸ��� ���� �Է¹޴´�.
		 * 2. �� �� �� key ���� �� ��°�� ���ԵǾ� �ִ°��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 3. ��, key�� ������ ���ԵǾ� ���� ��� �տ� ��Ÿ�� ���� ��ġ�� ����Ͻÿ�.
		 * 4. key�� �Ϸ��� �� �ȿ� ���� ��� "not found"�� ����Ͻÿ�.
		 * 
		 * ��) 
		 * result �� �Է� : 99
		 * 
		 * �Է� : 10
		 * �Է� : 99
		 * �Է� : 20
		 * �Է� : 99
		 * �Է� : 30
		 * �Է� : 99
		 * �Է� : 10
		 * �Է� : -1
		 * 
		 * ��� : key�� 99�� ù���� ��Ÿ�� ���� 2��° �̴�.
		 */
		
		Scanner sc = new Scanner(System.in);
//        int result = 99;
//		System.out.print("key�� �Է� : ");

		// ����� �� ==> -1 ==> Ű�� �Է¹���������.
		// ����� �� ==> 99 , 77 , -1 ==> Ű�� 1���̴�
		// ����� �� ==> 55, 99 , 99, 99, 99, 3 , -1 ==> Ű�� 2���̴�
		System.out.println("Ű �Է�");
		int key = sc.nextInt();
		int check = -1;
		int cnt = 1;
		boolean run = true;

		while (run) {
			System.out.println("���� �Է��ϼ���");
			int input = sc.nextInt();

			if (input == -1) {
				run = false;
			} else {
				if (input == key && check == -1) {
					check = cnt;
				}
			}
			cnt++;
		}

		if (check == -1) {
			System.out.println("Ű���� �Է¹��� ���� �����ϴ�");
		} else {
			System.out.println("Ű����" + check + "��°�� ��Ÿ�����ϴ�");
		}

	}

}

package lv3;

import java.util.Scanner;

public class Test01_lv3 {

	public static void main(String[] args) {
		// ���� 13:45
		// ���� 14:05
		// �ҿ� 20��

		/*
		 * # ��ȭ�� �¼����� 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�. 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1��
		 * �����Ѵ�. 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����. 4. �� �¼��� ���� ������ 12000���̴�. 5. ���α׷� ���� ��, �ش�
		 * ��ȭ���� �� ������� ����Ѵ�. ��) seat = 0 0 0 0 0 0 0
		 * 
		 * �¼����� : 1 seat = 0 1 0 0 0 0 0
		 * 
		 * �¼����� : 3 seat = 0 1 0 1 0 0 0
		 * 
		 * �¼����� : 3 seat = 0 1 0 1 0 0 0 �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�. ---------------------- ����� :
		 * 24000��
		 */
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[7];
		int total = 0;
		boolean run = true;
		while (run) {
			for (int i = 0; i < 7; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();

			for (int i = 0; i < 7; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("\n=��ȭ��=");
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("�¼��� �����ϼ���(1~7)");
				int input = sc.nextInt() - 1;

				if (input >= 0 && input < 7) {
					if (arr[input] == 1) {
						System.out.println("�̹̼��õ� �¼��Դϴ�");
					} else {
						System.out.println("�¼��� �����ϼ���(1~7)");
						arr[input] = 1;
						total += 12000;
						System.out.println("���Ű� �Ϸ�Ǿ����ϴ�");
					}
				} else {
					System.out.println("�¼��� Ȯ���ϼ���");
				}

			} else if (sel == 2) {
				System.out.println("��ȭ���� �������" + total + "�� �Դϴ�");
				System.out.println("�����ϰڽ��ϴ�");
				run = false;
			}

		}

	}

}

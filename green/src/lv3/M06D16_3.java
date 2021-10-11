package lv3;

import java.util.Scanner;

public class M06D16_3 {

	public static void main(String[] args) {
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
		int[] seat = new int[7];
		boolean run = true;
		int total = 0;
		while (run) {
			for (int i = 0; i < 7; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
			for (int i = 0; i < 7; i++) {
				if (seat[i] == 1) {
					System.out.print("�� ");
				} else {
					System.out.print("�� ");
				}
			}
			System.out.println("\n=��ȭ��=");
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("�¼����� ����(1~7����������)");
				int input = sc.nextInt() - 1;
				if (input >= 0 && input < 7) {
					if (seat[input] == 1) {
						System.out.println("���õ��ڼ���");
					} else {
						seat[input] = 1;
						System.out.println("���ſϷ�!");
						total += 12000;
					}
				} else {
					System.out.println("1~7���� �Է����ּ���");
				}
			} else if (sel == 2) {
				System.out.println("������" + total + "��");
				run = false;
			}
		}
	}
}

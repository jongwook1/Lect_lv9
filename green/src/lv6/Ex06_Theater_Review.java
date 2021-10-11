package lv6;

import java.util.Scanner;

/*
 * # ��ȭ�� �¼����� : Ŭ���� + ����
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */

class TMS99 {
	int[] seat = new int[7];
	int money = 0;
}

public class Ex06_Theater_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TMS99 e = new TMS99();

		while (true) {
			for (int i = 0; i < e.seat.length; i++) {
				if (e.seat[i] != 0) {
					System.out.print("�� ");
				} else {
					System.out.print("�� ");
				}
			}
			System.out.println("\nMOVIE]");
			System.out.println("[1]�¼�����");
			System.out.println("[2]�����ϱ�");

			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("�¼�����");
				int idx = sc.nextInt();

				if (e.seat[idx] != 0) {
					System.out.println("�̼���");
				} else {
					e.seat[idx] = 1;
					e.money += 12000;
				}
			} else if (sel == 2) {
				System.out.println("�� �����: "+e.money);
				break;
			}
		}

	}

}

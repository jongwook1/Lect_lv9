package lv6;

import java.util.Scanner;

class movie{
	int seat[]=new int[7];
	int money=0;
}

public class Ex06 {

	public static void main(String[] args) {
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
		Scanner sc = new Scanner(System.in);
		movie m = new movie();

		int cnt = 0;
		while (true) {
			for (int i = 0; i < m.seat.length; i++) {
				System.out.print(m.seat[i] + " ");
			}
			System.out.println("\n1)�¼�����");
			System.out.println("2)����");
			System.out.println("�޴�����");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("������ �¼���ȣ�� �Է��ϼ���");
				int idx = sc.nextInt() - 1;
				System.out.println("�¼� ����: "+(idx+1));

				if (m.seat[idx] == 0) {
					m.seat[idx] = 1;
					cnt++;
				} else {
					System.out.println("�̹̼��õ� �¼�");
				}
			} else if (sel == 2) {
				m.money = cnt * 12000;
				System.out.println("�����: " +m.money + "��");
			}
		}
	}

}

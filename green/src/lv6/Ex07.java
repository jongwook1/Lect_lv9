package lv6;

import java.util.Scanner;

class Nm{
	int game[]={0, 0, 1, 0, 2, 0, 0, 1, 0};	
}


public class Ex07 {

	public static void main(String[] args) {
		/*
		 * # �����̵�[3�ܰ�] : Ŭ���� + ����
		 * 1. ����2�� ĳ�����̴�.
		 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
		 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
		 * 3. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
		 * 4. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
		 * 5. �¿� ���� �����ص� ��� �ݴ������� �̵��� �����ϴ�.
		 * ��) 
		 *  0 0 0 0 0 0 0 2 
		 *  ����(1) ������(2) : 2
		 *  
		 *  2 0 0 0 0 0 0 0 
		 */

		Scanner sc = new Scanner(System.in);
		Nm m = new Nm();

		int p = -1;
		for (int i = 0; i < m.game.length; i++) {
			if (m.game[i] == 2) {
				p = i;
			}
		}

		while (true) {
			for (int i = 0; i < m.game.length; i++) {
				if (m.game[i] == 0) {
					System.out.print("_ ");
				} else if (m.game[i] == 1) {
					System.out.print("�� ");
				} else if (m.game[i] == 2) {
					System.out.print("�� ");
				}
			}

			System.out.println("\n1)���� 2)������ 3)����");
			System.out.println("�޴� �������ּ���");
			int sel = sc.nextInt();
			if (sel == 1) {
				if (sel == 1 && p - 1 < 0) {
					m.game[p] = 0;
					p = 8;
					m.game[p] = 2;
				} else if (sel == 1 && m.game[p - 1] != 1) {
					m.game[p] = 0;
					p--;
					m.game[p] = 2;
				}
			} else if (sel == 2) {
				if (sel == 2 && p + 1 == m.game.length) {
					m.game[p] = 0;
					p = 0;
					m.game[p] = 2;
				} else if (sel == 2 && m.game[p + 1] != 1) {
					m.game[p] = 0;
					p++;
					m.game[p] = 2;
				}
			} else if (sel == 3) {
				if (p - 1 >= 0 && m.game[p - 1] == 1) {
					m.game[p - 1] = 0;
					System.out.println("����");

				} else if (p + 1 < m.game.length && m.game[p + 1] == 1) {
					m.game[p + 1] = 0;
					System.out.println("����");
				}
			}

		}

	}

}

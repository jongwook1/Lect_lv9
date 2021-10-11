package lv4;

import java.util.Scanner;

public class Ex02_answer_nummove {

	public static void main(String[] args) {
		/*
		 * # �����̵�[2�ܰ�]
		 * 1. ����2�� ĳ�����̴�.
		 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
		 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
		 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
		 * 4. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
		 * 5. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.    ���Ĵ� �������ġ�� ������� �������ִ�
		 */
		Scanner sc = new Scanner(System.in);
		int[] game = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };
		int x = -1;
		while (true) {
			for (int i = 0; i < 9; i++) {
				if (game[i] == 0) {
					System.out.print("_");

				} else if (game[i] == 1) {
					System.out.print("|");
				} else if (game[i] == 2) {
					System.out.print("��");
					x = i;
				}
			}

			System.out.println("\n1.�� 2.�� 3.����");
			int move = sc.nextInt();

			if (move == 1 && x - 1 >= 0 && game[x - 1] != 1) {		//&&����� ���� ���� �߿� ���ʿ������� ����Ȯ���ϰ� ����
				game[x] = 0;
				x -= 1;
				game[x] = 2;
			} else if (move == 2 && x + 1 < 9 && game[x + 1] != 1) {
				game[x] = 0;
				x += 1;
				game[x] = 2;
			} else if (move == 3) {
				// �¿� Ȯ��
				if (x - 1 >= 0 && game[x - 1] == 1) {
					game[x - 1] = 0;
					System.out.println("����");
				} else if (x + 1 < 9 && game[x + 1] == 1) {
					game[x + 1] = 0;
					System.out.println("����");
				}

			}

		}

	}

}

package lv6;

import java.util.Scanner;

class Sadari{
	String food[]= {"���","������","ġŲ","���뱹","����"};
	
	int x=0;
	int y=0;
	int ladder[][]= {
			{0,0,0,0,0},
			{0,0,1,1,0},
			{0,1,1,0,0},
			{1,1,0,1,1},
			{0,0,0,0,0},
			{1,1,0,0,0},
			{0,0,1,1,0},
			{0,0,0,0,0}
	};

}


public class Ex11 {

	public static void main(String[] args) {
		/*
		 * # ��ٸ� ����
		 * 1. 0�� ������ �Ʒ��� ��������.
		 * 2. 1�� ������ �¿츦 �˻��� 1�� ������ �̵� �� �Ʒ��� ��������.
		 * 3. x�� ��ġ�� �Է¹ް� ��ٸ��� ǥ���Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);
		Sadari s = new Sadari();
		while (true) {
			for (int i = 0; i < s.ladder[0].length; i++) {
				System.out.print(" " + (i + 1) + " ");
			}
			System.out.println();
			for (int i = 0; i < s.ladder.length; i++) {
				for (int j = 0; j < s.ladder[0].length; j++) {
					if (s.ladder[i][j] == 0) {
						System.out.print(" �� ");
					} else if (j != 0 && s.ladder[i][j] == 1 && s.ladder[i][j - 1] == 1) {
						System.out.print("���� ");
					} else if (j != s.ladder[i].length - 1 && s.ladder[i][j] == 1 && s.ladder[i][j + 1] == 1) {
						System.out.print(" ����");
					}

//				System.out.println();
				}
				System.out.println();
			}

			System.out.println("��ȣ����");
			int sel = sc.nextInt() - 1;

			s.x = sel;

			for (int i = 0; i < s.ladder.length; i++) {
				if (s.ladder[i][s.x] == 1) {
					if (s.x != 0 && s.ladder[i][s.x - 1] == 1) {
						s.x--;

					} else if (s.x != s.ladder[i].length - 1 && s.ladder[i][s.x + 1] == 1) {
						s.x++;
					}

				}
//			s.y++;
			}

			System.out.print("��÷����: " + s.food[s.x] + "\n");

		}
	}

}

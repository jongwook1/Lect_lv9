package lv4_review;

import java.util.Random;
import java.util.Scanner;

public class aa {
	
	public static void main(String[] args) {
		/*
		 * # ��ٸ� ����
		 * 1. �ε��� 0~4�� �ϳ������Ѵ�. 
		 * 2. ���� 0 �� ������ �׳� �Ʒ��� ��������.
		 * 3. ���� 1 �� ������ ���������� �̵��� ��������.
		 * 4. ���� 2 �� ������ �������� �̵��� ��������.
		 * 5. ������ �޴� ��� 
		 */
		
		Scanner sc = new Scanner(System.in);
		String menu[] = {"�����" , "���" ,"¥���" , "�̸�" , "�����"};
		int ladder[][]= {
				{0,0,0,0,0},
				{1,2,0,1,2},
				{0,1,2,0,0},
				{0,0,1,2,0},
				{1,2,0,0,0},
				{0,1,2,0,0},
				{1,2,0,0,0},
				{0,0,0,1,2},
				{0,0,0,0,0}};
		int x = 0;

		int choice[] = new int[menu.length];
		while (true) {
			for (int i = 0; i < ladder[0].length; i++) {
				System.out.print(" " + (i + 1) + " ");
			}
			System.out.println();
			for (int y = 0; y < ladder.length; y++) {
				for (int xx = 0; xx < ladder[y].length; xx++) {
					if (ladder[y][xx] == 0) {
						System.out.print(" �� ");
					} else if (ladder[y][xx] == 1) {
						System.out.print(" ����");
					} else if (ladder[y][xx] == 2) {
						System.out.print("���� ");
					}
				}
				System.out.println();
			}

			for (int i = 0; i < 5; i++) {
				if (choice[i] == 0) {
					System.out.print(" O ");
				} else {
					System.out.println(menu[i]);
				}
			}

			System.out.println("\n��ȣ�������ּ���(1~5)");
			int sel = sc.nextInt() - 1;
			if (sel >= 0 && sel < ladder.length) {
				x = sel;
				for (int y = 0; y < ladder.length; y++) {
					if (ladder[y][x] == 1) {
						x++;
					} else if (ladder[y][x] == 2) {
						x--;
					}
				}
//		System.out.println(menu[x]);
				choice[x] = 1;
			}

		}

	}

}

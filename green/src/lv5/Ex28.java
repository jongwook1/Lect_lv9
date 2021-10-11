package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		/*
		 * # ������ũ ����
		 * 1. 10x10 �迭�� 0���� ä���.
		 * 2. ������ũ�� 1234�� ǥ���Ѵ�.
		 * 3. �����¿�� �̵��� �����ϸ�, ������ ����´�.
		 * 4. �ڱ���ϰ� �ε�����, ����Ѵ�.
		 * 5. �������� �������� ������
		 *    �������� ������ ���� 1���� �ڶ���.
		 * 6. ������ �ִ� 8������ ������ �� �ִ�.
		 */

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int size = 10;
		int[][] map = new int[size][size];

		int snake = 4;
		int[] x = new int[snake];
		int[] y = new int[snake];

		// ������ũ ����
		for (int i = 0; i < snake; i++) {
			x[i] = i;
			y[i] = 0;
			map[y[i]][x[i]] = i + 1;

		}
		// ������ �����ϱ�
		int itemCount = 5;
		int item = 9;

		while (itemCount != 0) {
			int rY = ran.nextInt(size);
			int rX = ran.nextInt(size);

			if (map[rY][rX] == 0) {
				map[rY][rX] = item;
				itemCount = itemCount - 1;
			}
		}

		while (true) {

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if(map[i][j] == item) {
						System.out.print("* ");
					}else {
						System.out.print(map[i][j] + " ");
					}
				}
				System.out.println();
			}
			System.out.println();

			System.out.print("1)left 2)right 3)up 4)down : ");
			int sel = sc.nextInt();

			// ���� �Ӹ� �ӽú����� ����
			int tempY = y[0];
			int tempX = x[0];
			
			if(sel==1||sel==2||sel==3||sel==4) {
			if (sel == 1) {
				tempX--;
			} else if (sel == 2) {
				tempX++;
			} else if (sel == 3) {
				tempY--;
			} else if (sel == 4) {
				tempY++;
			}
			}else {
				continue;
			}
			// �ʳ��κ� ����ó��
			if (size <= tempY || tempY < 0) {
				continue;
			}
			if (size <= tempX || tempX < 0) {
				continue;
			}

			// �ڽ��� ���� ������ ����
			if (map[tempY][tempX] != 0 && map[tempY][tempX] != item) {
				System.out.println("����!!!");
				break;
			}
						
			//���̴ø���
			if (map[tempY][tempX] == item) {
				if (snake == 8) {
					continue;
				}

				int[] yy = y;
				int[] xx = x;

				y = new int[snake + 1];
				x = new int[snake + 1];

				for (int i = 0; i < snake; i++) {
					y[i] = yy[i];
					x[i] = xx[i];
				}

				snake = snake + 1;
			}

			// ������ ���� ǥ��Ǿ� �ִ� mapȭ�� �ʱ�ȭ
			for (int i = 0; i < snake; i++) {
				map[y[i]][x[i]] = 0;
			}
			// ���� �̵��ϱ�
			for (int i = snake - 1; i > 0; i--) {
				y[i] = y[i - 1];
				x[i] = x[i - 1];
			}
			// �Ӹ� �̵��ϱ�
			y[0] = tempY;
			x[0] = tempX;

			// mapȭ�鿡 �̵��� ���� ��ġ�� �ٽ� ǥ���ϱ�
			for (int i = 0; i < snake; i++) {
				map[y[i]][x[i]] = i + 1;
			}

		}

	}

}

package lv2;

import java.util.Random;
import java.util.Scanner;

public class Test5_lv2 {

	public static void main(String[] args) {
		// ���� 11:30
		// ���� 11:55
		// �ҿ� 25��

		/*
		 * # īī�� �ý� 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�. 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�. 3.
		 * �޴��� �Ʒ��� ����. 1) �ӵ����� : 1~3������ ���� 2) ���⼳�� : ��(1)��(2)��(3)��(4) 3) �̵��ϱ� : ������ ��������
		 * ������ �ӵ���ŭ �̵� 4. �Ÿ� 1ĭ �� 50���� �߰��Ǿ� ������ ��ݵ� ����Ѵ�.
		 *
		 */

		Scanner sc = new Scanner(System.in);

		Random ran = new Random();

		int desX = ran.nextInt(20) - 10;
		int desY = ran.nextInt(20) - 10;
		int x = 0;
		int y = 0;
		int dir = 0;
		int speed = 0;
		int fee = 0;
		int move = 0;

		boolean run = true;

		while (run) {
			System.out.println("= īī�� �ý� =");
			System.out.println("�̵�ĭ�� =" + move);
			System.out.println("������ " + fee + "��");
			System.out.println("������ : " + desX + "," + desY);
			System.out.println("����ġ : " + x + "," + y);
			System.out.println("��   �� : " + dir);
			System.out.println("��   �� : " + speed);
			System.out.println("============");

			System.out.println("1) �ӵ����� : 1~3������ ����");
			System.out.println("2) ���⼳�� : ��(1)��(2)��(3)��(4)");
			System.out.println("3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵�");
			System.out.println("�޴��� �������ּ���");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("�ӵ��� �������ּ��� 1) 1�ӵ� 2) 2�ӵ� 3) 3�ӵ� ");
				sel = sc.nextInt();
				if (sel >= 1 && sel <= 4) {
					if (sel == 1) {
						speed = 1;
					} else if (sel == 2) {
						speed = 2;
					} else if (sel == 3) {
						speed = 3;
					}
				} else {
					System.out.println("�����Ҽ����°��Դϴ�.");
				}
			} else if (sel == 2) {
				System.out.println("���⼳���� �������ּ���  ��(1)��(2)��(3)��(4)");
				sel = sc.nextInt();
				if (sel >= 1 && sel <= 4) {
					if (sel == 1) {
						dir = 1;
					} else if (sel == 2) {
						dir = 2;
					} else if (sel == 3) {
						dir = 3;
					} else if (sel == 4) {
						dir = 4;
					}
				} else {
					System.out.println("�����Ҽ����� ���Դϴ�.");
				}
			} else if (sel == 3) {
				if (dir >= 1 && dir <= 4) {
					if (dir == 1) { // x +
						x = x += speed;
					} else if (dir == 2) {// x -
						x = x -= speed;
					} else if (dir == 3) {// y-
						y = y -= speed;
					} else if (dir == 4) {// y+
						// y��ǥ�� +
						y = y += speed;
					}
					move += speed;
					fee += 50 * speed;
				}
			}
			if (desX == x && desY == y) {
				System.out.println("�����߽��ϴ�");

				System.out.println("����� " + fee + "�� �Դϴ�.");
				run = false;

			}

		}

	}

}

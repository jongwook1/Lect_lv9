package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		/*
		 * # īī�� �ý� 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�. 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�. 3.
		 * �޴��� �Ʒ��� ����. 1) �ӵ����� : 1~3������ ���� //ex �ӵ��� 2�� 2ĭ�̵� 2) ���⼳�� : ��(1)��(2)��(3)��(4)
		 * 3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵� 4. �Ÿ� 1ĭ �� 50���� �߰��Ǿ� ������ ��ݵ� ����Ѵ�.
		 *
		 */

		Scanner scan = new Scanner(System.in);
		// ������(destination)
		Random ran = new Random();

		int desX = ran.nextInt(20) - 10;
		int desY = ran.nextInt(20) - 10;
		// ���� ��ġ
		int x = 0;
		int y = 0;
		// ����(direction)
		int dir = 0; // 1�� 2�� 3�� 4��
		// �ӵ�
		int speed = 0;
		// ���
		int fee = 0;
		int move = 0; // !!!!!
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

			// if(run == true) {
			System.out.println("1.���⼳��");
			System.out.println("2.�ӵ�����");
			System.out.println("3.�̵��ϱ�");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			if (sel == 1) {
				System.out.println("���� �Է�(1�� 2�� 3�� 4��):");
				// dir = scan.nextInt(); -> ����ó�� x
				int input = scan.nextInt();

				if (input >= 1 && input <= 4) {
					dir = input;
				} else {
					System.out.println("������ ������ ���Դϴ�");
				}

			} else if (sel == 2) {
				// 1~3 speed
				int input = scan.nextInt();

				if (input >= 1 && input <= 3) {
					speed = input;
				} else {
					System.out.println("�����Ҽ����� ���Դϴ�");
				}

			} else if (sel == 3) {
				// dir : 4
				// speed : 3
				// �̵�>>
				// �� ��ǥ x �Ǵ� y�� ������Ʈ �Ǿ����

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
				// ���� Ȯ��
			}
			if (desX == x && desY == y) {
				System.out.println("�����߽��ϴ�");

				System.out.println("����� " + fee + "�� �Դϴ�.");
				run = false;

			}

		}

	}

}

package lv6;
import java.util.Scanner;
/*
 * # ��ٸ� ����
 * 1. 0�� ������ �Ʒ��� ��������.
 * 2. 1�� ������ �¿츦 �˻��� 1�� ������ �̵� �� �Ʒ��� ��������.
 * 3. x�� ��ġ�� �Է¹ް� ��ٸ��� ǥ���Ѵ�.

 */

class Sadari9{
	int ladder[][]= {
			{0,0,0,0,0},
			{1,1,0,1,1},
			{0,0,0,0,0},
			{0,0,1,1,0},
			{1,1,0,1,1},
			{0,1,1,0,0},
			{0,0,1,1,0},
			{0,0,0,1,1},
			{0,0,0,0,0}};
	
	int x = 0;
	int y = 0;
	String[] menu = { "�ҽ�������", "CU������", "������", "���õ��", "���θ���" };
}

public class Ex11_sadari_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sadari9 sD = new Sadari9();

		System.out.println("���ɸ޴�: ");
		for (int i = 0; i < sD.menu.length; i++) {
			System.out.println(sD.menu[i]);
		}
		System.out.println("---------------");
		for (int i = 0; i < sD.ladder[0].length; i++) {
			System.out.print(" " + (i + 1) + " ");
		}
		System.out.println();

//		while(true) {
		for (int y = 0; y < sD.ladder.length; y++) {
			for (int x = 0; x < sD.ladder[y].length; x++) {
				if (sD.ladder[y][x] == 0) {
					System.out.print(" �� ");
				} else if (x != 0 && sD.ladder[y][x] == 1 && sD.ladder[y][x - 1] == 1) {
					System.out.print("���� ");
				} else if (x != sD.ladder[x].length - 1 && sD.ladder[y][x] == 1 && sD.ladder[y][x + 1] == 1) {
					System.out.print(" ����");
				}
			}
			System.out.println();
		}
		System.out.println();
//			break;
//		}
		System.out.print("��ȣ ����[1~5] : ");
		sD.x = sc.nextInt();
		sD.x -= 1;

		for (int i = 0; i < sD.ladder.length; i++) {

			if (sD.x != sD.ladder[0].length - 1 && sD.ladder[sD.y][sD.x] == 1 && sD.ladder[sD.y][sD.x + 1] == 1) {
				sD.x += 1;

			} else if (sD.x != 0 && sD.ladder[sD.y][sD.x] == 1 && sD.ladder[sD.y][sD.x - 1] == 1) {
				sD.x -= 1;
			}
			sD.y += 1;
		}

		System.out.println("������ ���ɸ޴��� \"" + sD.menu[sD.x] + "\" �Դϴ�.");

	}

}

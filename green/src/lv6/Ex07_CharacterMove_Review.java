package lv6;
import java.util.Random;
import java.util.Scanner;

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


class Move99 {
//	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
	int x;
	int p1 = 2;
	int WALL = 1;
	int SIZE = 10;
	int map[] = new int[SIZE];

}

public class Ex07_CharacterMove_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		Move99 m = new Move99();

		m.x = rn.nextInt(m.SIZE);
		m.map[m.x] = m.p1;

		for (int i = 0; i < 2; i++) {
			int rNum = rn.nextInt(m.SIZE);
			if (m.map[rNum] == 0) {
				m.map[rNum] = m.WALL;
			} else {
				i--;
			}
		}

		while (true) {
			for (int i = 0; i < m.map.length; i++) {
				System.out.print(m.map[i] + " ");
			}
			System.out.println("\n1.�� 2.�� 3.����");
			int sel = sc.nextInt();
			int xx = m.x;
			if (sel == 1) {
				xx--;
			} else if (sel == 2) {
				xx++;
			}
			if (xx >= 0 && xx < m.SIZE && m.map[xx] == 0) {
				m.map[m.x] = 0;
				m.x = xx;
				m.map[m.x] = m.p1;
			}

			else if (sel == 3) {
				if (m.x - 1 >= 0 && m.map[m.x - 1] == m.WALL) {
					m.map[m.x - 1] = 0;
				} else if (m.x + 1 < m.SIZE && m.map[m.x + 1] == m.WALL) {
					m.map[m.x + 1] = 0;

				}
			}
		}

	}

}

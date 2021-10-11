package lv6;
import java.util.Random;
import java.util.Scanner;

/*
 * # ���� ���� : Ŭ���� + ����
 * 1. front �迭 ī�� 10���� ���´�.
 * 2. front �迭���� ���� ī�带 ��� ī���� ��ġ�� �Է��Ѵ�.
 * 3. ������ 2���� ī�尡 ���� ī���̸�, back �迭�� ǥ���Ѵ�.
 * 4. ��� ī�尡 ��������(back�迭�� 0�� �������) ������ ����ȴ�. 
 */

class Ex08_memory9 {
	int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	int[] back = new int[10];

	int cnt = 0; // ������ ���� Ƚ��
}

public class Ex08_memory_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		Ex08_memory9 m = new Ex08_memory9();

		// shuffle

		for (int i = 0; i < 1000; i++) {
			int rN = rn.nextInt(m.front.length);
			int temp = m.front[0];
			m.front[0] = m.front[rN];
			m.front[rN] = temp;
		}

		while (true) {
			System.out.print("ī���ȣ ");
			for (int j = 0; j < m.front.length; j++) {
				System.out.print(j + 1 + " ");
			}
			System.out.println();
			System.out.print("ī���ǰ� ");
			for (int i = 0; i < m.front.length; i++) {
				System.out.print(m.front[i] + " ");
			}
			System.out.println();
			System.out.print("����ī��: ");
			for (int i = 0; i < m.back.length; i++) {
				System.out.print(m.back[i] + " ");
			}
			if (m.cnt == 5) {
				System.out.println("��� �������Ƿ� �����մϴ�");
				break;
			}
			System.out.println("\nī���ȣ �Է�1 ");
			int idx1 = sc.nextInt() - 1;
			System.out.println("ī���ȣ �Է�2");
			int idx2 = sc.nextInt() - 1;

			if (idx1 == idx2 || idx1 < 0 || idx1 >= 10 || idx2 < 0 || idx2 >= 10) {
				System.out.println("ī���ȣ Ȯ��");
			} else {
				if (m.front[idx1] == m.front[idx2] && m.back[idx1] == 0 && m.back[idx2] == 0) {
					System.out.println("����");
					m.back[idx1] = m.front[idx1];
					m.back[idx2] = m.front[idx2];
					m.cnt++;
				}
			}

		}

	}

}

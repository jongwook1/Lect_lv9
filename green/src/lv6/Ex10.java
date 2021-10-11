package lv6;

import java.util.Random;
import java.util.Scanner;

class To{
	int SIZE=9;
	int front[]=new int [SIZE];
	int back[]=new int [SIZE];
	int gameN=1;
}


public class Ex10 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50[3�ܰ�] : 1 to 18
		 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
		 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
		 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
		 * 4. ���� 1~9�� front �迭�� �����ϰ�,
		 *    ���� 10~18�� back �迭�� �����Ѵ�.
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		To t = new To();

//		int idx=-1;
		// ���ֱ�
		for (int i = 0; i < t.front.length; i++) {
			t.front[i] = i + 1;
			t.back[i] = i + 10;
//			idx=i;
		}
		// ����
		// 1.front
		for (int i = 0; i < 1000; i++) {
			int rN = ran.nextInt(9);
			int temp = t.front[0];
			t.front[0] = t.front[rN];
			t.front[rN] = temp;
		}
		// 2.back
		for (int i = 0; i < 1000; i++) {
			int rN = ran.nextInt(9);
			int temp = t.back[0];
			t.back[0] = t.back[rN];
			t.back[rN] = temp;
		}

//		for(int i=0;i<t.front.length;i++) {
//		System.out.print(t.front[i]+" ");
//		}
//		System.out.println();
//		for(int i=0;i<t.front.length;i++) {
//			System.out.print(t.back[i]+" ");
//			}

		// run
		while (true) {
			for (int i = 0; i < t.front.length; i++) {
				System.out.print(t.front[i] + " ");
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			System.out.println("����������ȣ���� �ε��� �Է����ּ���");
			int idx = sc.nextInt() - 1;

			if (idx >= 0 && idx < t.SIZE) {
				if (t.front[idx] == t.gameN) {
					t.front[idx] = t.back[idx];
					t.back[idx] = 0;
					t.gameN++;
				}
			}
			// end
			if (t.gameN > t.SIZE * 2) {
				System.out.println("Ŭ����");
				break;
			}
		}

	}

}

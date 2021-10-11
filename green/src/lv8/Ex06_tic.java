package lv8;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06_tic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<int[]> tic = new ArrayList<int[]>();
		int turn = 1;

		for (int i = 0; i < 3; i++) {
			tic.add(new int[3]);
		}

		int win = 0;
		while (true) {
			for (int i = 0; i < tic.size(); i++) {
				for (int j = 0; j < tic.get(i).length; j++) {
					System.out.print(tic.get(i)[j] + " ");
				}
				System.out.println();
			}
//			break;

			// �Է� �����ߴ� ƽ����� �ٸ��� 2�����迭�����ؾߵǴ°� ��ħ get(i)�� {0,0,0}�� �ִ°� get(0) (1) (2)�����ؼ� �����ϱ�
			// get(y) <--- ���� ��Ÿ��
			System.out.printf("p%d Y:", turn);
			int y = sc.nextInt();
			System.out.printf("p%d X:", turn);
			int x = sc.nextInt();

			// ����ó��
			if (y < 0 || y >= tic.size() || x < 0 || x >= tic.get(0).length || tic.get(y)[x] != 0)
				continue;

			// ��ũ
			int temp[] = tic.get(y);
			temp[x] = turn;
			tic.set(y, temp);

			// ����
			for (int i = 0; i < tic.size(); i++) {
				int cnt = 0;
				for (int j = 0; j < tic.get(i).length; j++) {
					if (tic.get(i)[j] == turn)
						cnt++;
				}
				if (cnt == 3)
					win = turn;
			}

			// ����
			for (int i = 0; i < tic.size(); i++) {
				int cnt = 0;
				for (int j = 0; j < tic.get(i).length; j++) {
					if (tic.get(j)[i] == turn)
						cnt++;
				}
				if (cnt == 3)
					win = turn;
			}

			// \
			int cnt = 0;
			for (int i = 0; i < tic.size(); i++) {
				if (tic.get(i)[i] == turn)
					cnt++;
			}
			if (cnt == 3)
				win = turn;

			// /
			cnt = 0;
			for (int i = 0; i < tic.size(); i++) {
				if (tic.get(i)[tic.get(i).length - i - 1] == turn)
					cnt++;
			}
			if (cnt == 3)
				win = turn;

			// �� �ٲ��ֱ�
			turn = turn == 1 ? 2 : 1;

		}

	}

}

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

			// 입력 여태했던 틱택토와 다르게 2차원배열접근해야되는걸 놓침 get(i)에 {0,0,0}이 있는게 get(0) (1) (2)생각해서 접근하기
			// get(y) <--- 행을 나타냄
			System.out.printf("p%d Y:", turn);
			int y = sc.nextInt();
			System.out.printf("p%d X:", turn);
			int x = sc.nextInt();

			// 예외처리
			if (y < 0 || y >= tic.size() || x < 0 || x >= tic.get(0).length || tic.get(y)[x] != 0)
				continue;

			// 마크
			int temp[] = tic.get(y);
			temp[x] = turn;
			tic.set(y, temp);

			// 가로
			for (int i = 0; i < tic.size(); i++) {
				int cnt = 0;
				for (int j = 0; j < tic.get(i).length; j++) {
					if (tic.get(i)[j] == turn)
						cnt++;
				}
				if (cnt == 3)
					win = turn;
			}

			// 세로
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

			// 턴 바꺼주기
			turn = turn == 1 ? 2 : 1;

		}

	}

}

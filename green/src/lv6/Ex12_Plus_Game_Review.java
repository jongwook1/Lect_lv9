package lv6;
/*
 * # ���ϱ� ����
 * 1. 1���� 10 ������ ������ ���� �ߺ� ���� game �迭�� 6�� �����Ѵ�.
 * 2. 6���� �迭�� �ε����� 0���� 5������ ���� �� 3���� �ߺ� ���� ������ 
       �� �ε����� �� �� ���� ����Ѵ�. 
 * 3. ����ڴ� �ߺ����� 3���� �ε����� ��� �� ���� ���ߴ� �����̴�.
*  ��)  4, 7, 5, 3, 2, 9  //   ����:  14   ==> �ε��� 3���� ��� ���� ���߸�ȴ�.  
    ����)  3,4,5 (�������� ����� ���� ���ü����ִ�)
 */

import java.util.Random;
import java.util.Scanner;

class Addgame9 {
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];
	int total = 0;
	int myTotal = 0;
}

public class Ex12_Plus_Game_Review {

	public static void main(String[] args) {
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		Addgame9 game = new Addgame9();

		for (int i = 0; i < game.game.length; i++) {
			int check = -1;
			int rN = rn.nextInt(10) + 1;
			for (int j = 0; j < game.game.length; j++) {
				if (game.game[j] == rN) {
					check = i;
				}
			}
			if (check == -1) {
				game.game[i] = rN;
			} else {
				i--;
			}
		}

		for (int i = 0; i < game.idx.length; i++) {
			int check2 = -1;
			int rIdx = rn.nextInt(5);

			for (int j = 0; j < game.idx.length; j++) {
				if (game.idx[j] == rIdx) {
					check2 = rIdx;
				}
			}
			if (check2 == -1) {
				game.idx[i] = rIdx;
			} else {
				i--;
			}

		}
		System.out.println("������Ȯ��");
		for (int i = 0; i < game.game.length; i++) {
			System.out.print(game.game[i] + " ");
		}
		System.out.println("\n�����ε��� ������ Ȯ��");
		for (int i = 0; i < game.idx.length; i++) {
			System.out.print(game.idx[i] + " ");
		}
		System.out.println();

		
		//��Ʒ� �κ� �򰥷��� �����ϱ�
		int idx = 0;
		for (int i = 0; i < game.game.length; i++) {
			if (idx < 3) {
				if (game.idx[idx] == i) {
					game.total += game.game[i];
					idx++;
					i = 0;
				}
			}
		}
		System.out.println("total: " + game.total);

		while (true) {
			for (int i = 0; i < 3; i++) {
				System.out.println("������ �ε��� �Է���");
				int myIdx = sc.nextInt();
				game.myTotal += game.game[myIdx];
			}
			if (game.myTotal == game.total) {
				System.out.println("�����̹Ƿ� �����մϴ�");
				break;
			} else {
				System.out.println("����");
				game.myTotal = 0;
				continue;
			}
		}

	}

}

package lv6;

import java.util.Random;
import java.util.Scanner;

class Addgame{
	int game[]=new int [6];
	int sum=0;
	int mySum=0;
	int idx[]=new int [3];
	int mIdx[]=new int [3];
	
}
public class Ex12_Plus_Game {


	public static void main(String[] args) {
		/*
		 * # ���ϱ� ����
		 * 1. 1���� 10 ������ ������ ���� �ߺ� ���� game �迭�� 6�� �����Ѵ�.
		 * 2. 6���� �迭�� �ε����� 0���� 5������ ���� �� 3���� �ߺ� ���� ������ 
		       �� �ε����� �� �� ���� ����Ѵ�. 
		 * 3. ����ڴ� �ߺ����� 3���� �ε����� ��� �� ���� ���ߴ� �����̴�.
		*  ��)  4, 7, 5, 3, 2, 9  //   ����:  14   ==> �ε��� 3���� ��� ���� ���߸�ȴ�.  
		    ����)  3,4,5 (�������� ����� ���� ���ü����ִ�)
		 */
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		Addgame add = new Addgame();

		// �������� �ߺ��ȵȰ� �ֱ�
		for (int i = 0; i < add.game.length; i++) {
			int rN = ran.nextInt(10) + 1;
			int check = 1;
			for (int j = 0; j < add.game.length; j++) {
				if (add.game[j] == rN) {
					check = -1;
				}
			}
			if (check == 1) {
				add.game[i] = rN;
			} else {
				i--;
			}
		}
		// �ߺ��ȵ� �ε��� ���ϱ�
		for (int i = 0; i < add.idx.length; i++) {
			int rN2 = ran.nextInt(5);
			int check2 = 1;
			for (int j = 0; j < add.idx.length; j++) {
				if (add.idx[j] == rN2) {
					check2 = -1;
				}
			}
			if (check2 == 1) {
				add.idx[i] = rN2;
			} else {
				i--;
			}
		}
		// ���ߺ����� �ߵ��� Ȯ��
		System.out.println("����������");
		for (int i = 0; i < add.game.length; i++) {
			System.out.print(add.game[i] + " ");
		}
		System.out.println("\n�����ε���������");
		for (int i = 0; i < add.idx.length; i++) {
			System.out.print(+add.idx[i] + " ");
		}
		System.out.println();

		//��Ʒ� �κ� �򰥷��� �����ϱ�
		int idx = 0;
		for (int i = 0; i < add.game.length; i++) {
			if (idx < 3) {
				if (add.idx[idx] == i) {
					add.sum += add.game[i];
					idx++;
					i = 0;

				}
			}
		}

		System.out.println("sum: " + add.sum);

//		for(int i=0;i<3;i++) {
//			System.out.println("�������ε����� �Է����ּ���");
//			int myIdx=sc.nextInt();
//			add.mIdx[i]=myIdx;
//		}
		// run
		while (true) {
			for (int i = 0; i < 3; i++) {
				System.out.println("������ �ε��� �Է����ּ���");
				int myIdx = sc.nextInt();
				add.mySum += add.game[myIdx];
			}
			if (add.mySum == add.sum) {
				System.out.println("�����̹Ƿ� �����մϴ�");
				break;
			} else {
				System.out.println("����");
				add.mySum = 0;
				continue;
			}
		}

	}

}

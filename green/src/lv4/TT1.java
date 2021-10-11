package lv4;

import java.util.Random;
import java.util.Scanner;

public class TT1 {

	public static void main(String[] args) {
		//���� 09:45
		//���� 00:55
		//�ҿ� 10��
	
		/*
		 * #  1 to 4
		 * 1. arr�迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
		 * 2. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
		 * 3. ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ������ ����ȴ�.
		 * ��)
		 * 4 2 3 1
		 * �Է� : 3
		 * 4 2 3 9
		 * �Է� : 1
		 * 4 9 3 9
		 * ...
		 */
	
		int[] arr = new int[4];
		int[] check = new int[4];

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int gameN = 1;
		int idx = 0;

		while (idx < 4) {
			int rN = ran.nextInt(4) + 1;
			if (check[rN - 1] == 0) {
				arr[idx] = rN;
				check[rN - 1] = 1;
				idx++;
			}

		}
		while (true) {
			System.out.print("��ȣ: ");
			for (int i = 0; i < 4; i++) {
				System.out.print(i + 1);
			}
			System.out.print("\n��: ");
			for (int i = 0; i < 4; i++) {
				System.out.print(arr[i]);
			}
			System.out.println("\n��ȣ�� �Է����ּ���");
			int inputN = sc.nextInt() - 1;

			if (arr[inputN] == gameN) {
				System.out.println("����!");
				gameN++;
			} else {
				System.out.println("��");
			}
			if (gameN > 4) {
				System.out.println("�ϼ������Ƿ� ����!");
				break;
			}
		}
			
			
	}

}

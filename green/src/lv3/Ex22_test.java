package lv3;

import java.util.Random;
import java.util.Scanner;

public class Ex22_test {

	public static void main(String[] args) {
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
		int gamenum=1;
		
		int[] arr = new int[4];					//1~4 {4,0,0,0}
		int[] check = new int[4];
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
	
		int idx = 0;
		while (idx < 4) {
			int rN = ran.nextInt(4) + 1; // 1~4
			if (check[rN - 1] == 0) {
				check[rN - 1] = 1;
				arr[idx] = rN;
				idx++;
			}
		}

		while (true) {

			for (int i = 0; i < 4; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("\n��ȣ �Է��ϼ���");
			int inputn = sc.nextInt() - 1;

			if (arr[inputn] == gamenum) {
				gamenum++;
				System.out.println("����");
			} else {
				System.out.println("��");
			}
			if (gamenum > 4) {
				break;
			}

		}
		
		
		
		
		
	}

}

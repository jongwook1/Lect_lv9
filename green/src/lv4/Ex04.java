package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * # ���� �߱� ����
		 * 1. me�� 1~9 ������ ���� 3���� ����
		 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
		 * 2. com�� me�� ���� ������ ���� ������ �ݺ�
		 * 3. ���ڿ� �ڸ��� ������ 		strike += 1
		 *    ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
		 * ��)
		 * ���� : 1 7 3
		 * 3 1 5		: 2b
		 * 1 5 6		: 1s
		 * ...
		 */
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];		
		int cnt=0;
		int s=0;
		int b=0;
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("���ڸ� �Է��ϼ���");
			int idx1=0;
			for(int a=0;a<3;a++) {
			int input=sc.nextInt();
			me[idx1]=input;
			idx1++;
			System.out.print(me[a]+" ");
			}
			for(int k=0;k<3;k++) {
			
			}
			
			int r = ran.nextInt(9) + 1;

			int check = -1;
			for (int j = 0; j < 3; j++) {
				if (r == com[j]) {
					check = j;
				}
			}
			int idx = -1;
			if (check == -1) {
				for (int i = 0; i < 3; i++) {
					me[i] = r;
					idx = i;

					if (com[i] == me[i] && i == idx) {
						s += 1;

					} else if (com[i] == me[i] && i != idx) {
						b += 1;
					}
				}
			}

			if (s == 3) {
				run = false;
			}
		}

		
		
		
	}

}

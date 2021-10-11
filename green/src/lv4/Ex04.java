package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * # 숫자 야구 게임
		 * 1. me에 1~9 사이의 숫자 3개를 저장
		 *    (단, 중복되는 숫자는 저장 불가)
		 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
		 * 3. 숫자와 자리가 같으면 		strike += 1
		 *    숫자만 같고 자리가 틀리면 	ball += 1
		 * 예)
		 * 정답 : 1 7 3
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
			System.out.println("숫자를 입력하세요");
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

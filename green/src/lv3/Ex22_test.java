package lv3;

import java.util.Random;
import java.util.Scanner;

public class Ex22_test {

	public static void main(String[] args) {
		/*
		 * #  1 to 4
		 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
		 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
		 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
		 * 예)
		 * 4 2 3 1
		 * 입력 : 3
		 * 4 2 3 9
		 * 입력 : 1
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
			System.out.println("\n번호 입력하세요");
			int inputn = sc.nextInt() - 1;

			if (arr[inputn] == gamenum) {
				gamenum++;
				System.out.println("정답");
			} else {
				System.out.println("떙");
			}
			if (gamenum > 4) {
				break;
			}

		}
		
		
		
		
		
	}

}

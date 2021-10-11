package lv4;

import java.util.Random;
import java.util.Scanner;

public class TT1 {

	public static void main(String[] args) {
		//시작 09:45
		//종료 00:55
		//소요 10분
	
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
			System.out.print("번호: ");
			for (int i = 0; i < 4; i++) {
				System.out.print(i + 1);
			}
			System.out.print("\n블럭: ");
			for (int i = 0; i < 4; i++) {
				System.out.print(arr[i]);
			}
			System.out.println("\n번호를 입력해주세요");
			int inputN = sc.nextInt() - 1;

			if (arr[inputN] == gameN) {
				System.out.println("정답!");
				gameN++;
			} else {
				System.out.println("땡");
			}
			if (gameN > 4) {
				System.out.println("완성했으므로 종료!");
				break;
			}
		}
			
			
	}

}

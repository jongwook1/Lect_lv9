package lv6;
/*
 * # 더하기 게임
 * 1. 1부터 10 사이의 랜덤한 값을 중복 없이 game 배열에 6개 저장한다.
 * 2. 6개의 배열의 인덱스를 0부터 5사이의 랜덤 값 3개를 중복 없이 선택해 
       그 인덱스의 값 의 합을 출력한다. 
 * 3. 사용자는 중복없이 3개의 인덱스를 골라 그 합을 맞추는 게임이다.
*  예)  4, 7, 5, 3, 2, 9  //   문제:  14   ==> 인덱스 3개를 골라서 합을 맞추면된다.  
    정답)  3,4,5 (여러가지 경우의 수가 나올수는있다)
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
		System.out.println("랜덤값확인");
		for (int i = 0; i < game.game.length; i++) {
			System.out.print(game.game[i] + " ");
		}
		System.out.println("\n랜덤인덱스 뽑은것 확인");
		for (int i = 0; i < game.idx.length; i++) {
			System.out.print(game.idx[i] + " ");
		}
		System.out.println();

		
		//요아래 부분 헷갈렸음 숙지하기
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
				System.out.println("선택할 인덱스 입력해");
				int myIdx = sc.nextInt();
				game.myTotal += game.game[myIdx];
			}
			if (game.myTotal == game.total) {
				System.out.println("정답이므로 종료합니다");
				break;
			} else {
				System.out.println("오답");
				game.myTotal = 0;
				continue;
			}
		}

	}

}

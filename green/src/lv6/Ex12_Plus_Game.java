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
		 * # 더하기 게임
		 * 1. 1부터 10 사이의 랜덤한 값을 중복 없이 game 배열에 6개 저장한다.
		 * 2. 6개의 배열의 인덱스를 0부터 5사이의 랜덤 값 3개를 중복 없이 선택해 
		       그 인덱스의 값 의 합을 출력한다. 
		 * 3. 사용자는 중복없이 3개의 인덱스를 골라 그 합을 맞추는 게임이다.
		*  예)  4, 7, 5, 3, 2, 9  //   문제:  14   ==> 인덱스 3개를 골라서 합을 맞추면된다.  
		    정답)  3,4,5 (여러가지 경우의 수가 나올수는있다)
		 */
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		Addgame add = new Addgame();

		// 랜덤값중 중복안된값 넣기
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
		// 중복안된 인덱스 정하기
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
		// 값중복없이 잘들어갔나 확인
		System.out.println("랜덤값들어간것");
		for (int i = 0; i < add.game.length; i++) {
			System.out.print(add.game[i] + " ");
		}
		System.out.println("\n랜덤인덱스뽑은거");
		for (int i = 0; i < add.idx.length; i++) {
			System.out.print(+add.idx[i] + " ");
		}
		System.out.println();

		//요아래 부분 헷갈렸음 숙지하기
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
//			System.out.println("선택할인덱스를 입력해주세요");
//			int myIdx=sc.nextInt();
//			add.mIdx[i]=myIdx;
//		}
		// run
		while (true) {
			for (int i = 0; i < 3; i++) {
				System.out.println("선택할 인덱스 입력해주세요");
				int myIdx = sc.nextInt();
				add.mySum += add.game[myIdx];
			}
			if (add.mySum == add.sum) {
				System.out.println("정답이므로 종료합니다");
				break;
			} else {
				System.out.println("오답");
				add.mySum = 0;
				continue;
			}
		}

	}

}

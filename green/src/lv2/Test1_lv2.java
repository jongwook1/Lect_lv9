package lv2;

import java.util.Random;
import java.util.Scanner;

public class Test1_lv2 {

	public static void main(String[] args) {
		// 시작 09:35
		// 종료 09:43
		// 소요 00분

		/*
		 * # Up & Down 게임[2단계] 1. com 은 랜덤으로 1~100사이를 저장한다. 2. me 는 1~100사이를 입력한다. 3.
		 * com 과 me 를 비교해서 com 크면 "크다" , com 이작으면 "작다" 힌트제공 4. 정답을 맞추면 게임은 종료된다.
		 */

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int com = ran.nextInt(100) + 1;
		System.out.println("com의 값 : "+com);

		boolean run = true;
		while (run) {
			System.out.println("숫자입력해주세요");
			int me = sc.nextInt();
			if (me >= 1 && me <= 100) {
				if (com == me) {
					System.out.println("정답");
					run = false;
				} else if (com > me) {
					System.out.println("com이 크다");
				} else if (com < me) {
					System.out.println("com이 작다");
				}
			} else {
				System.out.println("1~100사이 숫자만 입력해주세요");
			}
		}

	}

}

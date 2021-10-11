package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		/*
		 * # 타자연습 게임[2단계]
		 * 1. 문제를 섞는다.(shuffle)
		 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
		 * 예)
		 * 문제 : mys*l
		 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		 * 문제 : *sp
		 * 입력 : jsp
		 * ...
		 */
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		String[] words = { "java", "mysql", "jsp", "spring" };

		// 셔플
		for (int i = 0; i < 1000; i++) {
			int rN = ran.nextInt(words.length);
			String temp = words[0];
			words[0] = words[rN];
			words[rN] = temp;
		}
		// 셔플제대로되는지 확인
//		for(int i=0;i<words.length;i++) {
//			System.out.println(words[i]);
//		}

		// 문제에 별표넣고 출력
		int i = 0;

		while (i < words.length) { // words.length->4;
			int cnt = 0;
			int check = 1;
			while (true) {
				if (cnt == 4) {
					break;
				}
				if (check == 1) {
					int rIdx = ran.nextInt(words[i].length());

					for (int j = 0; j < words[i].length(); j++) {
						if (rIdx == j) {
							System.out.print("*");
						} else {
							System.out.print(words[i].charAt(j));
						}
					}

					System.out.println("\n입력: ");
					String inputData = sc.next();
					if (words[i].equals(inputData)) { // 정답일시 i증가시켜서 다른단어나오게
						System.out.println("정답\n");
						i++;
						cnt++;

					} else { // 문제 틀릴시 다시입력
						System.out.println("오답입니다");
						check = -1;
						if (check == -1) {
							boolean run = true;
							while (run) {

								for (int j = 0; j < words[i].length(); j++) {
									if (rIdx == j) {
										System.out.print("*");
									} else {
										System.out.print(words[i].charAt(j));
									}
								}
								System.out.println("\n입력: ");
								inputData = sc.next();
								if (words[i].equals(inputData)) { // 정답일시 i증가시켜서 다른단어나오게
									System.out.println("정답\n");
									i++;
									cnt++;
									check = 1;
									run = false;
								}
							}

						}
					}
				}
			}
		}
	}
}

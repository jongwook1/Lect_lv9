package lv1;

import java.util.Random;
import java.util.Scanner;

public class EX23 {

	public static void main(String[] args) {

		/*
		 * # 구구단 게임[3단계]
		 * 1. 구구단 게임을 5회 반복한다.
		 * 2. 정답을 맞추면 20점이다.
		 * 3. 게임 종료 후, 성적을 출력한다.
		 */
		
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		//int score = 0;
		int count = 0; // 중요!!!!!!!!!!
		int n = 0;
		while (n < 5) {
			int num1 = rn.nextInt(8) + 2; // 2~9
			int num2 = rn.nextInt(10) + 1; // 1~10
			int result = num1 * num2; // 정답

			System.out.println(num1 + " X" + num2 + " = ?");
			int answer = sc.nextInt(); // 덥변

			// 정답 또는 땡
			// 정답 -> 개수를 카운트 or 점수 누적

			if (answer == result) {
				System.out.println("딩동댕");
				count++;
				//score += 20;   // 스코어로 쓰는법
			} else {
				System.out.println("떙");
			}

			n++;
		}

		//성적산출
		System.out.println("점수 : " +(count*20));
		//System.out.println("점수 : " + score + "점");  //스코어로 쓰는법
	}

}

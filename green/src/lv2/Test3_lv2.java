package lv2;

import java.util.Random;

public class Test3_lv2 {

	public static void main(String[] args) {
		// 시작 10:42
		// 종료 11:00
		// 소요 18분

		/*
		 * # 랜덤학생 1. 10회 반복을 한다. 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적) 3. 성적이 60점 이상이면
		 * 합격생이다. --------------------------------------- . 전교생(10명)의 총점과 평균을 출력한다. .
		 * 합격자 수를 출력한다. . 1등 학생의 번호와 성적을 출력한다.
		 */

		Random ran = new Random();
		int a = 0;
		int cnt = 0;
		int sum = 0;
		int max = 0;
		int top = 0;
		while (a < 10) {
			int rN = ran.nextInt(100) + 1;
			System.out.println("학생점수:" + rN);
			if (rN >= 60) {

				cnt++;

			}
			if (max < rN) {
				max = rN;
				top = a + 1;
			}

			sum += rN;
			a++;
		}
		System.out.println("총점" + sum);
		System.out.println("평균" + (sum / 10));
		System.out.println("합격자수:" + cnt);
		System.out.println("1등점수" + max + "번호" + top);

	}

}

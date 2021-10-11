package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * # 타자연습 게임[1단계]
		 * 1. 문제를 섞는다.(shuffle)
		 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		 * 예)
		 * 문제 : mysql
		 * 입력 : mydb
		 * 문제 : mysql
		 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		 * 문제 : jsp
		 */
		
		String[] words = { "java", "mysql", "jsp", "spring" };

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		// 셔플
//		ver.1
//		int i=0;
//		
//		while(i<1000) {
//			int r=ran.nextInt(words.length);
//			
//			String temp=words[0];
//			words[0]=words[r];
//			words[r]=temp;
//			i++;
//		}
		// 셔플
//      ver.2
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(words.length);
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
//		for(int j=0;j<words.length;j++) {
//			System.out.println(words[j]);
//		}

		// 문제 공개
		int cnt = 0;

		while (true) {
			System.out.println("문제: " + words[cnt]);
			System.out.println("입력: ");
			String inputData = sc.next();
			if (words[cnt].equals(inputData)) {
				cnt++;
			}
			;

			if (cnt == 4) {
				System.out.println("모두 맞췄으므로 종료합니다");
				break;
			}
		}
	}
}

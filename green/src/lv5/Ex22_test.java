package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex22_test {

	public static void main(String[] args) {
		// 문제) 영어단어 맞추기
		// 영어단어가 전부 * 로 표시된다.
		// 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
		// (조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다.
		// 전부 벗겨지거나 맞추면 종료

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int score = 100;
		String word = "performanceTest";
		String meaning = "공연";
		int size = word.length();
		int check[] = new int[size]; // 힌트 체크를 통해서 확인할수있다.

		while (true) {
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			for (int i = 0; i < size; i++) {
				if (check[i] == 1) {
					System.out.print(word.charAt(i));
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			System.out.print("영어단어를 입력하세요 >>> ");
			String me = scan.next();

			if (me.equals(word)) {
				System.out.println("정답입니다.");
				System.out.println("점수 : " + score);
				break;
			} 
			else {
				int rNum = -1;
				while (true) {
					rNum = ran.nextInt(size);
					if (check[rNum] == 0) {
						break;
					}
				}

				check[rNum] = 1;
				for (int i = 0; i < size; i++) {
					if (word.charAt(rNum) == word.charAt(i)) {
						check[i] = 1;
					}
				}
				score-=5;
			}
		}






	}

}

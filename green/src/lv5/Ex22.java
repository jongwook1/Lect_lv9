package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// 문제) 영어단어 맞추기
		// 영어단어가 전부 * 로 표시된다.
		// 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
		// (조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다.
		// 전부 벗겨지거나 맞추면 종료
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int score = 100;
		String word = "performance";
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
			System.out.println("영어단어를 입력하세요 >>> ");
			String me = sc.next();
			if (me.equals(word)) {
				System.out.println("정답입니다");
				System.out.println(score);
				break;
			}
			
			else {
				int rN = -1; // 랜덤숫자를 인덱스로 while문밖에서도 사용하기위해 여기서 선언
				while (true) {
					rN = ran.nextInt(size);	
					
					if (check[rN] == 0) {	//랜덤숫자 중복되는것 방지(+철자밝혀진것또 안나오게)  
						break;
					}
					
				}

				check[rN] = 1;

				for (int i = 0; i < size; i++) {
					if (word.charAt(rN) == word.charAt(i)) { // (조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다.
						check[i] = 1;						
					}
				}				
				score -= 5;

			}

		}

	}

}

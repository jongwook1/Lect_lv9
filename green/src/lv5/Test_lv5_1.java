package lv5;
//시작 15:00
//종료 15:10
//소요 00:10
import java.util.Random;
import java.util.Scanner;

public class Test_lv5_1 {

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
		
			Scanner sc = new Scanner(System.in);
			Random ran = new Random();
			String[] words = { "java", "mysql", "jsp", "spring" };
			
			//단어순서 섞기
			for(int i=0;i<words.length;i++) {
				int rN=ran.nextInt(words.length);
				String temp=words[0];
				words[0]=words[rN];
				words[rN]=temp;
			}

			int i=0;
			while(i<words.length) {
				int size=words[i].length();
				int r=ran.nextInt(size);
				System.out.print("문제 "+(i+1));
				System.out.println();
				for(int j=0;j<size;j++) {
					if(j==r) {
						System.out.print("*");
					}else {
						System.out.print(words[i].charAt(j));
					}
				}
				System.out.println();
				System.out.println("입력: ");
				String inputWord=sc.next();
				if(inputWord.equals(words[i])) {
					i++;
				}
			}
	}

}

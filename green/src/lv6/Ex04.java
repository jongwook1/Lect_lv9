package lv6;

import java.util.Scanner;

class Ex{	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 * System.out.println("=== " + green.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
		 */
		
		Scanner sc = new Scanner(System.in);
		Ex green = new Ex();
		green.name="GREEN";
		while (true) {
			System.out.println("=== " + green.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			System.out.println("메뉴를 선택해주세요");
			int sel = sc.nextInt();
			if (sel == 1) {
				for(int i=0;i<green.arScore.length;i++) {
					System.out.printf("%d번 : %d점\n",green.arHakbun[i],green.arScore[i]);
				}
			} else if (sel == 2) {
				int first = -1;
				int top = 0;
				for (int i = 0; i < green.arScore.length; i++) {
					if (green.arScore[i] > top) {
						top = green.arScore[i];
						first = i;
					}
				}
				System.out.println("1등학생의 학번: " + green.arHakbun[first] + " 성적: " + top);

			} else if (sel == 3) {
				int last = -1;
				int min = 100;
				for (int i = 0; i < green.arScore.length; i++) {
					if (green.arScore[i] < min) {
						min = green.arScore[i];
						last = i;
					}
				}
				System.out.println("꼴등학생의 학번: " + green.arHakbun[last] + " 성적: " + min);
			} else if (sel == 4) {
				System.out.println("학번을 입력하세요");
				int hak = sc.nextInt();
				int idx = -1;
				for (int i = 0; i < green.arScore.length; i++) {
					if (hak == green.arHakbun[i]) {
						idx = i;
					}
				}
				System.out.println("학번 " + hak + "의 성적: " + green.arScore[idx]);
			} else if (sel == 5) {
				System.out.println("종료하겠습니다");
				break;
			}

		}

	}

}

package lv6;

import java.util.Random;
import java.util.Scanner;

class hak999 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class Ex03_Review {

	public static void main(String[] args) {
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		hak999 hak = new hak999();
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		for (int i = 0; i < hak.scores.length; i++) {
			int rN = rn.nextInt(100) + 1;
			hak.scores[i] = rN;
		}
		for (int i = 0; i < hak.scores.length; i++)
			System.out.print(hak.scores[i] + " ");
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		int total = 0;
		int avg = 0;
		for (int i = 0; i < hak.scores.length; i++) {
			total += hak.scores[i];

		}
		avg = total / hak.scores.length;
		System.out.println("\n총점: " + total + " 평균: " + avg);
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		int pass = 0;
		for (int i = 0; i < hak.scores.length; i++) {
			if (hak.scores[i] >= 60) {
				pass++;
			}
		}
		System.out.println(pass + "명");
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		System.out.println("인덱스입력 ");
		int idx = sc.nextInt();
		System.out.println(hak.scores[idx]);
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		System.out.println("성적입력");
		int inScore = sc.nextInt();
		for (int i = 0; i < hak.scores.length; i++) {
			if (hak.scores[i] == inScore) {
				System.out.println(i);
			}
		}
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 92점
		System.out.println("학번입력");
		int hakBun = sc.nextInt();
		int idx2 = -1;
		for (int i = 0; i < hak.hakbuns.length; i++) {
			if (hak.hakbuns[i] == hakBun) {
				idx2 = i;
			}
		}
		System.out.println("성적: " + hak.scores[idx2]);
		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		System.out.println("학번을 입력하세요");
		int hakBun2 = sc.nextInt();
		int idx3 = -1;
		for (int i = 0; i < hak.hakbuns.length; i++) {
			if (hak.hakbuns[i] == hakBun) {
				idx3 = i;
			}
		}
		if (idx3 != -1) {
			System.out.println("성적: " + hak.scores[idx3]);
		} else {
			System.out.println("해당학번은 존재하지않습니다");
		}

		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		int max = 0;
		int first = -1;
		for (int i = 0; i < hak.scores.length; i++) {
			if (max < hak.scores[i]) {
				max = hak.scores[i];
				first = i;
			}
		}
		System.out.println(hak.hakbuns[first]+"번 " + max+"점");

	}

}

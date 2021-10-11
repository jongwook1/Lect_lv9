package lv6;

import java.util.Random;
import java.util.Scanner;

class Test3 {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);

	void printq1(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			int rN = ran.nextInt(100) + 1;
			scores[i] = rN;
			System.out.print(scores[i] + " ");
		}
	}

	void printTotalAvg(int[] scores) {
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		int avg = total / scores.length;
		System.out.println("총합: " + total);
		System.out.println("평균: " + avg);
	}

	void printPass(int[] scores) {
		int pCnt = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				pCnt++;
			}
		}
		System.out.println("성적이 60점 이상인 합격생수: " + pCnt);
	}

	void printScores(int[] scores) {
		System.out.print("인덱스입력: ");
		int inIdx = sc.nextInt();
		System.out.println("성적: " + scores[inIdx]);
	}

	void printIdx(int[] scores) {
		System.out.print("성적입력: ");
		int inScore = sc.nextInt();
		int idx = -1;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == inScore) {
				idx = i;
			}
		}
		System.out.println("인덱스: " + idx);
	}

	void printInHakOutScore(int[] hakbuns, int[] scores) {
		for (int i = 0; i < hakbuns.length; i++) {
			System.out.print(hakbuns[i] + " ");
		}
		System.out.println("학번을 입력하세요");
		int inHak = sc.nextInt();
		int idx = -1;
		for (int i = 0; i < hakbuns.length; i++) {
			if (inHak == hakbuns[i]) {
				idx = i;
			}
		}
		if (idx != -1) {

			System.out.println("학번을 입력받아 성적 출력: " + scores[idx]);
		} else {
			System.out.println("존재하지 않는 학번입니다");
		}

	}

	void printMax(int[] hakbuns, int[] scores) {
		int maxNum = 0;
		int maxIdx = 0;
		for (int i = 0; i < scores.length; i++) {
			if (maxNum < scores[i]) {
				maxNum = scores[i];
				maxIdx = i;
			}
		}
		System.out.println("1등학생의 성적: " + maxNum + "  1등학생의 학번: " + maxIdx);
	}
}

public class Ex23 {

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];

		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		test3.printq1(scores);
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		test3.printTotalAvg(scores);
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		test3.printPass(scores);
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		test3.printScores(scores);
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		test3.printIdx(scores);
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 45점
		test3.printInHakOutScore(hakbuns, scores);
		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		test3.printInHakOutScore(hakbuns, scores);
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		test3.printMax(hakbuns, scores);
	}

}

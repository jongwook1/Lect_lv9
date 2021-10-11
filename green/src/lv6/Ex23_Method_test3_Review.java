package lv6;

import java.util.Random;
import java.util.Scanner;

class Test999 {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();

	public Test999() {
		System.out.println("생성자생성");
	}

	public void inputScore(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			int rN = rn.nextInt(100) + 1;
			scores[i] = rN;
			System.out.print(scores[i] + " ");
		}
	}

	public void printTotalAvg(int scores[]) {
		int total = 0;
		double avg = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		avg = total / scores.length;
		System.out.println("\n총점: " + total + " 평균: " + avg);
	}

	public void printPass(int scores[]) {
		int cnt = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				cnt++;
			}
		}
		System.out.println("합격생의 수 " + cnt);
	}

	// 문제4) 인덱스를 입력받아 성적 출력
	// 정답4) 인덱스 입력 : 1 성적 : 11점
	public void printInputIdxScores(int scores[]) {
		System.out.println("인덱스입력");
		int index = sc.nextInt();
		System.out.println(scores[index]);
	}

	// 문제5) 성적을 입력받아 인덱스 출력
	// 정답5) 성적 입력 : 11 인덱스 : 1
	public void inputScorePrintIdx(int scores[]) {
		System.out.println("성적입력");
		int a = sc.nextInt();
		int idx = -1;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == a) {
				idx = i;
			}
		}
		System.out.println(idx);
	}

	// 문제6) 학번을 입력받아 성적 출력
	// 정답6) 학번 입력 : 1003 성적 : 45점
	public void inputHakPrintScore(int hakbuns[], int scores[]) {
		System.out.println("학번입력");
		int hak = sc.nextInt();
		int idx = -1;
		for (int i = 0; i < hakbuns.length; i++) {
			if (hak == hakbuns[i]) {
				idx = i;
			}
		}
		System.out.println(scores[idx]);
	}

	// 문제7) 학번을 입력받아 성적 출력
	// 단, 없는학번 입력 시 예외처리
	// 예 7)
	// 학번 입력 : 1002 성적 : 11점
	// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
	public void inputHakPrintS(int hakbuns[], int scores[]) {
		System.out.println("학번입력");
		int hak = sc.nextInt();
		int idx = -1;
		for (int i = 0; i < hakbuns.length; i++) {
			if (hak == hakbuns[i]) {
				idx = i;
			}
		}
		if (idx == -1) {
			System.out.println("없는 학번입니다");
		} else {
			System.out.println(scores[idx]);
		}
	}

	// 문제8) 1등학생의 학번과 성적 출력
	// 정답8) 1004번(98점)
	public void printFirstS(int hakbuns[], int scores[]) {
		int first = scores[0];
		int firstIdx = -1;
		for (int i = 0; i < scores.length; i++) {
			if (first < scores[i]) {
				first = scores[i];
				firstIdx = i;
			}
		}
		System.out.println("1등학생 학번 " + hakbuns[firstIdx] + " 성적 " + first);
	}

}

public class Ex23_Method_test3_Review {

	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];

		Test999 test = new Test999();

		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		test.inputScore(scores);

		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		test.printTotalAvg(scores);

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		test.printPass(scores);

		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		test.printInputIdxScores(scores);

		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		test.inputScorePrintIdx(scores);

		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 45점
		test.inputHakPrintScore(hakbuns, scores);

		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		test.inputHakPrintS(hakbuns, scores);

		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		test.printFirstS(hakbuns, scores);

	}

}

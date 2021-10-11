package lv6;

import java.util.Random;
import java.util.Scanner;

class hak {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}


public class Ex03 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		hak h = new hak();	//클래스 초기화

		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		System.out.println("성적: ");
		for (int i = 0; i < h.scores.length; i++) {
			int rN = ran.nextInt(100) + 1;
			h.scores[i] = rN;
			System.out.print(h.scores[i] + " ");
		}

		System.out.println();
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		int total = 0;
		double avg = 0;
		for (int i = 0; i < h.scores.length; i++) {
			total += h.scores[i];
		}
		System.out.println("총점: " + total);
		avg = total / h.scores.length;
		System.out.println("평균: " + avg);

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		int cnt = 0;
		for (int i = 0; i < h.scores.length; i++) {
			if (h.scores[i] >= 60) {
				System.out.println("합격");
				cnt++;
			}
		}

		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		System.out.println("조회할 성적의 인덱스 입력하세요");
		int inIdx = sc.nextInt();
		System.out.println(h.scores[inIdx]+"점");
		System.out.println();

		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		int idx0=-1;
		System.out.println("인덱스를 조회할 성적을 입력하세요");
		int inS = sc.nextInt();
		for (int i = 0; i < h.scores.length; i++) {
			if (h.scores[i] == inS) {
				idx0=i;
			}
		}
		if(idx0 !=-1) {
			System.out.println("idx: "+ idx0);
		}else {
			System.out.println("존재하지않는성적입니다");
		}
		System.out.println();

		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 45점
		System.out.println("학번:");
		for (int i = 0; i < h.hakbuns.length; i++) {
			System.out.print(h.hakbuns[i] + " ");
		}

		System.out.println("학번을 입력하세요");
		int inN1 = sc.nextInt();
		int idx1 = -1;		//존재하지 않는게 있을수 있기때문에 -1로
		for (int i = 0; i < h.hakbuns.length; i++) {
			if (inN1 == h.hakbuns[i]) {
				idx1 = i;
			}
		}
		System.out.println(h.scores[idx1] + "점");

		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		System.out.println("학번을 입력하세요");
		int inN2 = sc.nextInt();

		int idx2 = -1;
		int check = -1;
		for (int i = 0; i < h.hakbuns.length; i++) {
			if (inN2 == h.hakbuns[i]) {
				check = i;
			}
		}
		if (check != -1) {
			System.out.println(h.scores[idx2] + "점");
		} else {
			System.out.println("해당학번은 존재하지 않습니다");
		}
		System.out.println();

		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		int max = 0;
		int first = -1;
		for (int i = 0; i < h.scores.length; i++) {
			if (h.scores[i] > max) {
				max = h.scores[i];
				first = i;
			}
		}
		System.out.println("1등 : " + h.hakbuns[first] + "번 " + max + "점");
	}

}

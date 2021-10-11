package lv3;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		int[] arr = new int[5];		//{0,0,0,0,0}
		Random ran = new Random();
		double sum = 0;
		double avg = 0;
		int cnt = 0;
		for (int i = 0; i < 5; i++) {	// i : 0~4(인덱스 역할)
			arr[i] = ran.nextInt(100) + 1;
			System.out.println("arr배열에 1~100점 사이의 정수를 5개 저장: " + arr[i]);
			sum += arr[i];
			if (arr[i] >= 60) {
				cnt++;
			}
		}
		System.out.println("전교생의 총점 : " + sum);
		avg = sum / 5;
		System.out.println("전교생의 평균 : " + avg);
		System.out.println("합격생 수: " + cnt);

	}

}

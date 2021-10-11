package lv4_review;

public class L4_Ex05 {

	public static void main(String[] args) {
		/*
		 * # 정렬하기
		 * 1. 인덱스 0번이 나머지를 검사한다.
		 * 2. 제일 큰 값을 찾아 교환한다.
		 * 3. 인덱스 1증가한다.
		 * 4. [1~3]을 끝까지 반복한다.
		 * 예)
		 * 10, 50, 30, 40, 80, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 40, 30, 10, 7
		 */

		int[] score = {10, 50, 30, 40, 80, 7};
//		
//		for (int i = 0; i < score.length; i++) {
//			for (int j = i; j < score.length; j++) {
//				if (score[i] < score[j]) {
//					int temp = score[i];
//					score[i] = score[j];
//					score[j] = temp;
//				}
//			}
//		}
//		for(int i=0;i<6;i++) {
//		System.out.println(score[i]+" ");
//	}	
//		

		
		for (int i = 0; i < score.length; i++) {
			int max = score[i];
			int idx = i;
			for (int j = i; j < score.length; j++) {
				if (max < score[j]) {
					max = score[j];
					idx = j;
				}
			}

			int temp = score[i];
			score[i] = score[idx];
			score[idx] = temp;

		}
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}

	}

}

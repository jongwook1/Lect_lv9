package lv3_review;

public class L3_Ex16 {

	public static void main(String[] args) {
		int arr[] = {
				0,0,0,
				0,0,0,
				3,3,3
		};

		// 문제2) 만약에 가로에 3이 연속으로 3개있으면 "빙고" 출력

		for (int i = 0; i < arr.length; i += 3) {
			int cnt = 0;
			for (int j = 0; j < 3; j++) {
				if (arr[i + j] == 3) {
					cnt++;
				}
			}
			if (cnt == 3) {
				System.out.println("bingo");
			}
		}

	}

}

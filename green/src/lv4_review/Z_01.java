package lv4_review;

import java.util.Scanner;

public class Z_01 {

	public static void main(String[] args) {
		//		시작 11:20
		//		종료 11:50
		//		소요 00:30
		/*
		 * # 배열 컨트롤러[2단계] : 벡터(Vector)
		 * 1. 추가
		 * . 값을 입력받아 순차적으로 추가
		 * 2. 삭제(인덱스)
		 * . 인덱스를 입력받아 해당 위치의 값 삭제
		 * 3. 삭제(값)
		 * . 값을 입력받아 삭제
		 * . 없는 값 입력 시 예외처리
		 * 4. 삽입
		 * . 인덱스와 값을 입력받아 삽입
		 */
		Scanner sc = new Scanner(System.in);
		int[] datas = null;
		int cnt = 0;

		while (true) {
			if (datas != null) {
				for (int i = 0; i < datas.length; i++) {
					System.out.print(datas[i] + " ");
				}
				System.out.println();
			}

			System.out.println("1.추가");
			System.out.println("2.삽입");
			System.out.println("3.삭제(인덱스)");
			System.out.println("4.삭제(값)");
			System.out.println("번호를 선택해주세요");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("추가할값을 입력해주세요");
				int data = sc.nextInt();
				if (cnt > 0) {
					int temp[] = datas;
					datas = new int[cnt + 1];

					for (int i = 0; i < temp.length; i++) {
						datas[i] = temp[i];
					}
				} else {
					datas = new int[1];
				}
				datas[cnt] = data;
				cnt++;

			} else if (sel == 2) {
				System.out.println("삽입할 위치를 입력해주세요");
				int idx = sc.nextInt();

				if (datas != null && idx >= 0 && idx < cnt) {
					System.out.println("삽입할 값을 입력해주세요");
					int data = sc.nextInt();

					int temp[] = datas;
					datas = new int[cnt + 1];

					for (int i = 0; i < temp.length; i++) {
						if (i < idx) {
							datas[i] = temp[i];
						} else {
							datas[i + 1] = temp[i];
						}
					}
					datas[idx] = data;
					cnt++;

				} else {
					System.out.println("삽입할수없는위치입니다");
				}
			} else if (sel == 3) {
				System.out.println("삭제할위치입력해주세요");
				int dIdx = sc.nextInt();
				if (datas != null && dIdx >= 0 && dIdx < cnt) {
					if (cnt == 1) {
						datas = null;
					} else {
						int temp[] = datas;
						datas = new int[cnt - 1];
						int idx = 0;
						for (int i = 0; i < temp.length; i++) {
							if (i != dIdx) {
								datas[idx] = temp[i];
								idx++;
							}
						}
					}
					cnt--;
				}

			} else if (sel == 4) {
				if (datas != null) {
					System.out.println("삭제할 값입력해주세요");
					int dData = sc.nextInt();

					int dCnt = 0;
					for (int i = 0; i < cnt; i++) {
						if (dData == datas[i]) {
							dCnt++;
						}
					}
					int temp[] = datas;
					datas = new int[cnt - dCnt];

					int idx = 0;
					for (int i = 0; i < temp.length; i++) {
						if (temp[i] != dData) {
							datas[idx] = temp[i];
							idx++;
						}
					}
					cnt -= dCnt;

				} else {
					System.out.println("비어있습니다");
				}
			}

		}

	}

}

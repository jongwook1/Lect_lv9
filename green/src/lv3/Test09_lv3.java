package lv3;

//Ex11 16
import java.util.Scanner;

public class Test09_lv3 {

	public static void main(String[] args) {
		// 시작 17:00
		// 종료 17:30
		// 소요 30분

		// 아래 번호를 입력받고 각방향 으로 0 이아닌숫자를 모으시요.
		// 1)left 2)right //메뉴
		// 예) 1) left ==> arr = {2,3,4,5,0,0,0,0,0}; //1번 눌렀을때 arr[]에서 0인덱스가 0인지를 먼저확인후
		// 당겨오고 현재위치인덱스 유지 그다음인덱스0인지확인후 또 당겨오기
		// 예) 2) right ==> arr = {0,0,0,0,0,2,3,4,5}; //2번 눌렀을때

		// 0 아닌걸 걸러내기
		// temp에 0 아닌걸 넣으면 되겠지?
		// temp 크기

		int arr[] = { 0, 2, 0, 3, 4, 0, 0, 5, 0 };
		for (int i = 0; i < 9; i++) {
			System.out.print(arr[i] + " ");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("\n1)왼쪽    2)오른쪽  어느쪽으로 모을지 번호를 선택해 주세요.");
		int sel = sc.nextInt();

		int idx = 0;

		if (sel == 1) {
			for (int i = 0; i < 9; i++) {
				if (arr[i] != 0) {
					idx++;
				}
			}
			int temp[] = new int[idx];
			int tempIdx = 0;
			for (int i = 0; i < 9; i++) {
				if (arr[i] != 0) {
					temp[tempIdx] = arr[i];
					tempIdx++;
				}
			}
			for (int i = 0; i < 9; i++) {
				if (i < tempIdx) {
					arr[i] = temp[i];
				} else {
					arr[i] = 0;
				}
			}
			for (int i = 0; i < 9; i++) {
				System.out.print(arr[i]);
			}
		} else if (sel == 2) {
			for (int i = 0; i < 9; i++) {
				if (arr[i] != 0) {
					idx++;
				}
			}
			int temp[] = new int[idx];
			int tempIdx = 0;
			for (int i = 0; i < 9; i++) {
				if (arr[i] != 0) {
					temp[tempIdx] = arr[i];
					tempIdx++;
				}
			}
			for (int i = 0; i < 9; i++) {
				if (i <= tempIdx) {
					arr[i] = 0;
				} else {
					arr[i] = temp[i - tempIdx - 1];
				}
			}
			for (int i = 0; i < 9; i++) {
				System.out.print(arr[i]);
			}
		}

	}

}

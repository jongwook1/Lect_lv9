package lv3;

public class Test07f_lv3 {

	public static void main(String[] args) {
		// 시작 11:20
		// 종료 10:30
		// 소요 10분
		int arr[] = { 10, 20, 30, 40, 50 };
		int temp1[] = new int[5];
		int temp2[] = new int[5];
		int temp3[] = new int[5];
		System.out.println("문제1번 arr 의 값을 temp1 에  복사후 출력 ");
		// 문제1) arr 의 값을 temp1 에 복사후 출력
		// temp1 ==> {10, 20, 30, 40, 50}
		for (int i = 0; i < 5; i++) {
			temp1[i] = arr[i];
			System.out.print(temp1[i] + " ");
		}
		System.out.println("\n문제2번 arr 의 값의 2배를 temp2에 복사후 출력 ");
		// 문제2) arr 의 값의 2배를 temp2에 복사후 출력
		// temp2 ==> {20, 40, 60, 80 , 100}
		int idx = 0;
		for (int i = 0; i < 5; i++) {
			temp2[idx] = (arr[i] * 2);
			idx++;
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(temp2[i] + " ");
		}

		System.out.println("\n문제3 arr 의 값에 i를 더한값을 temp3 에 복사후 출력  ");
		// 문제3) arr 의 값에 i를 더한값을 temp3 에 복사후 출력
		// temp3 ==> {10,21,32,43,54}
		int idx2 = 0;
		for (int i = 0; i < 5; i++) {
			temp3[idx2] = (arr[i] + i);
			idx2++;
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(temp3[i] + " ");
		}

	}

}

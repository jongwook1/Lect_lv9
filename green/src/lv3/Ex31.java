package lv3;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 10, 20, 30, 40, 50 };
		int b[] = new int[5];
		// 숫자를 5개 입력받고 arr 배열안에 입력한값이 있을때마다
		// b배열안에 해당 값의 인덱스를 차례대로 저장할려고 한다.
		// 조건) 만약에 입력한 숫자가 arr 에 없으면 인덱스 대신 -1 저장
		// 예) 10, 20, 10, 1, 50
		// b ={0,1,0,-1,4}
		// 예) 30, 40, 1, 10, 2
		// b = {2,3,-1,0,-1}

		for (int i = 0; i < 5; i++) {
			System.out.print("값입력: ");
			int num = sc.nextInt();

			int idx = -1;
			for (int j = 0; j < 5; j++) { // 중첩for문을 쓰는게 이해가안감 중첩안쓰고 if(arr[j]==num)하면 안되는것인지..?
				if (arr[j] == num) {
					idx = j;
				}
			}
			b[i] = idx;
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}

	}

}

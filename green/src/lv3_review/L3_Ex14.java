package lv3_review;

public class L3_Ex14 {

	public static void main(String[] args) {
		
		/*
		 * # 4�� ����� ����
		 * - arr �迭���� 4�� ����� ��� temp �迭�� ����
		 * - ��! temp �� ���̸� 4�� �����ŭ�� �����Ѵ�. 
		 */

		int[] arr = { 44, 11, 29, 24, 76 };
		int[] temp = null;

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		temp = new int[cnt];

		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				temp[idx] = arr[i];
				idx++;
			}
		}

		for (int i = 0; i < cnt; i++) {
			System.out.print(temp[i] + " ");
		}
	}
}

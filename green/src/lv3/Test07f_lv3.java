package lv3;

public class Test07f_lv3 {

	public static void main(String[] args) {
		// ���� 11:20
		// ���� 10:30
		// �ҿ� 10��
		int arr[] = { 10, 20, 30, 40, 50 };
		int temp1[] = new int[5];
		int temp2[] = new int[5];
		int temp3[] = new int[5];
		System.out.println("����1�� arr �� ���� temp1 ��  ������ ��� ");
		// ����1) arr �� ���� temp1 �� ������ ���
		// temp1 ==> {10, 20, 30, 40, 50}
		for (int i = 0; i < 5; i++) {
			temp1[i] = arr[i];
			System.out.print(temp1[i] + " ");
		}
		System.out.println("\n����2�� arr �� ���� 2�踦 temp2�� ������ ��� ");
		// ����2) arr �� ���� 2�踦 temp2�� ������ ���
		// temp2 ==> {20, 40, 60, 80 , 100}
		int idx = 0;
		for (int i = 0; i < 5; i++) {
			temp2[idx] = (arr[i] * 2);
			idx++;
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(temp2[i] + " ");
		}

		System.out.println("\n����3 arr �� ���� i�� ���Ѱ��� temp3 �� ������ ���  ");
		// ����3) arr �� ���� i�� ���Ѱ��� temp3 �� ������ ���
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

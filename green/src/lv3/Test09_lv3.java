package lv3;

//Ex11 16
import java.util.Scanner;

public class Test09_lv3 {

	public static void main(String[] args) {
		// ���� 17:00
		// ���� 17:30
		// �ҿ� 30��

		// �Ʒ� ��ȣ�� �Է¹ް� ������ ���� 0 �̾ƴѼ��ڸ� �����ÿ�.
		// 1)left 2)right //�޴�
		// ��) 1) left ==> arr = {2,3,4,5,0,0,0,0,0}; //1�� �������� arr[]���� 0�ε����� 0������ ����Ȯ����
		// ��ܿ��� ������ġ�ε��� ���� �״����ε���0����Ȯ���� �� ��ܿ���
		// ��) 2) right ==> arr = {0,0,0,0,0,2,3,4,5}; //2�� ��������

		// 0 �ƴѰ� �ɷ�����
		// temp�� 0 �ƴѰ� ������ �ǰ���?
		// temp ũ��

		int arr[] = { 0, 2, 0, 3, 4, 0, 0, 5, 0 };
		for (int i = 0; i < 9; i++) {
			System.out.print(arr[i] + " ");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("\n1)����    2)������  ��������� ������ ��ȣ�� ������ �ּ���.");
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

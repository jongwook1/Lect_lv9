package lv3;

import java.util.Scanner;

public class AAAAAAA_03 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int b[] = new int[5];
		// ���ڸ� 5�� �Է¹ް� arr �迭�ȿ� �Է��Ѱ��� ����������
		// b�迭�ȿ� �ش� ���� �ε����� ���ʴ�� �����ҷ��� �Ѵ�.
		// ����) ���࿡ �Է��� ���ڰ� arr �� ������ �ε��� ��� -1 ����
		// ��) 10, 20, 10, 1, 50
		// b ={0,1,0,-1,4}
		// ��) 30, 40, 1, 10, 2
		// b = {2,3,-1,0,-1}
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("���ڸ��Է��ϼ���");
			int n = sc.nextInt();

			int idx = -1;
			for (int j = 0; j < 5; j++) {
				if (arr[j] == n) {
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

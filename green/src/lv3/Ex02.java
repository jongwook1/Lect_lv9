package lv3;

public class Ex02 {

	public static void main(String[] args) {

		// ����1) 10���� 50���� arr �迭�� ����
		// ����1) 10 20 30 40 50
		// ����2) ��ü �� ���
		// ����2) 150

		int[] arr = new int[5];		//{0,0,0,0,0}
									// 0 1 2 3 4	
		int sum = 0;
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		int n = 0;
		while (n <= 4) {
			System.out.println(arr[n]);
			sum += arr[n];

			n++;
		}
		System.out.println("��ü �� ��� :" + sum);

	}

}

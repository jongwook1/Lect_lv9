package lv3;

import java.util.Random;

public class Ex20 {

	public static void main(String[] args) {

		// ����
		// ���� ==> �迭���� ������ �������� ���°�
		// ��� ==> 1) �����ε��� 1~ 4�� �̴´�.
		// 2) �����ε����� ���� 0���ε��� ���� ��ȯ
		// 3) �� ���� 100���ݺ�
		// int arr[5] = {10, 20, 30, 40, 50};
		// �� ) �����ε��� --> 3 ==> {40, 20, 30, 10, 50};
		// �� ) �����ε��� --> 1 ==> {20, 40, 30, 10, 50};
		// �� ) �����ε��� --> 4 ==> {50, 40, 30, 10, 20};

		// ����

		Random rn = new Random();

		int arr[] = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < 1000; i++) {
			int rIdx = rn.nextInt(4) + 1; // 0~4

			int temp = arr[0];
			arr[0] = arr[rIdx];			//�̰��ϸ� rIdx�� ���� �ε����ʿ��ؼ� �ٷ����� int temp  ??
			arr[rIdx] = temp;
		}

		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}

//		Random ran=new Random();
//		int rn=ran.nextInt(4)+1;
//		System.out.println("rn"+rn);
//		for(int i =0;i<5;i++) {
//			System.out.println("a"+arr[i]);
//			System.out.println("rn2 "+arr[rn]);
//			arr[i]=arr[rn];
//			
//			System.out.println(arr[i]);
//		}
//		

	}

}

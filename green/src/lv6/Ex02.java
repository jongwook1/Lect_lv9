package lv6;

class Arr {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class Ex02 {
	
	
	public static void main(String[] args) {
		
		// Ŭ������ ������= new Ŭ������();
		   Arr    temp =new Arr();
		
		// ���� 1) ��ü �� ���
				// ���� 1) 362
		
		int total = 0;
		for (int i = 0; i < temp.arr.length; i++) {
			total += temp.arr[i];
		}
		System.out.println(total);

		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
//���� 2,3 �ѹ����� ����
//		int sum = 0;
//		int cnt =0;
//		for (int i = 0; i < temp.arr.length; i++) {
//			if (temp.arr[i] % 4 == 0) {
//				sum += temp.arr[i];
//				cnt++;
//			}
//		}
//		System.out.println(sum);
//		System.out.println(cnt);
		
		int sum = 0;
		for (int i = 0; i < temp.arr.length; i++) {
			if (temp.arr[i] % 4 == 0) {
				sum += temp.arr[i];
			}
		}
		System.out.println(sum);

		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3
		int cnt = 0;
		for (int i = 0; i < temp.arr.length; i++) {
			if (temp.arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		// ���� 4) ¦���� ���� ���
		// ���� 4) 3
		int jjak = 0;
		for (int i = 0; i < temp.arr.length; i++) {
			if (temp.arr[i] % 2 == 0) {
				jjak++;
			}
		}
		System.out.println(jjak);

	}

}

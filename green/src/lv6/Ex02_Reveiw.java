package lv6;

class Arr999 {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class Ex02_Reveiw {

	public static void main(String[] args) {

		Arr999 temp = new Arr999();

		// ���� 1) ��ü �� ���
		// ���� 1) 362
		int total = 0;
		for (int i = 0; i < temp.arr.length; i++) {
			total += temp.arr[i];
		}
		System.out.println(total);

		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
		int total2 = 0;
		int fCnt = 0;
		int jjakCnt = 0;
		for (int i = 0; i < temp.arr.length; i++) {
			if (temp.arr[i] % 4 == 0) {
				total2 += temp.arr[i];
				fCnt++;
			}
			if (temp.arr[i] % 2 == 0) {
				jjakCnt++;
			}
		}
		System.out.println(total2);

		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3
		System.out.println(fCnt);
		// ���� 4) ¦���� ���� ���
		// ���� 4) 3
		System.out.println(jjakCnt);
	}

}

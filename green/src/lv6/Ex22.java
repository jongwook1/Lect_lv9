package lv6;
class Test2 {
	void printSum(int[] arr) {
		int total=0;
		for(int i=0;i<arr.length;i++) {
			total+=arr[i];
		}
		System.out.println("����: "+total);
	}
	void printSumMultiple4(int[] arr) {
		int total=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%4==0) {
				total+=arr[i];
			}
		}
		System.out.println("4�ǹ���� ��: "+total);
	}
	void printCountMultiple4(int[] arr) {
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%4==0) {
				cnt++;
			}
		}
		System.out.println("4�� ����� ����: "+cnt);
	}
	void printCountjjak(int[] arr) {
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				cnt++;
			}
		}
		System.out.println("¦���� ���� ��� "+ cnt);
	}
}
public class Ex22 {

	public static void main(String[] args) {
		Test2 test2=new Test2();
		int[] arr = { 87, 100, 11, 72, 92 };

		// ���� 1) ��ü �� ���
		// ���� 1) 362
		test2.printSum(arr);
		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
		test2.printSumMultiple4(arr);
		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3
		test2.printCountMultiple4(arr);
		// ���� 4) ¦���� ���� ���
		// ���� 4) 3
		test2.printCountjjak(arr);

	}

}

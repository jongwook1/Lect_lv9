package lv3_review;

public class L3_Ex01 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];

		// ����1) 4�� ����� ���
		// ����1) 20 40
		for(int i=0;i<5;i++) {
			arr[i]=10*(i+1);
			if(arr[i]%4==0) {
				System.out.println(arr[i]);
			}
		}

		// ����2) 4�� ����� �� ���
		// ����2) 60
		int sum=0;
		for(int i=0;i<5;i++) {
			arr[i]=10*(i+1);
			if(arr[i]%4==0) {
				sum=arr[i];
			}
		}
System.out.println("4�� ����� ��: "+sum);

		// ����3) 4�� ����� ���� ���
		// ����3) 2		
		int cnt=0;
		for(int i=0;i<5;i++) {
			arr[i]=10*(i+1);
			if(arr[i]%4==0) {
				cnt++;
			}
		}
		System.out.println("4�� ����� ����: "+cnt);
	}

}

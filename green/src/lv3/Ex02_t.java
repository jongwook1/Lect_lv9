package lv3;

public class Ex02_t {

	public static void main(String[] args) {
		// ����1) 10���� 50���� arr �迭�� ����
		// ����1) 10 20 30 40 50
		

		int[] arr = new int[5];		//{0,0,0,0,0}
									// 0 1 2 3 4	
		
		for(int i=0; i<5;i++) {
			arr[i] = (i+1)*10;
					System.out.println(arr[i]);
		}

		// ����2) ��ü �� ���
		// ����2) 150
		
		int sum =0;
		for(int i=0; i<5;i++) {
			sum+=arr[i];
		}
		System.out.println("��: " + sum);
		
		// ����1) 4�� ����� ���
		// ����1) 20 40
		sum = 0;
		for(int i=0; i<5;i++) {
			if(arr[i] % 4 ==0) {
				System.out.println(arr[i]+ " ");
				sum += arr[i];
			}
		}System.out.println();
		
		// ����2) 4�� ����� �� ���
		// ����2) 60
		System.out.println("sum " + sum);
		
		// ����3) 4�� ����� ���� ���
		// ����3) 2
		int cnt =0;
		for(int i=0; i<5;i++) {
			if(arr[i] % 4 ==0) {
				cnt ++;
			}
		}
		System.out.println("cnt:" + cnt);
		
		
		
		
		
	}

}

package lv4;

public class Ex13_re {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
				
			}
		}
		// ���� 1) ��ü �� ���
		// ���� 1) 450
		
		int total=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
			total+=arr[i][j];
			}
			}
		System.out.println("��ü�� ��:"+total);		
		
		System.out.println("4�ǹ�����");
		// ���� 2) 4�� ����� ���
		// ���� 2) 20 40 60 80
		int total2=0;
		int cnt2=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(arr[i][j]%4==0) {
					System.out.print(arr[i][j]+" ");
					total2+=arr[i][j];
					cnt2++;
				}
			}
			}
		
	
		// ���� 3) 4�� ����� �� ���
		// ���� 3) 200
		System.out.println("4�ǹ�� �����");
		System.out.println(total2);
		
		// ���� 4) 4�� ����� ���� ���
		// ���� 4) 4
		System.out.println("4�ǹ�� �������");
		System.out.println(cnt2);
		
	}

}

package lv4;

public class Ex13 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];													//{ {0}{0}{0} }{ {0}{0}{0} }{ {0}{0}{0} }
		int k = 1;
		int total=0;
		int total4=0;
		int cnt=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
				total+=arr[i][j];
				if(arr[i][j]%4==0) {					
					System.out.println("4�� ���"+  arr[i][j]);
					cnt++;
					total4+=arr[i][j];
				}
				//System.out.print(arr[i][j]+" ");
			}
			
		}
		
		// ���� 1) ��ü �� ���
		// ���� 1) 450
		System.out.println();
		System.out.println("��ü�� ���: " +total);		
		// ���� 2) 4�� ����� ���
		// ���� 2) 20 40 60 80
		
		
		
		
		// ���� 3) 4�� ����� �� ���
		// ���� 3) 200
		System.out.print("4�� ����� ��: "+total4);
		// ���� 4) 4�� ����� ���� ���
		// ���� 4) 4
		System.out.println("\n4�� ����� ���� ���: " +cnt);

	}

}

package lv3_review;

public class L3_Ex00 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		// ����1) 10���� 50���� arr �迭�� ����
		// ����1) 10 20 30 40 50

		for(int i=0;i<5;i++) {
			arr[i]=(i+1)*10;
					System.out.print(arr[i]+" ");
		}		
		
		// ����2) ��ü �� ���
		// ����2) 150
		int sum=0;
		for(int i=0;i<5;i++) {
			arr[i]=10*(i+1);
				sum=arr[i];
		}
		System.out.println("��ü��: "+sum);
	}

}

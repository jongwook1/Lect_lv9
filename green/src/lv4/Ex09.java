package lv4;

public class Ex09 {

	public static void main(String[] args) {
		
		//�迭�� �ּ� ����
		
		
		int[] arr = {87, 100, 24, 11, 79};
//		int[] temp = arr;		//arr �迭�� ����  ��(�ּ�)�� ���� �ʱ�ȭ  (�ּҸ� ����) (���ϳ��� ��2�� �����)
		int[] temp=new int[5];
				
		System.out.println(arr);
		System.out.println(temp);
		
		for(int i=0;i<5;i++) {
			temp[i] = arr[i];
		}
		
		
		temp[1] = 0;
		

		
		//���
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(temp[i] + " ");
		}
		
		
		
		
		
		
	}

}

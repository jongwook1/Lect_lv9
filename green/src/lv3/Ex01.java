package lv3;

public class Ex01 {

	public static void main(String[] args) {
		//����?
		//�� ���Ѱ��� ���� ������ �� ����
		//�� ���Ҽ� �ִ°�
		
		// �迭 array
		// �� ���� �ڷ����� ������(��)�� ������ ���� �� �� ����
		// �� 0���� �����ϴ� index(���ȣ)�� ������ ���� (1�� ����) (�߿�!!!!!!!!!!!!!!!!!!!!!)
		
		
		//����� �ʱ�ȭ
		//�ڷ���Ű���� �迭��[];
		//�ڷ���Ű����[] �迭��;
		
		//= {1,2,3,..}				//stack
		int arr[] = {1,2,3,4,5};
		//		     0 1 2 3 4     :index
		//= new �ڷ���Ű����[����];  		// heap		
		int arr2[] = new int[5];	//{0,0,0,0,0}
		//0~4
		
		//���
		//�迭��[index]
		System.out.println(arr);	//[[I@7637f22  �迭�� �ּ�
		System.out.println(arr[0]);
	
	//	System.out.println(arr[5]);	// Index 5 out of bounds for length 5 at lv3.Ex01.main(Ex01.java:31)  ===5�ε��� ����!

		
		System.out.println(arr2[0]);

	
		
		arr2[0] = 10;
		System.out.println(arr2[0]);
		
		// �迭�� ��ü��(=�迭�� �������ִ°�)�� �ݺ����� ���� ���(while, for)
		
		int n =0;	//index�� Ȱ�� �ϱ����� 0���� �ؾߴ�
		
		while(n < 5) {
			System.out.print(arr[n]+ " ");
			
			n++;
		}
		
		System.out.println(" ");
		
		for(int i =0; i<5; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		

	}

}

package lv4;

public class Ex12 {

	public static void main(String[] args) {
		// �迭 : (���� �ڷ�����) �������� ���� ���� �Ҽ��ִ°�
		//2���� �迭 : �� �ٸ� �迭�� ������ ���°�

		//����
		// �ڷ��� �迭��[];
		
		// �ʱ�ȭ
		// = {} ;
		// = new �ڷ���[����]
		
		//2���� �迭�� ����
		// �ڷ��� �迭��[][];	// �ڷ���[][] �迭��;
		
		//2���� �迭�� �ʱ�ȭ
		//={{},{},{}};
		// = new �ڷ���[����][����];
		
		int arr[][]= {{1,2},{3,4},{5,6}};
		//				0	  1		2
		//			   0 1	 0 1   0 1	
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//���
		//�迭��[�ܺ��ε���][�����ε���]
		
		System.out.println(arr[0][0]);
		
		//2���� �ݺ����� ����ؼ� -> arr�迭�� ��ü��(1~6����)�� ���
		for(int i=0; i<3;i++) {				//i-�ܺ��ε���
			for(int j=0;j<2;j++) {			//j-�����ε���
				System.out.print(arr[i][j]+" ");
			}
		}
		
		int datas[][] =new int[3][2];			//{{0,0},{0,0},{0,0}}
		//										   00 01  10 11 20 21	  
		
		//2���� �ݺ����� ����ؼ�-> datas �迭�� ��ü���� 1����6���� �ʱ�ȭ
												//{{1,2},{3,4},{5,6}}
		
		
		int n=1;
		for(int i=0;i<3;i++) {			
			for(int j=0;j<2;j++) {
				datas[i][j]=n;
				n++;
				System.out.print(datas[i][j]+" ");
			}
		}
		
		
	}

}

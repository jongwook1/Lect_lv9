package lv3;

public class Test08_lv3 {

	public static void main(String[] args) {
		// ���� 11:30
		// ���� 11:45
		// �ҿ� 15��		
		
		int arr[] = {10,20,30,40,50};	
		int b[] = new int[5];
		// arr�� ���� 4�� ����� b�� �Ųٷ�����
		// ��) b = {0,0,0,40,20};
		
		int idx=3;
		for(int i=0;i<5;i++) {
			if(arr[i]%4==0) {
				b[idx]=arr[i];
				idx++;
			}
		}
		int temp=b[3];
		b[3]=b[4];
		b[4]=temp;
		for(int i=0;i<5;i++) {
			System.out.print(b[i]+" ");
		}

	}

}

package lv3;

public class Ex16 {

	public static void main(String[] args) {
		/*
		 * # 4�� ����� ����
		 * - arr �迭���� 4�� ����� ��� temp �迭�� ����
		 * - ��! temp �� ���̸� 4�� �����ŭ�� �����Ѵ�. 
		 */
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;		//
		
		//1.temp �迭�� �ʱ�ȭ �� ũ�⸦ ���ؾ���
		int cnt =0;
		for(int i=0;i<5;i++) {
			if(arr[i] %4 ==0) {
				cnt++;
			}
		}	
		
		//2.temp �迭�� �� �ʱ�ȭ
		temp= new int[cnt];		//{0,0,0...}
			
		
		//3. 4�� ����� ���� -> ����
		int tempIdx =0;
		for(int i=0;i<5;i++) {
			if(arr[i] % 4 ==0) {
				temp[tempIdx]=arr[i];
				tempIdx++;
			}
		}
		//���
		for(int i=0;i<cnt;i++) {
			System.out.println(temp[i]+" ");
		}
		
		

	}

}

package lv4;

public class A {

	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,2,1};
		
		// �� �迭���� �ߺ��ȵȼ��ڸ� �����Ͻÿ� 
		// 1) {1,2,2,1}
		// 2) {4,4}
		// 3) {1,1,1,1}
		
		//1. �ߺ��� �ȵ�(cnt�� 1��) ���� �迭�� � �ֳ�?
		//2. �� �迭�� ũ�⸦ �˾Ƴ�-> �� �迭�� �ʱ�ȭ �Ҽ� ����
		//3. �ߺ��� ���ڸ� -> �� �迭�� �������� ����
		//4. �� �迭�� ���(ũ�⸸ŭ length)
		
		int size=test2.length;
		
		for(int i=0;i<test2.length;i++) {
			int cnt=0;
			for(int j=0;j<test2.length;j++) {
				
				if(test2[i]==test2[j]) {
					cnt++;
				}
			}
			if(cnt==1) {
				size--;
			}
		}
		
		int temp[]=test2;
		test2=new int[size];
		
		int idx=0;
		for(int i=0;i<temp.length;i++) {
			int cnt=0;							
			for(int j=0;j<temp.length;j++) {
				if(temp[i]==temp[j]) {
					cnt++;
				}
			}
			if(cnt!=1) {			//���⼭ cnt=1�� �ߺ��Ⱦֵ��̹Ƿ� �׹ݴ��� �ߺ��ȵȾֵ� �״°�
				test2[idx]=temp[i];
				idx++;
			}			
		}
		for(int i=0;i<test2.length;i++) {
			System.out.print(test2[i]);
		}
		
		
		
		
	}

}

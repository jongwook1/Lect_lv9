package lv4;

public class Ex24_t_kkkk {
//�ǾƷ� ��Ʈ������ �ǵ��� ��¥��Ǯ�� ����
	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,2,1};
		// �� �迭���� �ߺ��ȵȼ��ڸ� �����Ͻÿ� 
		// 1) {1,2,1,2}
		// 2) {4,4}
		// 3) {1,1,1,1}
		
		
		
		
		int size=test1.length;		//?
		for(int i=0; i<test1.length;i++) {		//test1[i]
			int cnt=0;
			for(int j=0; j<test1.length;j++) {	// ��ü �� �?
				if(test1[i]==test1[j]) {
					cnt++;
				}
			}
			
			if(cnt==1) {						// 	�ߺ�!��!�Ⱦֵ����		//ù��° for�� �ۿ� ��ġ
				size --;						//  �ߺ�!��!�Ⱦֵ鳪�¼��ڸ�ŭ ����������
			}
		}
		System.out.println(size);
		
		int temp[]=test1;
		test1 = new int[size];
		
		int idx=0;									//int idx=0 �̰ų�ħ
		for(int i=0;i<temp.length;i++) {
			int cnt =0;
			for(int j=0; j<temp.length;j++) {
				if(temp[i]==temp[j] ) {
					cnt++;
				}
			}
			if(cnt !=1) {						//���⼭ cnt=1�� �ߺ��Ⱦֵ��̹Ƿ� �׹ݴ��� �ߺ��ȵȾֵ� �״°�
				test1[idx]=temp[i];
						idx++;
			}
		}
		
		for(int i=0; i<test1.length;i++) {
			System.out.print(test1[i]+" ");
		}
		
		
		//1. �ߺ��� �ȵ�(cnt�� 1��) ���� �迭�� � �ֳ�?
		//2. �� �迭�� ũ�⸦ �˾Ƴ�-> �� �迭�� �ʱ�ȭ �Ҽ� ����
		//3. �ߺ��� ���ڸ� -> �� �迭�� �������� ����
		//4. �� �迭�� ���(ũ�⸸ŭ length)
		
		
		
		
		
	}

}

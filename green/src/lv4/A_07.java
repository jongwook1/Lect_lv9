package lv4;

public class A_07 {

	public static void main(String[] args) {
		/*
		 * # �����ϱ�
		 * 1. �ε��� 0���� �������� �˻��Ѵ�.
		 * 2. ���� ū ���� ã�� ��ȯ�Ѵ�.
		 * 3. �ε��� 1�����Ѵ�.
		 * 4. [1~3]�� ������ �ݺ��Ѵ�.
		 * ��)
		 * 10, 50, 30, 40, 80, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 40, 30, 10, 7
		 */

		int[] score = {10, 50, 30, 40, 80, 7};
		
		for (int i = 0; i < 6; i++) {
			int max = score[i];				
				int idx = i;
				for(int j=i;j<6;j++) {
					if(score[j]>max) {
						max=score[j];
						idx=j;
					}
				}
				int temp=score[i];
				score[i]=score[idx];
				score[idx]=temp;
			
			
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(score[i] + " ");
		}
		
		
		
	}

}

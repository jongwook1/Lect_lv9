package lv4;

public class Ex07_re {

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
		
		for(int i=0;i<score.length;i++) {
			for(int j=i;j<score.length;j++) {
				if(score[i]<score[j]) {
					score[i]=score[j];
					int temp=score[i];
					score[i]=score[j];
					score[j]=temp;
				}
			}
		}
		for(int i=0;i<score.length;i++) {
		System.out.print(score[i]+" ");
		}
		
	}

}

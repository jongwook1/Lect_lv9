package lv4_review;

public class L4_Ex06 {

	public static void main(String[] args) {
		/*
		 * # ���� ���
		 * . ���� ������ �̸� ���
		 */
		
		String[] name = {"ȫ�浿", "�迵", "�ڹ�ŷ", "�κ�ö", "�ް���"};
		int[] score   = {    87,    42,    100,     11,     98};
	
		
		for(int i=0;i<score.length;i++) {
			int max=score[i];
			int idx=i;
			for(int j=i;j<score.length;j++) {
				if(max<score[j]) {
					max=score[j];
					idx=j;
				}
			}
			int temp=score[i];
			score[i]=score[idx];
			score[idx]=temp;
			
			String temp2=name[i];
			name[i]=name[idx];
			name[idx]=temp2;
		}
		
		for(int i=0;i<5;i++) {
			System.out.printf("%d�� %s %d��\n", i+1, name[i],score[i]);
		}
		
	}

}

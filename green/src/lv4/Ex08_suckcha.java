package lv4;

public class Ex08_suckcha {

	public static void main(String[] args) {
		/*			
		 * # ���� ���							
		 * . ���� ������ �̸� ���              //���Ǽ��� �������ָ�x
		 */
		
		String[] name = {"ȫ�浿", "�迵", "�ڹ�ŷ", "�κ�ö", "�ް���"};
		int[] score   = {    87,    42,    100,     11,     98};

		for(int i=0;i<5;i++) {
			int max=score[i];
			
			int idx=i;
			for(int j=i;j<5;j++) {
				if(max<score[j]) {
					max=score[j];
					idx=j;
				}
			}
			//����ü
			int temp=score[i];
			score[i]=score[idx];			//���⿡ score[idx]��� max �൵��
			score[idx]=temp;
			
			
			String temp1= name[i];
			name[i]=name[idx];
			name[idx]=temp1;
			
			
		}
		for(int i=0;i<5;i++) {
			System.out.printf("%d�� %s %d��\n", i+1, name[i],score[i]);
		}
		
		
		
		

	}

}

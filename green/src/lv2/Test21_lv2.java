package lv2;

public class Test21_lv2 {

	public static void main(String[] args) {
			//���� 21:05
			//���� 21:07
			//�ҿ�ð� 2��
		
		
			//# ����4) 50 ���� 100 ������ �ڿ����߿��� 9�� ����� ��� �?
		
		int a = 100;
		int cnt =0;
		while(a >= 50) {
			if(a % 9 ==0) {
				//System.out.println("9�� ���" + a);
				cnt++;
			}				
			a--;	
		}System.out.println("50~100���� �ڿ����� 9�� ����� ��: " + cnt);
		
		
		
	}

}

package lv2;

public class Test22_lv2 {

	public static void main(String[] args) {
		//���� 21:25
		//���� 21:30
		//�ҿ� 5��
		
		
		// # ����1) 7�� ����� ���ʴ�� ��������� 8��° ����� ���
		boolean run = true;
		int a=1;
		int cnt =0;
		
		while(true) {
			if(a % 7 ==0) {
				System.out.println("7�� ���"+a);
				cnt++;
				if(cnt==8) {
					break;
				}
			}
			a++;
		}System.out.println("7�� ����� ���ʴ�� ��������� 8��° ����� ���" + a);	

	}

}

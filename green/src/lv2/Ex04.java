package lv2;

public class Ex04 {

	public static void main(String[] args) {
		//������� : break, continue
		//�� break : �ڽ��� ���� �ݺ����� ��� �����Ŵ
		//�� continue : �ڽ��� ���� �ݺ����� ó��(Ű����)���� ���ư�
		int n = 1;
		
		while(true) {
			System.out.println(1);
			while(true) {
				System.out.println(2);
				if(n == 10) {
					continue;		// ������ ��� ������ ����
				}
				break;				
			}
			System.out.println(3);
			n++;
		}		

	}

}

package lv2;

public class Test19_lv2 {

	public static void main(String[] args) {
		//���� 20:45
		//���� 20:47
		//�ҿ� 2��
		
		// # ����2) 24�� ����߿��� 2�� ��������

		int a = 1;	

		while (a <= 24) {
			if (24 % a == 0 && a % 2 == 0) {
				System.out.println(a);
			}
			a++;
		}
	}

}

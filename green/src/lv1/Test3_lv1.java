package lv1;

import java.util.Random;

public class Test3_lv1 {

	public static void main(String[] args) {
		// �������� 1. ���� ����
				// ���� 10:05
				// ���� 10:08
				// �ҿ� 3�� 00
		
		/*
		 * # ���� ����
		 * 1. 0 �Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
		 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
		 * 3. ������ �յ޸��� ���ߴ� �����̴�.
		 */
		
		Random ran =  new Random();
		
		int Rn = ran.nextInt(2);
		
		if(Rn == 0) {
			System.out.println("�޸��̴�");
		}else {
			System.out.println("�ո��̴�");
		}		
		
	}

}

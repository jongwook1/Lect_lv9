package lv1;

import java.util.Random;

public class Test2_lv1 {

	public static void main(String[] args) {
				// �������� 1. Ȧ¦����
				// ���� 09:50
				// ���� 09:55
				// �ҿ� 10��
		
		/*
		 * # Ȧ¦ ����
		 * 1. 1~100������ ���� ���ڸ� �����Ѵ�.
		 * 2. ����� ���� ���ڸ� �����ְ�,
		 * 3. �ش� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
		 */
		
		Random ran = new Random();
		int Rn = ran.nextInt(100)+1;
		System.out.println(Rn);
		
		if(Rn % 2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}		

	}

}

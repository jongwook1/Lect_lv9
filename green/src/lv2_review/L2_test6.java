package lv2_review;

import java.util.Scanner;

public class L2_test6 {

	public static void main(String[] args) {
		/*
		 * # ����� ���� 
		 * 1. 5ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
		 * 2. �Է¹��� ������ ���� ���� ����Ѵ�. 
		 * 3. ���࿡ �Է¹��� ���� 100 �̻��̸�  �ݺ��� 5ȸ�� �ƴ����� ��� ���� 
		 * 
		 * ��) 7 ==> �� : 7 ,  14 ==> �� : 21 , 1000 ==> �� : 1021 !����
		 * 
		 */	
		
		Scanner sc = new Scanner(System.in);

		int total = 0;
		int i = 0;
		while (i < 5) {
			System.out.println("�����Է��ϼ���");
			int inputN = sc.nextInt();
			total += inputN;
			if (total >= 100) {
				System.out.println("100�̻��̹Ƿ� �����մϴ�");
				break;
			}
			i++;
		}
		System.out.println("5ȸ �ʰ������Ƿ� ����");
	}

}

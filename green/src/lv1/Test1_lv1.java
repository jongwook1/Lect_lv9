package lv1;

import java.util.Random;

public class Test1_lv1 {

	public static void main(String[] args) {
	//�������� 1. ���������� 3�ܰ�
	// ���� 09:34
	// ���� 90:45
	// �ҿ� 11�� 00��
		
		
		/*
		 * # ���������� ����[2�ܰ�]��
		 *   if - else if �������� �����غ���.
		 */
		
		/*
		 * # ����(0)����(1)��(2) ����[2�ܰ�] 
		 * 1. com�� 0~2 ������ ������ ���ڸ� �����Ѵ�.
		 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�. 
		 * 3. com�� me�� ����, 1) ����. 2) ���� �̰��. 3) ���� ����. �� ����Ѵ�.
		 */
		
		Random ran = new Random();
		
		int com = ran.nextInt(3);
		int me = ran.nextInt(3);
		int win = 0;
		
		if(com == me) {
			System.out.println("����");
		}
		
		else if(com == 0 && me == 2 ) {
			System.out.println("����");
			System.out.println("�� : ����   �� : ��");
			win = 1;
		}else if(com == 1 && me == 0) {
			System.out.println("����");
			System.out.println("�� : ����   �� : ����");
			win = 1;
		}else if(com == 2 && me == 1) {
			System.out.println("����");
			System.out.println("�� : ��   �� : ����");
			win = 1;
		}
		
		else if(com == 0 && me == 1 ) {
			System.out.println("�̰��");
			System.out.println("�� : ����   �� : ����");
			win = 2;
		}else if(com == 1 && me == 2) {
			System.out.println("�̰��");
			System.out.println("�� : ����   �� : ��");
			win = 2;
		}else if(com == 2 && me == 0) {
			System.out.println("�̰��");
			System.out.println("�� : ��   �� : ����");
			win = 2;
		}else {
			System.out.println("��Ģ");
			win =2;
			}
		
		if(win == 1) {
			System.out.println("��������");			
		}else if(win == 2) {
			System.out.println("���� �̰��");
		}	
		
	}

}

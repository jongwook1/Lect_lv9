package lv1;
import java.util.Random;

import java.util.Scanner;
public class t1_2 {

	public static void main(String[] args) {
		/*
		 * # ����(0)����(1)��(2) ����[2�ܰ�] 
		 * 1. com�� 0~2 ������ ������ ���ڸ� �����Ѵ�.
		 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�. 
		 * 3. com�� me�� ����, 1) ����. 2) ���� �̰��. 3) ���� ����. �� ����Ѵ�.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		Random ran = new Random();
		
		int win = 0;
		int com = ran.nextInt(3);	// ���� 0~2
		int me = ran.nextInt(3);
		// ����
		if(com == me) {
			System.out.println("����");
		}
		// �̰��
		else if(me == 0 && com == 2) {
			System.out.println("��ǻ�� : ���ڱ�");
			System.out.println("�� : ����");
			win = 1;
		}
		else if(me == 1 && com == 0) {
			System.out.println("��ǻ�� : ���� ");
			System.out.println("�� : ����");
			win = 1;
		}
		else if(me == 2 && com == 1) {
			System.out.println("��ǻ�� : ����");
			System.out.println("�� : ��");
			win = 1;
		}		
		
		// ����
		else if(me == 0  && com == 1) {
			System.out.println("����");
			win = 2;
		}
		else if(me == 1 && com == 2) {
			System.out.println("����");
			win = 2;
		}
		else if(me == 2 && com == 0) {
			System.out.println("����");
			win = 2;
		}
		else{
			System.out.println("��Ģ! ");
			win = 2;
		}
		//��� ���
		if(win == 1) {
			System.out.println("���� �̰��");
		}
		else if(win == 2) {
			System.out.println("��ǻ�Ͱ� �̰��");
		}
		
	}

}

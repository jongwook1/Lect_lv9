package lv2_review;

import java.util.Scanner;

public class L2_test4 {

	public static void main(String[] args) {
		/*
		 * # ���θ� �ڷΰ���
		 * 
		 * ����) ���θ����θ޴����� �����Ƿ��� �����ؼ� 
		 *      �ڷΰ��� ������������ �����Ƿ� ������ �� �����Ϸ����Ѵ�.
		 * ��Ʈ) ���� ���� �ݺ����� �߰� ���ָ�ȴ�. 
		 * 1. �����Ƿ�
		 * 		1) Ƽ����
		 * 		2) ����
		 * 		3) �ڷΰ���
		 * 2. �����Ƿ�
		 * 		1) �����
		 * 		2) ġ��
		 * 		3) �ڷΰ���
		 * 3. ����
		 */
		
Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.�����Ƿ�");
			System.out.println("2.�����Ƿ�");
			System.out.println("3.����");
			
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				while(true) {					
				System.out.println("1)Ƽ����");
				System.out.println("2)����");
				System.out.println("3)�ڷΰ���");
				sel=sc.nextInt();
				if(sel==3) {
					break;
				}
				}
			}
			else if(sel == 2) {
				while(true) {		
				System.out.println("1)�����");
				System.out.println("2)ġ��");
				System.out.println("3)�ڷΰ���");
				sel=sc.nextInt();
				if(sel==3) {
					break;
				}
				}
			}
			else if(sel == 3) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}

	}

}

package lv2;

import java.util.Scanner;

public class Test4_lv2_false {

	public static void main(String[] args) {
		//���� 11:06
		//���� 00:00
		//�ҿ� ��
		
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
		int sel = 0;
		
		
		while(run) {
		System.out.println("1.�����Ƿ�");
		System.out.println("    1)Ƽ");
		System.out.println("    2)����");
		System.out.println("    3)�ڷΰ���");
		System.out.println("2.�����Ƿ�");
		System.out.println("	1)�����");
		System.out.println(" 	2)ġ��");
		System.out.println("	3)�ڷΰ���");
		System.out.println("�޴��� �������ּ���");
			sel=sc.nextInt();
			if(sel ==1) {
				System.out.println("1.�����Ƿ��� �����ϼ̽��ϴ�.");
				boolean dp = true;
				while(dp) {
					System.out.println("1.�����Ƿ�");
					System.out.println("    1)Ƽ");
					System.out.println("    2)����");
					System.out.println("    3)�ڷΰ���");	
					sel=sc.nextInt();
					if(sel==1) {
						System.out.println("Ƽ�� �����ϼ̽��ϴ�");
					}
					else if(sel==2){
						System.out.println("������ �����ϼ̽��ϴ�");
					}
					else if(sel ==3) {
						System.out.println("�ڷΰ��⸦ �����ϼ̽��ϴ�");
						break;
					}
					
				}
			}
			else if (sel==2) {
				System.out.println("1.�����Ƿ��� �����ϼ̽��ϴ�.");
				boolean dp = true;
				while(dp) {
					System.out.println("2.�����Ƿ�");
					System.out.println("    1)�����");
					System.out.println("    2)ġ��");
					System.out.println("    3)�ڷΰ���");	
					sel=sc.nextInt();
					if(sel==1) {
						System.out.println("������� �����ϼ̽��ϴ�");
					}
					else if(sel==2){
						System.out.println("ġ���� �����ϼ̽��ϴ�");
					}
					else if(sel ==3) {
						System.out.println("�ڷΰ��⸦ �����ϼ̽��ϴ�");
						break;
					}
					
				}
				
			}
			else if(sel==3) {
				System.out.println("�����ϰڽ��ϴ�");
				break;
			}
			
			
			
			
		}
		
		
		

	}

}

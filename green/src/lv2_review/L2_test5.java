package lv2_review;

import java.util.Random;
import java.util.Scanner;

public class L2_test5 {

	public static void main(String[] args) {
		/*
		 * # īī�� �ý�
		 * 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�.
		 * 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�.
		 * 3. �޴��� �Ʒ��� ����.
		 * 		1) �ӵ����� : 1~3������ ����
		 * 		2) ���⼳�� : ��(1)��(2)��(3)��(4)
		 * 		3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵�
		 * 4. �Ÿ� 1ĭ �� 50���� �߰��Ǿ� ������ ��ݵ� ����Ѵ�.
		 *
		 */

Scanner sc = new Scanner(System.in);
Random rn=new Random();		
		// ������(destination)
		int desX = rn.nextInt(20)-10;
		int desY = rn.nextInt(20)-10;
		
		// ���� ��ġ
		int x = 0;
		int y = 0;
		
		// ����(direction)
		int dir = 0;
		
		// �ӵ�
		int speed = 0;
		
		// ���
		int fee = 0;
		int move=0;
		boolean run = true;
		while(run) {
			
			System.out.println("= īī�� �ý� =");
			System.out.println("������ : " + desX + "," + desY);
			System.out.println("����ġ : " + x + "," + y);
			System.out.println("��   �� : " + dir);
			System.out.println("��   �� : " + speed);
			System.out.println("============");
			
			System.out.println("1.���⼳��");
			System.out.println("2.�ӵ�����");
			System.out.println("3.�̵��ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.println("������ �Է����ּ���(1.�� 2.�� 3.�� 4.��");				
				dir=sc.nextInt();
			}
			else if(sel == 2) {
				System.out.println("�ӵ��� �Է����ּ���(1~3)");
				speed=sc.nextInt();				
			}
			else if(sel == 3) {
				if(dir==1) {
					x+=speed;
				}
				else if(dir==2) {
					x-=speed;
				}
				else if (dir == 3) {
					y-=speed;
				} else if (dir == 4) {
					y+=speed;
				}
				move+=speed;
				
				
			}
			if(desX==x&&desY==y) {
				fee=move*50;
				System.out.println("������ ����!");
				System.out.println("�����: "+fee+"��");
				break;
			}
		}
		
		
	}

}

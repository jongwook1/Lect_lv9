package lv1;

import java.util.Scanner;

public class Test5_lv1 {

	public static void main(String[] args) {
		// �������� 1. ���������� 3�ܰ� 
				// ���� 10:24
				// ���� 10:48
				// �ҿ� 22�� 00		
		/*
		 * # ������ ���[1�ܰ�]
		 * 1. �޴����� ����Ѵ�.
		 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
		 * 3. ������ �Է¹޴´�.
		 * 4. �Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�.
		 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
		 */

		int price1 = 50000;
		int price2 = 60000;
		int price3 = 70000;
		System.out.println("�׸���ǻ�͸�");
		System.out.println("1.���Ͱ��� = " + price3 + "���Դϴ�");
		System.out.println("2.����Ŀ���� = " + price2 + "���Դϴ�");
		System.out.println("3.���콺���� = " + price1 + "���Դϴ�");
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("�ֹ��� ��ȣ�� �Է��ϼ���");
		int choice = sc.nextInt();
		
		
		int total = 0;
		
		if(choice == 1) {
			total = price1;	
		}else if(choice == 2) {
			total = price2;	
		}else if(choice == 3) {
			total = price3;	
		}else {
			System.out.println("���� �޴��Դϴ�");
			}
		
		System.out.println("�ֽ� ������ �Է��ϼ���");
		int intputMoney = sc.nextInt();
		if(total != 0) {
		if(total > intputMoney) {
			System.out.println("������ �����մϴ�!");
		}else {
			System.out.println("----�� �� �� ---");
			if(total == price3) {
				System.out.println("���Ͱ���" + price3 + " ���Դϴ�");
			}
			else if(total == price2) {
				System.out.println("����Ŀ" + price2 + " ���Դϴ�");
			}
			else if(total == price1) {
				System.out.println("���콺����" + price1 + " ���Դϴ�");
			}
			System.out.println("�Ž�������" +  + (intputMoney-total) + "���Դϴ�");
			System.out.println("��������� �̿����ּż� �����մϴ�");		
			}	
		}		
	}
}

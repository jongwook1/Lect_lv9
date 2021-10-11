package lv5;

import java.util.Scanner;

public class Ex23_answer {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int[] moneys  = {50000, 10000, 5000, 1000, 500, 100};		// ȭ�� ����
		int[] charges = {	 1,     1,    1,    1,   1,   5};		// ȭ�� ������ ����
		
		int ticketCount = 5;		// �ı��� ��� ����
		int ticketPrice = 3200;		// �ı��� ����
		
		while(true) {
			System.out.println("[�ı� ��� ����] " + ticketCount + "��");
			System.out.println("[ȭ�������� ����]");
			for(int i=0; i<moneys.length; i++) {
				System.out.print(moneys[i] + "��(" + charges[i] + ")");
			}
			System.out.println();
			
			System.out.println("[1]������");
			System.out.println("[2]�����");
			System.out.println("[0]����");
			
			System.out.println("�޴��� �����ϼ���.");
			int select = scan.nextInt();
			
			if(select == 1) {
				while(true) {
					System.out.println("1)�ı�����");
					System.out.println("2)�ܵ�����");
					System.out.println("3)�ڷΰ���");
					
					int choice = scan.nextInt();
					
					if(choice == 1) {
						System.out.println("[�ı� ��� ����] " + ticketCount + "��");
						System.out.println("[�ı�����]������ �ı� ������ �ۼ��ϼ���.");
						int addCount = scan.nextInt();
						
						ticketCount = ticketCount + addCount;
					}
					else if(choice == 2) {
						while(true) {
							System.out.println("[ȭ�������� ����]");
							for(int i=0; i<moneys.length; i++) {
								System.out.print(moneys[i] + "��(" + charges[i] + ")");
							}
							System.out.println();
							
							System.out.println("[�ܵ�����]������ ȭ���� ������ �����ϼ���.");
							for(int i=0; i<moneys.length; i++) {
								System.out.println("[" + (i + 1) + "]" + moneys[i] + "��");
							}
							System.out.println("[0]�ڷΰ���");
							
							int number = scan.nextInt();
							if(number == 0) {
								break;
							}else {
								number = number - 1;
								
								charges[number] = charges[number] + 1;
							}
						}
					}
					else if(choice == 3) {
						break;
					}
				}
			}
			else if(select == 2) {
				while(true) {
					System.out.println("1)�����ϱ�");
					System.out.println("2)�ڷΰ���");
					
					int choice = scan.nextInt();
					
					if(choice == 1) {
						System.out.println("[�ıǱ���]������ �ı� ���� �Է��ϼ���.");
						int myTicketcount = scan.nextInt();
						
						// ������ �ıǼ��� > ������
						if(myTicketcount > ticketCount) {
							System.out.println("[�޼���]�ıǼ��� �����մϴ�. �����ڿ��� �������ּ���.");
							continue;
						}
						
						// ���� �ݾ� ���
						int payment = myTicketcount * ticketPrice;
						System.out.println("[�޼���]�����Ͻ� �� �ݾ��� " + payment + "�� �Դϴ�.");
						
						// ������ �ݾ� �Է¹ޱ�
						int[] myCharges = new int[charges.length];
						while(true) {
							System.out.println("[�ıǱ���]������ ȭ���� ������ �����ϼ���.");
							for(int i=0; i<moneys.length; i++) {
								System.out.println("[" + (i + 1) + "]" + moneys[i] + "��");
							}
							System.out.println("[0]�ڷΰ���");
							
							int number = scan.nextInt();
							if(number == 0) {
								break;
							}else {
								number = number - 1;
								
								myCharges[number] = myCharges[number] + 1;
							}
						}
						// ������ �� �ݾ� ����ϱ�
						int myPayment = 0;
						for(int i=0; i<myCharges.length; i++) {
							myPayment = myPayment + myCharges[i] * moneys[i];
						}
						System.out.println("[�޼���]�����Ͻ� �� �ݾ��� " + myPayment + "�� �Դϴ�.");
						
						// ������ �� �ݾ� - �����ݾ� >= 0 : �ŷ�����
						int charge = myPayment - payment;
						if(charge >= 0) {
							
							// # ���� �Ž������� ������ ȭ�� ���ٸ� �ŷ� �Ұ�
							// => �ٷ� ó������ ���� �ӽú����� �����ؼ� Ȯ���� �� ó���� ��
							int tempCharge = charge;
							int[] tempCharges = new int[charges.length];
							for(int i=0; i<charges.length; i++) {
								tempCharges[i] = charges[i];
							}
							System.out.println();
							
							for(int i=0; i<charges.length; i++) {
								while(true) {
									if(tempCharge >= moneys[i] && tempCharges[i] > 0) {		//�ܵ��� moneys�迭���ִ� ��� �ε����� ������ Ŭ�� ,�� �ܵ��� �ټ�������
										tempCharge = tempCharge - moneys[i];
										tempCharges[i] = tempCharges[i] - 1;
									}else {
										break;
									}
								}
							}
							
							if(tempCharge == 0) {
								System.out.println("[�޼���]�ܵ��� " + charge + "�� �Դϴ�.\n�̿����ּż� �����մϴ�.");
								
								for(int i=0; i<charges.length; i++) {
									// ����ڿ��� �Ž��������� �����ְ� ���� �� �����ϱ�
									charges[i] = tempCharges[i];
									// ����ڰ� ������ �ݾ� �߰��ϱ�
									charges[i] = charges[i] + myCharges[i];
								}
								
								// ����ڰ� ������ �ı� �����ϱ�
								ticketCount = ticketCount - myTicketcount;
							}else {
								System.out.println("[�޼���]�Ž��� ���� ������ �ŷ��� �Ұ��մϴ�.");
							}
						}
						else {
							System.out.println("[�޼���]�ݾ��� �����մϴ�.");
						}
						
					}
					else if(choice == 2) {
						break;
					}
				}
			}
			else if(select == 0) {
				break;
			}
		}

	}

}

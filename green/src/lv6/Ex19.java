package lv6;
//�޴��� ���, �޴� ���ù޴°�,���

import java.util.Scanner;

class POS1 {
	Scanner sc = new Scanner(System.in);
	int total = 0;	
//	int myMoney= 10000;
	int eMoney=0;
	String name = "";
	int arPrice[] = { 2500, 3800, 1500 };
	String arMenu[] = { "ġŲ����", "�Ұ�����", "ġ�����" };
	int arCnt[];

	// �޴������
	void printMenu() {
		System.out.println("-------�޴�-----");
		for (int i = 0; i < 3; i++) {
			System.out.printf("-------%d) %s----", i + 1, this.arMenu[i]);
		}
		System.out.println("0) ���ư���");
	}

	// �޴����ùޱ�
	void selectMenu() {
		arCnt=new int[arMenu.length];
		while (true) {
			System.out.println("�޴��������ּ���");
			int sel = sc.nextInt()-1;
			if (sel >=0&&sel<this.arMenu.length) {
				arCnt[sel]++;
			}if(sel==-1) {
				break;
			}
		}
	}

	// ���
	int[] calculate() {
		int result[]=new int[2];
		int sum=0;
		
		for (int i = 0; i < this.arPrice.length; i++) {
			sum += this.arCnt[i] * this.arPrice[i];
		}
		System.out.println("������ �ݾ��� �Է��ϼ���");
		int outM=sc.nextInt();
		if(outM<sum) {
			System.out.println("�������ִ� ������ �����մϴ�");
		}else {
			result[0]=sum;
			result[1]=outM-sum;
			
		}
		return result;
		
	}

	// ������ ���
	void printRecipe(int[] result) {
		System.out.println("------" + name + "������----");
		for (int i = 0; i < this.arPrice.length; i++) {
			System.out.printf("%s +%d��  ", this.arMenu[i], this.arCnt[i]);
		}
		System.out.println("�� �ݾ�: " + result[0] + "�� �Դϴ�");
		System.out.println("������ �ܵ��� : "+result[1]+"�Դϴ�");
//		System.out.println(this.myMoney);
	}

	public void run() {
		while (true) {
			System.out.println("1.�޴����� 2.��� �� ��������� 3.����");
			int choice = sc.nextInt();
			if (choice == 1) {
				printMenu();
				selectMenu();
			}else if(choice==2) {
				
				printRecipe(calculate());
			}			
//			else if (choice == 3) {
//				this.calculate();
				
//			} 
		else if (choice == 3) {
				break;
			}
		}
	}
}

public class Ex19 {

	public static void main(String[] args) {
		/*
		 * # ������ ����ϱ� : Ŭ����[����]
		 * 1. �ܹ��� �ֹ��� �޾� �������� ����Ѵ�.
		 * 2. ��³����� �� �޴��� �ֹ� ������ �� �ݾ� �� �ܵ��� ǥ���Ѵ�.
		 */
		POS1 pos =new POS1();
		pos.run();
		
	}

}

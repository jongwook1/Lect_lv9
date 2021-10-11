package lv6;

import java.util.Scanner;

/*
 * # ��ȭ�� �¼����� : Ŭ���� + �޼���
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */
class Theater{
	Scanner sc=new Scanner(System.in);
	String name="";
	int total;
	final int size=10;
	final int price=12000;
	int seat[]=new int[size];
	
	boolean selectM() {
		
		System.out.println("�޴�����: ");
		int choice=sc.nextInt();
		if(choice==1) {
			choiceSeat();
		}else if(choice==2) {
			showSales();
			return false;
		}
		
		return true;
		
	}
	
	
	void show() {
		System.out.println("--------"+name+"-------");
		System.out.println("1.�����ϱ�");
		System.out.println("2.����");
//		showSeat();
	}
	
	void showSeat() {
		for(int i=0;i<this.seat.length;i++) {
			if(this.seat[i]==0) {
				System.out.print("O ");
			}else {
				System.out.print("�� ");
			}
		}
	}
	
	void choiceSeat(){
		showSeat();
		
		System.out.println("�¼���ȣ �Է�: ");
		int num=sc.nextInt()-1;
		
		if(num>=0&&num<this.size&&this.seat[num]==0) {
			this.seat[num]=1;
			this.total+=this.price;
		}else {
			System.out.println("�̼���");
		}
		
	}
	
	void showSales() {
		System.out.println("�� ����: "+total+"��");
	}

	public void run() {
		while(true) {
			show();			
			if(selectM()) {}
			else {	break;}
			
			
//			System.out.println("�޴�����: ");
//			int choice=sc.nextInt();
//			if(choice==1) {
//				choiceSeat();
//			}else if(choice==2) {
//				showSales();
//			}
		}
		
	}
	
	
	
	
}


public class Ex25_m {
	
	public static void main(String[] args) {
		Theater tms=new Theater();
		
		tms.run();

	}

}

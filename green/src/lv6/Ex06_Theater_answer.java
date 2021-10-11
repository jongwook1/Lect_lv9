package lv6;

import java.util.Scanner;

class TMS{
	int total;
	final int size=10;
	final int price =12000;
	int seats[]=new int[size];
}
public class Ex06_Theater_answer {

	public static void main(String[] args) {
		/*
		 * # ��ȭ�� �¼����� : Ŭ���� + ����
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
		Scanner sc= new Scanner(System.in);
		TMS tms =new TMS();
		
		while(true) {
			System.out.println("���� �ý���");			
			for(int i=0; i<tms.size;i++) {
				System.out.print(i+1+" ");
			}
			System.out.println();
			for(int i=0; i<tms.seats.length;i++) {
				if(tms.seats[i]==0) {
					System.out.print("�� ");
				}else {
					System.out.print("�� ");
				}
			}
			System.out.println("\n1. ����\n2. ����\n�޴��Է�: ");
			
			int sel=sc.nextInt();
			
			if(sel==1) {
				System.out.println("�¼���ȣ �Է�: ");
				int num=sc.nextInt()-1;
				
				if(num>=0&&num<tms.size&&tms.seats[num]==0) {
					tms.seats[num]=1;
					tms.total+= tms.price;
				}else {
					System.out.println("�̼���");
				}
			}else if(sel==2) {
				System.out.println("�� ����: " + tms.total+"��");
				break;
			}
			
		}
		
		
		
		
		
		
		

	}

}

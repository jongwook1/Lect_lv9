package lv6;
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

import java.util.Scanner;

class MOVIE1{
	Scanner sc=new Scanner(System.in);
	
	int total;
	final int size=10;
	final int price=12000;
	int seat[]=new int[size];
	//�޴�����
	void selectM() {
		System.out.println("1.���� 2.����");
		int sel=sc.nextInt();
		if(sel==1) {
			printNow();
		}if(sel==2) {
			return;
		}
	}
	
	
	//��Ȳ���
	void printNow(){
		for(int i=0;i<this.seat.length;i++) {
			if(this.seat[i]==0) {
				System.out.println("O ");
			}else {
				System.out.println("�� ");
			}
		}
	}
	//�����ϱ�
	
	//����ǥ��
	
	
	
	
	
}


public class Ex25_movie {

	public static void main(String[] args) {
		MOVIE1 movie=new MOVIE1();
		

	}

}

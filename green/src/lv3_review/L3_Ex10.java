package lv3_review;

import java.util.Scanner;

public class L3_Ex10 {

	public static void main(String[] args) {
		/*
		 * # ��ȭ�� �¼�����
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

		Scanner sc = new Scanner(System.in);		
		int[] seat = new int[7];
		int cnt=0;
		int price=0;
		boolean run = true;
		while(run) {
			System.out.println("�¼� ��Ȳ");
			for(int i=0;i<seat.length;i++) {
				System.out.print(seat[i]+" ");
			}
			System.out.println("\n=��ȭ��=");
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.println("�¼��� �������ּ���");
				int inputN=sc.nextInt()-1;
				
				if(inputN>=0&&inputN<7) {
				if(seat[inputN]!=1) {
				//for(int i=0;i<seat.length;i++) {
					
					seat[inputN]=1;
					cnt++;
			//	}
					}else {
						System.out.println("�̹� ���ŵ� �¼��Դϴ�");
					}
			}else {
				System.out.println("�ش������ʴ��¼��Դϴ�");
			}
				
			}
			else if(sel == 2) {
				 price = cnt * 12000;
				System.out.println("����� = " +price + "��");
				run = false;
			}
		}
		
	}

}

package lv3_review;

import java.util.Scanner;

public class L3_Test_04 {

	public static void main(String[] args) {
		/*
		 * # ȸ������ 
		 * 1. ����
		 * . ���̵� �� ��й�ȣ�� �Է¹޾� ����
		 * . ���̵� �ߺ��˻�
		 * 2. Ż��
		 * . ���̵� �� �Է¹޾� Ż��
		 */

		
Scanner sc = new Scanner(System.in);
		
		int[] ids = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			//��� 
			for(int i=0;i<5;i++) {
				System.out.print(ids[i]+" ");
			}
			System.out.println();
			for(int i=0;i<5;i++) {
				System.out.print(pws[i]+" ");
			}
			
			
			System.out.println("\n1.����");
			System.out.println("2.Ż��");
			
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				System.out.println("�Ƶ��Է����ּ���");
				int inputId = sc.nextInt();
				
				int check=-1;
				for(int i=0;i<ids.length;i++) {
					if(ids[i]==inputId) {
						check=1;
					}
				}
				if(check==-1) {
					System.out.println("����Է� ����");
					int inputPw=sc.nextInt();
					
						ids[cnt]=inputId;
						pws[cnt]=inputPw;
						System.out.println(inputId+"�� ȸ�����Ϸ�");
					
					cnt++;
				}
	
			}
			else if(sel == 2) {
				System.out.println("Ż���� �Ƶ��Է� ��");
				int inputId=sc.nextInt();
				
				int dIdx=-1;				
				for (int i = 0; i < cnt; i++) {
					if (ids[i] == inputId) {
                       dIdx=i;
					}
				}
				if(dIdx!=-1) {
					System.out.println("����Է¤�");
					int dPw=sc.nextInt();
					if(pws[dIdx]==dPw) {
						for(int i=dIdx;i<cnt-1;i++) {
							ids[i]=ids[i+1];
							pws[i]=pws[i+1];
						}
						ids[cnt-1]=0;
						pws[cnt-1]=0;
						cnt--;
					}else {
						System.out.println("��й�ȣ Ȯ�����ּ���");
					}
					
				}else {
					System.out.println("ȸ������ Ȯ�����ּ���");
				}
				
			}
			
		}
		

	}

}

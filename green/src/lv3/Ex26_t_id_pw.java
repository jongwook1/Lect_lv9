package lv3;

import java.util.Scanner;

public class Ex26_t_id_pw {

	public static void main(String[] args) {
		/*
		 * # ȸ������ 
		 * 1. ����
		 * . ���̵� �� ��й�ȣ�� �Է¹޾� ����
		 * . ���̵� �ߺ��˻�
		 * 2. Ż��
		 * . ���̵� �� �Է¹޾� Ż��
		 */
		Scanner scan =new Scanner(System.in);
		int[] ids = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		//             0      1   2  3  4
		int cnt = 2;
		boolean run = true;
		while(run) {
			System.out.println("cnt "+cnt);
			for(int i=0;i<5;i++) {
				System.out.print(ids[i]+" ");
			}
			System.out.println();
			for(int i=0;i<5;i++) {
				System.out.print(pws[i]+" ");
			}			
			System.out.println();
			
			System.out.println("1.����");
			System.out.println("2.Ż��");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {	//�迭��Ʈ�ѷ� (�߰�)
				System.out.println("������ ���̵�:");
				int inputId=scan.nextInt();
				
				
				boolean check=true;
				for(int i=0; i<cnt; i++) {//�ߺ�����Ȯ��
					if(ids[i]==inputId) {
						check=false;
					}
				}
				if(check==true) {
					System.out.println("��й�ȣ �Է�");
					int inputPw= scan.nextInt();
					
					ids[cnt] =inputId;
					pws[cnt] =inputPw;
					cnt++;
					
					System.out.println("ȸ�������� ȯ���մϴ�");
				}
				else {
					System.out.println("�̹� ������� ���̵��Դϴ�");
				}
			}
			else if(sel == 2) {
				System.out.println("Ż���� ���̵� �Է�: ");
				int inputId =scan.nextInt();
				
				int delIdx=-1;
				for(int i=0;i<5;i++) {	//������ �ε����� ���� ã��
					if(ids[i]== inputId) {
						delIdx=i;
					}
				}
				if(delIdx != -1) {
					System.out.println("��й�ȣ �Է�:");
					int inputPw =scan.nextInt();
					
					if(pws[delIdx]==inputPw) {
						
						for(int i=delIdx; i<cnt-1;i++) {		//��ĭ������ //���� cnt-1 ���� ��ġ�⽬��!!
							ids[i] =ids[i+1];
							pws[i] =pws[i+1];
						}						//�� �Ʒ��κ�(����) �ּ�ó���� �����ϰ� �������߰��ϰ� �ּ�Ǯ�� �ٽ��ϸ� �����ϱ⽬��
						ids[cnt-1]=0;			//�������ε����κ�ó��������(���κ�ó��)
						pws[cnt-1]=0;			//�������ε����κ�ó��������(���κ�ó��)
						cnt--;
						
						
						
//		�̷����ϸ�Ʋ��		ids[delIdx]=0;
//						pws[delIdx]=0;
//						cnt--;
					}else {
						System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���");
					}
				}else {
					System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���");
				}
				
				
				
			}
			
			
			
			
			
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

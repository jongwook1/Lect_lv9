package lv1;

import java.util.Scanner;

public class a_lv3_ex26_id_pw {

	public static void main(String[] args) {
		/*
		 * # ȸ������ 
		 * 1. ����
		 * . ���̵� �� ��й�ȣ�� �Է¹޾� ����
		 * . ���̵� �ߺ��˻�
		 * 2. Ż��
		 * . ���̵� �� �Է¹޾� Ż��
		 */
		Scanner sc =new Scanner(System.in);
		int[] ids = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		//             0      1   2  3  4
		int cnt = 2;
		
		while(true) {

			for(int i=0;i<5;i++) {
				System.out.print(ids[i]+" ");				
			}
			System.out.println();
			for(int i=0;i<5;i++) {
				System.out.print(pws[i]+" ");				
			}
			System.out.println("\n1.����");
			System.out.println("2.Ż��");
			int sel=sc.nextInt();
			
			if(sel==1) {

			
			System.out.println("���̵� �Է� ��");
			int inputId=sc.nextInt();
			
			//�ߺ��˻�
			boolean check=true;
			for(int i=0;i<5;i++) {
				if(inputId==ids[i]) {
					check=false;
				}
			}
			
			if(check==true) {
				System.out.println("����Է� ��");
				int inputPw=sc.nextInt();
//				for(int i=0;i<5;i++) {
					ids[cnt]=inputId;
					pws[cnt]=inputPw;
					cnt++;
//				}
			}else {
				System.out.println("�ߺ��� �Ƶ�");
			}
			
		
			
		}
		else if (sel == 2) {
			System.out.println("Ż���� �Ƶ��Է� ��");
			int inputId = sc.nextInt();

			int idx = -1;
			for (int i = 0; i < 5; i++) {
				if (ids[i] == inputId) {
					idx = i;
				}
			}

			if (idx != -1) {
				System.out.println("����Է¤�");
				int inputPw =sc.nextInt();

				if (pws[idx] == inputPw) {
					for (int i = idx; i < cnt-1; i++) {		//���� cnt-1 ���� ��ġ�⽬��!!
						ids[i] = ids[i + 1];
						pws[i] = pws[i + 1];
					}

					ids[cnt - 1] = 0;
					pws[cnt - 1] = 0;
					cnt--;
				} else {

				}

			} else {

			}

		}
			
			
			
			
			
			
		}
		
		
		

	}

}

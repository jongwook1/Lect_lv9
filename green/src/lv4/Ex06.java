package lv4;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * # ATM[4�ܰ�] : ��ü ��ɱ���
		 * 1. ȸ������
		 * . id�� pw�� �Է¹޾� ����
		 * . ���� �� �� 1000�� �ο�
		 * . id �ߺ�üũ
		 * 2. ȸ��Ż��
		 * . �α��νÿ��� �̿밡��
		 * 3. �α���
		 * . id�� pw�� �Է¹޾� �α���
		 * . �α׾ƿ� ���¿����� �̿밡��
		 * 4. �α׾ƿ�
		 * . �α��νÿ��� �̿밡��
		 * 5. �Ա�
		 * . �α��νÿ��� �̿밡��
		 * 6. ��ü
		 * . �α��νÿ��� �̿밡��
		 * 7. �ܾ���ȸ
		 * . �α��νÿ��� �̿밡��
		 */
		final int SIZE = 3;	
		int ids[]=new int[SIZE];
		int pws[]=new int[SIZE];
		int p1M=50000;
		int p2M=60000;
		int coin=0;
		int login=-1;		//-1:�α׾ƿ��Ȼ���  //0~:�α׾ƿ����ѻ���
		int money=0;
		
		Scanner sc= new Scanner(System.in);
		
		int cnt=0;
		boolean run= true;
		while(run) {			
			for(int i=0;i<3;i++) {
				System.out.print(ids[i]+" ");
			}
			System.out.println();
			for(int i=0;i<3;i++) {
				System.out.print(pws[i]+" ");
			}
			System.out.println("\n1.ȸ������");
			System.out.println("2.ȸ��Ż��");
			System.out.println("3.�α���");
			System.out.println("4.�α׾ƿ�");
			System.out.println("5.�Ա�");
			System.out.println("6.��ü");
			System.out.println("7.�ܾ���ȸ");
			System.out.println("8.����");
			
			System.out.println("�޴��� �������ּ���");
			
			int sel=sc.nextInt();
			
			if(sel==1) {
				if(cnt<3) {
				System.out.println("id�Է����ּ���");
				int inputId=sc.nextInt();
				
				boolean check=true;
				for (int i = 0; i < 3; i++) {
					if (inputId == ids[i]) {
						check=false;
						System.out.println("�ߺ��Ⱦƾ��̵��Դϴ�");
					}
				}if(check==true) {
					System.out.println("��й�ȣ �Է�");
					int inputPw= sc.nextInt();
										
					ids[cnt]=inputId;
					pws[cnt]=inputPw;
					coin+=1000;
					cnt++;
					System.out.println("ȸ�����ԵǽŰ��� ȯ���մϴ�");
				}				
			}else {
				System.out.println("ȸ�������� �����Ǿ����ϴ�");
			}
				}
			else if(sel==2) {
				System.out.println("Ż���� ���̵� �Է��ϼ���");
				int inputid=sc.nextInt();
				
				int delidx=-1;
				for(int i=0;i<3;i++) {
					if(inputid==ids[i]) {
						delidx=i;
					}
				}
				if(delidx!=-1) {
					System.out.println("Ż���� ����� �Է��ϼ���");
					int inputpw=sc.nextInt();
					
					if(inputpw==pws[delidx]) { 
					for(int i=delidx;i<cnt-1;i++) {						
							ids[i]=ids[i+1];
							pws[i]=pws[i+1];
							
					}
					ids[cnt-1]=0;		
					pws[cnt-1]=0;			
					cnt--;
					System.out.println("Ż��ó���� �Ǿ����ϴ�");
					
					}else {
						System.out.println("����� Ʋ���ϴ� Ȯ�ιٶ�");
					}
					
				}else {
					System.out.println("���Ե� �Ƶ� �����ϴ� Ȯ�ιٶ�");
				}				
			}
			else if(sel==3) {
				if(login==-1) {
					System.out.println("���̵� �Է��ϼ���");
					int inputid=sc.nextInt();
					
					int inidx = -1;
					for (int i = 0; i < 3; i++) {
						if (inputid == ids[i]) {
							inidx = i;
						}
					}
					if(inidx!=-1) {
						System.out.println("����� �Է��ϼ���");
						int inputpw=sc.nextInt();
						
						if(inputpw==pws[inidx]) {
							System.out.println("�α����� �Ǿ����ϴ�.");
							login=1;
						}else {
							System.out.println("����� Ȯ���ϼ���");
						}						
					}else {
						System.out.println("���̵� Ȯ���ϼ���");
					}					
				}else {
					System.out.println("�α��λ����Դϴ�");
				}
			}
			else if(sel==4) {
				if(login == -1) {
					System.out.println("�α����� ���� ���ּ���!");
				}
				else {
					System.out.println("�α׾ƿ��� �߽��ϴ�.");
					login = -1; //
				}
			}
			else if(sel==5) {
				if(login==-1) {
					System.out.println("�α��θ������ּ���");
				}else {
					System.out.println("�Ա��� �ݾ��� �Է����ּ���");
					int inpuM=sc.nextInt();
					if(inpuM > 0) {
						if(login == 1) {
							p1M += inpuM;
						}
						
					}
					
				}
			}
			else if(sel==6) {
				if(login == -1) {
					System.out.println("�α����� ���� ���ּ���!");
				}else {
					System.out.println("��ü���� ����(�Ƶ�)�Է�");
					int inputid=sc.nextInt();
					System.out.println("��ü�� �ݾ� �Է�");
					int inputM=sc.nextInt();
					if (login == 1) {
						for (int i = 0; i < 3; i++) {
							if (ids[i] == inputid) {
								if (inputM <= p1M) {
									p2M += inputM;
									p1M -= inputM;
									System.out.println("��ü�Ϸ�");
								}else {
									System.out.println("�ܰ� �����մϴ�");
								}
							}
						}
					}
					
				}
			}
			else if(sel==7) {
				if(login ==-1) {
					System.out.println("�α����� ���� ���ּ���!");
				}else {
					if(login==1) {
						System.out.println("�����ܾ�:"+ (p1M+coin)+"��");
					}else if(login == 2) {
						System.out.println("���� �ܾ�: " + (p2M+coin) + "��");
					}
				}
			}else if(sel==8) {
				run=false;
				System.out.println("�����ϰڽ��ϴ�");
			}
			
			
			
			
			
			
			
			
			
		}

	}

}

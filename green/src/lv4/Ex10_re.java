package lv4;

import java.util.Scanner;

public class Ex10_re {

	public static void main(String[] args) {
		/*
		 * # �迭 ��Ʈ�ѷ�[2�ܰ�] : ����(Vector)
		 * 1. �߰�
		 * . ���� �Է¹޾� ���������� �߰�
		 * 2. ����(�ε���)
		 * . �ε����� �Է¹޾� �ش� ��ġ�� �� ����
		 * 3. ����(��)
		 * . ���� �Է¹޾� ����
		 * . ���� �� �Է� �� ����ó��
		 * 4. ����
		 * . �ε����� ���� �Է¹޾� ����
		 */
		Scanner sc=new Scanner(System.in);
        int[] datas = null;
		int cnt = 0;
		
		
		while(true) {
			if(datas!=null)
				for(int i=0;i<datas.length;i++) {
					System.out.print(datas[i]+" ");
				}
			
			
			System.out.println("\n1.�߰�");
			System.out.println("2.����");
			System.out.println("3.����(�ε���)");
			System.out.println("4.����(��)");
			
			
				
			System.out.println("�޴��� �������ּ���");
			int sel=sc.nextInt();
		
			
			
			
			if(sel==1) {
				System.out.println("���԰��Է� ��");
				int inputN=sc.nextInt();		
				
				if(cnt>0) {
					int temp[]=datas;
					datas=new int [cnt+1];
					
					for(int i=0;i<temp.length;i++) {
						datas[i]=temp[i];
					}					
					
				}else {
					datas=new int[1];
					
				}
				
				datas[cnt]=inputN;
				cnt++;
				
		
				
			}
			else if(sel==2) {
				System.out.println("������ ��ġ�Է� ��");
				int idx=sc.nextInt();				
				
				if(datas!=null&&idx>=0&&idx<cnt-1) {					/////////////////////����ó�� cnt-1�ΰ� �ѹ� �����غ���
					
					System.out.println("���԰� ����");
					int inputN=sc.nextInt();
					
					int temp[]=datas;
					datas=new int [cnt+1];
					
					for(int i=0;i<temp.length;i++) {					///////temp.length!!!!!!!!!!!!!
						if(i<idx) {
							datas[i]=temp[i];
						}else {
							datas[i+1]=temp[i];
						}
					}
					datas[idx]=inputN;
					cnt++;
					
				}				
				
			}
			else if(sel==3) {
				System.out.println("������ �ε�����ȣ�Է� ��");
				int dIdx=sc.nextInt();
				
				if(datas!=null&&dIdx>=0&&dIdx<cnt) {//////!!!!!!!!!dIdx<cnt!!!!!!!!!!!!!!!				
									
					if(cnt==1) {
						datas=null;
					}else {
						int temp[]=datas;
						datas=new int [cnt-1];
						
						int idx=0;
						for(int i=0;i<temp.length;i++) {
							if(i!=dIdx) {
							datas[idx]=temp[i];
							idx++;
							}
						}					
						
					}
					cnt--;
				}						
				
				
				
			}
			else if(sel==4) {
				
				if (datas != null) {
					System.out.println("�����Ұ��Է� ��");
					int d = sc.nextInt();

					int dcnt = 0;
					for (int i = 0; i < datas.length; i++) {
						if (d==datas[i]) {
							dcnt++;
						}
					}

					int temp[] = datas;
					datas = new int[cnt - dcnt];			/////!!!!! dcnt���س��� ���⿡ �Ⱦ��� �ʱ�!!!!!!!!!!		////

					int ddIdx = 0;
					for (int i = 0; i < temp.length; i++) {
						if (temp[i] != d) { //// !!!!!!!temp[i]!=d!!!!!!!!!
							datas[ddIdx] = temp[i];
							ddIdx++;
						}

					}
					cnt -= dcnt; //////// !!!!!!!!

				} else {
					System.out.println("����ֽ��ϴ�");
				}
				
				
			}
			
			
			
			
			
		}
		
		
		
		
		
	}

}

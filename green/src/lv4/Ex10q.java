package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex10q {

	public static void main(String[] args) {
		/*
		 * # �迭 ��Ʈ�ѷ�[2�ܰ�] : ����(Vector)   
		 * 1. �߰�										�߰��Ǵ°������� ���ھ� �迭���ʱ�ȭ�� (������ �� �ҷ������ϴ¹� �ӽú���tmep��)cnt+1��ŭ �߰�
		 * . ���� �Է¹޾� ���������� �߰�
		 * 2. ����(�ε���)
		 * . �ε����� �Է¹޾� �ش� ��ġ�� �� ����
		 * 3. ����(��)
		 * . ���� �Է¹޾� ����
		 * . ���� �� �Է� �� ����ó��
		 * 4. ����
		 * . �ε����� ���� �Է¹޾� ����
		 */
		
		Scanner sc= new Scanner(System.in);
		Random rn=new Random();
		 int datas[] = null;
		int cnt = 0;
			
			
			while(true) {
				if (datas != null) {
					for (int i = 0; i < datas.length; i++) {
						System.out.print(datas[i] + " ");
					}
					System.out.println();
				}	
				System.out.println("1.�߰�");				
				System.out.println("2.����(�ε���)");
				System.out.println("3.����(��)");
				System.out.println("4.����");
						
				System.out.println("�޴�");
				int sel=sc.nextInt();
				if(sel==1) {
					System.out.print("�߰��� ���� �Է��ϼ���");
					
					int data =sc.nextInt();
					if(cnt>0) {//������ ���� �����ϴ� ���
						int temp[]=datas;					//datas�� �ּҰ� ����		//������� {1,2,3}				
						datas =new int [cnt+1];				//cnt+1 ũ���� ���ο� �ּ� �Ҵ����  //		{0,0,0,0}			
						for(int i=0; i<temp.length;i++) {
							datas[i] =temp[i];				
						}
					}
					
					else {//ó�� �� ���
						datas=new int[1];					//datas �迭�� �ʱ�ȭ (1��¥�� �迭�� �ּ� �Ҵ�)
					}
					datas[cnt]=data;		//������ �ε����� �� ����
					cnt++;
					
				}
				else if(sel==4) {
					System.out.print("������ ��ġ:");
					int idx=sc.nextInt();
					
					if(datas !=null&& idx>= 0 && idx <cnt-1) {				/////////////////////����ó�� cnt-1�ΰ� �ѹ� �����غ���

						System.out.print("������ ��:");
						int data=sc.nextInt();
						
						int temp[]=datas;
						datas= new int[cnt+1];
						
						for(int i=0;i<temp.length;i++) {				///////temp.length!!!!!!!!!!!!!
							if(i<idx) {													
								datas[i]=temp[i];
							}else {//��ĭ�� �ڷ� �з����¾ֵ�
								datas[i+1]=temp[i];					//temp ������ dats���� ©���Ƿ� �����ȳ�
							}
						}
						datas[idx]=data;
						cnt++;
					}
					
					
					
					
				}
				else if(sel==2) {
					System.out.print("������ �ε���");
					int delIdx=sc.nextInt();
					if (datas != null && delIdx >= 0 && delIdx < cnt) {					////////////����ó�� cnt�ΰ� �ѹ������غ���
						if(cnt==1) {
							datas=null;
						}
						else {
							int temp[]=datas;
							datas= new int[cnt-1];
							int idx=0;					//datas�� �ε��� �����Ұ��� ������ ���ϹǷ� idx���θ������			//?
							for(int i=0;i<temp.length;i++) {
								if(i!=delIdx) {																//?
									datas[idx]=temp[i];
									idx++;
								}
							}
						}
						cnt--;
					}
					
					
				}
				else if(sel==3) {
					if(datas!=null) {
					
					System.out.print("������ ��");
					int delData=sc.nextInt();
					
					int delCnt=0;
					for(int i=0; i<datas.length;i++) {
						if(delData ==datas[i]) {
							delCnt++;
						}
					}
					int temp[]=datas;
					datas =new int[cnt-delCnt];
					
					int idx=0;
					for(int i=0;i<temp.length;i++) {
						if(temp[i]!=delData) {
							datas[idx]=temp[i];
							idx++;
						}
					}
					cnt-=delCnt;
//					temp = null;	//temp�� �޸� ����	-> �������� (G.C �����ϱ� ����)
					}else {
						System.out.println("����ֽ��ϴ�");
					}
				}
				
				
				
				
				
				
			}
			
			
			
			
			
			

	}

}

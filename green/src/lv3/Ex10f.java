package lv3;

import java.util.Scanner;

public class Ex10f {

	public static void main(String[] args) {
		// ���� 1) �Ʒ� �迭 a ���� ���� �Է��� ���� ���� b �� ���� 
		int a[] = { 10,20,30,40,50 };
		int b[] = { 0,0,0,0,0 };
		// ��) 30 ==> b[] = {10,20,40,50,0};
		Scanner sc= new Scanner(System.in);
		System.out.println("���Է�:");
		int data =sc.nextInt();
		int bIdx =0;	//�ε��� �и�
		for(int i=0;i<5;i++) {	//a�迭 ��ȯ
			if(a[i] !=data) {
				b[bIdx] = a[i];
				bIdx ++;
			}
		}
		for(int i=0;i<5;i++) System.out.println(b[i]+ " ");
			
		
		
		
/*		System.out.println("���� �Է����ּ���");		
		int n=sc.nextInt();
		int bidx=0;
		for(int i=0;i<5;i++) {
			if(a[i]!=n) {
				b[bidx]=a[i];
				//System.out.println("a�ǰ�"+a[i]);
				bidx++;
			}
		}for(int i=0;i<5;i++) {
			System.out.println(b[i]);
		}
*/		
		
		
		System.out.println("2������");
		
		// ���� 2) �Ʒ� �迭���� ���� �Է��� ��ȣ �� �� �� ���� d �� ����
		int c[] = { 1001, 40, 1002, 65, 1003,  70 };
		int d[] = { 0,0,0,0,0,0 };
//		// ��) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};		//1002�Է��ϸ� 65�� ���̺���
		
		System.out.println("�й� �Ǵ� ���� �Է� ");
		data=sc.nextInt();
		
		int delIdx =-1;	//�й� ����
		for(int i=0;i<6;i++) {
			if(data ==c[i]) {	//�ε��� i���� ���� Ȧ¦		->�ĺ� ����
				//�й�
				if(i % 2 == 0) {
					//i, i+1
					delIdx =i;
				}
				//����
				else if(i%2==1){
					//i, i-1
					delIdx = i-1;
				}				
			}
		}		
		//ó��
		int dIdx =0;
		for(int i=0;i<6;i+=2) {		//�й��������� �Ҷ� �й����ذ� ��������		
			if(i != delIdx) {
				d[dIdx] = c[i];	//�й�
				d[dIdx+1] = c[i+1];//����				///////////+1�ϴ� ������ ���������ε������� -1�߱⶧��??????????
				dIdx +=2;			//�����ε����� 2�� �ٹǷ�
			}
		}
		//���
		for(int i=0;i<6;i++) {
			System.out.println(d[i]);
		}
		
//	ver.2	
//		int input2 = sc.nextInt();
//		int dindex = 0;
//		for(int i = 0; i < 6; i+=2) {
//			if(c[i] != input2) {
//				d[dindex] = c[i];
//				d[dindex + 1] = c[i+1];
//				dindex += 2;
//			}
//		}
//		
//		for(int i = 0; i < 6; i++) {
//			System.out.println(d[i]);
//		}
		
		
		
		
		
		
		
		
		
//		System.out.println("���� �Է����ּ���");		
//		int n1=sc.nextInt();
//		int didx=0;
//		for(int i=0;i<5;i++) {
//			if(c[i]!=n1) {
//				if(i+1)
//				d[didx]=c[i];
//						didx++;
//			}
//		}for(int i=0;i<5;i++) {
//			System.out.println(d[i]);
//		}
	
		
		

	}

}

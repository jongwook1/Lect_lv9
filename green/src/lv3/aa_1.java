package lv3;

import java.util.Scanner;

public class aa_1 {

	public static void main(String[] args) {
		// ����1)  �ε���(���ȣ)�� �Է��ϸ� �����
				int a[] = { 10,20,30,40,50 };
				// ��) 3 ==> 40
				Scanner sc=new Scanner(System.in);
				int idx=sc.nextInt();
						System.out.println(a[idx]);
						
				// ����2) �Ʒ��迭�� ����ū�� ��� 
				int b[] = { 12,54,23,87,1 };
				// ��) 87
				int max=b[0];
				for(int i=0;i<5;i++) {
					if(b[i]>max) {
						max=b[i];
					}
				}System.out.println();
				
				// ����3) �Ʒ� �迭�� Ȧ���� ���� ��� 
				int c[] = { 12,54,23,87,1 };
				// ��) Ȧ���� ���� : 3
				int cnt=0;
				for(int i=0;i<5;i++) {
					if(c[i]%2==1) {
						cnt++;
					}
				}
				System.out.println("cnt :" +cnt);	
				
				// ����4) �Ʒ��迭�� �Ųٷ� ���� 
				int d[] = { 1,2,3,4,5 };
				int e[] = { 0,0,0,0,0 };
				//��)  ={5,4,3,2,1};
				
				for(int i =0;i<5;i++) {
					e[i]=d[4-i];
				}
	
						
						
	}

}

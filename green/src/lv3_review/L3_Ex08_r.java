package lv3_review;

import java.util.Scanner;

public class L3_Ex08_r {

	public static void main(String[] args) {
		// ���� 1) �Ʒ� �迭 a ���� ���� �Է��� ���� ���� b �� ���� 
		int a[] = { 10,20,30,40,50 };
		int b[] = { 0,0,0,0,0 };
		// ��) 30 ==> b[] = {10,20,40,50,0};
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int inputN=sc.nextInt();
		
		int addidx=0;
		for(int i=0;i<5;i++) {
			if(a[i]!=inputN) {
				b[addidx]=a[i];
				addidx++;
			}
		}
		for(int i=0;i<5;i++) {
			System.out.print(b[i]+" ");
		}
System.out.println();
		// ���� 2) �Ʒ� �迭���� ���� �Է��� ��ȣ �� �� �� ���� d �� ����
		int c[] = { 1001, 40, 1002, 65, 1003,  70 };
		int d[] = { 0,0,0,0,0,0 };
		// ��) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
		System.out.println("�й� �Ǵ� ������ �Է��ϼ���");
		int inD=sc.nextInt();
		
		int delIdx=-1;
		for(int i=0;i<6;i++) {
			if(c[i]==inD) {
				if(i%2==0) {
					delIdx=i;
				}else if(i%2==1) {
					delIdx=i-1;
				}
			}
		}
		
		int didx=0;
		for(int i=0;i<6;i+=2) {
			if(i!=delIdx) {
				d[didx]=c[i];
				d[didx+1]=c[i+1];
				didx+=2;
			}
		}
		
		for(int i=0;i<6;i++) {
			System.out.print(d[i]+" ");
		}
		
		

	}

}
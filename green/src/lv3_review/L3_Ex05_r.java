package lv3_review;

import java.util.Scanner;

public class L3_Ex05_r {

	public static void main(String[] args) {
		int a[] = { 10, 49, 51, 36, 17 };
		// ���� 1) ���� ����Ʈ�� ���� �Է��ϸ�   ��ȣ ��� 
		// ��) 51 ==> 2
		// ��) 10 ==> 0
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �Է����ּ���");
		int n=sc.nextInt();
		for(int i=0;i<5;i++) {
			if(a[i]==n) {
				System.out.println(i);
			}
		}

		
System.out.println();
		// ���� 2) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� b �� ����(��ġ�� ��������ġ�� ����)
		// ��) b = [0, 49, 51, 0, 17]
		int b[] = { 0,0,0,0,0 };
		
		int idx2=-1;
		for(int i=0;i<5;i++) {
			if(a[i]%2==1) {
				b[i]=a[i];
			}
			}
		for(int i=0;i<5;i++) {
			System.out.print(b[i]+" ");
		}
		
		
		
		System.out.println();
		//-------------------------------------------------
		// ���� 3) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����(��ġ�� �տ��� ����  ����)
	    // 2�������� ���� �ٸ�
		// ��) c = [49, 51, 17, 0, 0]
		int c[] = { 0,0,0,0,0 };
		
		int idx3=0;
		for(int i=0;i<5;i++) {
			if(a[i]%2==1) {
				c[idx3]=a[i];
				idx3++;
			}
		}
		for(int i=0;i<5;i++) {
			System.out.print(c[i]+" ");
		}
		
		
		
		//-------------------------------------------------
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// �й��� ������ �ѽ��̴�. ==>  1001:20 , 1002:45 , 1003:54
		
		// ����4) �й��� �Է��ϸ� ���� ��� 
		// ��) 1001==>20 , 1003 ==> 54
		System.out.println("\n�й��Է����ּ���");
		int h=sc.nextInt();
		for(int i=0;i<6;i++) {
			if(arr[i]==h) {
				System.out.printf("%d--->%d",arr[i],arr[i+1]);
			}
		}
			
		// ����5) ������ �Է��ϸ� �й� ��� 
		// ��) 20 ==> 1001 , 45 ==> 1002
		System.out.println("\n�����Է����ּ���");
		int score=sc.nextInt();
		
		for(int i=0;i<6;i++) {
			if(arr[i]==score) {
				System.out.printf("%d--->%d",arr[i],arr[i-1]);
			}
		}
		
		
		
	}

}

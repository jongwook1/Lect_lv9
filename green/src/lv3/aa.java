package lv3;

import java.util.Scanner;

public class aa {

	public static void main(String[] args) {
		int a[] = { 10, 49, 51, 36, 17 };
		// ���� 1) ���� ����Ʈ�� ���� �Է��ϸ�   ��ȣ ��� 
		// ��) 51 ==> 2
		// ��) 10 ==> 0
		Scanner sc= new Scanner(System.in);
		int ipn=sc.nextInt();
		
		for(int i=0;i<5;i++) {		
		if(a[i]==ipn) {
	System.out.println(i);}	}
		System.out.println(" 2��");
		// ���� 2) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� b �� ����(��ġ�� ��������ġ�� ����)
		// ��) b = [0, 49, 51, 0, 17]
		int b[] = { 0,0,0,0,0 };
		//int idx=-1
		for(int i=0;i<5;i++) {
			if(a[i] %2 ==1) {
				b[i]=a[i];
				//idx++;
			}
		}for(int i=0;i<5;i++) {
			System.out.println(b[i]);
		}
		System.out.println("3��");
		
		
		// ���� 3) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����(��ġ�� �տ��� ����  ����)
	    // 2�������� ���� �ٸ�
		// ��) c = [49, 51, 17, 0, 0]
		int c[] = { 0,0,0,0,0 };
		int idx=0;
		for(int i=0;i<5;i++) {
			if(a[i]%2==1) {
				c[idx]=a[i];
				idx++;
			}
		}for(int i=0;i<5;i++) {
			System.out.println(c[i]);
		}
		
		
		
		
		//-------------------------------------------------
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// �й��� ������ �ѽ��̴�. ==>  1001:20 , 1002:45 , 1003:54
		// ����4) �й��� �Է��ϸ� ���� ��� 
		// ��) 1001==>20 , 1003 ==> 54
		System.out.println("�й� ����");
		int num =sc.nextInt();
		
			
		
		
		
		// ����5) ������ �Է��ϸ� �й� ��� 
		// ��) 20 ==> 1001 , 45 ==> 1002
			for(int i=0;i<6;i+=2) {
				if(num==arr[i]) {
					System.out.println("����"+arr[i]+"�й�"+arr[i-1]);
				}
			}


	}

}

package lv3;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int a[] = { 10, 49, 51, 36, 17 };
//		 ���� 1) ���� ����Ʈ�� ���� �Է��ϸ� ��ȣ ���
//		 ��) 51 ==> 2
//		 ��) 10 ==> 0
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("���ڸ� �Է����ּ���");
		int num = sc.nextInt();
		for(int i = 0; i<5; i++) {
		if( a[i] ==num) {
			System.out.println(i);			
		}
		}
		
		// ���� 2) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� b �� ����(��ġ�� ��������ġ�� ����)
		// ��) b = [0, 49, 51, 0, 17]
		int b[] = { 0,0,0,0,0 };
		
	for(int i =0;i<5; i++) {
		if(a[i]%2==1) {				
			//System.out.println(i);
			b[i]=a[i];
			System.out.println(b[i]);
			}else {
				System.out.println(b[i]);
			}			
		}
			
		
		
		
		
		
		
		
//		// ���� 3) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����(��ġ�� �տ��� ����  ����)
//	    // 2�������� ���� �ٸ�
//		// ��) c = [49, 51, 17, 0, 0]
//		int c[] = { 0,0,0,0,0 };		//c�迭�� ����� �ε��� -->���������ؾ���!!!!!!
//		//int j=0;
//		for(int i = 0; i<5 ; i++) {	// i : a�迭�� �ε����θ� ��� ����!!!!!!!!!!!!
//			if(a[i]% 2==1 ) {
				
//			for(int j =0; j <5; j++) {
//				System.out.println(a[i]);
//				a[i]=c[j];
//				System.out.println(c[j]);
//			}
//			}			
//		}for(int j=0; j<5; j++) {
			
//		}
//		System.out.println();
		
		
		
		
//		//-------------------------------------------------
		int arr[] = {1001, 20, 1002, 45, 1003, 54};		//0~5
//		// �й��� ������ �ѽ��̴�. ==>  1001:20 , 1002:45 , 1003:54
//		// ����4) �й��� �Է��ϸ� ���� ��� 		
//		// ��) 1001==>20 , 1003 ==> 54
		
		System.out.println("�й��� �Է����ּ���");
		int n = sc.nextInt();
		for(int i =0;i<6;i++) {
			if(arr[i]==n) {
			//System.out.println(i);
				System.out.println(arr[i+1]);			
			}
		}
//		
		
		
//		// ����5) ������ �Է��ϸ� �й� ��� 
//		// ��) 20 ==> 1001 , 45 ==> 1002
		System.out.println("������ �Է����ּ���");
		int n2=sc.nextInt();
		for(int i =0;i<6;i++) {
			if(arr[i]==n2) {
				System.out.println(arr[i-1]);
			}
		}

	}

}

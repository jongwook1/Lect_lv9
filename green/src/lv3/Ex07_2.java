package lv3;

import java.util.Scanner;

public class Ex07_2 {

	public static void main(String[] args) {
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// �й��� ������ �ѽ��̴�. ==>  1001:20 , 1002:45 , 1003:54
		// ����4) �й��� �Է��ϸ� ���� ��� 
		// ��) 1001==>20 , 1003 ==> 54
		
		Scanner sc= new Scanner(System.in);
		System.out.println("�й��� �Է����ּ���");
		int n = sc.nextInt();
		for(int i =0;i<6;i++) {
			if(arr[i]==n) {
			//System.out.println(i);
				System.out.println(arr[i+1]);			
			}
		}		
		// ����5) ������ �Է��ϸ� �й� ��� 
		// ��) 20 ==> 1001 , 45 ==> 1002
		System.out.println("������ �Է����ּ���");
		int n2=sc.nextInt();
		for(int i =0;i<6;i++) {
			if(arr[i]==n2) {
				System.out.println(arr[i-1]);
			}
		}
	}
}

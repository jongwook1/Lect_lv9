package lv3;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1 , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}
		Scanner sc = new Scanner(System.in);
		// System.out.println("�ε����� �Է����ּ���");
		// int n= sc.nextInt();
		// int n2=sc.nextInt();
		//int idx=0;
		System.out.println("�ε���1:");
		int idx1=sc.nextInt();
		System.out.println("�ε���2:");
		int idx2=sc.nextInt();
	
		int temp= arr[idx1];	//������
		arr[idx1] =arr[idx2];
		arr[idx2]= temp;
		for(int i =0;i<5;i++) {
			System.out.print(arr[i]+" ");		
		}
		

		
		  System.out.println();
		//int[] arr = { 10, 20, 30, 40, 50 };
		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 20, 30, 40, 50}
		System.out.print("\n����Ÿ1:");
		int data1=sc.nextInt();
		System.out.print("����Ÿ2:");
		int data2=sc.nextInt();
		
		idx1=-1;		//
		idx2=-1;		//
		//�ε��� ã���� ����
		for (int i = 0; i < 5; i++) {
			if (data1 == arr[i]) {
				idx1 = i;
			}
			if (data2 == arr[i]) {
				idx2 = i;
			}
		}
		//�� ��ü
         if(idx1 != -1 && idx2 != -1) {
        	 temp= arr[idx1];
        	 arr[idx1]=arr[idx2];
        	 arr[idx2]=temp;
         }
         
         for (int i = 0; i < 5; i++) {
        	 System.out.print(arr[i]+" ");
         }
         
         System.out.println();
         
         
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		// ���� 3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
		// �� 3) �й�1 �Է� : 1002 , �й�2 �Է� : 1003
		// {87, 45, 11, 98, 23}
		
		
		System.out.print("\n�й�1:");
		int num1=sc.nextInt();
		System.out.print("\n�й�2:");
		int num2=sc.nextInt();
		
		
		idx1=-1;
		idx2=-1;
		
		for(int i=0; i<5;i++) {
			if(hakbuns[i] ==num1) {
				idx1=i;
			}if(hakbuns[i] ==num2) {
				idx2=i;
			}
		}
		//���� ��ü
		temp=scores[idx1];
		scores[idx1]=scores[idx2];
		scores[idx2]= temp;
		
		//���
		for(int i=0; i<5;i++) {
			System.out.printf("%d�� : %d��\n", hakbuns[i],scores[i]);
		}
	}
}

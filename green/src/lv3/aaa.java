package lv3;

import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1 , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}
		Scanner sc = new Scanner(System.in);

		int idx1=sc.nextInt();
		int idx2=sc.nextInt();
		
		int temp=arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=temp;
		
		for(int i =0;i<5;i++) {
			System.out.print(arr[i]);
		}
		
		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 20, 30, 40, 50}
		
		int data1=sc.nextInt();
		int data2=sc.nextInt();
		
		temp=arr[data1];
		arr[data1]=arr[data2];
		arr[data2]=arr[temp];
		

		
		
		
	}

}

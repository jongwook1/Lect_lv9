package lv4;

import java.util.Scanner;

public class Ex14_re {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		Scanner sc=new Scanner(System.in);
		
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
		// ��    1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		System.out.println("�ε���1�Է� ��");
		int inputIdx1=sc.nextInt();
		System.out.println("�ε���2�Է� ��");
		int inputIdx2=sc.nextInt();
		
			System.out.print(arr[inputIdx1][inputIdx2]);		
		System.out.println("\n�����Է¹޾� �ε���2�����");
		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// ��    2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
			System.out.println("\n���� �Է����ּ���");
			int data=sc.nextInt();
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(arr[i][j]==data) {
						System.out.println("�ε���1: "+i+" "+ "�ε���2: "+j);
					}
				}
			}
			
		
		
		System.out.println("����ū���� �ε��� 2�����");
		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
		int max=arr[0][0];
		int idx1=-1;
		int idx2=-1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			if(max<arr[i][j]) {
				max=arr[i][j];
				idx1=i;
				idx2=j;
			}	
			}
			
			}
		System.out.println("�ε���1: "+idx1+" "+ "�ε���2: "+idx2);
		
		
		// ���� 4) �� 2���� �Է¹޾� �� ��ü
		int inputN1=sc.nextInt();
		int inputN2=sc.nextInt();
		
		idx1=-1;
		idx2=-1;
		int idx3=-1;
		int idx4=-1;
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
				if(arr[i][j]==inputN1) {
					idx1=i;
					idx2=j;
				}
				if(arr[i][j]==inputN2) {
					idx3=i;
					idx4=j;
				}
			}
		}
		int temp=arr[idx1][idx2];
		arr[idx1][idx2]=arr[idx3][idx4];
		arr[idx3][idx4]=temp;
		
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		

	}

}

package lv4;

import java.util.Scanner;

public class Ex14_t {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[][] arr = new int[3][3];
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
		// ��    1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
			System.out.print("idx1 ");
			int idx1=sc.nextInt();
			System.out.print("idx2 ");
			int idx2=sc.nextInt();
			
			System.out.println(arr[idx1][idx2]);
			
			// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
			// ��    2) �� �Է� : 60
			//		   �ε���1 ��� : 1	�ε���2 ��� : 2

			System.out.println("���Է� ����");
			int data =sc.nextInt();
			idx1 =-1;
			idx2=-1;
			for(int i=0; i<3;i++) {
				for(int j=0; j<3;j++) {
					if(arr[i][j]==data) {
						idx1=i;
						idx2=j;
					}
				}
			}
			if(idx1 !=-1) {
				System.out.println(idx1);
				System.out.println(idx2);
				
			}
			
			// ���� 3) ���� ū ���� �ε��� 2�� ���
			// ���� 3) 2 2
			int max=0;
			idx1=-1;
			idx2=-1;
			for(int i=0; i<3;i++) {
				for(int j=0; j<3;j++) {
					if(max<arr[i][j]) {
						max=arr[i][j];
						idx1=i;
						idx2=j;
					}
				}
			}
			System.out.println(idx1);
			System.out.println(idx2);
			
			
			// ���� 4) �� 2���� �Է¹޾� �� ��ü
			System.out.print("data1: ");
			data=sc.nextInt();
			System.out.println("data2: ");
			int data2=sc.nextInt();
			
			idx1=-1;
			idx2=-1;
			int idx3=-1;
			int idx4=-1;
			
			for(int i=0; i<3;i++) {
				for(int j=0; j<3;j++) {
					if(arr[i][j]==data) {
						idx1=i;
						idx2=j;
					}
					if(arr[i][j]==data2) {
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

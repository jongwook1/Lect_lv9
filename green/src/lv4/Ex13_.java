package lv4;

import java.util.Scanner;

public class Ex13_ {

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
		System.out.println("1)�ε����� �Է� ��");
		int idx1=sc.nextInt();
		System.out.println("2)�ε����� �Է� ��");
		int idx2=sc.nextInt();
		System.out.println(arr[idx1][idx2]);
		
		
		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// ��    2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		System.out.println("���� �Է����ּ���");
		int data=sc.nextInt();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(data==arr[i][j]) {
					System.out.println("�ε���1: "+i);
					System.out.println("�ε���2: "+j);
				}
			}
		}			
		
		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
		idx1=0;
		idx2=0;
		int max=arr[0][0];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
					idx1=i;
					idx2=j;
				}
			}
		}		
		System.out.println(idx1+" "+idx2);
		
		
		// ���� 4) �� 2���� �Է¹޾� �� ��ü
		
		System.out.println("1)���� �Է����ּ���");
		int data11=sc.nextInt();
		System.out.println("2)���� �Է����ּ���");
		int data22=sc.nextInt();
		
		idx1=0;
		idx2=0;
		int idx3=0;
		int idx4=0;

		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j]==data11) {
					idx1=i;
					idx2=j;
				}
				if(arr[i][j]==data22) {
					idx3=i;
					idx4=j;
				}
		
			}
		}		
		int temp=arr[idx1][idx2];
		arr[idx1][idx2]=arr[idx3][idx4];
		arr[idx3][idx4]=temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
		System.out.print(arr[i][j]);
			}
			System.out.println();
			}
	}

}

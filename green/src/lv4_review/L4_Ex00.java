package lv4_review;

import java.util.Scanner;

public class L4_Ex00 {

	public static void main(String[] args) {
		/*
		 * # �ִ밪 ���ϱ�
		 * 1. ���� ū ���� ã�� �Է��Ѵ�.
		 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
		 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
		 * ��)
		 * 11, 87, 42, 100, 24
		 * �Է� : 100
		 * 
		 * 11, 87, 42, 0, 24
		 * �Է� : 87
		 * 
		 * 11, 0, 42, 0, 24
		 */
Scanner sc=new Scanner(System.in);
		int[] arr = {11, 87, 42, 100, 24};
		
		
		int cnt=0;
		while(true) {
			for(int i=0;i<5;i++) {
				System.out.print(arr[i]+" ");
			}
			
			System.out.println("�ִ밪�Է��ϼ���");
			int mN=sc.nextInt();
		int idx=0;
		int max=arr[idx];
			
			for(int i=0;i<5;i++) {
				if(arr[i]>max) {
					max=arr[i];
					idx=i;
				}
			}
			if(max==mN) {
				for(int i=0;i<5;i++) {
				arr[idx]=0;
				}
			}
		}

	}

}

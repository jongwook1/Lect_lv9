package lv3_review;

import java.util.Random;
import java.util.Scanner;

public class a {

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
		
		int midx=0;
//		int max=arr[midx];							�����϶��� 35������������ �������򰥷��� �����
		int cnt=0;		
		while(true) {
			for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
			}
			System.out.println("�ִ밪�Է� ��");
			int n=sc.nextInt();
			int max=arr[midx];
			for(int i=0;i<5;i++) {
				if(max<arr[i]) {
					max=arr[i];
					midx=i;
				}
			}
			if(max==n) {
				arr[midx]=0;
				cnt++;
			}else {
				
			}
			if(cnt==5) {
				System.out.println("Ŭ����");
				break;
			}
		}
		
	}

}

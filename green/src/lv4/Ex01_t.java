package lv4;

import java.util.Scanner;

public class Ex01_t {

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
		
		
		while (true) {
			int cnt=0;			//�����ϱ� ���� ������ Ȱ��
			
			int idx=0;
		//	int min =arr[idx];
			int max = arr[idx];
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[i] + " ");
				if(max<arr[i]) {		//�ִ밪 ����
					max=arr[i];
					idx=i;
				}
				if(arr[i]==0) {		//�������� Ȯ��
					cnt++;
				}
				
			}

			System.out.println();
			//���Ṯ
			if(cnt==5) {
				break;
			}
			System.out.print("�ִ밪:");
			int answer=sc.nextInt();
			
			if(answer==max) {
				arr[idx]=0;
			}			
			
		}
	}

}

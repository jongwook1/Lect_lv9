package lv4;

import java.util.Random;

public class A_03 {

	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[2�ܰ�]
		 * 1. arr�迭�� 1~10 ������ ���� ���� 5���� �����Ѵ�.
		 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
		 */		
		
		int[] arr = new int[5];
		Random rn=new Random();
		int i=0;
	
		while(i<5) {
			int rN=rn.nextInt(10)+1;
			int check=-1;
			
			for(int j=0;j<5;j++) {
				if(arr[j]==rN) {
					check=i;
				}
			}
			if(check==-1) {
				arr[i]=rN;
				i++;
			}
			
		}
		for(i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}


	}

}

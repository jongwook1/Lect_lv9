package lv4_review;

import java.util.Random;

public class L4_Ex02 {

	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[2�ܰ�]
		 * 1. arr�迭�� 1~10 ������ ���� ���� 5���� �����Ѵ�.
		 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
		 */

		int[] arr = new int[5];
		
		Random ran=new Random();
		
		for(int i=0;i<5;i++) {
			int rN=ran.nextInt(10)+1;
			boolean check=true;
			for(int j=0;j<5;j++) {
				if(arr[j]==rN) {
					check=false;
				}
			}
			if(check==true) {
				arr[i]=rN;
			}else {
				i--;
			}
		}
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		
			
		
			
			
			
			
			
		
		
		
	}

}

package lv4;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[2�ܰ�]
		 * 1. arr�迭�� 1~10 ������ ���� ���� 5���� �����Ѵ�.
		 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
		 */
		Random ran=new Random();
		int[] arr = new int[5];
	//	int[] check= new int[5];
				
				
		int idx=0;
		while(idx<5) {
			int r=ran.nextInt(10)+1;
			if(r<5&&arr[r-1]==0) {
				arr[idx]=r;
	//			check[r]=1;
				idx++;
			}
		}
		//arr[i]=r;
		for(int i=0;i<5;i++) {
		System.out.println(arr[i]);
		}
	}

}

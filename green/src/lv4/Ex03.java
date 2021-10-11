package lv4;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * # 중복숫자 금지[2단계]
		 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
		 * 2. 단 중복되는 숫자가 없어야 한다.
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

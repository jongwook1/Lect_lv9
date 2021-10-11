package lv4;

import java.util.Random;

public class A_03 {

	public static void main(String[] args) {
		/*
		 * # 중복숫자 금지[2단계]
		 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
		 * 2. 단 중복되는 숫자가 없어야 한다.
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

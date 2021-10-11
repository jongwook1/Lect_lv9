package lv4;

import java.util.Random;

public class Ex03_t_overlap {

	public static void main(String[] args) {
		/*
		 * # 중복숫자 금지[2단계]
		 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
		 * 2. 단 중복되는 숫자가 없어야 한다.
		 */
		Random rn=new Random();
		int[] arr = new int[5];
		
		for(int i=0;i<5;i++) {
			int rNum =rn.nextInt(10)+1;
			boolean check=true;
			for(int j=0;j<5;j++) {
				if(arr[j]==rNum) {
					check =false;
				}
			}
			if(check==true) {
				arr[i]=rNum;
			}
			else {//중복 발견시,
				i--;
				
			}
		}
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
	}
		
		
		
		
//		while문으로 푼거		
//		int i=0;
//		while(i<5) {
//			int r=rn.nextInt(10)+1;
//			
//			int check=-1;
//			//중복확인후 -> 유효한 값만 저장
//			for(int j=0; j<5;j++) {
//			if(r==arr[j]) {
//				check=i;
//			}
//			}
//			
//			if(check==-1) {
//				arr[i]=r;
//				i++;
//			
//			}
//			
//		}
//		for( i=0;i<5;i++) {
//			System.out.print(arr[i]+" ");
//	}
//	
		
		

	}

}

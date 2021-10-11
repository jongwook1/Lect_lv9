package lv3;

import java.util.Random;

public class Ex14 {

	public static void main(String[] args) {
		/*
		 * # 중복숫자 금지[1단계]
		 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
		 * 2. 단, 중복되는 숫자는 없어야 한다.
		 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
		 * 
		 * 예)
		 * 랜덤숫자 : 1
		 * check = {0, 1, 0, 0, 0}		//0 1 2 3 4
		 * arr   = {1, 0, 0, 0, 0}
		 * 랜덤숫자 : 3
		 * check = {0, 1, 0, 1, 0}
		 * arr   = {1, 3, 0, 0, 0}
		 * 랜덤숫자 : 2
		 * check = {0, 1, 1, 1, 0}
		 * arr   = {1, 3, 2, 0, 0}
		 */
		Random ran=new Random();
		int[] check = new int[5];
		int[] arr = new int[5];
		boolean run =true;
		int idx=0;	
		while(run) {
		for(int i =0;i<5;i++) {
			arr[i]=ran.nextInt(5);
			System.out.println("arr배열"+arr[i]);
			if(arr[i]==0) {
				check[idx]=1;
				idx++;
			}else if(arr[i]==1) {
				check[idx]=1;
				idx++;
			}else if(arr[i]==2) {
				check[idx]=1;
				idx++;
			}else if(arr[i]==3) {
				check[idx]=1;
				idx++;
			}else if(arr[i]==4) {
				check[idx]=1;
				idx++;
			}System.out.println("check배열"+check[i]);
			if(check[idx]==1) {
				System.out.println(arr[i]);
				run=false;
		}
		}
		}
		//if(check)
		
	}

}
